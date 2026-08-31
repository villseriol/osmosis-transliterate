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


@UnicodeRanges(UnicodeRange.MISCELLANEOUS_SYMBOLS_AND_ARROWS)
public class MiscellaneousSymbolsAndArrowsMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("[⬄] > '<->';");
        rules.add("[⬅] > '<-';");
        rules.add("[⬌] > '<->';");

        rules.add("[⬎] > '->';");
        rules.add("[⬏] > '->';");
        rules.add("[⬐] > '<-';");
        rules.add("[⬑] > '<-';");

        rules.add("[⬰] > '<-';");
        rules.add("[⬱] > '<=';");
        rules.add("[⬲] > '<-';");
        rules.add("[⬳] > '<~';");
        rules.add("[⬴] > '<-';");
        rules.add("[⬵] > '<-';");
        rules.add("[⬶] > '<-';");
        rules.add("[⬷] > '<-';");
        rules.add("[⬸] > '<-';");
        rules.add("[⬹] > '<-';");
        rules.add("[⬺] > '<-';");
        rules.add("[⬻] > '<-';");
        rules.add("[⬼] > '<-';");
        rules.add("[⬽] > '<-';");
        rules.add("[⬾] > '<-';");
        rules.add("[⬿] > '<~';");

        rules.add("[⭀] > '<=';");
        rules.add("[⭁] > '<~';");
        rules.add("[⭂] > '<~';");
        rules.add("[⭃] > '->';");
        rules.add("[⭄] > '->';");
        rules.add("[⭅] > '<=';");
        rules.add("[⭆] > '=>';");
        rules.add("[⭇] > '~>';");
        rules.add("[⭈] > '~>';");
        rules.add("[⭉] > '<~';");
        rules.add("[⭊] > '<~';");
        rules.add("[⭋] > '<~';");
        rules.add("[⭌] > '~>';");

        String rule = Icu4jUtils.createIcu4jRuleWithFallback(MiscellaneousSymbolsAndArrowsMapper.class, rules, " ");

        TRANSLITERATOR = Transliterator.createFromRules("MiscellaneousSymbolsAndArrows-BasicLatin", rule,
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
