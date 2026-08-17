// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.decorator.TransformSequenceDecorator;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.RangeToWhitespaceTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;


public class SmallFormVariantsMapperTest {

    private final Unimap transform = new TransformSequenceDecorator(new SmallFormVariantsMapper(),
            new RangeToWhitespaceTransform(UnicodeRange.SMALL_FORM_VARIANTS));

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
        assertEquals(" ", transform.action("﹓"));
        assertEquals(" ", transform.action("﹧"));
    }
}
