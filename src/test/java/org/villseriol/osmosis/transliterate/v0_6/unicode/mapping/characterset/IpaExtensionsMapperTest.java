// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class IpaExtensionsMapperTest extends LatinMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals("b", transform.action("ɓ"));
        assertEquals("c", transform.action("ɕ"));
        assertEquals("d", transform.action("ɖ"));
        assertEquals("d", transform.action("ɗ"));
        assertEquals("e", transform.action("ɛ"));
        assertEquals("j", transform.action("ɟ"));
        assertEquals("g", transform.action("ɠ"));
        assertEquals("g", transform.action("ɡ"));
        assertEquals("G", transform.action("ɢ"));
        assertEquals("h", transform.action("ɦ"));
        assertEquals("h", transform.action("ɧ"));
        assertEquals("i", transform.action("ɨ"));
        assertEquals("I", transform.action("ɪ"));
        assertEquals("l", transform.action("ɫ"));
        assertEquals("l", transform.action("ɬ"));
        assertEquals("l", transform.action("ɭ"));
        assertEquals("m", transform.action("ɱ"));
        assertEquals("n", transform.action("ɲ"));
        assertEquals("n", transform.action("ɳ"));
        assertEquals("N", transform.action("ɴ"));
        assertEquals("OE", transform.action("ɶ"));
        assertEquals("r", transform.action("ɼ"));
        assertEquals("r", transform.action("ɽ"));
        assertEquals("r", transform.action("ɾ"));
        assertEquals("R", transform.action("ʀ"));
        assertEquals("s", transform.action("ʂ"));
        assertEquals("t", transform.action("ʈ"));
        assertEquals("u", transform.action("ʉ"));
        assertEquals("v", transform.action("ʋ"));
        assertEquals("Y", transform.action("ʏ"));
        assertEquals("z", transform.action("ʐ"));
        assertEquals("z", transform.action("ʑ"));
        assertEquals("B", transform.action("ʙ"));
        assertEquals("G", transform.action("ʛ"));
        assertEquals("H", transform.action("ʜ"));
        assertEquals("j", transform.action("ʝ"));
        assertEquals("L", transform.action("ʟ"));
        assertEquals("q", transform.action("ʠ"));
        assertEquals("dz", transform.action("ʣ"));
        assertEquals("dz", transform.action("ʥ"));
        assertEquals("ts", transform.action("ʦ"));
        assertEquals("ls", transform.action("ʪ"));
        assertEquals("lz", transform.action("ʫ"));
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("ɐ", transform.action("ɐ"));
        assertEquals("ɑ", transform.action("ɑ"));
        assertEquals("ɒ", transform.action("ɒ"));
        assertEquals("ɔ", transform.action("ɔ"));
        assertEquals("ɘ", transform.action("ɘ"));
        assertEquals("ə", transform.action("ə"));
        assertEquals("ɚ", transform.action("ɚ"));
        assertEquals("ɜ", transform.action("ɜ"));
        assertEquals("ɝ", transform.action("ɝ"));
        assertEquals("ɞ", transform.action("ɞ"));
        assertEquals("ɣ", transform.action("ɣ"));
        assertEquals("ɤ", transform.action("ɤ"));
        assertEquals("ɥ", transform.action("ɥ"));
        assertEquals("ɩ", transform.action("ɩ"));
        assertEquals("ɮ", transform.action("ɮ"));
        assertEquals("ɯ", transform.action("ɯ"));
        assertEquals("ɰ", transform.action("ɰ"));
        assertEquals("ɵ", transform.action("ɵ"));
        assertEquals("ɷ", transform.action("ɷ"));
        assertEquals("ɸ", transform.action("ɸ"));
        assertEquals("ɹ", transform.action("ɹ"));
        assertEquals("ɺ", transform.action("ɺ"));
        assertEquals("ɻ", transform.action("ɻ"));
        assertEquals("ɿ", transform.action("ɿ"));
        assertEquals("ʁ", transform.action("ʁ"));
        assertEquals("ʃ", transform.action("ʃ"));
        assertEquals("ʄ", transform.action("ʄ"));
        assertEquals("ʅ", transform.action("ʅ"));
        assertEquals("ʆ", transform.action("ʆ"));
        assertEquals("ʇ", transform.action("ʇ"));
        assertEquals("ʊ", transform.action("ʊ"));
        assertEquals("ʌ", transform.action("ʌ"));
        assertEquals("ʍ", transform.action("ʍ"));
        assertEquals("ʎ", transform.action("ʎ"));
        assertEquals("ʒ", transform.action("ʒ"));
        assertEquals("ʓ", transform.action("ʓ"));
        assertEquals("ʔ", transform.action("ʔ"));
        assertEquals("ʕ", transform.action("ʕ"));
        assertEquals("ʖ", transform.action("ʖ"));
        assertEquals("ʗ", transform.action("ʗ"));
        assertEquals("ʘ", transform.action("ʘ"));
        assertEquals("ʚ", transform.action("ʚ"));
        assertEquals("ʞ", transform.action("ʞ"));
        assertEquals("ʡ", transform.action("ʡ"));
        assertEquals("ʢ", transform.action("ʢ"));
        assertEquals("ʤ", transform.action("ʤ"));
        assertEquals("ʧ", transform.action("ʧ"));
        assertEquals("ʨ", transform.action("ʨ"));
        assertEquals("ʩ", transform.action("ʩ"));
        assertEquals("ʬ", transform.action("ʬ"));
        assertEquals("ʭ", transform.action("ʭ"));
        assertEquals("ʮ", transform.action("ʮ"));
        assertEquals("ʯ", transform.action("ʯ"));
    }
}
