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
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("ᴂ", transform.action("ᴂ"));
        assertEquals("ᴈ", transform.action("ᴈ"));
        assertEquals("ᴉ", transform.action("ᴉ"));
        assertEquals("ᴎ", transform.action("ᴎ"));
        assertEquals("ᴐ", transform.action("ᴐ"));
        assertEquals("ᴑ", transform.action("ᴑ"));
        assertEquals("ᴒ", transform.action("ᴒ"));
        assertEquals("ᴓ", transform.action("ᴓ"));
        assertEquals("ᴔ", transform.action("ᴔ"));
        assertEquals("ᴕ", transform.action("ᴕ"));
        assertEquals("ᴖ", transform.action("ᴖ"));
        assertEquals("ᴗ", transform.action("ᴗ"));
        assertEquals("ᴙ", transform.action("ᴙ"));
        assertEquals("ᴚ", transform.action("ᴚ"));
        assertEquals("ᴝ", transform.action("ᴝ"));
        assertEquals("ᴞ", transform.action("ᴞ"));
        assertEquals("ᴟ", transform.action("ᴟ"));
        assertEquals("ᴣ", transform.action("ᴣ"));
        assertEquals("ᴤ", transform.action("ᴤ"));
        assertEquals("ᴥ", transform.action("ᴥ"));
        assertEquals("ᴦ", transform.action("ᴦ"));
        assertEquals("ᴧ", transform.action("ᴧ"));
        assertEquals("ᴨ", transform.action("ᴨ"));
        assertEquals("ᴩ", transform.action("ᴩ"));
        assertEquals("ᴪ", transform.action("ᴪ"));
        assertEquals("ᴫ", transform.action("ᴫ"));
        assertEquals("ᴬ", transform.action("ᴬ"));
        assertEquals("ᴭ", transform.action("ᴭ"));
        assertEquals("ᴮ", transform.action("ᴮ"));
        assertEquals("ᴯ", transform.action("ᴯ"));
        assertEquals("ᴰ", transform.action("ᴰ"));
        assertEquals("ᴱ", transform.action("ᴱ"));
        assertEquals("ᴲ", transform.action("ᴲ"));
        assertEquals("ᴳ", transform.action("ᴳ"));
        assertEquals("ᴴ", transform.action("ᴴ"));
        assertEquals("ᴵ", transform.action("ᴵ"));
        assertEquals("ᴶ", transform.action("ᴶ"));
        assertEquals("ᴷ", transform.action("ᴷ"));
        assertEquals("ᴸ", transform.action("ᴸ"));
        assertEquals("ᴹ", transform.action("ᴹ"));
        assertEquals("ᴺ", transform.action("ᴺ"));
        assertEquals("ᴻ", transform.action("ᴻ"));
        assertEquals("ᴼ", transform.action("ᴼ"));
        assertEquals("ᴽ", transform.action("ᴽ"));
        assertEquals("ᴾ", transform.action("ᴾ"));
        assertEquals("ᴿ", transform.action("ᴿ"));
        assertEquals("ᵀ", transform.action("ᵀ"));
        assertEquals("ᵁ", transform.action("ᵁ"));
        assertEquals("ᵂ", transform.action("ᵂ"));
        assertEquals("ᵃ", transform.action("ᵃ"));
        assertEquals("ᵄ", transform.action("ᵄ"));
        assertEquals("ᵅ", transform.action("ᵅ"));
        assertEquals("ᵆ", transform.action("ᵆ"));
        assertEquals("ᵇ", transform.action("ᵇ"));
        assertEquals("ᵈ", transform.action("ᵈ"));
        assertEquals("ᵉ", transform.action("ᵉ"));
        assertEquals("ᵊ", transform.action("ᵊ"));
        assertEquals("ᵋ", transform.action("ᵋ"));
        assertEquals("ᵌ", transform.action("ᵌ"));
        assertEquals("ᵍ", transform.action("ᵍ"));
        assertEquals("ᵎ", transform.action("ᵎ"));
        assertEquals("ᵏ", transform.action("ᵏ"));
        assertEquals("ᵐ", transform.action("ᵐ"));
        assertEquals("ᵑ", transform.action("ᵑ"));
        assertEquals("ᵒ", transform.action("ᵒ"));
        assertEquals("ᵓ", transform.action("ᵓ"));
        assertEquals("ᵔ", transform.action("ᵔ"));
        assertEquals("ᵕ", transform.action("ᵕ"));
        assertEquals("ᵖ", transform.action("ᵖ"));
        assertEquals("ᵗ", transform.action("ᵗ"));
        assertEquals("ᵘ", transform.action("ᵘ"));
        assertEquals("ᵙ", transform.action("ᵙ"));
        assertEquals("ᵚ", transform.action("ᵚ"));
        assertEquals("ᵛ", transform.action("ᵛ"));
        assertEquals("ᵜ", transform.action("ᵜ"));
        assertEquals("ᵝ", transform.action("ᵝ"));
        assertEquals("ᵞ", transform.action("ᵞ"));
        assertEquals("ᵟ", transform.action("ᵟ"));
        assertEquals("ᵠ", transform.action("ᵠ"));
        assertEquals("ᵡ", transform.action("ᵡ"));
        assertEquals("ᵢ", transform.action("ᵢ"));
        assertEquals("ᵣ", transform.action("ᵣ"));
        assertEquals("ᵤ", transform.action("ᵤ"));
        assertEquals("ᵥ", transform.action("ᵥ"));
        assertEquals("ᵦ", transform.action("ᵦ"));
        assertEquals("ᵧ", transform.action("ᵧ"));
        assertEquals("ᵨ", transform.action("ᵨ"));
        assertEquals("ᵩ", transform.action("ᵩ"));
        assertEquals("ᵪ", transform.action("ᵪ"));
        assertEquals("ᵷ", transform.action("ᵷ"));
        assertEquals("ᵸ", transform.action("ᵸ"));
        assertEquals("ᵹ", transform.action("ᵹ"));
        assertEquals("ᵼ", transform.action("ᵼ"));
        assertEquals("ᵿ", transform.action("ᵿ"));
    }
}
