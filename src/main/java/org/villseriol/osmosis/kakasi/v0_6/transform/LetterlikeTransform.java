// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.Transform;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/letterlike-symbols/
public class LetterlikeTransform implements Transform {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Letterlike Symbols block only
        rules.add("::[\\u2100-\\u214F];");

        rules.add("℀ > 'a/c';"); // 2100 ACCOUNT OF
        rules.add("℁ > 'a/s';"); // 2101 ADDRESSED TO THE SUBJECT
        rules.add("ℂ > 'C';"); // 2102 DOUBLE-STRUCK CAPITAL C
        rules.add("℃ > 'C';"); // 2103 DEGREE CELSIUS
        rules.add("℄ > 'CL';"); // 2104 CENTRE LINE SYMBOL (arbitrary)
        rules.add("℅ > 'c/o';"); // 2105 CARE OF
        rules.add("℆ > 'c/u';"); // 2106 CADA UNA
        rules.add("ℇ > ' ';"); // 2107 EULER CONSTANT (no easy equivalent)
        rules.add("℈ > 's';"); // 2108 SCRUPLE (apothecary weight, arbitrary)
        rules.add("℉ > 'F';"); // 2109 DEGREE FAHRENHEIT
        rules.add("ℊ > 'g';"); // 210A SCRIPT SMALL G
        rules.add("ℋ > 'H';"); // 210B SCRIPT CAPITAL H
        rules.add("ℌ > 'H';"); // 210C BLACK-LETTER CAPITAL H (dup)
        rules.add("ℍ > 'H';"); // 210D DOUBLE-STRUCK CAPITAL H (dup)
        rules.add("ℎ > 'h';"); // 210E PLANCK CONSTANT
        rules.add("ℏ > 'h';"); // 210F PLANCK CONSTANT OVER TWO PI
        rules.add("ℐ > 'I';"); // 2110 SCRIPT CAPITAL I
        rules.add("ℑ > 'I';"); // 2111 BLACK-LETTER CAPITAL I (dup)
        rules.add("ℒ > 'L';"); // 2112 SCRIPT CAPITAL L
        rules.add("ℓ > 'l';"); // 2113 SCRIPT SMALL L
        rules.add("℔ > 'lb';"); // 2114 L B BAR SYMBOL (pound weight)
        rules.add("ℕ > 'N';"); // 2115 DOUBLE-STRUCK CAPITAL N
        rules.add("№ > 'No.';"); // 2116 NUMERO SIGN
        rules.add("℗ > '(p)';"); // 2117 SOUND RECORDING COPYRIGHT
        rules.add("℘ > 'P';"); // 2118 SCRIPT CAPITAL P (Weierstrass elliptic
                               // function, dup)
        rules.add("ℙ > 'P';"); // 2119 DOUBLE-STRUCK CAPITAL P (dup)
        rules.add("ℚ > 'Q';"); // 211A DOUBLE-STRUCK CAPITAL Q
        rules.add("ℛ > 'R';"); // 211B SCRIPT CAPITAL R
        rules.add("ℜ > 'R';"); // 211C BLACK-LETTER CAPITAL R (dup)
        rules.add("ℝ > 'R';"); // 211D DOUBLE-STRUCK CAPITAL R (dup)
        rules.add("℞ > 'Rx';"); // 211E PRESCRIPTION TAKE
        rules.add("℟ > 'R.';"); // 211F RESPONSE (liturgical, arbitrary)
        rules.add("℠ > '(SM)';"); // 2120 SERVICE MARK
        rules.add("℡ > 'TEL';"); // 2121 TELEPHONE SIGN
        rules.add("™ > '(TM)';"); // 2122 TRADE MARK SIGN
        rules.add("℣ > 'V';"); // 2123 VERSICLE (liturgical, arbitrary)
        rules.add("ℤ > 'Z';"); // 2124 DOUBLE-STRUCK CAPITAL Z
        rules.add("℥ > 'oz';"); // 2125 OUNCE SIGN
        rules.add("Ω > 'ohm';"); // 2126 OHM SIGN
        rules.add("℧ > 'mho';"); // 2127 INVERTED OHM SIGN
        rules.add("ℨ > 'Z';"); // 2128 BLACK-LETTER CAPITAL Z (dup)
        rules.add("℩ > ' ';"); // 2129 TURNED GREEK SMALL LETTER IOTA (no easy
                               // equivalent)
        rules.add("K > 'K';"); // 212A KELVIN SIGN
        rules.add("Å > 'A';"); // 212B ANGSTROM SIGN
        rules.add("ℬ > 'B';"); // 212C SCRIPT CAPITAL B
        rules.add("ℭ > 'C';"); // 212D BLACK-LETTER CAPITAL C (dup)
        rules.add("℮ > 'e';"); // 212E ESTIMATED SYMBOL
        rules.add("ℯ > 'e';"); // 212F SCRIPT SMALL E (dup)
        rules.add("ℰ > 'E';"); // 2130 SCRIPT CAPITAL E
        rules.add("ℱ > 'F';"); // 2131 SCRIPT CAPITAL F
        rules.add("Ⅎ > ' ';"); // 2132 TURNED CAPITAL F (no easy equivalent)
        rules.add("ℳ > 'M';"); // 2133 SCRIPT CAPITAL M
        rules.add("ℴ > 'o';"); // 2134 SCRIPT SMALL O
        rules.add("ℵ > 'N';"); // 2135 ALEF SYMBOL
        rules.add("ℶ > ' ';"); // 2136 BET SYMBOL
        rules.add("ℷ > ' ';"); // 2137 GIMEL SYMBOL
        rules.add("ℸ > ' ';"); // 2138 DALET SYMBOL
        rules.add("ℹ > 'i';"); // 2139 INFORMATION SOURCE
        rules.add("℺ > ' ';"); // 213A ROTATED CAPITAL Q (no easy equivalent)
        rules.add("℻ > 'FAX';"); // 213B FACSIMILE SIGN
        rules.add("ℼ > ' ';"); // 213C DOUBLE-STRUCK SMALL PI
        rules.add("ℽ > 'y';"); // 213D DOUBLE-STRUCK SMALL GAMMA
        rules.add("ℾ > ' ';"); // 213E DOUBLE-STRUCK CAPITAL GAMMA
        rules.add("ℿ > ' ';"); // 213F DOUBLE-STRUCK CAPITAL PI
        rules.add("⅀ > ' ';"); // 2140 DOUBLE-STRUCK N-ARY SUMMATION (no easy
                               // equivalent)
        rules.add("⅁ > ' ';"); // 2141 TURNED SANS-SERIF CAPITAL G (no easy
                               // equivalent)
        rules.add("⅂ > ' ';"); // 2142 TURNED SANS-SERIF CAPITAL L (no easy
                               // equivalent)
        rules.add("⅃ > ' ';"); // 2143 REVERSED SANS-SERIF CAPITAL L (no easy
                               // equivalent)
        rules.add("⅄ > ' ';"); // 2144 TURNED SANS-SERIF CAPITAL Y (no easy
                               // equivalent)
        rules.add("ⅅ > 'D';"); // 2145 DOUBLE-STRUCK ITALIC CAPITAL D
        rules.add("ⅆ > 'd';"); // 2146 DOUBLE-STRUCK ITALIC SMALL D
        rules.add("ⅇ > 'e';"); // 2147 DOUBLE-STRUCK ITALIC SMALL E (dup)
        rules.add("ⅈ > 'i';"); // 2148 DOUBLE-STRUCK ITALIC SMALL I
        rules.add("ⅉ > 'j';"); // 2149 DOUBLE-STRUCK ITALIC SMALL J
        rules.add("⅊ > ' ';"); // 214A PROPERTY LINE (no easy equivalent)
        rules.add("⅋ > '&';"); // 214B TURNED AMPERSAND
        rules.add("⅌ > '/';"); // 214C PER SIGN (arbitrary)
        rules.add("⅍ > 'A/S';"); // 214D AKTIESELSKAB
        rules.add("ⅎ > ' ';"); // 214E TURNED SMALL F
        rules.add("⅏ > ' ';"); // 214F SYMBOL FOR SAMARITAN SOURCE (no easy
                               // equivalent)
        TRANSLITERATOR = Transliterator.createFromRules("Letterlike-BasicLatin", String.join("\n", rules),
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
