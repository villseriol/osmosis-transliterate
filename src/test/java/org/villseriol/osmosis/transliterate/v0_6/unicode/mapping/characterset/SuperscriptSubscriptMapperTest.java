// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.common.UnicodeRange;


public class SuperscriptSubscriptMapperTest {

    private final SuperscriptSubscriptMapper transform = new SuperscriptSubscriptMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.SUPERSCRIPTS_AND_SUBSCRIPTS) {
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
        // Superscript digits
        assertEquals("0", transform.action("⁰"));
        assertEquals("i", transform.action("ⁱ"));
        assertEquals("4", transform.action("⁴"));
        assertEquals("5", transform.action("⁵"));
        assertEquals("6", transform.action("⁶"));
        assertEquals("7", transform.action("⁷"));
        assertEquals("8", transform.action("⁸"));
        assertEquals("9", transform.action("⁹"));

        // Superscript symbols
        assertEquals("+", transform.action("⁺"));
        assertEquals("-", transform.action("⁻"));
        assertEquals("=", transform.action("⁼"));
        assertEquals("(", transform.action("⁽"));
        assertEquals(")", transform.action("⁾"));
        assertEquals("n", transform.action("ⁿ"));

        // Subscript digits
        assertEquals("0", transform.action("₀"));
        assertEquals("1", transform.action("₁"));
        assertEquals("2", transform.action("₂"));
        assertEquals("3", transform.action("₃"));
        assertEquals("4", transform.action("₄"));
        assertEquals("5", transform.action("₅"));
        assertEquals("6", transform.action("₆"));
        assertEquals("7", transform.action("₇"));
        assertEquals("8", transform.action("₈"));
        assertEquals("9", transform.action("₉"));

        // Subscript symbols
        assertEquals("+", transform.action("₊"));
        assertEquals("-", transform.action("₋"));
        assertEquals("=", transform.action("₌"));
        assertEquals("(", transform.action("₍"));
        assertEquals(")", transform.action("₎"));

        // Latin subscript letters
        assertEquals("a", transform.action("ₐ"));
        assertEquals("e", transform.action("ₑ"));
        assertEquals("o", transform.action("ₒ"));
        assertEquals("x", transform.action("ₓ"));
        assertEquals("e", transform.action("ₔ")); // SCHWA -- approximated
        assertEquals("h", transform.action("ₕ"));
        assertEquals("k", transform.action("ₖ"));
        assertEquals("l", transform.action("ₗ"));
        assertEquals("m", transform.action("ₘ"));
        assertEquals("n", transform.action("ₙ"));
        assertEquals("p", transform.action("ₚ"));
        assertEquals("s", transform.action("ₛ"));
        assertEquals("t", transform.action("ₜ"));
    }


    @Test
    public void testUnmappedCharacters() {
        // Reserved, unassigned in Unicode -- no mapping is provided, so
        // they are left untouched.
        assertEquals("⁲", transform.action("⁲")); // 2072
        assertEquals("⁳", transform.action("⁳")); // 2073
        assertEquals("₏", transform.action("₏")); // 208F
    }
}
