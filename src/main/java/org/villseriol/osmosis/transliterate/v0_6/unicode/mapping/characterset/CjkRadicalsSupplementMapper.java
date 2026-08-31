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


@UnicodeRanges(UnicodeRange.CJK_RADICALS_SUPPLEMENT)
public class CjkRadicalsSupplementMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("⺂ > '乛';");
        rules.add("⺃ > '乚';");
        rules.add("⺅ > '亻';");
        rules.add("⺇ > '𠘨';");
        rules.add("⺉ > '刂';");
        rules.add("⺋ > '㔾';");
        rules.add("⺍ > '𭕄';");
        rules.add("⺎ > '兀';");
        rules.add("⺏ > '尣';");
        rules.add("⺐ > '尢';");
        rules.add("⺒ > '巳';");
        rules.add("⺓ > '幺';");
        rules.add("⺔ > '彑';");
        rules.add("⺖ > '忄';");
        rules.add("⺘ > '扌';");
        rules.add("⺙ > '攵';");
        rules.add("⺛ > '旡';");
        rules.add("⺞ > '歺';");
        rules.add("⺟ > '母';");
        rules.add("⺠ > '民';");
        rules.add("⺡ > '氵';");
        rules.add("⺣ > '灬';");
        rules.add("⺤ > '爫';");
        rules.add("⺦ > '丬';");
        rules.add("⺨ > '犭';");
        rules.add("⺩ > '𤣩';");
        rules.add("⺫ > '罒';");
        rules.add("⺭ > '礻';");
        rules.add("⺮ > '𥫗';");
        rules.add("⺯ > '糹';");
        rules.add("⺰ > '纟';");
        rules.add("⺱ > '罓';");
        rules.add("⺲ > '罒';");
        rules.add("⺹ > '耂';");
        rules.add("⺺ > '肀';");
        rules.add("⺽ > '𦥑';");
        rules.add("⺾ > '艹';");
        rules.add("⺿ > '艹';");
        rules.add("⻀ > '艹';");
        rules.add("⻂ > '衤';");
        rules.add("⻃ > '覀';");
        rules.add("⻄ > '西';");
        rules.add("⻅ > '见';");
        rules.add("⻇ > '𧢲';");
        rules.add("⻈ > '讠';");
        rules.add("⻉ > '贝';");
        rules.add("⻊ > '𧾷';");
        rules.add("⻋ > '车';");
        rules.add("⻌ > '辶';");
        rules.add("⻍ > '辶';");
        rules.add("⻐ > '钅';");
        rules.add("⻑ > '長';");
        rules.add("⻒ > '镸';");
        rules.add("⻓ > '长';");
        rules.add("⻕ > '𨸏';");
        rules.add("⻖ > '阝';");
        rules.add("⻘ > '青';");
        rules.add("⻙ > '韦';");
        rules.add("⻚ > '页';");
        rules.add("⻛ > '风';");
        rules.add("⻜ > '飞';");
        rules.add("⻞ > '𩙿';");
        rules.add("⻟ > '飠';");
        rules.add("⻠ > '饣';");
        rules.add("⻡ > '𩠐';");
        rules.add("⻢ > '马';");
        rules.add("⻥ > '鱼';");
        rules.add("⻦ > '鸟';");
        rules.add("⻧ > '卤';");
        rules.add("⻨ > '麦';");
        rules.add("⻩ > '黄';");
        rules.add("⻪ > '黾';");
        rules.add("⻫ > '斉';");
        rules.add("⻬ > '齐';");
        rules.add("⻭ > '歯';");
        rules.add("⻮ > '齿';");
        rules.add("⻯ > '竜';");
        rules.add("⻰ > '龙';");
        rules.add("⻲ > '亀';");
        rules.add("⻳ > '龟';");

        String rule = Icu4jUtils.createIcu4jRule(CjkRadicalsSupplementMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("CjkRadicalsSupplement-Normalized", rule,
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
