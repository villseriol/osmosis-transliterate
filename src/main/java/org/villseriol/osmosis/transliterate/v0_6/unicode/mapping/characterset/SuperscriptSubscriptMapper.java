// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRanges;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


@UnicodeRanges(UnicodeRange.SUPERSCRIPTS_AND_SUBSCRIPTS)
public class SuperscriptSubscriptMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();
        rules.add("⁰ > '0';");
        rules.add("ⁱ > 'i';");
        rules.add("⁴ > '4';");
        rules.add("⁵ > '5';");
        rules.add("⁶ > '6';");
        rules.add("⁷ > '7';");
        rules.add("⁸ > '8';");
        rules.add("⁹ > '9';");

        rules.add("⁺ > '+';");
        rules.add("⁻ > '-';");
        rules.add("⁼ > '=';");
        rules.add("⁽ > '(';");
        rules.add("⁾ > ')';");
        rules.add("ⁿ > 'n';");

        rules.add("₀ > '0';");
        rules.add("₁ > '1';");
        rules.add("₂ > '2';");
        rules.add("₃ > '3';");
        rules.add("₄ > '4';");
        rules.add("₅ > '5';");
        rules.add("₆ > '6';");
        rules.add("₇ > '7';");
        rules.add("₈ > '8';");
        rules.add("₉ > '9';");

        rules.add("₊ > '+';");
        rules.add("₋ > '-';");
        rules.add("₌ > '=';");
        rules.add("₍ > '(';");
        rules.add("₎ > ')';");

        rules.add("ₐ > 'a';");
        rules.add("ₑ > 'e';");
        rules.add("ₒ > 'o';");
        rules.add("ₓ > 'x';");
        rules.add("ₔ > 'e';");
        rules.add("ₕ > 'h';");
        rules.add("ₖ > 'k';");
        rules.add("ₗ > 'l';");
        rules.add("ₘ > 'm';");
        rules.add("ₙ > 'n';");
        rules.add("ₚ > 'p';");
        rules.add("ₛ > 's';");
        rules.add("ₜ > 't';");

        String rule = Icu4jUtils.createIcu4jRule(SuperscriptSubscriptMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("SuperscriptSubscript-BasicLatin", rule,
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
