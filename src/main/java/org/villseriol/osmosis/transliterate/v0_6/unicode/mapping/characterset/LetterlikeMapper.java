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


@UnicodeRanges(UnicodeRange.LETTERLIKE_SYMBOLS)
public class LetterlikeMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("℀ > 'a/c';");
        rules.add("℁ > 'a/s';");
        rules.add("ℂ > 'C';");
        rules.add("℃ > '°C';");
        rules.add("℄ > 'CL';");
        rules.add("℅ > 'c/o';");
        rules.add("℆ > 'c/u';");
        rules.add("℈ > 's';");
        rules.add("℉ > '°F';");
        rules.add("ℊ > 'g';");
        rules.add("ℋ > 'H';");
        rules.add("ℌ > 'H';");
        rules.add("ℍ > 'H';");
        rules.add("ℎ > 'h';");
        rules.add("ℏ > 'h';");
        rules.add("ℐ > 'I';");
        rules.add("ℑ > 'I';");
        rules.add("ℒ > 'L';");
        rules.add("ℓ > 'l';");
        rules.add("℔ > 'lb';");
        rules.add("ℕ > 'N';");
        rules.add("№ > 'No.';");
        rules.add("℗ > '(p)';");
        rules.add("℘ > 'P';");
        rules.add("ℙ > 'P';");
        rules.add("ℚ > 'Q';");
        rules.add("ℛ > 'R';");
        rules.add("ℜ > 'R';");
        rules.add("ℝ > 'R';");
        rules.add("℞ > 'Rx';");
        rules.add("℟ > 'R.';");
        rules.add("℠ > '(SM)';");
        rules.add("℡ > 'TEL';");
        rules.add("™ > '(TM)';");
        rules.add("℣ > 'V';");
        rules.add("ℤ > 'Z';");
        rules.add("ℨ > 'Z';");
        rules.add("K > 'K';");
        rules.add("Å > 'A';");
        rules.add("ℬ > 'B';");
        rules.add("ℭ > 'C';");
        rules.add("℮ > 'e';");
        rules.add("ℯ > 'e';");
        rules.add("ℰ > 'E';");
        rules.add("ℱ > 'F';");
        rules.add("ℳ > 'M';");
        rules.add("ℴ > 'o';");
        rules.add("ℵ > 'N';");
        rules.add("ℹ > 'i';");
        rules.add("℻ > 'FAX';");
        rules.add("ℽ > 'y';");
        rules.add("ⅅ > 'D';");
        rules.add("ⅆ > 'd';");
        rules.add("ⅇ > 'e';");
        rules.add("ⅈ > 'i';");
        rules.add("ⅉ > 'j';");
        rules.add("⅋ > '&';");
        rules.add("⅌ > '/';");
        rules.add("⅍ > 'A/S';");

        String rule = Icu4jUtils.createIcu4jRule(LetterlikeMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("Letterlike-BasicLatin", rule, Transliterator.FORWARD);
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
