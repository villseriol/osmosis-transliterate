// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6.transform;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.shared.Transform;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/superscripts-and-subscripts/
public class SuperscriptSubscriptTransform implements Transform {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();
        // Restrict the transliterator to the Superscripts and Subscripts block
        // only
        rules.add("::[\\u2070-\\u209C];");

        // Superscript digits
        rules.add("⁰ > '0';"); // 2070 SUPERSCRIPT ZERO
        rules.add("ⁱ > 'i';"); // 2071 SUPERSCRIPT LATIN SMALL LETTER I
        rules.add("⁴ > '4';"); // 2074 SUPERSCRIPT FOUR
        rules.add("⁵ > '5';"); // 2075 SUPERSCRIPT FIVE
        rules.add("⁶ > '6';"); // 2076 SUPERSCRIPT SIX
        rules.add("⁷ > '7';"); // 2077 SUPERSCRIPT SEVEN
        rules.add("⁸ > '8';"); // 2078 SUPERSCRIPT EIGHT
        rules.add("⁹ > '9';"); // 2079 SUPERSCRIPT NINE

        // Superscript symbols
        rules.add("⁺ > '+';"); // 207A SUPERSCRIPT PLUS SIGN
        rules.add("⁻ > '-';"); // 207B SUPERSCRIPT MINUS
        rules.add("⁼ > '=';"); // 207C SUPERSCRIPT EQUALS SIGN
        rules.add("⁽ > '(';"); // 207D SUPERSCRIPT LEFT PARENTHESIS
        rules.add("⁾ > ')';"); // 207E SUPERSCRIPT RIGHT PARENTHESIS
        rules.add("ⁿ > 'n';"); // 207F SUPERSCRIPT LATIN SMALL LETTER N

        // Subscript digits
        rules.add("₀ > '0';"); // 2080 SUBSCRIPT ZERO
        rules.add("₁ > '1';"); // 2081 SUBSCRIPT ONE
        rules.add("₂ > '2';"); // 2082 SUBSCRIPT TWO
        rules.add("₃ > '3';"); // 2083 SUBSCRIPT THREE
        rules.add("₄ > '4';"); // 2084 SUBSCRIPT FOUR
        rules.add("₅ > '5';"); // 2085 SUBSCRIPT FIVE
        rules.add("₆ > '6';"); // 2086 SUBSCRIPT SIX
        rules.add("₇ > '7';"); // 2087 SUBSCRIPT SEVEN
        rules.add("₈ > '8';"); // 2088 SUBSCRIPT EIGHT
        rules.add("₉ > '9';"); // 2089 SUBSCRIPT NINE

        // Subscript symbols
        rules.add("₊ > '+';"); // 208A SUBSCRIPT PLUS SIGN
        rules.add("₋ > '-';"); // 208B SUBSCRIPT MINUS
        rules.add("₌ > '=';"); // 208C SUBSCRIPT EQUALS SIGN
        rules.add("₍ > '(';"); // 208D SUBSCRIPT LEFT PARENTHESIS
        rules.add("₎ > ')';"); // 208E SUBSCRIPT RIGHT PARENTHESIS

        // Latin subscript letters
        rules.add("ₐ > 'a';"); // 2090 LATIN SUBSCRIPT SMALL LETTER A
        rules.add("ₑ > 'e';"); // 2091 LATIN SUBSCRIPT SMALL LETTER E
        rules.add("ₒ > 'o';"); // 2092 LATIN SUBSCRIPT SMALL LETTER O
        rules.add("ₓ > 'x';"); // 2093 LATIN SUBSCRIPT SMALL LETTER X
        rules.add("ₔ > 'e';"); // 2094 LATIN SUBSCRIPT SMALL LETTER SCHWA -
                               // approximated, no ASCII schwa exists
        rules.add("ₕ > 'h';"); // 2095 LATIN SUBSCRIPT SMALL LETTER H
        rules.add("ₖ > 'k';"); // 2096 LATIN SUBSCRIPT SMALL LETTER K
        rules.add("ₗ > 'l';"); // 2097 LATIN SUBSCRIPT SMALL LETTER L
        rules.add("ₘ > 'm';"); // 2098 LATIN SUBSCRIPT SMALL LETTER M
        rules.add("ₙ > 'n';"); // 2099 LATIN SUBSCRIPT SMALL LETTER N
        rules.add("ₚ > 'p';"); // 209A LATIN SUBSCRIPT SMALL LETTER P
        rules.add("ₛ > 's';"); // 209B LATIN SUBSCRIPT SMALL LETTER S
        rules.add("ₜ > 't';"); // 209C LATIN SUBSCRIPT SMALL LETTER T

        TRANSLITERATOR = Transliterator.createFromRules("SuperscriptSubscript-BasicLatin", String.join("\n", rules),
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
