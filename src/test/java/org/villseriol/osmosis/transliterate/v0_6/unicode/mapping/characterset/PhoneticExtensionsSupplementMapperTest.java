// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PhoneticExtensionsSupplementMapperTest extends LatinMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals("b", transform.action("ᶀ"));
        assertEquals("d", transform.action("ᶁ"));
        assertEquals("f", transform.action("ᶂ"));
        assertEquals("g", transform.action("ᶃ"));
        assertEquals("k", transform.action("ᶄ"));
        assertEquals("l", transform.action("ᶅ"));
        assertEquals("m", transform.action("ᶆ"));
        assertEquals("n", transform.action("ᶇ"));
        assertEquals("p", transform.action("ᶈ"));
        assertEquals("r", transform.action("ᶉ"));
        assertEquals("s", transform.action("ᶊ"));
        assertEquals("v", transform.action("ᶌ"));
        assertEquals("x", transform.action("ᶍ"));
        assertEquals("z", transform.action("ᶎ"));
        assertEquals("a", transform.action("ᶏ"));
        assertEquals("d", transform.action("ᶑ"));
        assertEquals("e", transform.action("ᶒ"));
        assertEquals("e", transform.action("ᶓ"));
        assertEquals("i", transform.action("ᶖ"));
        assertEquals("u", transform.action("ᶙ"));
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("ᶋ", transform.action("ᶋ"));
        assertEquals("ᶐ", transform.action("ᶐ"));
        assertEquals("ᶔ", transform.action("ᶔ"));
        assertEquals("ᶕ", transform.action("ᶕ"));
        assertEquals("ᶗ", transform.action("ᶗ"));
        assertEquals("ᶘ", transform.action("ᶘ"));
        assertEquals("ᶚ", transform.action("ᶚ"));
        assertEquals("ᶛ", transform.action("ᶛ"));
        assertEquals("ᶜ", transform.action("ᶜ"));
        assertEquals("ᶝ", transform.action("ᶝ"));
        assertEquals("ᶞ", transform.action("ᶞ"));
        assertEquals("ᶟ", transform.action("ᶟ"));
        assertEquals("ᶠ", transform.action("ᶠ"));
        assertEquals("ᶡ", transform.action("ᶡ"));
        assertEquals("ᶢ", transform.action("ᶢ"));
        assertEquals("ᶣ", transform.action("ᶣ"));
        assertEquals("ᶤ", transform.action("ᶤ"));
        assertEquals("ᶥ", transform.action("ᶥ"));
        assertEquals("ᶦ", transform.action("ᶦ"));
        assertEquals("ᶧ", transform.action("ᶧ"));
        assertEquals("ᶨ", transform.action("ᶨ"));
        assertEquals("ᶩ", transform.action("ᶩ"));
        assertEquals("ᶪ", transform.action("ᶪ"));
        assertEquals("ᶫ", transform.action("ᶫ"));
        assertEquals("ᶬ", transform.action("ᶬ"));
        assertEquals("ᶭ", transform.action("ᶭ"));
        assertEquals("ᶮ", transform.action("ᶮ"));
        assertEquals("ᶯ", transform.action("ᶯ"));
        assertEquals("ᶰ", transform.action("ᶰ"));
        assertEquals("ᶱ", transform.action("ᶱ"));
        assertEquals("ᶲ", transform.action("ᶲ"));
        assertEquals("ᶳ", transform.action("ᶳ"));
        assertEquals("ᶴ", transform.action("ᶴ"));
        assertEquals("ᶵ", transform.action("ᶵ"));
        assertEquals("ᶶ", transform.action("ᶶ"));
        assertEquals("ᶷ", transform.action("ᶷ"));
        assertEquals("ᶸ", transform.action("ᶸ"));
        assertEquals("ᶹ", transform.action("ᶹ"));
        assertEquals("ᶺ", transform.action("ᶺ"));
        assertEquals("ᶻ", transform.action("ᶻ"));
        assertEquals("ᶼ", transform.action("ᶼ"));
        assertEquals("ᶽ", transform.action("ᶽ"));
        assertEquals("ᶾ", transform.action("ᶾ"));
        assertEquals("ᶿ", transform.action("ᶿ"));
    }
}
