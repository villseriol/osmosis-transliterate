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


@UnicodeRanges(UnicodeRange.ENCLOSED_CJK_LETTERS_AND_MONTHS)
public class EnclosedCjkLettersAndMonthsMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("[\\u3200-\\u321F] > ' ';");

        rules.add("㈠ > '(一)';");
        rules.add("㈡ > '(二)';");
        rules.add("㈢ > '(三)';");
        rules.add("㈣ > '(四)';");
        rules.add("㈤ > '(五)';");
        rules.add("㈥ > '(六)';");
        rules.add("㈦ > '(七)';");
        rules.add("㈧ > '(八)';");
        rules.add("㈨ > '(九)';");
        rules.add("㈩ > '(十)';");
        rules.add("㈪ > '(月)';");
        rules.add("㈫ > '(火)';");
        rules.add("㈬ > '(水)';");
        rules.add("㈭ > '(木)';");
        rules.add("㈮ > '(金)';");
        rules.add("㈯ > '(土)';");
        rules.add("㈰ > '(日)';");
        rules.add("㈱ > '(株)';");
        rules.add("㈲ > '(有)';");
        rules.add("㈳ > '(社)';");
        rules.add("㈴ > '(名)';");
        rules.add("㈵ > '(特)';");
        rules.add("㈶ > '(財)';");
        rules.add("㈷ > '(祝)';");
        rules.add("㈸ > '(労)';");
        rules.add("㈹ > '(代)';");
        rules.add("㈺ > '(呼)';");
        rules.add("㈻ > '(学)';");
        rules.add("㈼ > '(監)';");
        rules.add("㈽ > '(企)';");
        rules.add("㈾ > '(資)';");
        rules.add("㈿ > '(協)';");
        rules.add("㉀ > '(祭)';");
        rules.add("㉁ > '(休)';");
        rules.add("㉂ > '(自)';");
        rules.add("㉃ > '(至)';");
        rules.add("㉄ > '(問)';");
        rules.add("㉅ > '(幼)';");
        rules.add("㉆ > '(文)';");
        rules.add("㉇ > '(箏)';");

        rules.add("㉈ > '(10)';");
        rules.add("㉉ > '(20)';");
        rules.add("㉊ > '(30)';");
        rules.add("㉋ > '(40)';");
        rules.add("㉌ > '(50)';");
        rules.add("㉍ > '(60)';");
        rules.add("㉎ > '(70)';");
        rules.add("㉏ > '(80)';");
        rules.add("㉐ > '(PTE)';");
        rules.add("㉑ > '(21)';");
        rules.add("㉒ > '(22)';");
        rules.add("㉓ > '(23)';");
        rules.add("㉔ > '(24)';");
        rules.add("㉕ > '(25)';");
        rules.add("㉖ > '(26)';");
        rules.add("㉗ > '(27)';");
        rules.add("㉘ > '(28)';");
        rules.add("㉙ > '(29)';");
        rules.add("㉚ > '(30)';");
        rules.add("㉛ > '(31)';");
        rules.add("㉜ > '(32)';");
        rules.add("㉝ > '(33)';");
        rules.add("㉞ > '(34)';");
        rules.add("㉟ > '(35)';");

        rules.add("[\\u3260-\\u327F] > ' ';");

        rules.add("㊀ > '(一)';");
        rules.add("㊁ > '(二)';");
        rules.add("㊂ > '(三)';");
        rules.add("㊃ > '(四)';");
        rules.add("㊄ > '(五)';");
        rules.add("㊅ > '(六)';");
        rules.add("㊆ > '(七)';");
        rules.add("㊇ > '(八)';");
        rules.add("㊈ > '(九)';");
        rules.add("㊉ > '(十)';");
        rules.add("㊊ > '(月)';");
        rules.add("㊋ > '(火)';");
        rules.add("㊌ > '(水)';");
        rules.add("㊍ > '(木)';");
        rules.add("㊎ > '(金)';");
        rules.add("㊏ > '(土)';");
        rules.add("㊐ > '(日)';");
        rules.add("㊑ > '(株)';");
        rules.add("㊒ > '(有)';");
        rules.add("㊓ > '(社)';");
        rules.add("㊔ > '(名)';");
        rules.add("㊕ > '(特)';");
        rules.add("㊖ > '(財)';");
        rules.add("㊗ > '(祝)';");
        rules.add("㊘ > '(労)';");
        rules.add("㊙ > '(秘)';");
        rules.add("㊚ > '(男)';");
        rules.add("㊛ > '(女)';");
        rules.add("㊜ > '(適)';");
        rules.add("㊝ > '(優)';");
        rules.add("㊞ > '(印)';");
        rules.add("㊟ > '(注)';");
        rules.add("㊠ > '(項)';");
        rules.add("㊡ > '(休)';");
        rules.add("㊢ > '(写)';");
        rules.add("㊣ > '(正)';");
        rules.add("㊤ > '(上)';");
        rules.add("㊥ > '(中)';");
        rules.add("㊦ > '(下)';");
        rules.add("㊧ > '(左)';");
        rules.add("㊨ > '(右)';");
        rules.add("㊩ > '(医)';");
        rules.add("㊪ > '(宗)';");
        rules.add("㊫ > '(学)';");
        rules.add("㊬ > '(監)';");
        rules.add("㊭ > '(企)';");
        rules.add("㊮ > '(資)';");
        rules.add("㊯ > '(協)';");
        rules.add("㊰ > '(夜)';");
        rules.add("㊱ > '(36)';");
        rules.add("㊲ > '(37)';");
        rules.add("㊳ > '(38)';");
        rules.add("㊴ > '(39)';");
        rules.add("㊵ > '(40)';");
        rules.add("㊶ > '(41)';");
        rules.add("㊷ > '(42)';");
        rules.add("㊸ > '(43)';");
        rules.add("㊹ > '(44)';");
        rules.add("㊺ > '(45)';");
        rules.add("㊻ > '(46)';");
        rules.add("㊼ > '(47)';");
        rules.add("㊽ > '(48)';");
        rules.add("㊾ > '(49)';");
        rules.add("㊿ > '(50)';");

        rules.add("㋀ > '1月';");
        rules.add("㋁ > '2月';");
        rules.add("㋂ > '3月';");
        rules.add("㋃ > '4月';");
        rules.add("㋄ > '5月';");
        rules.add("㋅ > '6月';");
        rules.add("㋆ > '7月';");
        rules.add("㋇ > '8月';");
        rules.add("㋈ > '9月';");
        rules.add("㋉ > '10月';");
        rules.add("㋊ > '11月';");
        rules.add("㋋ > '12月';");

        rules.add("㋌ > 'Hg';");
        rules.add("㋍ > 'erg';");
        rules.add("㋎ > 'eV';");
        rules.add("㋏ > 'LTD';");

        rules.add("㋐ > '(ア)';");
        rules.add("㋑ > '(イ)';");
        rules.add("㋒ > '(ウ)';");
        rules.add("㋓ > '(エ)';");
        rules.add("㋔ > '(オ)';");
        rules.add("㋕ > '(カ)';");
        rules.add("㋖ > '(キ)';");
        rules.add("㋗ > '(ク)';");
        rules.add("㋘ > '(ケ)';");
        rules.add("㋙ > '(コ)';");
        rules.add("㋚ > '(サ)';");
        rules.add("㋛ > '(シ)';");
        rules.add("㋜ > '(ス)';");
        rules.add("㋝ > '(セ)';");
        rules.add("㋞ > '(ソ)';");
        rules.add("㋟ > '(タ)';");
        rules.add("㋠ > '(チ)';");
        rules.add("㋡ > '(ツ)';");
        rules.add("㋢ > '(テ)';");
        rules.add("㋣ > '(ト)';");
        rules.add("㋤ > '(ナ)';");
        rules.add("㋥ > '(ニ)';");
        rules.add("㋦ > '(ヌ)';");
        rules.add("㋧ > '(ネ)';");
        rules.add("㋨ > '(ノ)';");
        rules.add("㋩ > '(ハ)';");
        rules.add("㋪ > '(ヒ)';");
        rules.add("㋫ > '(フ)';");
        rules.add("㋬ > '(ヘ)';");
        rules.add("㋭ > '(ホ)';");
        rules.add("㋮ > '(マ)';");
        rules.add("㋯ > '(ミ)';");
        rules.add("㋰ > '(ム)';");
        rules.add("㋱ > '(メ)';");
        rules.add("㋲ > '(モ)';");
        rules.add("㋳ > '(ヤ)';");
        rules.add("㋴ > '(ユ)';");
        rules.add("㋵ > '(ヨ)';");
        rules.add("㋶ > '(ラ)';");
        rules.add("㋷ > '(リ)';");
        rules.add("㋸ > '(ル)';");
        rules.add("㋹ > '(レ)';");
        rules.add("㋺ > '(ロ)';");
        rules.add("㋻ > '(ワ)';");
        rules.add("㋼ > '(ヰ)';");
        rules.add("㋽ > '(ヱ)';");
        rules.add("㋾ > '(ヲ)';");

        rules.add("㋿ > '令和';");

        String rule = Icu4jUtils.createIcu4jRuleWithFallback(EnclosedCjkLettersAndMonthsMapper.class, rules, " ");

        TRANSLITERATOR = Transliterator.createFromRules("EnclosedCjkLettersAndMonths-Normalized", rule,
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
