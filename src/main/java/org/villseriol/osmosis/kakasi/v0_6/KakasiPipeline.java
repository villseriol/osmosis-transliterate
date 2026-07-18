// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.openstreetmap.osmosis.core.OsmosisRuntimeException;
import org.villseriol.kakasi.api.Kakasi;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
import org.villseriol.osmosis.kakasi.v0_6.configuration.model.DictionaryEntry;
import org.villseriol.osmosis.kakasi.v0_6.configuration.model.UserConfiguration;
import org.villseriol.osmosis.kakasi.v0_6.transform.HalfToFullTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.KakasiTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.LigatureTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.NoTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.ReplacementTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.SequenceTransformDecorator;
import org.villseriol.osmosis.kakasi.v0_6.transform.SplitTransformDecorator;
import org.villseriol.osmosis.kakasi.v0_6.transform.TransformProxy;
import org.villseriol.osmosis.kakasi.v0_6.transform.TrimTransform;
import org.villseriol.osmosis.kakasi.v0_6.transform.UnAccentTransform;
import org.villseriol.osmosis.shared.DictionaryLoader;
import org.villseriol.osmosis.shared.Transform;


public final class KakasiPipeline {
    private static final Logger LOG = Logger.getLogger(KakasiPipeline.class.getName());

    private final Kakasi kakasi = new Kakasi();
    private final TransformProxy pre = new TransformProxy();
    private final TransformProxy post = new TransformProxy();

    // Apply the transforms in this order
    private final Transform combined = new SequenceTransformDecorator(
            // replace all characters except japanese with latin1
            new UnAccentTransform(), new LigatureTransform(), new HalfToFullTransform(),
            // user pre-transform
            pre,
            // split the string into runs of words
            new SplitTransformDecorator(new KakasiTransform(kakasi)),
            // trim the white space
            new TrimTransform(),
            // user post-transform
            post);

    public KakasiPipeline() {
        super();
    }


    /**
     * Set a user configurable pre-transform.
     *
     * @param transform the pre-transform to apply
     */
    public void setPreTransform(Transform transform) {
        this.pre.setProxy(transform);
    }


    /**
     * Set a user configurable post-transform.
     *
     * @param transform the post-transform to apply
     */
    public void setPostTransform(Transform transform) {
        this.post.setProxy(transform);
    }


    public void init() {
        this.pre.setProxy(new NoTransform());
        this.post.setProxy(new NoTransform());

        kakasi.configure(KakasiConstants.ASCII_CONFIG);

        warmup();
    }


    public void init(UserConfiguration configuration) {
        KakasiConfig config = new KakasiConfig(KakasiConstants.ASCII_CONFIG);

        List<String> dictionaries = configuration.getDictionaryEntries().stream().map(this::resolveDictionaryPath)
                .map(Path::toString).toList();
        if (!dictionaries.isEmpty()) {
            LOG.fine("Loaded " + dictionaries.size() + " dictionaries");
            config.setDictionaries(dictionaries);
        }

        kakasi.configure(config);

        warmup();

        Map<CharSequence, CharSequence> replacements = configuration.getReplacements().stream()
                .collect(Collectors.toMap((r) -> r.getFrom(), (r) -> r.getTo()));
        this.pre.setProxy(new ReplacementTransform(replacements));
    }


    private Path resolveDictionaryPath(DictionaryEntry entry) {
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


    /**
     * Run this to ensure correct initialization of kakasi buffers
     */
    private void warmup() {
        String first = kakasi.run("にほんご");
        if ("nihongo".equalsIgnoreCase(first)) {
            LOG.fine("Kakasi initialized");
        } else {
            LOG.severe("Failed to convert '日本語' to 'nihongo'");
            throw new OsmosisRuntimeException("Kakasi initialization error");
        }
    }


    public String run(String input) {
        return combined.action(input);
    }
}
