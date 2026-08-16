// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.openstreetmap.osmosis.core.OsmosisRuntimeException;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
import org.villseriol.osmosis.transliterate.v0_6.config.loader.DictionaryLoader;
import org.villseriol.osmosis.transliterate.v0_6.config.model.DictionaryNode;
import org.villseriol.osmosis.transliterate.v0_6.config.model.NormalizeAlias;
import org.villseriol.osmosis.transliterate.v0_6.config.model.NormalizeConfiguration;
import org.villseriol.osmosis.transliterate.v0_6.config.model.ReplaceWithNode;
import org.villseriol.osmosis.transliterate.v0_6.config.model.RunNode;
import org.villseriol.osmosis.transliterate.v0_6.config.model.TagNode;
import org.villseriol.osmosis.transliterate.v0_6.config.model.WhenValueIsNode;
import org.villseriol.osmosis.transliterate.v0_6.unicode.decorator.TransformConditionalDecorator;
import org.villseriol.osmosis.transliterate.v0_6.unicode.decorator.TransformSequenceDecorator;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.KakasiTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.Latin1OnlyTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.LatinTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.TrimTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.UnAccentTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.ArrowsTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.BoxDrawingTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.CyrillicTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.EnclosedAlphanumericSupplementTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.EnclosedAlphanumericsTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.EnclosedCjkLettersAndMonthsTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.EnclosedIdeographicSupplementTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.GeneralPunctuationTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.GeometricShapesTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.GreekTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.HalfWidthFullWidthTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.MiscellaneousSymbolsAndArrowsTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset.SmallFormVariantsTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.nonspecific.CustomMappingTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.nonspecific.DuplicateSpaceTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;


public class TransliteratePipelineBuilder {
    private static final Logger LOG = Logger.getLogger(TransliteratePipelineBuilder.class.getName());

    private final NormalizeConfiguration configuration;

    public TransliteratePipelineBuilder(NormalizeConfiguration configuration) {
        super();

        this.configuration = configuration;
    }


    /**
     * Returns a transform from the specified run config.
     *
     * @param run configuration to build from
     * @return the transform
     */
    private Unimap createTransformFromRunNode(RunNode run) {
        NormalizeAlias alias = run.getAlias();

        switch (alias) {
        case ARROW:
            LOG.info("Initializing arrow transform");
            return new ArrowsTransform();

        case BOX_DRAWING:
            LOG.info("Initializing box-drawing transform");
            return new BoxDrawingTransform();

        case CYRILLIC:
            LOG.info("Initializing cyrillic transform");
            return new CyrillicTransform();

        case CUSTOM:
            LOG.info("Initializing custom transform");
            Map<CharSequence, CharSequence> replacements = new HashMap<>();

            for (ReplaceWithNode replaceWith : run.getReplaceWiths()) {
                for (WhenValueIsNode whenValueIs : replaceWith.getWhenValues()) {
                    replacements.put(whenValueIs.getValue(), replaceWith.getValue());
                }
            }

            return new CustomMappingTransform(replacements);

        case DUPLICATE_SPACE:
            LOG.info("Initializing duplicate-space transform");
            return new DuplicateSpaceTransform();

        case ENCLOSED:
            LOG.info("Initializing enclosed transform");
            return new TransformSequenceDecorator(new EnclosedAlphanumericsTransform(),
                    new EnclosedAlphanumericSupplementTransform(), new EnclosedIdeographicSupplementTransform(),
                    new EnclosedCjkLettersAndMonthsTransform());

        case GENERAL_PUNCTUATION:
            LOG.info("Initializing general-punctuation transform");
            return new GeneralPunctuationTransform();

        case GEOMETRIC_SHAPES:
            LOG.info("Initializing geometric-shapes transform");
            return new GeometricShapesTransform();

        case GREEK:
            LOG.info("Initializing greek transform");
            return new GreekTransform();

        case HALF_WIDTH_FULL_WIDTH:
            LOG.info("Initializing half-width-full-width transform");
            return new HalfWidthFullWidthTransform();

        case KAKASI:
            LOG.info("Initializing kakasi transform");
            KakasiConfig config = new KakasiConfig(KakasiConstants.ASCII_CONFIG);

            List<String> dictionaries = run.getDictionaries().stream()
                    .map(TransliteratePipelineBuilder::resolveDictionaryPath).map(Path::toString).toList();
            if (!dictionaries.isEmpty()) {
                LOG.info("Loaded " + dictionaries.size() + " dictionaries");
                config.setDictionaries(dictionaries);
            }

            return new KakasiTransform(config);

        case LATIN:
            LOG.info("Initializing latin transform");
            return new LatinTransform();

        case LATIN1_ONLY:
            LOG.info("Initializing latin1-only transform");
            return new Latin1OnlyTransform();

        case MISC_SYMBOL_ARROW:
            LOG.info("Initializing misc-symbol-arrow transform");
            return new MiscellaneousSymbolsAndArrowsTransform();

        case SMALL_FORM:
            LOG.info("Initializing small-form transform");
            return new SmallFormVariantsTransform();

        case TRIM:
            LOG.info("Initializing trim transform");
            return new TrimTransform();

        case UN_ACCENT:
            LOG.info("Initializing un-accent transform");
            return new UnAccentTransform();

        default:
            throw new OsmosisRuntimeException("Unknown normalize alias: " + alias);
        }
    }


    /**
     * Builds using the specified configuration without any context.
     *
     * @return the transform
     */
    public Unimap build() {
        List<Unimap> transforms = new ArrayList<>();
        for (RunNode run : configuration.getRuns()) {
            Unimap t = createTransformFromRunNode(run);

            transforms.add(t);
        }

        return new TransformSequenceDecorator(transforms);
    }


    /**
     * Builds using the specified configuration using the supplied context.
     *
     * @param context the context
     * @return the transform
     */
    public Unimap build(TransliteratePipelineContext context) {
        List<Unimap> transforms = new ArrayList<>();

        Set<String> tagVector = configuration.getTags().stream().map(TagNode::getKey).collect(Collectors.toSet());
        Supplier<Boolean> filterBySpecifiedTags = () -> {
            return !tagVector.isEmpty() && tagVector.contains(context.getCurrentTag());
        };

        for (RunNode run : configuration.getRuns()) {
            Unimap t = createTransformFromRunNode(run);

            transforms.add(new TransformConditionalDecorator(t, filterBySpecifiedTags));
        }

        return new TransformSequenceDecorator(transforms);
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
            Path p = Path.of(path);
            if (Files.exists(p)) {
                return p;
            } else {
                String error = String.format("Dictionary does not exist %s", path);
                throw new OsmosisRuntimeException(error);
            }
        }
    }
}
