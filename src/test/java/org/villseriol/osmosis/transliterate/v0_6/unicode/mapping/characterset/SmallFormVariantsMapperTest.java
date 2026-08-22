// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public class SmallFormVariantsMapperTest {

    private final SmallFormVariantsMapper transform = new SmallFormVariantsMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.SMALL_FORM_VARIANTS) {
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
        assertEquals(",", transform.action("﹐"));
        assertEquals(",", transform.action("﹑"));
        assertEquals(".", transform.action("﹒"));
        assertEquals(";", transform.action("﹔"));
        assertEquals(":", transform.action("﹕"));
        assertEquals("?", transform.action("﹖"));
        assertEquals("!", transform.action("﹗"));
        assertEquals("-", transform.action("﹘"));
        assertEquals("(", transform.action("﹙"));
        assertEquals(")", transform.action("﹚"));
        assertEquals("{", transform.action("﹛"));
        assertEquals("}", transform.action("﹜"));
        assertEquals("[", transform.action("﹝"));
        assertEquals("]", transform.action("﹞"));
        assertEquals("#", transform.action("﹟"));
        assertEquals("&", transform.action("﹠"));
        assertEquals("*", transform.action("﹡"));
        assertEquals("+", transform.action("﹢"));
        assertEquals("-", transform.action("﹣"));
        assertEquals("<", transform.action("﹤"));
        assertEquals(">", transform.action("﹥"));
        assertEquals("=", transform.action("﹦"));
        assertEquals("\\", transform.action("﹨"));
        assertEquals("$", transform.action("﹩"));
        assertEquals("%", transform.action("﹪"));
        assertEquals("@", transform.action("﹫"));
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("﹓", transform.action("﹓")); // FE53 unassigned
        assertEquals("﹧", transform.action("﹧")); // FE67 unassigned
    }
}
