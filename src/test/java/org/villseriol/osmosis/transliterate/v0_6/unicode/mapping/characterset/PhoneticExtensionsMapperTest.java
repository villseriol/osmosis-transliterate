// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public class PhoneticExtensionsMapperTest {

    private final PhoneticExtensionsMapper transform = new PhoneticExtensionsMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.PHONETIC_EXTENSIONS) {
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
        assertEquals("A", transform.action("ᴀ"));
        assertEquals("AE", transform.action("ᴁ"));
        assertEquals("B", transform.action("ᴃ"));
        assertEquals("C", transform.action("ᴄ"));
        assertEquals("D", transform.action("ᴅ"));
        assertEquals("D", transform.action("ᴆ"));
        assertEquals("E", transform.action("ᴇ"));
        assertEquals("J", transform.action("ᴊ"));
        assertEquals("K", transform.action("ᴋ"));
        assertEquals("L", transform.action("ᴌ"));
        assertEquals("M", transform.action("ᴍ"));
        assertEquals("O", transform.action("ᴏ"));
        assertEquals("P", transform.action("ᴘ"));
        assertEquals("T", transform.action("ᴛ"));
        assertEquals("U", transform.action("ᴜ"));
        assertEquals("V", transform.action("ᴠ"));
        assertEquals("W", transform.action("ᴡ"));
        assertEquals("Z", transform.action("ᴢ"));
        assertEquals("ue", transform.action("ᵫ"));
        assertEquals("b", transform.action("ᵬ"));
        assertEquals("d", transform.action("ᵭ"));
        assertEquals("f", transform.action("ᵮ"));
        assertEquals("m", transform.action("ᵯ"));
        assertEquals("n", transform.action("ᵰ"));
        assertEquals("p", transform.action("ᵱ"));
        assertEquals("r", transform.action("ᵲ"));
        assertEquals("r", transform.action("ᵳ"));
        assertEquals("s", transform.action("ᵴ"));
        assertEquals("t", transform.action("ᵵ"));
        assertEquals("z", transform.action("ᵶ"));
        assertEquals("th", transform.action("ᵺ"));
        assertEquals("I", transform.action("ᵻ"));
        assertEquals("p", transform.action("ᵽ"));
        assertEquals("U", transform.action("ᵾ"));

        assertEquals("A", transform.action("ᴬ"));
        assertEquals("AE", transform.action("ᴭ"));
        assertEquals("B", transform.action("ᴮ"));
        assertEquals("B", transform.action("ᴯ"));
        assertEquals("D", transform.action("ᴰ"));
        assertEquals("E", transform.action("ᴱ"));
        assertEquals("G", transform.action("ᴳ"));
        assertEquals("H", transform.action("ᴴ"));
        assertEquals("I", transform.action("ᴵ"));
        assertEquals("J", transform.action("ᴶ"));
        assertEquals("K", transform.action("ᴷ"));
        assertEquals("L", transform.action("ᴸ"));
        assertEquals("M", transform.action("ᴹ"));
        assertEquals("N", transform.action("ᴺ"));
        assertEquals("O", transform.action("ᴼ"));
        assertEquals("OU", transform.action("ᴽ"));
        assertEquals("P", transform.action("ᴾ"));
        assertEquals("R", transform.action("ᴿ"));
        assertEquals("T", transform.action("ᵀ"));
        assertEquals("U", transform.action("ᵁ"));
        assertEquals("W", transform.action("ᵂ"));
        assertEquals("a", transform.action("ᵃ"));
        assertEquals("a", transform.action("ᵅ"));
        assertEquals("b", transform.action("ᵇ"));
        assertEquals("d", transform.action("ᵈ"));
        assertEquals("e", transform.action("ᵉ"));
        assertEquals("g", transform.action("ᵍ"));
        assertEquals("k", transform.action("ᵏ"));
        assertEquals("m", transform.action("ᵐ"));
        assertEquals("o", transform.action("ᵒ"));
        assertEquals("p", transform.action("ᵖ"));
        assertEquals("t", transform.action("ᵗ"));
        assertEquals("u", transform.action("ᵘ"));
        assertEquals("v", transform.action("ᵛ"));
    }


    @Test
    public void testUnsupportedCharacter() {
        // Characters with no reasonable ASCII equivalent -- mapped to a
        // space as a generic "unsupported" marker.
        assertEquals(" ", transform.action("ᴂ"));
        assertEquals(" ", transform.action("ᴈ"));
        assertEquals(" ", transform.action("ᴉ"));
        assertEquals(" ", transform.action("ᴎ"));
        assertEquals(" ", transform.action("ᴐ"));
        assertEquals(" ", transform.action("ᴑ"));
        assertEquals(" ", transform.action("ᴒ"));
        assertEquals(" ", transform.action("ᴓ"));
        assertEquals(" ", transform.action("ᴔ"));
        assertEquals(" ", transform.action("ᴕ"));
        assertEquals(" ", transform.action("ᴖ"));
        assertEquals(" ", transform.action("ᴗ"));
        assertEquals(" ", transform.action("ᴙ"));
        assertEquals(" ", transform.action("ᴚ"));
        assertEquals(" ", transform.action("ᴝ"));
        assertEquals(" ", transform.action("ᴞ"));
        assertEquals(" ", transform.action("ᴟ"));
        assertEquals(" ", transform.action("ᴣ"));
        assertEquals(" ", transform.action("ᴤ"));
        assertEquals(" ", transform.action("ᴥ"));
        assertEquals(" ", transform.action("ᴦ"));
        assertEquals(" ", transform.action("ᴧ"));
        assertEquals(" ", transform.action("ᴨ"));
        assertEquals(" ", transform.action("ᴩ"));
        assertEquals(" ", transform.action("ᴪ"));
        assertEquals(" ", transform.action("ᴫ"));
        assertEquals(" ", transform.action("ᴲ"));
        assertEquals(" ", transform.action("ᴻ"));
        assertEquals(" ", transform.action("ᵄ"));
        assertEquals(" ", transform.action("ᵆ"));
        assertEquals(" ", transform.action("ᵊ"));
        assertEquals(" ", transform.action("ᵋ"));
        assertEquals(" ", transform.action("ᵌ"));
        assertEquals(" ", transform.action("ᵎ"));
        assertEquals(" ", transform.action("ᵑ"));
        assertEquals(" ", transform.action("ᵓ"));
        assertEquals(" ", transform.action("ᵔ"));
        assertEquals(" ", transform.action("ᵕ"));
        assertEquals(" ", transform.action("ᵙ"));
        assertEquals(" ", transform.action("ᵚ"));
        assertEquals(" ", transform.action("ᵜ"));
        assertEquals(" ", transform.action("ᵝ"));
        assertEquals(" ", transform.action("ᵞ"));
        assertEquals(" ", transform.action("ᵟ"));
        assertEquals(" ", transform.action("ᵠ"));
        assertEquals(" ", transform.action("ᵡ"));
        assertEquals(" ", transform.action("ᵢ"));
        assertEquals(" ", transform.action("ᵣ"));
        assertEquals(" ", transform.action("ᵤ"));
        assertEquals(" ", transform.action("ᵥ"));
        assertEquals(" ", transform.action("ᵦ"));
        assertEquals(" ", transform.action("ᵧ"));
        assertEquals(" ", transform.action("ᵨ"));
        assertEquals(" ", transform.action("ᵩ"));
        assertEquals(" ", transform.action("ᵪ"));
        assertEquals(" ", transform.action("ᵷ"));
        assertEquals(" ", transform.action("ᵸ"));
        assertEquals(" ", transform.action("ᵹ"));
        assertEquals(" ", transform.action("ᵼ"));
        assertEquals(" ", transform.action("ᵿ"));
    }
}
