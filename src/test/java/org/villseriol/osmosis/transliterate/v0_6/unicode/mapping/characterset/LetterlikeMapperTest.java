// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LetterlikeMapperTest extends LatinMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals("a/c", transform.action("℀")); // ACCOUNT OF
        assertEquals("a/s", transform.action("℁")); // ADDRESSED TO THE SUBJECT
        assertEquals("C", transform.action("ℂ")); // DOUBLE-STRUCK CAPITAL C
        assertEquals("c/o", transform.action("℅")); // CARE OF
        assertEquals("c/u", transform.action("℆")); // CADA UNA
        assertEquals("g", transform.action("ℊ")); // SCRIPT SMALL G
        assertEquals("H", transform.action("ℋ")); // SCRIPT CAPITAL H
        assertEquals("x", transform.action("ℌ")); // BLACK-LETTER CAPITAL H
        assertEquals("H", transform.action("ℍ")); // DOUBLE-STRUCK CAPITAL H
        assertEquals("h", transform.action("ℎ")); // PLANCK CONSTANT
        assertEquals("I", transform.action("ℐ")); // SCRIPT CAPITAL I
        assertEquals("I", transform.action("ℑ")); // BLACK-LETTER CAPITAL I
        assertEquals("L", transform.action("ℒ")); // SCRIPT CAPITAL L
        assertEquals("l", transform.action("ℓ")); // SCRIPT SMALL L
        assertEquals("N", transform.action("ℕ")); // DOUBLE-STRUCK CAPITAL N
        assertEquals("No", transform.action("№")); // NUMERO SIGN
        assertEquals("(P)", transform.action("℗")); // SOUND RECORDING COPYRIGHT
        assertEquals("P", transform.action("℘")); // SCRIPT CAPITAL P
        assertEquals("P", transform.action("ℙ")); // DOUBLE-STRUCK CAPITAL P
        assertEquals("Q", transform.action("ℚ")); // DOUBLE-STRUCK CAPITAL Q
        assertEquals("R", transform.action("ℛ")); // SCRIPT CAPITAL R
        assertEquals("R", transform.action("ℜ")); // BLACK-LETTER CAPITAL R
        assertEquals("R", transform.action("ℝ")); // DOUBLE-STRUCK CAPITAL R
        assertEquals("Rx", transform.action("℞")); // PRESCRIPTION TAKE
        assertEquals("TEL", transform.action("℡")); // TELEPHONE SIGN
        assertEquals("Z", transform.action("ℤ")); // DOUBLE-STRUCK CAPITAL Z
        assertEquals("O", transform.action("Ω")); // OHM SIGN
        assertEquals("Z", transform.action("ℨ")); // BLACK-LETTER CAPITAL Z
        assertEquals("K", transform.action("K")); // KELVIN SIGN
        assertEquals("A", transform.action("Å")); // ANGSTROM SIGN
        assertEquals("B", transform.action("ℬ")); // SCRIPT CAPITAL B
        assertEquals("C", transform.action("ℭ")); // BLACK-LETTER CAPITAL C
        assertEquals("e", transform.action("ℯ")); // SCRIPT SMALL E
        assertEquals("E", transform.action("ℰ")); // SCRIPT CAPITAL E
        assertEquals("F", transform.action("ℱ")); // SCRIPT CAPITAL F
        assertEquals("M", transform.action("ℳ")); // SCRIPT CAPITAL M
        assertEquals("o", transform.action("ℴ")); // SCRIPT SMALL O
        assertEquals("i", transform.action("ℹ")); // INFORMATION SOURCE
        assertEquals("FAX", transform.action("℻")); // FACSIMILE SIGN
        assertEquals("D", transform.action("ⅅ")); // DOUBLE-STRUCK ITALIC CAPITAL D
        assertEquals("d", transform.action("ⅆ")); // DOUBLE-STRUCK ITALIC SMALL D
        assertEquals("e", transform.action("ⅇ")); // DOUBLE-STRUCK ITALIC SMALL E
        assertEquals("i", transform.action("ⅈ")); // DOUBLE-STRUCK ITALIC SMALL I
        assertEquals("j", transform.action("ⅉ")); // DOUBLE-STRUCK ITALIC SMALL J
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("℃", transform.action("℃")); // DEGREE CELSIUS
        assertEquals("℄", transform.action("℄")); // CENTRE LINE SYMBOL
        assertEquals("ℇ", transform.action("ℇ")); // EULER CONSTANT
        assertEquals("℈", transform.action("℈")); // SCRUPLE
        assertEquals("℉", transform.action("℉")); // DEGREE FAHRENHEIT
        assertEquals("ℏ", transform.action("ℏ")); // PLANCK CONSTANT OVER TWO PI
        assertEquals("℔", transform.action("℔")); // L B BAR SYMBOL
        assertEquals("℟", transform.action("℟")); // RESPONSE
        assertEquals("℠", transform.action("℠")); // SERVICE MARK
        assertEquals("™", transform.action("™")); // TRADE MARK SIGN
        assertEquals("℣", transform.action("℣")); // VERSICLE
        assertEquals("℥", transform.action("℥")); // OUNCE SIGN
        assertEquals("℧", transform.action("℧")); // INVERTED OHM SIGN
        assertEquals("℩", transform.action("℩")); // TURNED GREEK SMALL LETTER IOTA
        assertEquals("℮", transform.action("℮")); // ESTIMATED SYMBOL
        assertEquals("Ⅎ", transform.action("Ⅎ")); // TURNED CAPITAL F
        assertEquals("ℵ", transform.action("ℵ")); // ALEF SYMBOL
        assertEquals("ℶ", transform.action("ℶ")); // BET SYMBOL
        assertEquals("ℷ", transform.action("ℷ")); // GIMEL SYMBOL
        assertEquals("ℸ", transform.action("ℸ")); // DALET SYMBOL
        assertEquals("℺", transform.action("℺")); // ROTATED CAPITAL Q
        assertEquals("ℼ", transform.action("ℼ")); // DOUBLE-STRUCK SMALL PI
        assertEquals("ℽ", transform.action("ℽ")); // DOUBLE-STRUCK SMALL GAMMA
        assertEquals("ℾ", transform.action("ℾ")); // DOUBLE-STRUCK CAPITAL GAMMA
        assertEquals("ℿ", transform.action("ℿ")); // DOUBLE-STRUCK CAPITAL PI
        assertEquals("⅀", transform.action("⅀")); // DOUBLE-STRUCK N-ARY SUMMATION
        assertEquals("⅁", transform.action("⅁")); // TURNED SANS-SERIF CAPITAL G
        assertEquals("⅂", transform.action("⅂")); // TURNED SANS-SERIF CAPITAL L
        assertEquals("⅃", transform.action("⅃")); // REVERSED SANS-SERIF CAPITAL L
        assertEquals("⅄", transform.action("⅄")); // TURNED SANS-SERIF CAPITAL Y
        assertEquals("⅊", transform.action("⅊")); // PROPERTY LINE
        assertEquals("⅋", transform.action("⅋")); // TURNED AMPERSAND
        assertEquals("⅌", transform.action("⅌")); // PER SIGN
        assertEquals("⅍", transform.action("⅍")); // AKTIESELSKAB
        assertEquals("ⅎ", transform.action("ⅎ")); // TURNED SMALL F
        assertEquals("⅏", transform.action("⅏")); // SYMBOL FOR SAMARITAN SOURCE
    }
}
