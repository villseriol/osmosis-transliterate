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
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.unicode.decorator.ConditionalDecorator;
import org.villseriol.osmosis.transliterate.v0_6.unicode.decorator.SequenceDecorator;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.ArrowsMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.BoxDrawingMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.CyrillicMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedAlphanumericSupplementMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedAlphanumericsMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedCjkLettersAndMonthsMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedIdeographicSupplementMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.GeneralPunctuationMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.GeometricShapesMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.GreekMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.HalfWidthFullWidthMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.KatakanaPhoneticExtensionsMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.LatinMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.LetterlikeMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.MiscellaneousSymbolsAndArrowsMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.SmallFormVariantsMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.SpacingModifierLettersMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.ThaiMapper;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.CustomMappingTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.DuplicateSpaceTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.KakasiTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.Latin1OnlyTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.RangeToBlankTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.RangeToWhitespaceTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.TrimTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.UnAccentTransform;


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
        case ALL_TO_BLANK:
            LOG.info("Initializing all-to-blank transform");
            return new RangeToBlankTransform(run.getUnicodeGroup());

        case ALL_TO_WHITESPACE:
            LOG.info("Initializing all-to-whitespace transform");
            return new RangeToWhitespaceTransform(run.getUnicodeGroup());

        case ARROW:
            LOG.info("Initializing arrow transform");
            return new ArrowsMapper();

        case BOX_DRAWING:
            LOG.info("Initializing box-drawing transform");
            return new BoxDrawingMapper();

        case CYRILLIC:
            LOG.info("Initializing cyrillic transform");
            return new CyrillicMapper();

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
            return new SequenceDecorator(new EnclosedAlphanumericsMapper(), new EnclosedAlphanumericSupplementMapper(),
                    new EnclosedIdeographicSupplementMapper(), new EnclosedCjkLettersAndMonthsMapper());

        case GENERAL_PUNCTUATION:
            LOG.info("Initializing general-punctuation transform");
            return new GeneralPunctuationMapper();

        case GEOMETRIC_SHAPES:
            LOG.info("Initializing geometric-shapes transform");
            return new GeometricShapesMapper();

        case GREEK:
            LOG.info("Initializing greek transform");
            return new GreekMapper();

        case HALF_WIDTH_FULL_WIDTH:
            LOG.info("Initializing half-width-full-width transform");
            return new HalfWidthFullWidthMapper();

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

        case KATAKANA_PHONETIC_EXTENSIONS:
            LOG.info("Initializing katakana-phonetic-extensions transform");
            return new KatakanaPhoneticExtensionsMapper();

        case LETTERLIKE:
            LOG.info("Initializing letterlike transform");
            return new LetterlikeMapper();

        case LATIN:
            LOG.info("Initializing latin transform");
            return new LatinMapper();

        case LATIN1_ONLY:
            LOG.info("Initializing latin1-only transform");
            return new Latin1OnlyTransform();

        case MISC_SYMBOL_ARROW:
            LOG.info("Initializing misc-symbol-arrow transform");
            return new MiscellaneousSymbolsAndArrowsMapper();

        case SMALL_FORM:
            LOG.info("Initializing small-form transform");
            return new SmallFormVariantsMapper();

        case SPACING_MODIFIER_LETTERS:
            LOG.info("Initializing spacing-modifier-letters transform");
            return new SpacingModifierLettersMapper();

        case THAI:
            LOG.info("Initializing thai transform");
            return new ThaiMapper();

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

        return new SequenceDecorator(transforms);
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

            transforms.add(new ConditionalDecorator(t, filterBySpecifiedTags));
        }

        return new SequenceDecorator(transforms);
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
