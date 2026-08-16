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
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.ArrowTransform
     */
    ARROW("arrow"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.BoxDrawingMapper
     */
    BOX_DRAWING("box-drawing"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.CyrillicMapper
     */
    CYRILLIC("cyrillic"),

    /**
     * TODO.
     */
    CUSTOM("custom"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.DuplicateSpaceTransform
     */
    DUPLICATE_SPACE("duplicate-space"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.unicode.transform.characterset.EnclosedAlphanumericsMapper
     * @see org.villseriol.osmosis.kakasi.v0_6.unicode.transform.characterset.EnclosedAlphanumericSupplementMapper
     * @see org.villseriol.osmosis.kakasi.v0_6.unicode.transform.characterset.EnclosedIdeographicSupplementMapper
     * @see org.villseriol.osmosis.kakasi.v0_6.unicode.transform.characterset.EnclosedCjkLettersAndMonthsMapper
     */
    ENCLOSED("enclosed"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.GeneralPunctuationMapper
     */
    GENERAL_PUNCTUATION("general-punctuation"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.GeometricShapesMapper
     */
    GEOMETRIC_SHAPES("geometric-shapes"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.GreekMapper
     */
    GREEK("greek"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.HalfWidthFullWidthMapper
     */
    HALF_WIDTH_FULL_WIDTH("half-width-full-width"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.KakasiTransform
     */
    KAKASI("kakasi"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.LatinTransform
     */
    LATIN("latin"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.Latin1OnlyTransform
     */
    LATIN1_ONLY("latin1-only"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.MiscellaneousSymbolsAndArrowsMapper
     */
    MISC_SYMBOL_ARROW("misc-symbol-arrow"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.SmallFormVariantsMapper
     */
    SMALL_FORM("small-form"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.TrimTransform
     */
    TRIM("trim"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.UnAccentTransform
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
