// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.unicode.transform;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/general-punctuation/
public class GeneralPunctuationTransform implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the General Punctuation ranges in use.
        // Non-contiguous: excludes 2028-202F (line/paragraph separators, bidi
        // embedding controls, narrow no-break space) and 2066-2069 (bidi
        // isolate
        // controls), which are not part of this visible-punctuation mapping.
        rules.add("::[\\u2000-\\u206F];");

        // Zero-width joining controls -- invisible, drop
        rules.add("‌ > '';"); // 200C ZERO WIDTH NON-JOINER
        rules.add("‍ > '';"); // 200D ZERO WIDTH JOINER

        // Hyphens and dashes
        rules.add("‐ > '-';"); // 2010 HYPHEN
        rules.add("‑ > '-';"); // 2011 NON-BREAKING HYPHEN
        rules.add("‒ > '-';"); // 2012 FIGURE DASH
        rules.add("– > '-';"); // 2013 EN DASH
        rules.add("— > '-';"); // 2014 EM DASH
        rules.add("― > '-';"); // 2015 HORIZONTAL BAR (dup of em dash)

        // Lines
        rules.add("‖ > '||';"); // 2016 DOUBLE VERTICAL LINE
        rules.add("‗ > '__';"); // 2017 DOUBLE LOW LINE

        // Quotation marks
        rules.add("‘ > '';"); // 2018 LEFT SINGLE QUOTATION MARK -> literal '
        rules.add("’ > '';"); // 2019 RIGHT SINGLE QUOTATION MARK -> literal '
        rules.add("‚ > ',';"); // 201A SINGLE LOW-9 QUOTATION MARK
        rules.add("‛ > '';"); // 201B SINGLE HIGH-REVERSED-9 QUOTATION MARK (dup
                              // -> ')
        rules.add("“ > '\"';"); // 201C LEFT DOUBLE QUOTATION MARK
        rules.add("” > '\"';"); // 201D RIGHT DOUBLE QUOTATION MARK
        rules.add("„ > '\"';"); // 201E DOUBLE LOW-9 QUOTATION MARK (dup)
        rules.add("‟ > '\"';"); // 201F DOUBLE HIGH-REVERSED-9 QUOTATION MARK
                                // (dup)

        // Dagger / bullets / leaders
        rules.add("† > '+';"); // 2020 DAGGER
        rules.add("‡ > '++';"); // 2021 DOUBLE DAGGER
        rules.add("• > '*';"); // 2022 BULLET
        rules.add("‣ > '>';"); // 2023 TRIANGULAR BULLET
        rules.add("․ > '.';"); // 2024 ONE DOT LEADER
        rules.add("‥ > '..';"); // 2025 TWO DOT LEADER
        rules.add("… > '...';"); // 2026 HORIZONTAL ELLIPSIS
        rules.add("‧ > '-';"); // 2027 HYPHENATION POINT

        // Per mille / primes
        rules.add("‰ > '%';"); // 2030 PER MILLE SIGN
        rules.add("‱ > '%';"); // 2031 PER TEN THOUSAND SIGN
        rules.add("′ > '';"); // 2032 PRIME -> literal '
        rules.add("″ > '''';"); // 2033 DOUBLE PRIME -> ''
        rules.add("‴ > '''''';"); // 2034 TRIPLE PRIME -> '''
        rules.add("‵ > '`';"); // 2035 REVERSED PRIME
        rules.add("‶ > '``';"); // 2036 REVERSED DOUBLE PRIME
        rules.add("‷ > '```';"); // 2037 REVERSED TRIPLE PRIME
        rules.add("‸ > '^';"); // 2038 CARET

        // Angle quotes / marks
        rules.add("‹ > '<';"); // 2039 SINGLE LEFT-POINTING ANGLE QUOTATION MARK
        rules.add("› > '>';"); // 203A SINGLE RIGHT-POINTING ANGLE QUOTATION
                               // MARK
        rules.add("※ > '*';"); // 203B REFERENCE MARK
        rules.add("‼ > '!!';"); // 203C DOUBLE EXCLAMATION MARK
        rules.add("‽ > '?!';"); // 203D INTERROBANG
        rules.add("‾ > '-';"); // 203E OVERLINE
        rules.add("‿ > '_';"); // 203F UNDERTIE
        rules.add("⁀ > '_';"); // 2040 CHARACTER TIE (dup)
        rules.add("⁁ > '^';"); // 2041 CARET INSERTION POINT (dup of 2038)
        rules.add("⁂ > '***';"); // 2042 ASTERISM
        rules.add("⁃ > '-';"); // 2043 HYPHEN BULLET
        rules.add("⁄ > '/';"); // 2044 FRACTION SLASH

        // Brackets / question-exclamation combos
        rules.add("⁅ > '[';"); // 2045 LEFT SQUARE BRACKET WITH QUILL
        rules.add("⁆ > ']';"); // 2046 RIGHT SQUARE BRACKET WITH QUILL
        rules.add("⁇ > '??';"); // 2047 DOUBLE QUESTION MARK
        rules.add("⁈ > '?!';"); // 2048 QUESTION EXCLAMATION MARK (dup of
                                // interrobang)
        rules.add("⁉ > '!?';"); // 2049 EXCLAMATION QUESTION MARK

        // Editorial / archaic marks -- approximate, several arbitrary
        rules.add("⁊ > '&';"); // 204A TIRONIAN SIGN ET ("and")
        rules.add("⁋ > 'P.';"); // 204B REVERSED PILCROW SIGN (arbitrary)
        rules.add("⁌ > '<*';"); // 204C BLACK LEFTWARDS BULLET
        rules.add("⁍ > '*>';"); // 204D BLACK RIGHTWARDS BULLET
        rules.add("⁎ > '*';"); // 204E LOW ASTERISK (dup of bullet)
        rules.add("⁏ > ';';"); // 204F REVERSED SEMICOLON
        rules.add("⁐ > '';"); // 2050 CLOSE UP (editorial instruction, not a
                              // glyph)
        rules.add("⁑ > '**';"); // 2051 TWO ASTERISKS ALIGNED VERTICALLY
        rules.add("⁒ > '-';"); // 2052 COMMERCIAL MINUS SIGN (dup)
        rules.add("⁓ > '~';"); // 2053 SWUNG DASH
        rules.add("⁔ > '_';"); // 2054 INVERTED UNDERTIE (dup)
        rules.add("⁕ > '*';"); // 2055 FLOWER PUNCTUATION MARK (dup)
        rules.add("⁖ > '...';"); // 2056 THREE DOT PUNCTUATION (dup of ellipsis)
        rules.add("⁗ > '''''''';"); // 2057 QUADRUPLE PRIME -> ''''
        rules.add("⁘ > '....';"); // 2058 FOUR DOT PUNCTUATION
        rules.add("⁙ > '.....';"); // 2059 FIVE DOT PUNCTUATION
        rules.add("⁚ > '..';"); // 205A TWO DOT PUNCTUATION (dup of two-dot
                                // leader)
        rules.add("⁛ > '....';"); // 205B FOUR DOT MARK (dup of 2058)
        rules.add("⁜ > '+';"); // 205C DOTTED CROSS (dup of dagger)
        rules.add("⁝ > ':::';"); // 205D TRICOLON
        rules.add("⁞ > '::::';"); // 205E VERTICAL FOUR DOTS

        // Invisible math/format controls -- no glyph, drop
        rules.add("⁠ > '';"); // 2060 WORD JOINER
        rules.add("⁡ > '';"); // 2061 FUNCTION APPLICATION
        rules.add("⁢ > '';"); // 2062 INVISIBLE TIMES
        rules.add("⁣ > '';"); // 2063 INVISIBLE SEPARATOR
        rules.add("⁤ > '';"); // 2064 INVISIBLE PLUS
        rules.add("⁥ > '';"); // 2065 <reserved> -- unassigned in Unicode;
                              // included only
                              // because it appeared in the source character
                              // list

        // Bidi format controls (deprecated) -- no glyph, drop
        rules.add("⁪ > '';"); // 206A INHIBIT SYMMETRIC SWAPPING
        rules.add("⁫ > '';"); // 206B ACTIVATE SYMMETRIC SWAPPING
        rules.add("⁬ > '';"); // 206C INHIBIT ARABIC FORM SHAPING
        rules.add("⁭ > '';"); // 206D ACTIVATE ARABIC FORM SHAPING
        rules.add("⁮ > '';"); // 206E NATIONAL DIGIT SHAPES
        rules.add("⁯ > '';"); // 206F NOMINAL DIGIT SHAPES

        TRANSLITERATOR = Transliterator.createFromRules("GeneralPunctuation-Normalized", String.join("\n", rules),
                Transliterator.FORWARD);
    }

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
