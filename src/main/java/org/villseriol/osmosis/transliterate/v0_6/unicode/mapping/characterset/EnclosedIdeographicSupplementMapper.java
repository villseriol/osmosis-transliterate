// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.utils.Icu4jUtils;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/enclosed-ideographic-supplement/
public class EnclosedIdeographicSupplementMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Enclosed Ideographic Supplement
        // block
        rules.add(Icu4jUtils.toIcuFilterRule(UnicodeRange.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT));

        // Enclosed Ideographic Supplement block mappings
        rules.add("🈀 > '[ほか]';"); // 1F200 SQUARE HIRAGANA HOKA
        rules.add("🈁 > '[ココ]';"); // 1F201 SQUARED KATAKANA KOKO
        rules.add("🈂 > '[サ]';"); // 1F202 SQUARED KATAKANA SA

        rules.add("🈐 > '[手]';"); // 1F210 SQUARED CJK UNIFIED IDEOGRAPH-624B
        rules.add("🈑 > '[字]';"); // 1F211 SQUARED CJK UNIFIED IDEOGRAPH-5B57
        rules.add("🈒 > '[双]';"); // 1F212 SQUARED CJK UNIFIED IDEOGRAPH-53CC
        rules.add("🈓 > '[デ]';"); // 1F213 SQUARED KATAKANA DE
        rules.add("🈔 > '[二]';"); // 1F214 SQUARED CJK UNIFIED IDEOGRAPH-4E8C
        rules.add("🈕 > '[多]';"); // 1F215 SQUARED CJK UNIFIED IDEOGRAPH-591A
        rules.add("🈖 > '[解]';"); // 1F216 SQUARED CJK UNIFIED IDEOGRAPH-89E3
        rules.add("🈗 > '[天]';"); // 1F217 SQUARED CJK UNIFIED IDEOGRAPH-5929
        rules.add("🈘 > '[交]';"); // 1F218 SQUARED CJK UNIFIED IDEOGRAPH-4EA4
        rules.add("🈙 > '[映]';"); // 1F219 SQUARED CJK UNIFIED IDEOGRAPH-6620
        rules.add("🈚 > '[無]';"); // 1F21A SQUARED CJK UNIFIED IDEOGRAPH-7121
        rules.add("🈛 > '[料]';"); // 1F21B SQUARED CJK UNIFIED IDEOGRAPH-6599
        rules.add("🈜 > '[前]';"); // 1F21C SQUARED CJK UNIFIED IDEOGRAPH-524D
        rules.add("🈝 > '[後]';"); // 1F21D SQUARED CJK UNIFIED IDEOGRAPH-5F8C
        rules.add("🈞 > '[再]';"); // 1F21E SQUARED CJK UNIFIED IDEOGRAPH-518D
        rules.add("🈟 > '[新]';"); // 1F21F SQUARED CJK UNIFIED IDEOGRAPH-65B0
        rules.add("🈠 > '[初]';"); // 1F220 SQUARED CJK UNIFIED IDEOGRAPH-521D
        rules.add("🈡 > '[終]';"); // 1F221 SQUARED CJK UNIFIED IDEOGRAPH-7D42
        rules.add("🈢 > '[生]';"); // 1F222 SQUARED CJK UNIFIED IDEOGRAPH-751F
        rules.add("🈣 > '[販]';"); // 1F223 SQUARED CJK UNIFIED IDEOGRAPH-8CA9
        rules.add("🈤 > '[声]';"); // 1F224 SQUARED CJK UNIFIED IDEOGRAPH-58F0
        rules.add("🈥 > '[吹]';"); // 1F225 SQUARED CJK UNIFIED IDEOGRAPH-5439
        rules.add("🈦 > '[演]';"); // 1F226 SQUARED CJK UNIFIED IDEOGRAPH-6F14
        rules.add("🈧 > '[投]';"); // 1F227 SQUARED CJK UNIFIED IDEOGRAPH-6295
        rules.add("🈨 > '[捕]';"); // 1F228 SQUARED CJK UNIFIED IDEOGRAPH-6355
        rules.add("🈩 > '[一]';"); // 1F229 SQUARED CJK UNIFIED IDEOGRAPH-4E00
        rules.add("🈪 > '[三]';"); // 1F22A SQUARED CJK UNIFIED IDEOGRAPH-4E09
        rules.add("🈫 > '[遊]';"); // 1F22B SQUARED CJK UNIFIED IDEOGRAPH-904A
        rules.add("🈬 > '[左]';"); // 1F22C SQUARED CJK UNIFIED IDEOGRAPH-5DE6
        rules.add("🈭 > '[中]';"); // 1F22D SQUARED CJK UNIFIED IDEOGRAPH-4E2D
        rules.add("🈮 > '[右]';"); // 1F22E SQUARED CJK UNIFIED IDEOGRAPH-53F3
        rules.add("🈯 > '[指]';"); // 1F22F SQUARED CJK UNIFIED IDEOGRAPH-6307
        rules.add("🈰 > '[走]';"); // 1F230 SQUARED CJK UNIFIED IDEOGRAPH-8D70
        rules.add("🈱 > '[打]';"); // 1F231 SQUARED CJK UNIFIED IDEOGRAPH-6253
        rules.add("🈲 > '[禁]';"); // 1F232 SQUARED CJK UNIFIED IDEOGRAPH-7981
        rules.add("🈳 > '[空]';"); // 1F233 SQUARED CJK UNIFIED IDEOGRAPH-7A7A
        rules.add("🈴 > '[合]';"); // 1F234 SQUARED CJK UNIFIED IDEOGRAPH-5408
        rules.add("🈵 > '[満]';"); // 1F235 SQUARED CJK UNIFIED IDEOGRAPH-6E80
        rules.add("🈶 > '[有]';"); // 1F236 SQUARED CJK UNIFIED IDEOGRAPH-6709
        rules.add("🈷 > '[月]';"); // 1F237 SQUARED CJK UNIFIED IDEOGRAPH-6708
        rules.add("🈸 > '[申]';"); // 1F238 SQUARED CJK UNIFIED IDEOGRAPH-7533
        rules.add("🈹 > '[割]';"); // 1F239 SQUARED CJK UNIFIED IDEOGRAPH-5272
        rules.add("🈺 > '[営]';"); // 1F23A SQUARED CJK UNIFIED IDEOGRAPH-55B6
        rules.add("🈻 > '[配]';"); // 1F23B SQUARED CJK UNIFIED IDEOGRAPH-914D

        rules.add("🉀 > '[本]';"); // 1F240 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-672C
        rules.add("🉁 > '[三]';"); // 1F241 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-4E09
        rules.add("🉂 > '[二]';"); // 1F242 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-4E8C
        rules.add("🉃 > '[安]';"); // 1F243 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-5B89
        rules.add("🉄 > '[点]';"); // 1F244 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-70B9
        rules.add("🉅 > '[打]';"); // 1F245 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-6253
        rules.add("🉆 > '[盗]';"); // 1F246 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-76D7
        rules.add("🉇 > '[勝]';"); // 1F247 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-52DD
        rules.add("🉈 > '[敗]';"); // 1F248 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-6557

        rules.add("🉐 > '(得)';"); // 1F250 CIRCLED IDEOGRAPH ADVANTAGE
        rules.add("🉑 > '(可)';"); // 1F251 CIRCLED IDEOGRAPH ACCEPT

        TRANSLITERATOR = Transliterator.createFromRules("EnclosedIdeographicSupplement-Normalized",
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
