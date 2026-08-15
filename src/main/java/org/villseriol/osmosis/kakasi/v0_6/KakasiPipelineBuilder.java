// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.logging.Logger;

import org.openstreetmap.osmosis.core.OsmosisRuntimeException;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
import org.villseriol.osmosis.kakasi.v0_6.config.ConditionNode;
import org.villseriol.osmosis.kakasi.v0_6.config.DictionaryNode;
import org.villseriol.osmosis.kakasi.v0_6.config.NormalizeAlias;
import org.villseriol.osmosis.kakasi.v0_6.config.NormalizeConfiguration;
import org.villseriol.osmosis.kakasi.v0_6.config.ReplaceWithNode;
import org.villseriol.osmosis.kakasi.v0_6.config.RunNode;
import org.villseriol.osmosis.kakasi.v0_6.config.TagNode;
import org.villseriol.osmosis.kakasi.v0_6.config.WhenValueIsNode;
import org.villseriol.osmosis.kakasi.v0_6.unicode.decorator.TransformConditionalDecorator;
import org.villseriol.osmosis.kakasi.v0_6.unicode.decorator.TransformSequenceDecorator;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.ArrowTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.BoxDrawingTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.CustomMappingTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.CyrillicTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.DuplicateSpaceTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.EnclosedLettersAndSymbols;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.GeneralPunctuationTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.GeometricShapesTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.GreekTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.HalfWidthFullWidthTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.KakasiTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.Latin1OnlyTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.LatinTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.MiscellaneousSymbolsAndArrowsTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.SmallFormVariantsTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.TrimTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.UnAccentTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;
import org.villseriol.osmosis.kakasi.v0_6.utils.DictionaryLoader;
import org.villseriol.osmosis.kakasi.v0_6.utils.ScriptBuilder;


public class KakasiPipelineBuilder {
    private static final Logger LOG = Logger.getLogger(KakasiPipelineBuilder.class.getName());

    private final NormalizeConfiguration configuration;

    public KakasiPipelineBuilder(NormalizeConfiguration configuration) {
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
            return new ArrowTransform();

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
            return new EnclosedLettersAndSymbols();

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

            List<String> dictionaries = run.getDictionaries().stream().map(KakasiPipelineBuilder::resolveDictionaryPath)
                    .map(Path::toString).toList();
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
    public Unimap build(KakasiPipelineContext context) {
        List<Unimap> transforms = new ArrayList<>();

        List<TagNode> globalTagPreFilter = configuration.getTags();
        Supplier<Boolean> filterBySpecifiedTags = () -> {
            if (!globalTagPreFilter.isEmpty()) {
                return globalTagPreFilter.stream().map((t) -> t.getKey())
                        .anyMatch(tag -> tag.equals(context.getCurrentTag()));
            }

            return true;
        };

        for (RunNode run : configuration.getRuns()) {
            Unimap t = createTransformFromRunNode(run);

            List<Supplier<Boolean>> conditions = run.getConditions().stream()
                    .map(conditionNode -> buildConditionSupplier(conditionNode, context)).toList();

            transforms.add(new TransformConditionalDecorator(t,
                    () -> filterBySpecifiedTags.get() && conditions.stream().allMatch(Supplier::get)));
        }

        return new TransformSequenceDecorator(transforms);
    }


    private static Supplier<Boolean> buildConditionSupplier(ConditionNode conditionNode, KakasiPipelineContext ctx) {
        String path = conditionNode.getPath();
        String expr = conditionNode.getExpr();
        boolean isPathEmpty = path == null || "".equals(path);
        boolean isExprEmpty = expr == null || "".equals(expr);

        ScriptBuilder scriptBuilder = new ScriptBuilder();

        if (!isPathEmpty) {
            scriptBuilder.useFile(path);
        } else if (!isExprEmpty) {
            scriptBuilder.useExpression(expr);
        } else {
            throw new OsmosisRuntimeException("Either 'path' or 'expr' must be specified for condition");
        }

        return scriptBuilder.build(ctx);
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
