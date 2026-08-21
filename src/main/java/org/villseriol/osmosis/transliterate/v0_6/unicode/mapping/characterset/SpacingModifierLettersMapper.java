// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/spacing-modifier-letters/
public class SpacingModifierLettersMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the full Spacing Modifier Letters
        // block, as one continuous range.
        rules.add("::[\\u02B0-\\u02FF];");

        // Stub mapping -- every character in the block maps to a single
        // ASCII space until real mappings are provided.
        rules.add("ʰ > ' ';"); // 02B0 MODIFIER LETTER SMALL H
        rules.add("ʱ > ' ';"); // 02B1 MODIFIER LETTER SMALL H WITH HOOK
        rules.add("ʲ > ' ';"); // 02B2 MODIFIER LETTER SMALL J
        rules.add("ʳ > ' ';"); // 02B3 MODIFIER LETTER SMALL R
        rules.add("ʴ > ' ';"); // 02B4 MODIFIER LETTER SMALL TURNED R
        rules.add("ʵ > ' ';"); // 02B5 MODIFIER LETTER SMALL TURNED R WITH
                               // HOOK
        rules.add("ʶ > ' ';"); // 02B6 MODIFIER LETTER SMALL CAPITAL INVERTED
                               // R
        rules.add("ʷ > ' ';"); // 02B7 MODIFIER LETTER SMALL W
        rules.add("ʸ > ' ';"); // 02B8 MODIFIER LETTER SMALL Y
        rules.add("ʹ > '';"); // 02B9 MODIFIER LETTER PRIME
        rules.add("ʺ > '\"';"); // 02BA MODIFIER LETTER DOUBLE PRIME
        rules.add("ʻ > '';"); // 02BB MODIFIER LETTER TURNED COMMA
        rules.add("ʼ > '';"); // 02BC MODIFIER LETTER APOSTROPHE
        rules.add("ʽ > '';"); // 02BD MODIFIER LETTER REVERSED COMMA
        rules.add("ʾ > ' ';"); // 02BE MODIFIER LETTER RIGHT HALF RING
        rules.add("ʿ > ' ';"); // 02BF MODIFIER LETTER LEFT HALF RING
        rules.add("ˀ > ' ';"); // 02C0 MODIFIER LETTER GLOTTAL STOP
        rules.add("ˁ > ' ';"); // 02C1 MODIFIER LETTER REVERSED GLOTTAL STOP
        rules.add("˂ > '<';"); // 02C2 MODIFIER LETTER LEFT ARROWHEAD
        rules.add("˃ > '>';"); // 02C3 MODIFIER LETTER RIGHT ARROWHEAD
        rules.add("˄ > ' ';"); // 02C4 MODIFIER LETTER UP ARROWHEAD
        rules.add("˅ > ' ';"); // 02C5 MODIFIER LETTER DOWN ARROWHEAD
        rules.add("ˆ > ' ';"); // 02C6 MODIFIER LETTER CIRCUMFLEX ACCENT
        rules.add("ˇ > ' ';"); // 02C7 CARON
        rules.add("ˈ > '';"); // 02C8 MODIFIER LETTER VERTICAL LINE
        rules.add("ˉ > '¯';"); // 02C9 MODIFIER LETTER MACRON
        rules.add("ˊ > '';"); // 02CA MODIFIER LETTER ACUTE ACCENT
        rules.add("ˋ > '';"); // 02CB MODIFIER LETTER GRAVE ACCENT
        rules.add("ˌ > ' ';"); // 02CC MODIFIER LETTER LOW VERTICAL LINE
        rules.add("ˍ > '_';"); // 02CD MODIFIER LETTER LOW MACRON
        rules.add("ˎ > ',';"); // 02CE MODIFIER LETTER LOW GRAVE ACCENT
        rules.add("ˏ > ',';"); // 02CF MODIFIER LETTER LOW ACUTE ACCENT
        rules.add("ː > ':';"); // 02D0 MODIFIER LETTER TRIANGULAR COLON
        rules.add("ˑ > ' ';"); // 02D1 MODIFIER LETTER HALF TRIANGULAR COLON
        rules.add("˒ > ' ';"); // 02D2 MODIFIER LETTER CENTRED RIGHT HALF RING
        rules.add("˓ > ' ';"); // 02D3 MODIFIER LETTER CENTRED LEFT HALF RING
        rules.add("˔ > ' ';"); // 02D4 MODIFIER LETTER UP TACK
        rules.add("˕ > ' ';"); // 02D5 MODIFIER LETTER DOWN TACK
        rules.add("˖ > '+';"); // 02D6 MODIFIER LETTER PLUS SIGN
        rules.add("˗ > '-';"); // 02D7 MODIFIER LETTER MINUS SIGN
        rules.add("˘ > ' ';"); // 02D8 BREVE
        rules.add("˙ > ' ';"); // 02D9 DOT ABOVE
        rules.add("˚ > '°';"); // 02DA RING ABOVE
        rules.add("˛ > ' ';"); // 02DB OGONEK
        rules.add("˜ > ' ';"); // 02DC SMALL TILDE
        rules.add("˝ > '\"';"); // 02DD DOUBLE ACUTE ACCENT
        rules.add("˞ > ' ';"); // 02DE MODIFIER LETTER RHOTIC HOOK
        rules.add("˟ > ' ';"); // 02DF MODIFIER LETTER CROSS ACCENT
        rules.add("ˠ > ' ';"); // 02E0 MODIFIER LETTER SMALL GAMMA
        rules.add("ˡ > ' ';"); // 02E1 MODIFIER LETTER SMALL L
        rules.add("ˢ > ' ';"); // 02E2 MODIFIER LETTER SMALL S
        rules.add("ˣ > ' ';"); // 02E3 MODIFIER LETTER SMALL X
        rules.add("ˤ > ' ';"); // 02E4 MODIFIER LETTER SMALL REVERSED GLOTTAL
                               // STOP
        rules.add("˥ > ' ';"); // 02E5 MODIFIER LETTER EXTRA-HIGH TONE BAR
        rules.add("˦ > ' ';"); // 02E6 MODIFIER LETTER HIGH TONE BAR
        rules.add("˧ > ' ';"); // 02E7 MODIFIER LETTER MID TONE BAR
        rules.add("˨ > ' ';"); // 02E8 MODIFIER LETTER LOW TONE BAR
        rules.add("˩ > ' ';"); // 02E9 MODIFIER LETTER EXTRA-LOW TONE BAR
        rules.add("˪ > ' ';"); // 02EA MODIFIER LETTER YIN DEPARTING TONE
                               // MARK
        rules.add("˫ > ' ';"); // 02EB MODIFIER LETTER YANG DEPARTING TONE
                               // MARK
        rules.add("ˬ > ' ';"); // 02EC MODIFIER LETTER VOICING
        rules.add("˭ > ' ';"); // 02ED MODIFIER LETTER UNASPIRATED
        rules.add("ˮ > '\"';"); // 02EE MODIFIER LETTER DOUBLE APOSTROPHE
        rules.add("˯ > ' ';"); // 02EF MODIFIER LETTER LOW DOWN ARROWHEAD
        rules.add("˰ > ' ';"); // 02F0 MODIFIER LETTER LOW UP ARROWHEAD
        rules.add("˱ > ' ';"); // 02F1 MODIFIER LETTER LOW LEFT ARROWHEAD
        rules.add("˲ > ' ';"); // 02F2 MODIFIER LETTER LOW RIGHT ARROWHEAD
        rules.add("˳ > ' ';"); // 02F3 MODIFIER LETTER LOW RING
        rules.add("˴ > ' ';"); // 02F4 MODIFIER LETTER MIDDLE GRAVE ACCENT
        rules.add("˵ > ' ';"); // 02F5 MODIFIER LETTER MIDDLE DOUBLE GRAVE
                               // ACCENT
        rules.add("˶ > ' ';"); // 02F6 MODIFIER LETTER MIDDLE DOUBLE ACUTE
                               // ACCENT
        rules.add("˷ > ' ';"); // 02F7 MODIFIER LETTER LOW TILDE
        rules.add("˸ > ':';"); // 02F8 MODIFIER LETTER RAISED COLON
        rules.add("˹ > ' ';"); // 02F9 MODIFIER LETTER BEGIN HIGH TONE
        rules.add("˺ > ' ';"); // 02FA MODIFIER LETTER END HIGH TONE
        rules.add("˻ > ' ';"); // 02FB MODIFIER LETTER BEGIN LOW TONE
        rules.add("˼ > ' ';"); // 02FC MODIFIER LETTER END LOW TONE
        rules.add("˽ > ' ';"); // 02FD MODIFIER LETTER SHELF
        rules.add("˾ > ' ';"); // 02FE MODIFIER LETTER OPEN SHELF
        rules.add("˿ > '<-';"); // 02FF MODIFIER LETTER LOW LEFT ARROW

        TRANSLITERATOR = Transliterator.createFromRules("SpacingModifierLetters-Normalized", String.join("\n", rules),
                Transliterator.FORWARD);
    }

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
