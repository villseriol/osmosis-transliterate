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


@UnicodeRanges(UnicodeRange.HALFWIDTH_AND_FULLWIDTH_FORMS)
public class HalfWidthFullWidthMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("！ > '!';");
        rules.add("＂ > '\"';");
        rules.add("＃ > '#';");
        rules.add("＄ > '$';");
        rules.add("％ > '%';");
        rules.add("＆ > '&';");
        rules.add("＇ > '';");
        rules.add("（ > '(';");
        rules.add("） > ')';");
        rules.add("＊ > '*';");
        rules.add("＋ > '+';");
        rules.add("， > ',';");
        rules.add("－ > 'ー';");
        rules.add("． > '.';");
        rules.add("／ > '/';");

        rules.add("０ > '0';");
        rules.add("１ > '1';");
        rules.add("２ > '2';");
        rules.add("３ > '3';");
        rules.add("４ > '4';");
        rules.add("５ > '5';");
        rules.add("６ > '6';");
        rules.add("７ > '7';");
        rules.add("８ > '8';");
        rules.add("９ > '9';");

        rules.add("： > ':';");
        rules.add("； > ';';");
        rules.add("＜ > '<';");
        rules.add("＝ > '=';");
        rules.add("＞ > '>';");
        rules.add("？ > '?';");
        rules.add("＠ > '@';");

        rules.add("Ａ > 'A';");
        rules.add("Ｂ > 'B';");
        rules.add("Ｃ > 'C';");
        rules.add("Ｄ > 'D';");
        rules.add("Ｅ > 'E';");
        rules.add("Ｆ > 'F';");
        rules.add("Ｇ > 'G';");
        rules.add("Ｈ > 'H';");
        rules.add("Ｉ > 'I';");
        rules.add("Ｊ > 'J';");
        rules.add("Ｋ > 'K';");
        rules.add("Ｌ > 'L';");
        rules.add("Ｍ > 'M';");
        rules.add("Ｎ > 'N';");
        rules.add("Ｏ > 'O';");
        rules.add("Ｐ > 'P';");
        rules.add("Ｑ > 'Q';");
        rules.add("Ｒ > 'R';");
        rules.add("Ｓ > 'S';");
        rules.add("Ｔ > 'T';");
        rules.add("Ｕ > 'U';");
        rules.add("Ｖ > 'V';");
        rules.add("Ｗ > 'W';");
        rules.add("Ｘ > 'X';");
        rules.add("Ｙ > 'Y';");
        rules.add("Ｚ > 'Z';");

        rules.add("［ > '[';");
        rules.add("＼ > '\\';");
        rules.add("］ > ']';");
        rules.add("＾ > '^';");
        rules.add("＿ > '_';");
        rules.add("｀ > '`';");

        rules.add("ａ > 'a';");
        rules.add("ｂ > 'b';");
        rules.add("ｃ > 'c';");
        rules.add("ｄ > 'd';");
        rules.add("ｅ > 'e';");
        rules.add("ｆ > 'f';");
        rules.add("ｇ > 'g';");
        rules.add("ｈ > 'h';");
        rules.add("ｉ > 'i';");
        rules.add("ｊ > 'j';");
        rules.add("ｋ > 'k';");
        rules.add("ｌ > 'l';");
        rules.add("ｍ > 'm';");
        rules.add("ｎ > 'n';");
        rules.add("ｏ > 'o';");
        rules.add("ｐ > 'p';");
        rules.add("ｑ > 'q';");
        rules.add("ｒ > 'r';");
        rules.add("ｓ > 's';");
        rules.add("ｔ > 't';");
        rules.add("ｕ > 'u';");
        rules.add("ｖ > 'v';");
        rules.add("ｗ > 'w';");
        rules.add("ｘ > 'x';");
        rules.add("ｙ > 'y';");
        rules.add("ｚ > 'z';");

        rules.add("｛ > '{';");
        rules.add("｜ > '|';");
        rules.add("｝ > '}';");
        rules.add("～ > '~';");

        rules.add("｟ > '((';");
        rules.add("｠ > '))';");

        rules.add("｡ > '.';");
        rules.add("｢ > '[';");
        rules.add("｣ > ']';");
        rules.add("､ > ',';");

        rules.add("･ > '·';");


        rules.add("ｶﾞ > 'ガ';");
        rules.add("ｷﾞ > 'ギ';");
        rules.add("ｸﾞ > 'グ';");
        rules.add("ｹﾞ > 'ゲ';");
        rules.add("ｺﾞ > 'ゴ';");
        rules.add("ｻﾞ > 'ザ';");
        rules.add("ｼﾞ > 'ジ';");
        rules.add("ｽﾞ > 'ズ';");
        rules.add("ｾﾞ > 'ゼ';");
        rules.add("ｿﾞ > 'ゾ';");
        rules.add("ﾀﾞ > 'ダ';");
        rules.add("ﾁﾞ > 'ヂ';");
        rules.add("ﾂﾞ > 'ヅ';");
        rules.add("ﾃﾞ > 'デ';");
        rules.add("ﾄﾞ > 'ド';");
        rules.add("ﾊﾞ > 'バ';");
        rules.add("ﾋﾞ > 'ビ';");
        rules.add("ﾌﾞ > 'ブ';");
        rules.add("ﾍﾞ > 'ベ';");
        rules.add("ﾎﾞ > 'ボ';");
        rules.add("ｳﾞ > 'ヴ';");

        rules.add("ﾊﾟ > 'パ';");
        rules.add("ﾋﾟ > 'ピ';");
        rules.add("ﾌﾟ > 'プ';");
        rules.add("ﾍﾟ > 'ペ';");
        rules.add("ﾎﾟ > 'ポ';");

        rules.add("ｦ > 'ヲ';");
        rules.add("ｧ > 'ァ';");
        rules.add("ｨ > 'ィ';");
        rules.add("ｩ > 'ゥ';");
        rules.add("ｪ > 'ェ';");
        rules.add("ｫ > 'ォ';");
        rules.add("ｬ > 'ャ';");
        rules.add("ｭ > 'ュ';");
        rules.add("ｮ > 'ョ';");
        rules.add("ｯ > 'ッ';");
        rules.add("ｰ > 'ー';");
        rules.add("ｱ > 'ア';");
        rules.add("ｲ > 'イ';");
        rules.add("ｳ > 'ウ';");
        rules.add("ｴ > 'エ';");
        rules.add("ｵ > 'オ';");
        rules.add("ｶ > 'カ';");
        rules.add("ｷ > 'キ';");
        rules.add("ｸ > 'ク';");
        rules.add("ｹ > 'ケ';");
        rules.add("ｺ > 'コ';");
        rules.add("ｻ > 'サ';");
        rules.add("ｼ > 'シ';");
        rules.add("ｽ > 'ス';");
        rules.add("ｾ > 'セ';");
        rules.add("ｿ > 'ソ';");
        rules.add("ﾀ > 'タ';");
        rules.add("ﾁ > 'チ';");
        rules.add("ﾂ > 'ツ';");
        rules.add("ﾃ > 'テ';");
        rules.add("ﾄ > 'ト';");
        rules.add("ﾅ > 'ナ';");
        rules.add("ﾆ > 'ニ';");
        rules.add("ﾇ > 'ヌ';");
        rules.add("ﾈ > 'ネ';");
        rules.add("ﾉ > 'ノ';");
        rules.add("ﾊ > 'ハ';");
        rules.add("ﾋ > 'ヒ';");
        rules.add("ﾌ > 'フ';");
        rules.add("ﾍ > 'ヘ';");
        rules.add("ﾎ > 'ホ';");
        rules.add("ﾏ > 'マ';");
        rules.add("ﾐ > 'ミ';");
        rules.add("ﾑ > 'ム';");
        rules.add("ﾒ > 'メ';");
        rules.add("ﾓ > 'モ';");
        rules.add("ﾔ > 'ヤ';");
        rules.add("ﾕ > 'ユ';");
        rules.add("ﾖ > 'ヨ';");
        rules.add("ﾗ > 'ラ';");
        rules.add("ﾘ > 'リ';");
        rules.add("ﾙ > 'ル';");
        rules.add("ﾚ > 'レ';");
        rules.add("ﾛ > 'ロ';");
        rules.add("ﾜ > 'ワ';");
        rules.add("ﾝ > 'ン';");

        rules.add("ﾞ > ;");
        rules.add("ﾟ > ;");

        rules.add("￠ > '\u00A2';");
        rules.add("￡ > '\u00A3';");
        rules.add("￢ > '\u00AC';");
        rules.add("￣ > '\u00AF';");
        rules.add("￤ > '\u00A6';");
        rules.add("￥ > '\u00A5';");
        rules.add("￦ > 'W';");

        rules.add("￨ > '|';");
        rules.add("￩ > '<-';");
        rules.add("￪ > ' ';");
        rules.add("￫ > '->';");
        rules.add("￬ > ' ';");
        rules.add("￭ > ' ';");
        rules.add("￮ > ' ';");

        String rule = Icu4jUtils.createIcu4jRule(HalfWidthFullWidthMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("HalfWidthFullWidth-Normalized", rule,
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
