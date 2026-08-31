// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public class KatakanaPhoneticExtensionsMapperTest {

    private final KatakanaPhoneticExtensionsMapper transform = new KatakanaPhoneticExtensionsMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.KATAKANA_PHONETIC_EXTENSIONS) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }


    @Test
    public void testSmallKatakanaExtensionsMapToFullWidthEquivalent() {
        assertEquals("ク", transform.action("ㇰ"));
        assertEquals("シ", transform.action("ㇱ"));
        assertEquals("ス", transform.action("ㇲ"));
        assertEquals("ト", transform.action("ㇳ"));
        assertEquals("ヌ", transform.action("ㇴ"));
        assertEquals("ハ", transform.action("ㇵ"));
        assertEquals("ヒ", transform.action("ㇶ"));
        assertEquals("フ", transform.action("ㇷ"));
        assertEquals("ヘ", transform.action("ㇸ"));
        assertEquals("ホ", transform.action("ㇹ"));
        assertEquals("ム", transform.action("ㇺ"));
        assertEquals("ラ", transform.action("ㇻ"));
        assertEquals("リ", transform.action("ㇼ"));
        assertEquals("ル", transform.action("ㇽ"));
        assertEquals("レ", transform.action("ㇾ"));
        assertEquals("ロ", transform.action("ㇿ"));
    }
}
