// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.transliterate.v0_6;

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
import io.github.villseriol.osmosis.transliterate.v0_6.config.loader.DictionaryLoader;
import io.github.villseriol.osmosis.transliterate.v0_6.config.model.DictionaryNode;
import io.github.villseriol.osmosis.transliterate.v0_6.config.model.NormalizeAlias;
import io.github.villseriol.osmosis.transliterate.v0_6.config.model.NormalizeConfiguration;
import io.github.villseriol.osmosis.transliterate.v0_6.config.model.ReplaceWithNode;
import io.github.villseriol.osmosis.transliterate.v0_6.config.model.RunNode;
import io.github.villseriol.osmosis.transliterate.v0_6.config.model.TagNode;
import io.github.villseriol.osmosis.transliterate.v0_6.config.model.WhenValueIsNode;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.decorator.ConditionalDecorator;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.decorator.SequenceDecorator;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.ArrowsMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.BoxDrawingMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.CjkCompatibilityMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.CjkRadicalsSupplementMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.CyrillicMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedAlphanumericSupplementMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedAlphanumericsMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedCjkLettersAndMonthsMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedIdeographicSupplementMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.GeneralPunctuationMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.GreekMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.HalfWidthFullWidthMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.KangxiRadicalsMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.KatakanaPhoneticExtensionsMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.LatinMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.MiscellaneousSymbolsAndArrowsMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.PhoneticExtensionsMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.SpacingModifierLettersMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.ThaiMapper;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.CustomMappingTransform;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.DuplicateSpaceTransform;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.KakasiTransform;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.Latin1OnlyTransform;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.NfkcTransform;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.RangeToBlankTransform;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.RangeToWhitespaceTransform;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.TrimTransform;


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
        case ALL_PHONETIC_EXTENSIONS:
            LOG.info("Initializing all-phonetic-extensions transform");
            return new SequenceDecorator(new PhoneticExtensionsMapper(), new KatakanaPhoneticExtensionsMapper());

        case ALL_TO_BLANK:
            LOG.info("Initializing all-to-blank transform");
            return new RangeToBlankTransform(run.getUnicodeGroup());

        case ALL_TO_WHITESPACE:
            LOG.info("Initializing all-to-whitespace transform");
            return new RangeToWhitespaceTransform(run.getUnicodeGroup());

        case ARROW:
            LOG.info("Initializing arrow transform");
            return new SequenceDecorator(new ArrowsMapper(), new MiscellaneousSymbolsAndArrowsMapper());

        case BOX_DRAWING:
            LOG.info("Initializing box-drawing transform");
            return new BoxDrawingMapper();

        case CJK_COMPATIBILITY:
            LOG.info("Initializing cjk-compatibility transform");
            return new CjkCompatibilityMapper();

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

        case LATIN:
            LOG.info("Initializing latin transform");
            return new LatinMapper();

        case LATIN1_ONLY:
            LOG.info("Initializing latin1-only transform");
            return new Latin1OnlyTransform();

        case NFKC:
            LOG.info("Initializing nfkc transform");
            return new NfkcTransform(run.getUnicodeGroup());

        case RADICALS:
            LOG.info("Initializing radicals transform");
            return new SequenceDecorator(new KangxiRadicalsMapper(), new CjkRadicalsSupplementMapper());

        case SPACING_MODIFIER_LETTERS:
            LOG.info("Initializing spacing-modifier-letters transform");
            return new SpacingModifierLettersMapper();

        case THAI:
            LOG.info("Initializing thai transform");
            return new ThaiMapper();

        case TRIM:
            LOG.info("Initializing trim transform");
            return new TrimTransform();

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
