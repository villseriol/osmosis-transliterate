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


@UnicodeRanges(UnicodeRange.KATAKANA_PHONETIC_EXTENSIONS)
public class KatakanaPhoneticExtensionsMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("ㇰ > ク;");
        rules.add("ㇱ > シ;");
        rules.add("ㇲ > ス;");
        rules.add("ㇳ > ト;");
        rules.add("ㇴ > ヌ;");
        rules.add("ㇵ > ハ;");
        rules.add("ㇶ > ヒ;");
        rules.add("ㇷ > フ;");
        rules.add("ㇸ > ヘ;");
        rules.add("ㇹ > ホ;");
        rules.add("ㇺ > ム;");
        rules.add("ㇻ > ラ;");
        rules.add("ㇼ > リ;");
        rules.add("ㇽ > ル;");
        rules.add("ㇾ > レ;");
        rules.add("ㇿ > ロ;");

        String rule = Icu4jUtils.createIcu4jRule(KatakanaPhoneticExtensionsMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("KatakanaPhoneticExtensions-FullWidth", rule,
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
