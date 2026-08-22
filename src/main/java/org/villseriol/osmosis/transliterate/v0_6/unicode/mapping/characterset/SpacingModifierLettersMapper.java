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


@UnicodeRanges(UnicodeRange.SPACING_MODIFIER_LETTERS)
public class SpacingModifierLettersMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("ʰ > 'h';");
        rules.add("ʱ > 'h';");
        rules.add("ʲ > 'j';");
        rules.add("ʳ > 'r';");
        rules.add("ʴ > 'r';");
        rules.add("ʵ > 'r';");
        rules.add("ʶ > 'r';");
        rules.add("ʷ > 'w';");
        rules.add("ʸ > 'y';");
        rules.add("ʹ > '';");
        rules.add("ʺ > '\"';");
        rules.add("ʻ > '';");
        rules.add("ʼ > '';");
        rules.add("ʽ > '';");
        rules.add("ʾ > ' ';");
        rules.add("ʿ > ' ';");
        rules.add("ˀ > ' ';");
        rules.add("ˁ > ' ';");
        rules.add("˂ > '<';");
        rules.add("˃ > '>';");
        rules.add("˄ > '^';");
        rules.add("˅ > ' ';");
        rules.add("ˆ > '^';");
        rules.add("ˇ > ' ';");
        rules.add("ˈ > '';");
        rules.add("ˉ > '¯';");
        rules.add("ˊ > '';");
        rules.add("ˋ > '`';");
        rules.add("ˌ > ' ';");
        rules.add("ˍ > '_';");
        rules.add("ˎ > ',';");
        rules.add("ˏ > ',';");
        rules.add("ː > ':';");
        rules.add("ˑ > ' ';");
        rules.add("˒ > ' ';");
        rules.add("˓ > ' ';");
        rules.add("˔ > ' ';");
        rules.add("˕ > ' ';");
        rules.add("˖ > '+';");
        rules.add("˗ > '-';");
        rules.add("˘ > ' ';");
        rules.add("˙ > ' ';");
        rules.add("˚ > '°';");
        rules.add("˛ > ' ';");
        rules.add("˜ > '~';");
        rules.add("˝ > '\"';");
        rules.add("˞ > ' ';");
        rules.add("˟ > ' ';");
        rules.add("ˠ > ' ';");
        rules.add("ˡ > 'l';");
        rules.add("ˢ > 's';");
        rules.add("ˣ > 'x';");
        rules.add("ˤ > ' ';");
        rules.add("˥ > ' ';");
        rules.add("˦ > ' ';");
        rules.add("˧ > ' ';");
        rules.add("˨ > ' ';");
        rules.add("˩ > ' ';");
        rules.add("˪ > ' ';");
        rules.add("˫ > ' ';");
        rules.add("ˬ > ' ';");
        rules.add("˭ > ' ';");
        rules.add("ˮ > '\"';");
        rules.add("˯ > ' ';");
        rules.add("˰ > ' ';");
        rules.add("˱ > ' ';");
        rules.add("˲ > ' ';");
        rules.add("˳ > ' ';");
        rules.add("˴ > ' ';");
        rules.add("˵ > ' ';");
        rules.add("˶ > ' ';");
        rules.add("˷ > ' ';");
        rules.add("˸ > ':';");
        rules.add("˹ > ' ';");
        rules.add("˺ > ' ';");
        rules.add("˻ > ' ';");
        rules.add("˼ > ' ';");
        rules.add("˽ > ' ';");
        rules.add("˾ > ' ';");
        rules.add("˿ > '<-';");

        String rule = Icu4jUtils.createIcu4jRule(SpacingModifierLettersMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("SpacingModifierLetters-Normalized", rule,
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
