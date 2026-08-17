// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.UnicodeRange;


public class GeneralPunctuationMapperTest {

    private final GeneralPunctuationMapper transform = new GeneralPunctuationMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.GENERAL_PUNCTUATION) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }


    @Test
    public void testMappedCharacters() {
        // Zero-width joining controls -- mapped to a literal apostrophe by
        // the underlying ICU rule escaping (`''` denotes a quoted `'`, not
        // an empty string)
        assertEquals("'", transform.action("‌")); // ZERO WIDTH NON-JOINER
        assertEquals("'", transform.action("‍")); // ZERO WIDTH JOINER

        // Hyphens and dashes
        assertEquals("-", transform.action("‐"));
        assertEquals("-", transform.action("‑"));
        assertEquals("-", transform.action("‒"));
        assertEquals("-", transform.action("–"));
        assertEquals("-", transform.action("—"));
        assertEquals("-", transform.action("―"));

        // Lines
        assertEquals("||", transform.action("‖"));
        assertEquals("_", transform.action("‗"));

        // Quotation marks
        assertEquals("'", transform.action("‘"));
        assertEquals("'", transform.action("’"));
        assertEquals(",", transform.action("‚"));
        assertEquals("'", transform.action("‛"));
        assertEquals("\"", transform.action("“"));
        assertEquals("\"", transform.action("”"));
        assertEquals("\"", transform.action("„"));
        assertEquals("\"", transform.action("‟"));

        // Dagger / bullets / leaders
        assertEquals("+", transform.action("†"));
        assertEquals("++", transform.action("‡"));
        assertEquals("*", transform.action("•"));
        assertEquals(">", transform.action("‣"));
        assertEquals(".", transform.action("․"));
        assertEquals("..", transform.action("‥"));
        assertEquals("...", transform.action("…"));
        assertEquals("-", transform.action("‧"));

        // Per mille / primes
        assertEquals("%", transform.action("‰"));
        assertEquals("%", transform.action("‱"));
        assertEquals("'", transform.action("′"));
        assertEquals("''", transform.action("″"));
        assertEquals("'''", transform.action("‴"));
        assertEquals("`", transform.action("‵"));
        assertEquals("``", transform.action("‶"));
        assertEquals("```", transform.action("‷"));
        assertEquals("^", transform.action("‸"));

        // Angle quotes / marks
        assertEquals("<", transform.action("‹"));
        assertEquals(">", transform.action("›"));
        assertEquals("*", transform.action("※"));
        assertEquals("!!", transform.action("‼"));
        assertEquals("?!", transform.action("‽"));
        assertEquals("***", transform.action("⁂"));
        assertEquals("-", transform.action("⁃"));
        assertEquals("/", transform.action("⁄"));

        // Brackets / question-exclamation combos
        assertEquals("[", transform.action("⁅"));
        assertEquals("]", transform.action("⁆"));
        assertEquals("??", transform.action("⁇"));
        assertEquals("?!", transform.action("⁈"));
        assertEquals("!?", transform.action("⁉"));

        // Editorial / archaic marks
        assertEquals("¶", transform.action("⁋"));
        assertEquals("*", transform.action("⁎"));
        assertEquals(";", transform.action("⁏"));
        assertEquals("**", transform.action("⁑"));
        assertEquals("-", transform.action("⁒"));
        assertEquals("~", transform.action("⁓"));
        assertEquals("*", transform.action("⁕"));
        assertEquals("''''", transform.action("⁗"));
        assertEquals(":", transform.action("⁚"));
        assertEquals("+", transform.action("⁜"));
        assertEquals(":", transform.action("⁝"));
        assertEquals(":", transform.action("⁞"));

        // Invisible math/format controls -- mapped to a literal apostrophe
        // by the underlying ICU rule escaping (see zero-width joiners above)
        assertEquals("'", transform.action("⁠")); // WORD JOINER
        assertEquals("'", transform.action("⁡")); // FUNCTION APPLICATION
        assertEquals("'", transform.action("⁢")); // INVISIBLE TIMES
        assertEquals("'", transform.action("⁣")); // INVISIBLE SEPARATOR
        assertEquals("'", transform.action("⁤")); // INVISIBLE PLUS

        // Bidi format controls (deprecated) -- same apostrophe escaping quirk
        assertEquals("'", transform.action("⁪")); // INHIBIT SYMMETRIC SWAPPING
        assertEquals("'", transform.action("⁫")); // ACTIVATE SYMMETRIC SWAPPING
        assertEquals("'", transform.action("⁬")); // INHIBIT ARABIC FORM SHAPING
        assertEquals("'", transform.action("⁭")); // ACTIVATE ARABIC FORM
                                                  // SHAPING
        assertEquals("'", transform.action("⁮")); // NATIONAL DIGIT SHAPES
        assertEquals("'", transform.action("⁯")); // NOMINAL DIGIT SHAPES

        // Space variants -- normalized to a standard ASCII space. Written
        // as escaped code points since these are visually indistinguishable
        // from a plain ASCII space in source.
        assertEquals(" ", transform.action("\u2000")); // EN QUAD
        assertEquals(" ", transform.action("\u2001")); // EM QUAD
        assertEquals(" ", transform.action("\u2002")); // EN SPACE
        assertEquals(" ", transform.action("\u2003")); // EM SPACE
        assertEquals(" ", transform.action("\u2004")); // THREE-PER-EM SPACE
        assertEquals(" ", transform.action("\u2005")); // FOUR-PER-EM SPACE
        assertEquals(" ", transform.action("\u2006")); // SIX-PER-EM SPACE
        assertEquals(" ", transform.action("\u2007")); // FIGURE SPACE
        assertEquals(" ", transform.action("\u2008")); // PUNCTUATION SPACE
        assertEquals(" ", transform.action("\u2009")); // THIN SPACE
        assertEquals(" ", transform.action("\u200A")); // HAIR SPACE
        assertEquals(" ", transform.action("\u205F")); // MEDIUM MATHEMATICAL SPACE
        assertEquals(" ", transform.action("\u202F")); // NARROW NO-BREAK SPACE

        // Zero-width space -- invisible, drop
        assertEquals("", transform.action("\u200B")); // ZERO WIDTH SPACE

        // Line/paragraph separators and bidi embedding controls --
        // invisible or non-printing, drop
        assertEquals("", transform.action("\u2028")); // LINE SEPARATOR
        assertEquals("", transform.action("\u2029")); // PARAGRAPH SEPARATOR
        assertEquals("", transform.action("\u202A")); // LEFT-TO-RIGHT EMBEDDING
        assertEquals("", transform.action("\u202B")); // RIGHT-TO-LEFT EMBEDDING
        assertEquals("", transform.action("\u202C")); // POP DIRECTIONAL FORMATTING
        assertEquals("", transform.action("\u202D")); // LEFT-TO-RIGHT OVERRIDE
        assertEquals("", transform.action("\u202E")); // RIGHT-TO-LEFT OVERRIDE

        // Bidi isolate controls -- invisible, drop
        assertEquals("", transform.action("\u2066")); // LEFT-TO-RIGHT ISOLATE
        assertEquals("", transform.action("\u2067")); // RIGHT-TO-LEFT ISOLATE
        assertEquals("", transform.action("\u2068")); // FIRST STRONG ISOLATE
        assertEquals("", transform.action("\u2069")); // POP DIRECTIONAL ISOLATE

        // Bidi marks -- invisible, drop
        assertEquals("", transform.action("\u200E")); // LEFT-TO-RIGHT MARK
        assertEquals("", transform.action("\u200F")); // RIGHT-TO-LEFT MARK
    }


    @Test
    public void testUnmappedCharacters() {
        // Reserved, unassigned in Unicode -- no mapping is provided, so it
        // is left untouched.
        assertEquals("\u2065", transform.action("\u2065"));
    }


    @Test
    public void testUnsupportedCharacter() {
        // Characters with no reasonable ASCII equivalent -- mapped to the
        // inverted question mark as a generic "unsupported" marker.
        assertEquals("¿", transform.action("‿")); // UNDERTIE
        assertEquals("¿", transform.action("⁔")); // INVERTED UNDERTIE
        assertEquals("¿", transform.action("‾")); // OVERLINE
        assertEquals("¿", transform.action("⁀")); // CHARACTER TIE
        assertEquals("¿", transform.action("⁁")); // CARET INSERTION POINT
        assertEquals("¿", transform.action("⁊")); // TIRONIAN SIGN ET ("and")
        assertEquals("¿", transform.action("⁌")); // BLACK LEFTWARDS BULLET
        assertEquals("¿", transform.action("⁍")); // BLACK RIGHTWARDS BULLET
        assertEquals("¿", transform.action("⁐")); // CLOSE UP
        assertEquals("¿", transform.action("⁖")); // THREE DOT PUNCTUATION
        assertEquals("¿", transform.action("⁘")); // FOUR DOT PUNCTUATION
        assertEquals("¿", transform.action("⁙")); // FIVE DOT PUNCTUATION
        assertEquals("¿", transform.action("⁛")); // FOUR DOT MARK
    }
}
