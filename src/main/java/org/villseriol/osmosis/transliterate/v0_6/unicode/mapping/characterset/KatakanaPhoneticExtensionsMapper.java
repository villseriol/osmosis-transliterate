// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.utils.StringUtils;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/katakana-phonetic-extensions/
public class KatakanaPhoneticExtensionsMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Katakana Phonetic Extensions block
        rules.add(StringUtils.toIcuFilterRule(UnicodeRange.KATAKANA_PHONETIC_EXTENSIONS));

        // Small Ainu-extension katakana -> their full-size equivalent
        rules.add("ㇰ > ク;"); // 31F0 KATAKANA LETTER SMALL KU
        rules.add("ㇱ > シ;"); // 31F1 KATAKANA LETTER SMALL SI
        rules.add("ㇲ > ス;"); // 31F2 KATAKANA LETTER SMALL SU
        rules.add("ㇳ > ト;"); // 31F3 KATAKANA LETTER SMALL TO
        rules.add("ㇴ > ヌ;"); // 31F4 KATAKANA LETTER SMALL NU
        rules.add("ㇵ > ハ;"); // 31F5 KATAKANA LETTER SMALL HA
        rules.add("ㇶ > ヒ;"); // 31F6 KATAKANA LETTER SMALL HI
        rules.add("ㇷ > フ;"); // 31F7 KATAKANA LETTER SMALL HU
        rules.add("ㇸ > ヘ;"); // 31F8 KATAKANA LETTER SMALL HE
        rules.add("ㇹ > ホ;"); // 31F9 KATAKANA LETTER SMALL HO
        rules.add("ㇺ > ム;"); // 31FA KATAKANA LETTER SMALL MU
        rules.add("ㇻ > ラ;"); // 31FB KATAKANA LETTER SMALL RA
        rules.add("ㇼ > リ;"); // 31FC KATAKANA LETTER SMALL RI
        rules.add("ㇽ > ル;"); // 31FD KATAKANA LETTER SMALL RU
        rules.add("ㇾ > レ;"); // 31FE KATAKANA LETTER SMALL RE
        rules.add("ㇿ > ロ;"); // 31FF KATAKANA LETTER SMALL RO

        TRANSLITERATOR = Transliterator.createFromRules("KatakanaPhoneticExtensions-FullWidth",
                String.join("\n", rules), Transliterator.FORWARD);
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
