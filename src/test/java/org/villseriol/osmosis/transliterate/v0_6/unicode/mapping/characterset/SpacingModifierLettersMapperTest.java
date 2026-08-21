// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.common.UnicodeRange;


public class SpacingModifierLettersMapperTest {

    private final SpacingModifierLettersMapper transform = new SpacingModifierLettersMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.SPACING_MODIFIER_LETTERS) {
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
        assertEquals(" ", transform.action("ʰ")); // 02B0 MODIFIER LETTER SMALL H
        assertEquals(" ", transform.action("ʱ")); // 02B1 MODIFIER LETTER SMALL H WITH HOOK
        assertEquals(" ", transform.action("ʲ")); // 02B2 MODIFIER LETTER SMALL J
        assertEquals(" ", transform.action("ʳ")); // 02B3 MODIFIER LETTER SMALL R
        assertEquals(" ", transform.action("ʴ")); // 02B4 MODIFIER LETTER SMALL TURNED R
        assertEquals(" ", transform.action("ʵ")); // 02B5 MODIFIER LETTER SMALL TURNED R WITH HOOK
        assertEquals(" ", transform.action("ʶ")); // 02B6 MODIFIER LETTER SMALL CAPITAL INVERTED R
        assertEquals(" ", transform.action("ʷ")); // 02B7 MODIFIER LETTER SMALL W
        assertEquals(" ", transform.action("ʸ")); // 02B8 MODIFIER LETTER SMALL Y
        assertEquals("'", transform.action("ʹ")); // 02B9 MODIFIER LETTER PRIME
        assertEquals("\"", transform.action("ʺ")); // 02BA MODIFIER LETTER DOUBLE PRIME
        assertEquals("'", transform.action("ʻ")); // 02BB MODIFIER LETTER TURNED COMMA
        assertEquals("'", transform.action("ʼ")); // 02BC MODIFIER LETTER APOSTROPHE
        assertEquals("'", transform.action("ʽ")); // 02BD MODIFIER LETTER REVERSED COMMA
        assertEquals(" ", transform.action("ʾ")); // 02BE MODIFIER LETTER RIGHT HALF RING
        assertEquals(" ", transform.action("ʿ")); // 02BF MODIFIER LETTER LEFT HALF RING
        assertEquals(" ", transform.action("ˀ")); // 02C0 MODIFIER LETTER GLOTTAL STOP
        assertEquals(" ", transform.action("ˁ")); // 02C1 MODIFIER LETTER REVERSED GLOTTAL STOP
        assertEquals("<", transform.action("˂")); // 02C2 MODIFIER LETTER LEFT ARROWHEAD
        assertEquals(">", transform.action("˃")); // 02C3 MODIFIER LETTER RIGHT ARROWHEAD
        assertEquals(" ", transform.action("˄")); // 02C4 MODIFIER LETTER UP ARROWHEAD
        assertEquals(" ", transform.action("˅")); // 02C5 MODIFIER LETTER DOWN ARROWHEAD
        assertEquals(" ", transform.action("ˆ")); // 02C6 MODIFIER LETTER CIRCUMFLEX ACCENT
        assertEquals(" ", transform.action("ˇ")); // 02C7 CARON
        assertEquals("'", transform.action("ˈ")); // 02C8 MODIFIER LETTER VERTICAL LINE
        assertEquals("¯", transform.action("ˉ")); // 02C9 MODIFIER LETTER MACRON
        assertEquals("'", transform.action("ˊ")); // 02CA MODIFIER LETTER ACUTE ACCENT
        assertEquals("'", transform.action("ˋ")); // 02CB MODIFIER LETTER GRAVE ACCENT
        assertEquals(" ", transform.action("ˌ")); // 02CC MODIFIER LETTER LOW VERTICAL LINE
        assertEquals("_", transform.action("ˍ")); // 02CD MODIFIER LETTER LOW MACRON
        assertEquals(",", transform.action("ˎ")); // 02CE MODIFIER LETTER LOW GRAVE ACCENT
        assertEquals(",", transform.action("ˏ")); // 02CF MODIFIER LETTER LOW ACUTE ACCENT
        assertEquals(":", transform.action("ː")); // 02D0 MODIFIER LETTER TRIANGULAR COLON
        assertEquals(" ", transform.action("ˑ")); // 02D1 MODIFIER LETTER HALF TRIANGULAR COLON
        assertEquals(" ", transform.action("˒")); // 02D2 MODIFIER LETTER CENTRED RIGHT HALF RING
        assertEquals(" ", transform.action("˓")); // 02D3 MODIFIER LETTER CENTRED LEFT HALF RING
        assertEquals(" ", transform.action("˔")); // 02D4 MODIFIER LETTER UP TACK
        assertEquals(" ", transform.action("˕")); // 02D5 MODIFIER LETTER DOWN TACK
        assertEquals("+", transform.action("˖")); // 02D6 MODIFIER LETTER PLUS SIGN
        assertEquals("-", transform.action("˗")); // 02D7 MODIFIER LETTER MINUS SIGN
        assertEquals(" ", transform.action("˘")); // 02D8 BREVE
        assertEquals(" ", transform.action("˙")); // 02D9 DOT ABOVE
        assertEquals("°", transform.action("˚")); // 02DA RING ABOVE
        assertEquals(" ", transform.action("˛")); // 02DB OGONEK
        assertEquals(" ", transform.action("˜")); // 02DC SMALL TILDE
        assertEquals("\"", transform.action("˝")); // 02DD DOUBLE ACUTE ACCENT
        assertEquals(" ", transform.action("˞")); // 02DE MODIFIER LETTER RHOTIC HOOK
        assertEquals(" ", transform.action("˟")); // 02DF MODIFIER LETTER CROSS ACCENT
        assertEquals(" ", transform.action("ˠ")); // 02E0 MODIFIER LETTER SMALL GAMMA
        assertEquals(" ", transform.action("ˡ")); // 02E1 MODIFIER LETTER SMALL L
        assertEquals(" ", transform.action("ˢ")); // 02E2 MODIFIER LETTER SMALL S
        assertEquals(" ", transform.action("ˣ")); // 02E3 MODIFIER LETTER SMALL X
        assertEquals(" ", transform.action("ˤ")); // 02E4 MODIFIER LETTER SMALL REVERSED GLOTTAL STOP
        assertEquals(" ", transform.action("˥")); // 02E5 MODIFIER LETTER EXTRA-HIGH TONE BAR
        assertEquals(" ", transform.action("˦")); // 02E6 MODIFIER LETTER HIGH TONE BAR
        assertEquals(" ", transform.action("˧")); // 02E7 MODIFIER LETTER MID TONE BAR
        assertEquals(" ", transform.action("˨")); // 02E8 MODIFIER LETTER LOW TONE BAR
        assertEquals(" ", transform.action("˩")); // 02E9 MODIFIER LETTER EXTRA-LOW TONE BAR
        assertEquals(" ", transform.action("˪")); // 02EA MODIFIER LETTER YIN DEPARTING TONE MARK
        assertEquals(" ", transform.action("˫")); // 02EB MODIFIER LETTER YANG DEPARTING TONE MARK
        assertEquals(" ", transform.action("ˬ")); // 02EC MODIFIER LETTER VOICING
        assertEquals(" ", transform.action("˭")); // 02ED MODIFIER LETTER UNASPIRATED
        assertEquals("\"", transform.action("ˮ")); // 02EE MODIFIER LETTER DOUBLE APOSTROPHE
        assertEquals(" ", transform.action("˯")); // 02EF MODIFIER LETTER LOW DOWN ARROWHEAD
        assertEquals(" ", transform.action("˰")); // 02F0 MODIFIER LETTER LOW UP ARROWHEAD
        assertEquals(" ", transform.action("˱")); // 02F1 MODIFIER LETTER LOW LEFT ARROWHEAD
        assertEquals(" ", transform.action("˲")); // 02F2 MODIFIER LETTER LOW RIGHT ARROWHEAD
        assertEquals(" ", transform.action("˳")); // 02F3 MODIFIER LETTER LOW RING
        assertEquals(" ", transform.action("˴")); // 02F4 MODIFIER LETTER MIDDLE GRAVE ACCENT
        assertEquals(" ", transform.action("˵")); // 02F5 MODIFIER LETTER MIDDLE DOUBLE GRAVE ACCENT
        assertEquals(" ", transform.action("˶")); // 02F6 MODIFIER LETTER MIDDLE DOUBLE ACUTE ACCENT
        assertEquals(" ", transform.action("˷")); // 02F7 MODIFIER LETTER LOW TILDE
        assertEquals(":", transform.action("˸")); // 02F8 MODIFIER LETTER RAISED COLON
        assertEquals(" ", transform.action("˹")); // 02F9 MODIFIER LETTER BEGIN HIGH TONE
        assertEquals(" ", transform.action("˺")); // 02FA MODIFIER LETTER END HIGH TONE
        assertEquals(" ", transform.action("˻")); // 02FB MODIFIER LETTER BEGIN LOW TONE
        assertEquals(" ", transform.action("˼")); // 02FC MODIFIER LETTER END LOW TONE
        assertEquals(" ", transform.action("˽")); // 02FD MODIFIER LETTER SHELF
        assertEquals(" ", transform.action("˾")); // 02FE MODIFIER LETTER OPEN SHELF
        assertEquals("<-", transform.action("˿")); // 02FF MODIFIER LETTER LOW LEFT ARROW
    }
}
