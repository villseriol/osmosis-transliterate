// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LatinExtendedCMapperTest extends LatinMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals("L", transform.action("Ⱡ"));
        assertEquals("l", transform.action("ⱡ"));
        assertEquals("L", transform.action("Ɫ"));
        assertEquals("P", transform.action("Ᵽ"));
        assertEquals("R", transform.action("Ɽ"));
        assertEquals("a", transform.action("ⱥ"));
        assertEquals("t", transform.action("ⱦ"));
        assertEquals("H", transform.action("Ⱨ"));
        assertEquals("h", transform.action("ⱨ"));
        assertEquals("K", transform.action("Ⱪ"));
        assertEquals("k", transform.action("ⱪ"));
        assertEquals("Z", transform.action("Ⱬ"));
        assertEquals("z", transform.action("ⱬ"));
        assertEquals("M", transform.action("Ɱ"));
        assertEquals("v", transform.action("ⱱ"));
        assertEquals("W", transform.action("Ⱳ"));
        assertEquals("w", transform.action("ⱳ"));
        assertEquals("v", transform.action("ⱴ"));
        assertEquals("e", transform.action("ⱸ"));
        assertEquals("o", transform.action("ⱺ"));
        assertEquals("S", transform.action("Ȿ"));
        assertEquals("Z", transform.action("Ɀ"));
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("Ɑ", transform.action("Ɑ"));
        assertEquals("Ɐ", transform.action("Ɐ"));
        assertEquals("Ɒ", transform.action("Ɒ"));
        assertEquals("Ⱶ", transform.action("Ⱶ"));
        assertEquals("ⱶ", transform.action("ⱶ"));
        assertEquals("ⱷ", transform.action("ⱷ"));
        assertEquals("ⱹ", transform.action("ⱹ"));
        assertEquals("ⱻ", transform.action("ⱻ"));
        assertEquals("ⱼ", transform.action("ⱼ"));
        assertEquals("ⱽ", transform.action("ⱽ"));
    }
}
