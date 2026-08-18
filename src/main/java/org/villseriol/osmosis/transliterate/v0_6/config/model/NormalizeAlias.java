// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.config.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TODO.
 */
public enum NormalizeAlias {
    /**
     * TODO.
     */
    ALL_TO_BLANK("all-to-blank"),

    /**
     * TODO.
     */
    ALL_TO_WHITESPACE("all-to-whitespace"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.ArrowsMapper
     */
    ARROW("arrow"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.BoxDrawingMapper
     */
    BOX_DRAWING("box-drawing"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.CyrillicMapper
     */
    CYRILLIC("cyrillic"),

    /**
     * TODO.
     */
    CUSTOM("custom"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.DuplicateSpaceTransform
     */
    DUPLICATE_SPACE("duplicate-space"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedAlphanumericsMapper
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedAlphanumericSupplementMapper
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedIdeographicSupplementMapper
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.EnclosedCjkLettersAndMonthsMapper
     */
    ENCLOSED("enclosed"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.GeneralPunctuationMapper
     */
    GENERAL_PUNCTUATION("general-punctuation"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.GeometricShapesMapper
     */
    GEOMETRIC_SHAPES("geometric-shapes"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.GreekMapper
     */
    GREEK("greek"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.HalfWidthFullWidthMapper
     */
    HALF_WIDTH_FULL_WIDTH("half-width-full-width"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.KakasiTransform
     */
    KAKASI("kakasi"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.LetterlikeMapper
     */
    LETTERLIKE("letterlike"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.LatinTransform
     */
    LATIN("latin"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.Latin1OnlyTransform
     */
    LATIN1_ONLY("latin1-only"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.MiscellaneousSymbolsAndArrowsMapper
     */
    MISC_SYMBOL_ARROW("misc-symbol-arrow"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset.SmallFormVariantsMapper
     */
    SMALL_FORM("small-form"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.TrimTransform
     */
    TRIM("trim"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.UnAccentTransform
     */
    UN_ACCENT("un-accent");

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
