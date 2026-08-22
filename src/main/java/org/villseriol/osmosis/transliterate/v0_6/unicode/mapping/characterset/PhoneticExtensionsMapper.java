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


@UnicodeRanges(UnicodeRange.PHONETIC_EXTENSIONS)
public class PhoneticExtensionsMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("ᴀ > 'A';");
        rules.add("ᴁ > 'AE';");
        rules.add("ᴃ > 'B';");
        rules.add("ᴄ > 'C';");
        rules.add("ᴅ > 'D';");
        rules.add("ᴆ > 'D';");
        rules.add("ᴇ > 'E';");
        rules.add("ᴊ > 'J';");
        rules.add("ᴋ > 'K';");
        rules.add("ᴌ > 'L';");
        rules.add("ᴍ > 'M';");
        rules.add("ᴏ > 'O';");
        rules.add("ᴘ > 'P';");
        rules.add("ᴛ > 'T';");
        rules.add("ᴜ > 'U';");
        rules.add("ᴠ > 'V';");
        rules.add("ᴡ > 'W';");
        rules.add("ᴢ > 'Z';");
        rules.add("ᵫ > 'ue';");
        rules.add("ᵬ > 'b';");
        rules.add("ᵭ > 'd';");
        rules.add("ᵮ > 'f';");
        rules.add("ᵯ > 'm';");
        rules.add("ᵰ > 'n';");
        rules.add("ᵱ > 'p';");
        rules.add("ᵲ > 'r';");
        rules.add("ᵳ > 'r';");
        rules.add("ᵴ > 's';");
        rules.add("ᵵ > 't';");
        rules.add("ᵶ > 'z';");
        rules.add("ᵺ > 'th';");
        rules.add("ᵻ > 'I';");
        rules.add("ᵽ > 'p';");
        rules.add("ᵾ > 'U';");

        String rule = Icu4jUtils.createIcu4jRule(PhoneticExtensionsMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("PhoneticExtensions-Normalized", rule, Transliterator.FORWARD);
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
