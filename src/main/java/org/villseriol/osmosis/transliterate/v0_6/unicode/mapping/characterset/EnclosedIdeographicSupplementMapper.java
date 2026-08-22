// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.unicode.reflection.UnicodeRanges;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


@UnicodeRanges(UnicodeRange.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT)
public class EnclosedIdeographicSupplementMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("🈀 > '[ほか]';");
        rules.add("🈁 > '[ココ]';");
        rules.add("🈂 > '[サ]';");

        rules.add("🈐 > '[手]';");
        rules.add("🈑 > '[字]';");
        rules.add("🈒 > '[双]';");
        rules.add("🈓 > '[デ]';");
        rules.add("🈔 > '[二]';");
        rules.add("🈕 > '[多]';");
        rules.add("🈖 > '[解]';");
        rules.add("🈗 > '[天]';");
        rules.add("🈘 > '[交]';");
        rules.add("🈙 > '[映]';");
        rules.add("🈚 > '[無]';");
        rules.add("🈛 > '[料]';");
        rules.add("🈜 > '[前]';");
        rules.add("🈝 > '[後]';");
        rules.add("🈞 > '[再]';");
        rules.add("🈟 > '[新]';");
        rules.add("🈠 > '[初]';");
        rules.add("🈡 > '[終]';");
        rules.add("🈢 > '[生]';");
        rules.add("🈣 > '[販]';");
        rules.add("🈤 > '[声]';");
        rules.add("🈥 > '[吹]';");
        rules.add("🈦 > '[演]';");
        rules.add("🈧 > '[投]';");
        rules.add("🈨 > '[捕]';");
        rules.add("🈩 > '[一]';");
        rules.add("🈪 > '[三]';");
        rules.add("🈫 > '[遊]';");
        rules.add("🈬 > '[左]';");
        rules.add("🈭 > '[中]';");
        rules.add("🈮 > '[右]';");
        rules.add("🈯 > '[指]';");
        rules.add("🈰 > '[走]';");
        rules.add("🈱 > '[打]';");
        rules.add("🈲 > '[禁]';");
        rules.add("🈳 > '[空]';");
        rules.add("🈴 > '[合]';");
        rules.add("🈵 > '[満]';");
        rules.add("🈶 > '[有]';");
        rules.add("🈷 > '[月]';");
        rules.add("🈸 > '[申]';");
        rules.add("🈹 > '[割]';");
        rules.add("🈺 > '[営]';");
        rules.add("🈻 > '[配]';");

        rules.add("🉀 > '[本]';");
        rules.add("🉁 > '[三]';");
        rules.add("🉂 > '[二]';");
        rules.add("🉃 > '[安]';");
        rules.add("🉄 > '[点]';");
        rules.add("🉅 > '[打]';");
        rules.add("🉆 > '[盗]';");
        rules.add("🉇 > '[勝]';");
        rules.add("🉈 > '[敗]';");

        rules.add("🉐 > '(得)';");
        rules.add("🉑 > '(可)';");

        String rule = Icu4jUtils.createIcu4jRule(EnclosedIdeographicSupplementMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("EnclosedIdeographicSupplement-Normalized", rule,
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
