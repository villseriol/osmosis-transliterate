// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.openstreetmap.osmosis.core.OsmosisRuntimeException;
import org.openstreetmap.osmosis.core.domain.v0_6.Tag;
import org.openstreetmap.osmosis.core.lifecycle.Completable;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
import org.villseriol.osmosis.kakasi.v0_6.config.DictionaryNode;
import org.villseriol.osmosis.kakasi.v0_6.config.NormalizeAlias;
import org.villseriol.osmosis.kakasi.v0_6.config.NormalizeConfiguration;
import org.villseriol.osmosis.kakasi.v0_6.config.ReplaceWithNode;
import org.villseriol.osmosis.kakasi.v0_6.config.RunNode;
import org.villseriol.osmosis.kakasi.v0_6.config.TagNode;
import org.villseriol.osmosis.kakasi.v0_6.config.WhenValueIsNode;
import org.villseriol.osmosis.kakasi.v0_6.transform.ArrowTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.BoxDrawingTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.CustomMappingTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.CyrillicTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.GeometricShapesTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.GreekTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.HalfWidthFullWidthTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.KakasiTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.LatinTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.NoTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.UnAccentTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.TransformConditionalDecorator;
import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.TransformSequenceDecorator;
import org.villseriol.osmosis.kakasi.v0_6.utils.DictionaryLoader;
import org.villseriol.osmosis.kakasi.v0_6.utils.Transform;


public class KakasiPipeline implements Completable {
    private static final Logger LOG = Logger.getLogger(KakasiPipeline.class.getName());

    private final KakasiPipelineContext context = new KakasiPipelineContext();

    private Transform combined = new NoTransform();

    public void init() {
    }


    public void init(NormalizeConfiguration configuration) {
        List<Transform> transforms = new ArrayList<>();

        for (RunNode run : configuration.getRuns()) {
            NormalizeAlias alias = run.getAlias();

            Transform base = null;

            switch (alias) {
            case ARROW:
                LOG.info("Initializing arrow transform");
                base = new ArrowTransform();
                break;

            case BOX_DRAWING:
                LOG.info("Initializing box-drawing transform");
                base = new BoxDrawingTransform();
                break;

            case CYRILLIC:
                LOG.info("Initializing cyrillic transform");
                base = new CyrillicTransform();
                break;

            case CUSTOM:
                LOG.info("Initializing custom transform");
                Map<CharSequence, CharSequence> replacements = new HashMap<>();

                for (ReplaceWithNode replaceWith : run.getReplaceWiths()) {
                    for (WhenValueIsNode whenValueIs : replaceWith.getWhenValues()) {
                        replacements.put(whenValueIs.getValue(), replaceWith.getValue());
                    }
                }

                base = new CustomMappingTransform(replacements);
                break;

            case GEOMETRIC_SHAPES:
                LOG.info("Initializing geometric-shapes transform");
                base = new GeometricShapesTransform();
                break;

            case GREEK:
                LOG.info("Initializing greek transform");
                base = new GreekTransform();
                break;

            case HALF_WIDTH_FULL_WIDTH:
                LOG.info("Initializing half-width-full-width transform");
                base = new HalfWidthFullWidthTransform();
                break;

            case KAKASI:
                LOG.info("Initializing kakasi transform");
                KakasiConfig config = new KakasiConfig(KakasiConstants.ASCII_CONFIG);

                List<String> dictionaries = run.getDictionaries().stream().map(KakasiPipeline::resolveDictionaryPath)
                        .map(Path::toString).toList();
                if (!dictionaries.isEmpty()) {
                    LOG.info("Loaded " + dictionaries.size() + " dictionaries");
                    config.setDictionaries(dictionaries);
                }

                base = new KakasiTransform(config);
                break;

            case LATIN:
                LOG.info("Initializing latin transform");
                base = new LatinTransform();
                break;

            case UN_ACCENT:
                LOG.info("Initializing un-accent transform");
                base = new UnAccentTransform();
                break;

            default:
                throw new OsmosisRuntimeException("Unknown normalize alias: " + alias);
            }

            List<TagNode> globalTags = configuration.getTags();
            List<TagNode> localTags = run.getTags();

            transforms.add(new TransformConditionalDecorator(base, () -> {
                String currentTag = context.getCurrentTag();

                if (!localTags.isEmpty()) {
                    return localTags.stream().anyMatch(tag -> tag.getKey().equals(currentTag));
                } else if (!globalTags.isEmpty()) {
                    return globalTags.stream().anyMatch(tag -> tag.getKey().equals(currentTag));
                } else {
                    return true;
                }
            }));
        }

        combined = new TransformSequenceDecorator(transforms);
    }


    public Tag run(Tag tag) {
        return new Tag(tag.getKey(), run(tag.getKey(), tag.getValue()));
    }


    public String run(String tag, String value) {
        context.setCurrentTag(tag);

        return combined.action(value);
    }


    private static Path resolveDictionaryPath(DictionaryNode entry) {
        String path = entry.getPath();
        String alias = entry.getAlias();
        boolean isPathEmpty = path == null || "".equals(path);
        boolean isAliasEmpty = alias == null || "".equals(alias);

        if (isAliasEmpty && isPathEmpty) {
            throw new OsmosisRuntimeException("Both 'path' and 'name' can not be specified for dictionary");
        }

        if (!isAliasEmpty) {
            try {
                return DictionaryLoader.load(alias);
            } catch (IOException e) {
                throw new OsmosisRuntimeException("Failed to load dictionary from alias", e);
            }
        } else {
            Path result = Path.of(path);
            if (Files.exists(result)) {
                return result;
            } else {
                String error = String.format("Dictionary does not exist %s", path);
                throw new OsmosisRuntimeException(error);
            }
        }
    }


    @Override
    public void close() {
    }


    @Override
    public void complete() {
        // Do nothing.
    }
}
