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


    /**
     * Verifies the characters in the Spacing Modifier Letters block
     * (U+02B0-U+02FF) that have no reasonable ASCII equivalent and are mapped
     * to a single ASCII space.
     *
     * <ul>
     * <li>02B0 MODIFIER LETTER SMALL H</li>
     * <li>02B1 MODIFIER LETTER SMALL H WITH HOOK</li>
     * <li>02B2 MODIFIER LETTER SMALL J</li>
     * <li>02B3 MODIFIER LETTER SMALL R</li>
     * <li>02B4 MODIFIER LETTER SMALL TURNED R</li>
     * <li>02B5 MODIFIER LETTER SMALL TURNED R WITH HOOK</li>
     * <li>02B6 MODIFIER LETTER SMALL CAPITAL INVERTED R</li>
     * <li>02B7 MODIFIER LETTER SMALL W</li>
     * <li>02B8 MODIFIER LETTER SMALL Y</li>
     * <li>02BE MODIFIER LETTER RIGHT HALF RING</li>
     * <li>02BF MODIFIER LETTER LEFT HALF RING</li>
     * <li>02C0 MODIFIER LETTER GLOTTAL STOP</li>
     * <li>02C1 MODIFIER LETTER REVERSED GLOTTAL STOP</li>
     * <li>02C4 MODIFIER LETTER UP ARROWHEAD</li>
     * <li>02C5 MODIFIER LETTER DOWN ARROWHEAD</li>
     * <li>02C6 MODIFIER LETTER CIRCUMFLEX ACCENT</li>
     * <li>02C7 CARON</li>
     * <li>02CC MODIFIER LETTER LOW VERTICAL LINE</li>
     * <li>02D1 MODIFIER LETTER HALF TRIANGULAR COLON</li>
     * <li>02D2 MODIFIER LETTER CENTRED RIGHT HALF RING</li>
     * <li>02D3 MODIFIER LETTER CENTRED LEFT HALF RING</li>
     * <li>02D4 MODIFIER LETTER UP TACK</li>
     * <li>02D5 MODIFIER LETTER DOWN TACK</li>
     * <li>02D8 BREVE</li>
     * <li>02D9 DOT ABOVE</li>
     * <li>02DB OGONEK</li>
     * <li>02DC SMALL TILDE</li>
     * <li>02DE MODIFIER LETTER RHOTIC HOOK</li>
     * <li>02DF MODIFIER LETTER CROSS ACCENT</li>
     * <li>02E0 MODIFIER LETTER SMALL GAMMA</li>
     * <li>02E1 MODIFIER LETTER SMALL L</li>
     * <li>02E2 MODIFIER LETTER SMALL S</li>
     * <li>02E3 MODIFIER LETTER SMALL X</li>
     * <li>02E4 MODIFIER LETTER SMALL REVERSED GLOTTAL STOP</li>
     * <li>02E5 MODIFIER LETTER EXTRA-HIGH TONE BAR</li>
     * <li>02E6 MODIFIER LETTER HIGH TONE BAR</li>
     * <li>02E7 MODIFIER LETTER MID TONE BAR</li>
     * <li>02E8 MODIFIER LETTER LOW TONE BAR</li>
     * <li>02E9 MODIFIER LETTER EXTRA-LOW TONE BAR</li>
     * <li>02EA MODIFIER LETTER YIN DEPARTING TONE MARK</li>
     * <li>02EB MODIFIER LETTER YANG DEPARTING TONE MARK</li>
     * <li>02EC MODIFIER LETTER VOICING</li>
     * <li>02ED MODIFIER LETTER UNASPIRATED</li>
     * <li>02EF MODIFIER LETTER LOW DOWN ARROWHEAD</li>
     * <li>02F0 MODIFIER LETTER LOW UP ARROWHEAD</li>
     * <li>02F1 MODIFIER LETTER LOW LEFT ARROWHEAD</li>
     * <li>02F2 MODIFIER LETTER LOW RIGHT ARROWHEAD</li>
     * <li>02F3 MODIFIER LETTER LOW RING</li>
     * <li>02F4 MODIFIER LETTER MIDDLE GRAVE ACCENT</li>
     * <li>02F5 MODIFIER LETTER MIDDLE DOUBLE GRAVE ACCENT</li>
     * <li>02F6 MODIFIER LETTER MIDDLE DOUBLE ACUTE ACCENT</li>
     * <li>02F7 MODIFIER LETTER LOW TILDE</li>
     * <li>02F9 MODIFIER LETTER BEGIN HIGH TONE</li>
     * <li>02FA MODIFIER LETTER END HIGH TONE</li>
     * <li>02FB MODIFIER LETTER BEGIN LOW TONE</li>
     * <li>02FC MODIFIER LETTER END LOW TONE</li>
     * <li>02FD MODIFIER LETTER SHELF</li>
     * <li>02FE MODIFIER LETTER OPEN SHELF</li>
     * </ul>
     */
    @Test
    public void testMappedWhitespace() {
        assertEquals(" ", transform.action("ʰ"));
        assertEquals(" ", transform.action("ʱ"));
        assertEquals(" ", transform.action("ʲ"));
        assertEquals(" ", transform.action("ʳ"));
        assertEquals(" ", transform.action("ʴ"));
        assertEquals(" ", transform.action("ʵ"));
        assertEquals(" ", transform.action("ʶ"));
        assertEquals(" ", transform.action("ʷ"));
        assertEquals(" ", transform.action("ʸ"));
        assertEquals(" ", transform.action("ʾ"));
        assertEquals(" ", transform.action("ʿ"));
        assertEquals(" ", transform.action("ˀ"));
        assertEquals(" ", transform.action("ˁ"));
        assertEquals(" ", transform.action("˄"));
        assertEquals(" ", transform.action("˅"));
        assertEquals(" ", transform.action("ˆ"));
        assertEquals(" ", transform.action("ˇ"));
        assertEquals(" ", transform.action("ˌ"));
        assertEquals(" ", transform.action("ˑ"));
        assertEquals(" ", transform.action("˒"));
        assertEquals(" ", transform.action("˓"));
        assertEquals(" ", transform.action("˔"));
        assertEquals(" ", transform.action("˕"));
        assertEquals(" ", transform.action("˘"));
        assertEquals(" ", transform.action("˙"));
        assertEquals(" ", transform.action("˛"));
        assertEquals(" ", transform.action("˜"));
        assertEquals(" ", transform.action("˞"));
        assertEquals(" ", transform.action("˟"));
        assertEquals(" ", transform.action("ˠ"));
        assertEquals(" ", transform.action("ˡ"));
        assertEquals(" ", transform.action("ˢ"));
        assertEquals(" ", transform.action("ˣ"));
        assertEquals(" ", transform.action("ˤ"));
        assertEquals(" ", transform.action("˥"));
        assertEquals(" ", transform.action("˦"));
        assertEquals(" ", transform.action("˧"));
        assertEquals(" ", transform.action("˨"));
        assertEquals(" ", transform.action("˩"));
        assertEquals(" ", transform.action("˪"));
        assertEquals(" ", transform.action("˫"));
        assertEquals(" ", transform.action("ˬ"));
        assertEquals(" ", transform.action("˭"));
        assertEquals(" ", transform.action("˯"));
        assertEquals(" ", transform.action("˰"));
        assertEquals(" ", transform.action("˱"));
        assertEquals(" ", transform.action("˲"));
        assertEquals(" ", transform.action("˳"));
        assertEquals(" ", transform.action("˴"));
        assertEquals(" ", transform.action("˵"));
        assertEquals(" ", transform.action("˶"));
        assertEquals(" ", transform.action("˷"));
        assertEquals(" ", transform.action("˹"));
        assertEquals(" ", transform.action("˺"));
        assertEquals(" ", transform.action("˻"));
        assertEquals(" ", transform.action("˼"));
        assertEquals(" ", transform.action("˽"));
        assertEquals(" ", transform.action("˾"));
    }


    /**
     * Verifies the characters in the Spacing Modifier Letters block
     * (U+02B0-U+02FF) that are mapped to an ASCII equivalent other than a
     * single space.
     *
     * <ul>
     * <li>02B9 MODIFIER LETTER PRIME</li>
     * <li>02BA MODIFIER LETTER DOUBLE PRIME</li>
     * <li>02BB MODIFIER LETTER TURNED COMMA</li>
     * <li>02BC MODIFIER LETTER APOSTROPHE</li>
     * <li>02BD MODIFIER LETTER REVERSED COMMA</li>
     * <li>02C2 MODIFIER LETTER LEFT ARROWHEAD</li>
     * <li>02C3 MODIFIER LETTER RIGHT ARROWHEAD</li>
     * <li>02C8 MODIFIER LETTER VERTICAL LINE</li>
     * <li>02C9 MODIFIER LETTER MACRON</li>
     * <li>02CA MODIFIER LETTER ACUTE ACCENT</li>
     * <li>02CB MODIFIER LETTER GRAVE ACCENT</li>
     * <li>02CD MODIFIER LETTER LOW MACRON</li>
     * <li>02CE MODIFIER LETTER LOW GRAVE ACCENT</li>
     * <li>02CF MODIFIER LETTER LOW ACUTE ACCENT</li>
     * <li>02D0 MODIFIER LETTER TRIANGULAR COLON</li>
     * <li>02D6 MODIFIER LETTER PLUS SIGN</li>
     * <li>02D7 MODIFIER LETTER MINUS SIGN</li>
     * <li>02DA RING ABOVE</li>
     * <li>02DD DOUBLE ACUTE ACCENT</li>
     * <li>02EE MODIFIER LETTER DOUBLE APOSTROPHE</li>
     * <li>02F8 MODIFIER LETTER RAISED COLON</li>
     * <li>02FF MODIFIER LETTER LOW LEFT ARROW</li>
     * </ul>
     */
    @Test
    public void testTransliterated() {
        assertEquals("'", transform.action("ʹ"));
        assertEquals("\"", transform.action("ʺ"));
        assertEquals("'", transform.action("ʻ"));
        assertEquals("'", transform.action("ʼ"));
        assertEquals("'", transform.action("ʽ"));
        assertEquals("<", transform.action("˂"));
        assertEquals(">", transform.action("˃"));
        assertEquals("'", transform.action("ˈ"));
        assertEquals("¯", transform.action("ˉ"));
        assertEquals("'", transform.action("ˊ"));
        assertEquals("'", transform.action("ˋ"));
        assertEquals("_", transform.action("ˍ"));
        assertEquals(",", transform.action("ˎ"));
        assertEquals(",", transform.action("ˏ"));
        assertEquals(":", transform.action("ː"));
        assertEquals("+", transform.action("˖"));
        assertEquals("-", transform.action("˗"));
        assertEquals("°", transform.action("˚"));
        assertEquals("\"", transform.action("˝"));
        assertEquals("\"", transform.action("ˮ"));
        assertEquals(":", transform.action("˸"));
        assertEquals("<-", transform.action("˿"));
    }
}
