// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/general-punctuation/
public class GeneralPunctuationMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the full General Punctuation block,
        // as one continuous range.
        rules.add("::[\\u2000-\\u206F];");

        // Space variants -- normalize to a standard ASCII space. Written as
        // escaped code points since these are visually indistinguishable
        // from a plain ASCII space in source.
        rules.add("\u2000 > ' ';"); // EN QUAD
        rules.add("\u2001 > ' ';"); // EM QUAD
        rules.add("\u2002 > ' ';"); // EN SPACE
        rules.add("\u2003 > ' ';"); // EM SPACE
        rules.add("\u2004 > ' ';"); // THREE-PER-EM SPACE
        rules.add("\u2005 > ' ';"); // FOUR-PER-EM SPACE
        rules.add("\u2006 > ' ';"); // SIX-PER-EM SPACE
        rules.add("\u2007 > ' ';"); // FIGURE SPACE
        rules.add("\u2008 > ' ';"); // PUNCTUATION SPACE
        rules.add("\u2009 > ' ';"); // THIN SPACE
        rules.add("\u200A > ' ';"); // HAIR SPACE

        // Zero-width joining controls -- invisible, drop
        rules.add("‌ > '';"); // 200C ZERO WIDTH NON-JOINER
        rules.add("‍ > '';"); // 200D ZERO WIDTH JOINER

        // Zero-width space -- invisible, drop. Written without quotes since
        // a quoted empty literal ('') is ICU's escape for a literal quote
        // character, not an empty string.
        rules.add("​ > ;"); // 200B ZERO WIDTH SPACE

        // Bidi marks -- invisible, drop. Written using ICU's own \\uXXXX
        // rule-text escape (rather than the raw character) because ICU's
        // rule parser treats bidi format controls as insignificant
        // whitespace and silently strips a literal occurrence, which would
        // collapse this into a masked, no-op rule.
        rules.add("\\u200E > ;"); // LEFT-TO-RIGHT MARK
        rules.add("\\u200F > ;"); // RIGHT-TO-LEFT MARK

        // Hyphens and dashes
        rules.add("‐ > '-';"); // 2010 HYPHEN
        rules.add("‑ > '-';"); // 2011 NON-BREAKING HYPHEN
        rules.add("‒ > '-';"); // 2012 FIGURE DASH
        rules.add("– > '-';"); // 2013 EN DASH
        rules.add("— > '-';"); // 2014 EM DASH
        rules.add("― > '-';"); // 2015 HORIZONTAL BAR (dup of em dash)

        // Lines
        rules.add("‖ > '||';"); // 2016 DOUBLE VERTICAL LINE
        rules.add("‗ > '_';"); // 2017 DOUBLE LOW LINE

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
        rules.add("‾ > '¿';"); // 203E OVERLINE
        rules.add("‿ > '¿';"); // 203F UNDERTIE
        rules.add("⁀ > '¿';"); // 2040 CHARACTER TIE (dup)
        rules.add("⁁ > '¿';"); // 2041 CARET INSERTION POINT (dup of 2038)
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
        rules.add("⁊ > '¿';"); // 204A TIRONIAN SIGN ET ("and")
        rules.add("⁋ > '¶';"); // 204B REVERSED PILCROW SIGN (arbitrary)
        rules.add("⁌ > '¿';"); // 204C BLACK LEFTWARDS BULLET
        rules.add("⁍ > '¿';"); // 204D BLACK RIGHTWARDS BULLET
        rules.add("⁎ > '*';"); // 204E LOW ASTERISK (dup of bullet)
        rules.add("⁏ > ';';"); // 204F REVERSED SEMICOLON
        rules.add("⁐ > '¿';"); // 2050 CLOSE UP (editorial instruction, not a
                               // glyph)
        rules.add("⁑ > '**';"); // 2051 TWO ASTERISKS ALIGNED VERTICALLY
        rules.add("⁒ > '-';"); // 2052 COMMERCIAL MINUS SIGN (dup)
        rules.add("⁓ > '~';"); // 2053 SWUNG DASH
        rules.add("⁔ > '¿';"); // 2054 INVERTED UNDERTIE (dup)
        rules.add("⁕ > '*';"); // 2055 FLOWER PUNCTUATION MARK (dup)
        rules.add("⁖ > '¿';"); // 2056 THREE DOT PUNCTUATION
        rules.add("⁗ > '''''''';"); // 2057 QUADRUPLE PRIME -> ''''
        rules.add("⁘ > '¿';"); // 2058 FOUR DOT PUNCTUATION
        rules.add("⁙ > '¿';"); // 2059 FIVE DOT PUNCTUATION
        rules.add("⁚ > ':';"); // 205A TWO DOT PUNCTUATION
        rules.add("⁛ > '¿';"); // 205B FOUR DOT MARK (dup of 2058)
        rules.add("⁜ > '+';"); // 205C DOTTED CROSS (dup of dagger)
        rules.add("⁝ > ':';"); // 205D TRICOLON
        rules.add("⁞ > ':';"); // 205E VERTICAL FOUR DOTS
        rules.add("\u205F > ' ';"); // MEDIUM MATHEMATICAL SPACE

        // Invisible math/format controls -- no glyph, drop
        rules.add("⁠ > '';"); // 2060 WORD JOINER
        rules.add("⁡ > '';"); // 2061 FUNCTION APPLICATION
        rules.add("⁢ > '';"); // 2062 INVISIBLE TIMES
        rules.add("⁣ > '';"); // 2063 INVISIBLE SEPARATOR
        rules.add("⁤ > '';"); // 2064 INVISIBLE PLUS

        // Bidi format controls (deprecated) -- no glyph, drop
        rules.add("⁪ > '';"); // 206A INHIBIT SYMMETRIC SWAPPING
        rules.add("⁫ > '';"); // 206B ACTIVATE SYMMETRIC SWAPPING
        rules.add("⁬ > '';"); // 206C INHIBIT ARABIC FORM SHAPING
        rules.add("⁭ > '';"); // 206D ACTIVATE ARABIC FORM SHAPING
        rules.add("⁮ > '';"); // 206E NATIONAL DIGIT SHAPES
        rules.add("⁯ > '';"); // 206F NOMINAL DIGIT SHAPES

        // Line/paragraph separators, bidi embedding controls, and the
        // narrow no-break space -- invisible or non-printing, drop. Written
        // without quotes since a quoted empty literal ('') is ICU's escape
        // for a literal quote character, not an empty string.
        rules.add("\\u2028 > ;"); // LINE SEPARATOR
        rules.add("\\u2029 > ;"); // PARAGRAPH SEPARATOR
        rules.add("\\u202A > ;"); // LEFT-TO-RIGHT EMBEDDING
        rules.add("\\u202B > ;"); // RIGHT-TO-LEFT EMBEDDING
        rules.add("\\u202C > ;"); // POP DIRECTIONAL FORMATTING
        rules.add("\\u202D > ;"); // LEFT-TO-RIGHT OVERRIDE
        rules.add("\\u202E > ;"); // RIGHT-TO-LEFT OVERRIDE
        rules.add("\\u202F > ;"); // NARROW NO-BREAK SPACE

        // Bidi isolate controls -- invisible, drop
        rules.add("\\u2066 > ;"); // LEFT-TO-RIGHT ISOLATE
        rules.add("\\u2067 > ;"); // RIGHT-TO-LEFT ISOLATE
        rules.add("\\u2068 > ;"); // FIRST STRONG ISOLATE
        rules.add("\\u2069 > ;"); // POP DIRECTIONAL ISOLATE

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
