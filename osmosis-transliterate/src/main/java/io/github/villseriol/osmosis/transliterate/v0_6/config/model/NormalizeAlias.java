// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.transliterate.v0_6.config.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.ArabicMapper;
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
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.HebrewMapper;
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


/**
 * TODO.
 */
public enum NormalizeAlias {
    /**
     * TODO.
     *
     * @see PhoneticExtensionsMapper
     * @see KatakanaPhoneticExtensionsMapper
     */
    ALL_PHONETIC_EXTENSIONS("all-phonetic-extensions"),

    /**
     * TODO.
     *
     * @see RangeToBlankTransform
     */
    ALL_TO_BLANK("all-to-blank"),

    /**
     * TODO.
     *
     * @see RangeToWhitespaceTransform
     */
    ALL_TO_WHITESPACE("all-to-whitespace"),

    /**
     * TODO.
     *
     * @see ArabicMapper
     */
    ARABIC("arabic"),

    /**
     * TODO.
     *
     * @see ArrowsMapper
     * @see MiscellaneousSymbolsAndArrowsMapper
     */
    ARROW("arrow"),

    /**
     * TODO.
     *
     * @see BoxDrawingMapper
     */
    BOX_DRAWING("box-drawing"),

    /**
     * TODO.
     *
     * @see CjkCompatibilityMapper
     */
    CJK_COMPATIBILITY("cjk-compatibility"),

    /**
     * TODO.
     *
     * @see CyrillicMapper
     */
    CYRILLIC("cyrillic"),

    /**
     * TODO.
     *
     * @see CustomMappingTransform
     */
    CUSTOM("custom"),

    /**
     * TODO.
     *
     * @see DuplicateSpaceTransform
     */
    DUPLICATE_SPACE("duplicate-space"),

    /**
     * TODO.
     *
     * @see EnclosedAlphanumericsMapper
     * @see EnclosedAlphanumericSupplementMapper
     * @see EnclosedIdeographicSupplementMapper
     * @see EnclosedCjkLettersAndMonthsMapper
     */
    ENCLOSED("enclosed"),

    /**
     * TODO.
     *
     * @see GeneralPunctuationMapper
     */
    GENERAL_PUNCTUATION("general-punctuation"),

    /**
     * TODO.
     *
     * @see GreekMapper
     */
    GREEK("greek"),

    /**
     * TODO.
     *
     * @see HalfWidthFullWidthMapper
     */
    HALF_WIDTH_FULL_WIDTH("half-width-full-width"),

    /**
     * TODO.
     *
     * @see HebrewMapper
     */
    HEBREW("hebrew"),

    /**
     * TODO.
     *
     * @see KakasiTransform
     */
    KAKASI("kakasi"),

    /**
     * TODO.
     *
     * @see KatakanaPhoneticExtensionsMapper
     */
    KATAKANA_PHONETIC_EXTENSIONS("katakana-phonetic-extensions"),

    /**
     * TODO.
     *
     * @see LatinMapper
     */
    LATIN("latin"),

    /**
     * TODO.
     *
     * @see Latin1OnlyTransform
     */
    LATIN1_ONLY("latin1-only"),

    /**
     * TODO.
     *
     * @see NfkcTransform
     */
    NFKC("nfkc"),

    /**
     * TODO.
     *
     * @see KangxiRadicalsMapper
     * @see CjkRadicalsSupplementMapper
     */
    RADICALS("radicals"),

    /**
     * TODO.
     *
     * @see SpacingModifierLettersMapper
     */
    SPACING_MODIFIER_LETTERS("spacing-modifier-letters"),

    /**
     * TODO.
     *
     * @see ThaiMapper
     */
    THAI("thai"),

    /**
     * TODO.
     *
     * @see TrimTransform
     */
    TRIM("trim");

    private final String alias;

    NormalizeAlias(String alias) {
        this.alias = alias;
    }


    /**
     * TODO.
     *
     * @return TODO.
     */
    @JsonValue
    public String getAlias() {
        return alias;
    }


    /**
     * TODO.
     *
     * @param alias TODO.
     * @return TODO.
     */
    @JsonCreator
    public static NormalizeAlias fromAlias(String alias) {
        for (NormalizeAlias value : values()) {
            if (value.alias.equals(alias)) {
                return value;
            }
        }

        throw new IllegalArgumentException("Unknown normalize alias: " + alias);
    }
}
