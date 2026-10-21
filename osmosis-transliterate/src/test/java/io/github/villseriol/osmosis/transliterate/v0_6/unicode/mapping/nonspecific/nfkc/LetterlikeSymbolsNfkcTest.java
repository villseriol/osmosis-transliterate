// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.nfkc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.NfkcTransform;


public class LetterlikeSymbolsNfkcTest {
    /** The transform under test. */
    private final NfkcTransform transform = new NfkcTransform(UnicodeRange.LETTERLIKE_SYMBOLS);

    @Test
    public void testMappedCharacters() {
        assertEquals("a/c", transform.action("℀")); // 2100 ACCOUNT OF
        assertEquals("a/s", transform.action("℁")); // 2101 ADDRESSED TO THE SUBJECT
        assertEquals("C", transform.action("ℂ")); // 2102 DOUBLE-STRUCK CAPITAL C
        assertEquals("°C", transform.action("℃")); // 2103 DEGREE CELSIUS
        assertEquals("c/o", transform.action("℅")); // 2105 CARE OF
        assertEquals("c/u", transform.action("℆")); // 2106 CADA UNA
        assertEquals("Ɛ", transform.action("ℇ")); // 2107 EULER CONSTANT
        assertEquals("°F", transform.action("℉")); // 2109 DEGREE FAHRENHEIT
        assertEquals("g", transform.action("ℊ")); // 210A SCRIPT SMALL G
        assertEquals("H", transform.action("ℋ")); // 210B SCRIPT CAPITAL H
        assertEquals("H", transform.action("ℌ")); // 210C BLACK-LETTER CAPITAL H
        assertEquals("H", transform.action("ℍ")); // 210D DOUBLE-STRUCK CAPITAL H
        assertEquals("h", transform.action("ℎ")); // 210E PLANCK CONSTANT
        assertEquals("ħ", transform.action("ℏ")); // 210F PLANCK CONSTANT OVER TWO PI
        assertEquals("I", transform.action("ℐ")); // 2110 SCRIPT CAPITAL I
        assertEquals("I", transform.action("ℑ")); // 2111 BLACK-LETTER CAPITAL I
        assertEquals("L", transform.action("ℒ")); // 2112 SCRIPT CAPITAL L
        assertEquals("l", transform.action("ℓ")); // 2113 SCRIPT SMALL L
        assertEquals("N", transform.action("ℕ")); // 2115 DOUBLE-STRUCK CAPITAL N
        assertEquals("No", transform.action("№")); // 2116 NUMERO SIGN
        assertEquals("P", transform.action("ℙ")); // 2119 DOUBLE-STRUCK CAPITAL P
        assertEquals("Q", transform.action("ℚ")); // 211A DOUBLE-STRUCK CAPITAL Q
        assertEquals("R", transform.action("ℛ")); // 211B SCRIPT CAPITAL R
        assertEquals("R", transform.action("ℜ")); // 211C BLACK-LETTER CAPITAL R
        assertEquals("R", transform.action("ℝ")); // 211D DOUBLE-STRUCK CAPITAL R
        assertEquals("SM", transform.action("℠")); // 2120 SERVICE MARK
        assertEquals("TEL", transform.action("℡")); // 2121 TELEPHONE SIGN
        assertEquals("TM", transform.action("™")); // 2122 TRADE MARK SIGN
        assertEquals("Z", transform.action("ℤ")); // 2124 DOUBLE-STRUCK CAPITAL Z
        assertEquals("Ω", transform.action("Ω")); // 2126 OHM SIGN
        assertEquals("Z", transform.action("ℨ")); // 2128 BLACK-LETTER CAPITAL Z
        assertEquals("K", transform.action("K")); // 212A KELVIN SIGN
        assertEquals("Å", transform.action("Å")); // 212B ANGSTROM SIGN
        assertEquals("B", transform.action("ℬ")); // 212C SCRIPT CAPITAL B
        assertEquals("C", transform.action("ℭ")); // 212D BLACK-LETTER CAPITAL C
        assertEquals("e", transform.action("ℯ")); // 212F SCRIPT SMALL E
        assertEquals("E", transform.action("ℰ")); // 2130 SCRIPT CAPITAL E
        assertEquals("F", transform.action("ℱ")); // 2131 SCRIPT CAPITAL F
        assertEquals("M", transform.action("ℳ")); // 2133 SCRIPT CAPITAL M
        assertEquals("o", transform.action("ℴ")); // 2134 SCRIPT SMALL O
        assertEquals("א", transform.action("ℵ")); // 2135 ALEF SYMBOL
        assertEquals("ב", transform.action("ℶ")); // 2136 BET SYMBOL
        assertEquals("ג", transform.action("ℷ")); // 2137 GIMEL SYMBOL
        assertEquals("ד", transform.action("ℸ")); // 2138 DALET SYMBOL
        assertEquals("i", transform.action("ℹ")); // 2139 INFORMATION SOURCE
        assertEquals("FAX", transform.action("℻")); // 213B FACSIMILE SIGN
        assertEquals("π", transform.action("ℼ")); // 213C DOUBLE-STRUCK SMALL PI
        assertEquals("γ", transform.action("ℽ")); // 213D DOUBLE-STRUCK SMALL GAMMA
        assertEquals("Γ", transform.action("ℾ")); // 213E DOUBLE-STRUCK CAPITAL GAMMA
        assertEquals("Π", transform.action("ℿ")); // 213F DOUBLE-STRUCK CAPITAL PI
        assertEquals("∑", transform.action("⅀")); // 2140 DOUBLE-STRUCK N-ARY SUMMATION
        assertEquals("D", transform.action("ⅅ")); // 2145 DOUBLE-STRUCK ITALIC CAPITAL D
        assertEquals("d", transform.action("ⅆ")); // 2146 DOUBLE-STRUCK ITALIC SMALL D
        assertEquals("e", transform.action("ⅇ")); // 2147 DOUBLE-STRUCK ITALIC SMALL E
        assertEquals("i", transform.action("ⅈ")); // 2148 DOUBLE-STRUCK ITALIC SMALL I
        assertEquals("j", transform.action("ⅉ")); // 2149 DOUBLE-STRUCK ITALIC SMALL J
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("℄", transform.action("℄")); // 2104 CENTRE LINE SYMBOL
        assertEquals("℈", transform.action("℈")); // 2108 SCRUPLE
        assertEquals("℔", transform.action("℔")); // 2114 L B BAR SYMBOL
        assertEquals("℗", transform.action("℗")); // 2117 SOUND RECORDING COPYRIGHT
        assertEquals("℘", transform.action("℘")); // 2118 SCRIPT CAPITAL P
        assertEquals("℞", transform.action("℞")); // 211E PRESCRIPTION TAKE
        assertEquals("℟", transform.action("℟")); // 211F RESPONSE
        assertEquals("℣", transform.action("℣")); // 2123 VERSICLE
        assertEquals("℥", transform.action("℥")); // 2125 OUNCE SIGN
        assertEquals("℧", transform.action("℧")); // 2127 INVERTED OHM SIGN
        assertEquals("℩", transform.action("℩")); // 2129 TURNED GREEK SMALL LETTER IOTA
        assertEquals("℮", transform.action("℮")); // 212E ESTIMATED SYMBOL
        assertEquals("Ⅎ", transform.action("Ⅎ")); // 2132 TURNED CAPITAL F
        assertEquals("℺", transform.action("℺")); // 213A ROTATED CAPITAL Q
        assertEquals("⅁", transform.action("⅁")); // 2141 TURNED SANS-SERIF CAPITAL G
        assertEquals("⅂", transform.action("⅂")); // 2142 TURNED SANS-SERIF CAPITAL L
        assertEquals("⅃", transform.action("⅃")); // 2143 REVERSED SANS-SERIF CAPITAL L
        assertEquals("⅄", transform.action("⅄")); // 2144 TURNED SANS-SERIF CAPITAL Y
        assertEquals("⅊", transform.action("⅊")); // 214A PROPERTY LINE
        assertEquals("⅋", transform.action("⅋")); // 214B TURNED AMPERSAND
        assertEquals("⅌", transform.action("⅌")); // 214C PER SIGN
        assertEquals("⅍", transform.action("⅍")); // 214D AKTIESELSKAB
        assertEquals("ⅎ", transform.action("ⅎ")); // 214E TURNED SMALL F
        assertEquals("⅏", transform.action("⅏")); // 214F SYMBOL FOR SAMARITAN SOURCE
    }
}
