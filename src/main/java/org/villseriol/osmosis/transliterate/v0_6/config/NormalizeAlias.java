// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TODO.
 */
public enum NormalizeAlias {
    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.ArrowTransform
     */
    ARROW("arrow"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.BoxDrawingTransform
     */
    BOX_DRAWING("box-drawing"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.CyrillicTransform
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
     * @see org.villseriol.osmosis.kakasi.v0_6.unicode.transform.characterset.EnclosedAlphanumericsTransform
     * @see org.villseriol.osmosis.kakasi.v0_6.unicode.transform.characterset.EnclosedAlphanumericSupplementTransform
     * @see org.villseriol.osmosis.kakasi.v0_6.unicode.transform.characterset.EnclosedIdeographicSupplementTransform
     * @see org.villseriol.osmosis.kakasi.v0_6.unicode.transform.characterset.EnclosedCjkLettersAndMonthsTransform
     */
    ENCLOSED("enclosed"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.GeneralPunctuationTransform
     */
    GENERAL_PUNCTUATION("general-punctuation"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.GeometricShapesTransform
     */
    GEOMETRIC_SHAPES("geometric-shapes"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.GreekTransform
     */
    GREEK("greek"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.HalfWidthFullWidthTransform
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
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.MiscellaneousSymbolsAndArrowsTransform
     */
    MISC_SYMBOL_ARROW("misc-symbol-arrow"),

    /**
     * TODO.
     *
     * @see org.villseriol.osmosis.kakasi.v0_6.transform.SmallFormVariantsTransform
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
