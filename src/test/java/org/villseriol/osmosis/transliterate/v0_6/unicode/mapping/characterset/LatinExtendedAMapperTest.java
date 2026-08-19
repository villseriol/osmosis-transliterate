// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.villseriol.osmosis.common.UnicodeRange;


public class LatinExtendedAMapperTest extends LatinMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals("A", transform.action("Ā"));
        assertEquals("a", transform.action("ā"));
        assertEquals("A", transform.action("Ă"));
        assertEquals("a", transform.action("ă"));
        assertEquals("A", transform.action("Ą"));
        assertEquals("a", transform.action("ą"));
        assertEquals("C", transform.action("Ć"));
        assertEquals("c", transform.action("ć"));
        assertEquals("C", transform.action("Ĉ"));
        assertEquals("c", transform.action("ĉ"));
        assertEquals("C", transform.action("Ċ"));
        assertEquals("c", transform.action("ċ"));
        assertEquals("C", transform.action("Č"));
        assertEquals("c", transform.action("č"));
        assertEquals("D", transform.action("Ď"));
        assertEquals("d", transform.action("ď"));
        assertEquals("D", transform.action("Đ"));
        assertEquals("d", transform.action("đ"));
        assertEquals("E", transform.action("Ē"));
        assertEquals("e", transform.action("ē"));
        assertEquals("E", transform.action("Ĕ"));
        assertEquals("e", transform.action("ĕ"));
        assertEquals("E", transform.action("Ė"));
        assertEquals("e", transform.action("ė"));
        assertEquals("E", transform.action("Ę"));
        assertEquals("e", transform.action("ę"));
        assertEquals("E", transform.action("Ě"));
        assertEquals("e", transform.action("ě"));
        assertEquals("G", transform.action("Ĝ"));
        assertEquals("g", transform.action("ĝ"));
        assertEquals("G", transform.action("Ğ"));
        assertEquals("g", transform.action("ğ"));
        assertEquals("G", transform.action("Ġ"));
        assertEquals("g", transform.action("ġ"));
        assertEquals("G", transform.action("Ģ"));
        assertEquals("g", transform.action("ģ"));
        assertEquals("H", transform.action("Ĥ"));
        assertEquals("h", transform.action("ĥ"));
        assertEquals("H", transform.action("Ħ"));
        assertEquals("h", transform.action("ħ"));
        assertEquals("I", transform.action("Ĩ"));
        assertEquals("i", transform.action("ĩ"));
        assertEquals("I", transform.action("Ī"));
        assertEquals("i", transform.action("ī"));
        assertEquals("I", transform.action("Ĭ"));
        assertEquals("i", transform.action("ĭ"));
        assertEquals("I", transform.action("Į"));
        assertEquals("i", transform.action("į"));
        assertEquals("I", transform.action("İ"));
        assertEquals("i", transform.action("ı"));
        assertEquals("IJ", transform.action("Ĳ"));
        assertEquals("ij", transform.action("ĳ"));
        assertEquals("J", transform.action("Ĵ"));
        assertEquals("j", transform.action("ĵ"));
        assertEquals("K", transform.action("Ķ"));
        assertEquals("k", transform.action("ķ"));
        assertEquals("q", transform.action("ĸ"));
        assertEquals("L", transform.action("Ĺ"));
        assertEquals("l", transform.action("ĺ"));
        assertEquals("L", transform.action("Ļ"));
        assertEquals("l", transform.action("ļ"));
        assertEquals("L", transform.action("Ľ"));
        assertEquals("l", transform.action("ľ"));
        assertEquals("L", transform.action("Ŀ"));
        assertEquals("l", transform.action("ŀ"));
        assertEquals("L", transform.action("Ł"));
        assertEquals("l", transform.action("ł"));
        assertEquals("N", transform.action("Ń"));
        assertEquals("n", transform.action("ń"));
        assertEquals("N", transform.action("Ņ"));
        assertEquals("n", transform.action("ņ"));
        assertEquals("N", transform.action("Ň"));
        assertEquals("n", transform.action("ň"));
        assertEquals("'n", transform.action("ŉ"));
        assertEquals("N", transform.action("Ŋ"));
        assertEquals("n", transform.action("ŋ"));
        assertEquals("O", transform.action("Ō"));
        assertEquals("o", transform.action("ō"));
        assertEquals("O", transform.action("Ŏ"));
        assertEquals("o", transform.action("ŏ"));
        assertEquals("O", transform.action("Ő"));
        assertEquals("o", transform.action("ő"));
        assertEquals("OE", transform.action("Œ"));
        assertEquals("oe", transform.action("œ"));
        assertEquals("R", transform.action("Ŕ"));
        assertEquals("r", transform.action("ŕ"));
        assertEquals("R", transform.action("Ŗ"));
        assertEquals("r", transform.action("ŗ"));
        assertEquals("R", transform.action("Ř"));
        assertEquals("r", transform.action("ř"));
        assertEquals("S", transform.action("Ś"));
        assertEquals("s", transform.action("ś"));
        assertEquals("S", transform.action("Ŝ"));
        assertEquals("s", transform.action("ŝ"));
        assertEquals("S", transform.action("Ş"));
        assertEquals("s", transform.action("ş"));
        assertEquals("S", transform.action("Š"));
        assertEquals("s", transform.action("š"));
        assertEquals("T", transform.action("Ţ"));
        assertEquals("t", transform.action("ţ"));
        assertEquals("T", transform.action("Ť"));
        assertEquals("t", transform.action("ť"));
        assertEquals("T", transform.action("Ŧ"));
        assertEquals("t", transform.action("ŧ"));
        assertEquals("U", transform.action("Ũ"));
        assertEquals("u", transform.action("ũ"));
        assertEquals("U", transform.action("Ū"));
        assertEquals("u", transform.action("ū"));
        assertEquals("U", transform.action("Ŭ"));
        assertEquals("u", transform.action("ŭ"));
        assertEquals("U", transform.action("Ů"));
        assertEquals("u", transform.action("ů"));
        assertEquals("U", transform.action("Ű"));
        assertEquals("u", transform.action("ű"));
        assertEquals("U", transform.action("Ų"));
        assertEquals("u", transform.action("ų"));
        assertEquals("W", transform.action("Ŵ"));
        assertEquals("w", transform.action("ŵ"));
        assertEquals("Y", transform.action("Ŷ"));
        assertEquals("y", transform.action("ŷ"));
        assertEquals("Y", transform.action("Ÿ"));
        assertEquals("Z", transform.action("Ź"));
        assertEquals("z", transform.action("ź"));
        assertEquals("Z", transform.action("Ż"));
        assertEquals("z", transform.action("ż"));
        assertEquals("Z", transform.action("Ž"));
        assertEquals("z", transform.action("ž"));
        assertEquals("s", transform.action("ſ"));
    }


    @Test
    public void testUnmappedCharacters() {
        for (int codePoint = UnicodeRange.LATIN_EXTENDED_A.getLower(); codePoint <= UnicodeRange.LATIN_EXTENDED_A
                .getUpper(); codePoint++) {
            String input = new String(Character.toChars(codePoint));

            assertNotEquals(input, transform.action(input));
        }
    }
}
