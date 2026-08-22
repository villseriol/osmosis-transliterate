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


@UnicodeRanges(UnicodeRange.GENERAL_PUNCTUATION)
public class GeneralPunctuationMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("\u2000 > ' ';");
        rules.add("\u2001 > ' ';");
        rules.add("\u2002 > ' ';");
        rules.add("\u2003 > ' ';");
        rules.add("\u2004 > ' ';");
        rules.add("\u2005 > ' ';");
        rules.add("\u2006 > ' ';");
        rules.add("\u2007 > ' ';");
        rules.add("\u2008 > ' ';");
        rules.add("\u2009 > ' ';");
        rules.add("\u200A > ' ';");

        rules.add("‌ > ;");
        rules.add("‍ > ;");

        rules.add("​ > ;");

        rules.add("\\u200E > ;");
        rules.add("\\u200F > ;");

        rules.add("‐ > '-';");
        rules.add("‑ > '-';");
        rules.add("‒ > '-';");
        rules.add("– > '-';");
        rules.add("— > '-';");
        rules.add("― > '-';");

        rules.add("‖ > '||';");
        rules.add("‗ > '_';");

        rules.add("‘ > '';");
        rules.add("’ > '';");
        rules.add("‚ > ',';");
        rules.add("‛ > '';");
        rules.add("“ > '\"';");
        rules.add("” > '\"';");
        rules.add("„ > '\"';");
        rules.add("‟ > '\"';");

        rules.add("† > '+';");
        rules.add("‡ > '++';");
        rules.add("• > '·';");
        rules.add("‣ > '>';");
        rules.add("․ > '.';");
        rules.add("‥ > '..';");
        rules.add("… > '...';");
        rules.add("‧ > '-';");

        rules.add("‰ > '%';");
        rules.add("‱ > '%';");
        rules.add("′ > '';");
        rules.add("″ > '''';");
        rules.add("‴ > '''''';");
        rules.add("‵ > '`';");
        rules.add("‶ > '``';");
        rules.add("‷ > '```';");
        rules.add("‸ > '^';");

        rules.add("‹ > '<';");
        rules.add("› > '>';");
        rules.add("※ > '*';");
        rules.add("‼ > '!!';");
        rules.add("‽ > '?!';");
        rules.add("‾ > '¯';");
        rules.add("‿ > ' ';");
        rules.add("⁀ > ' ';");
        rules.add("⁁ > ' ';");
        rules.add("⁂ > '***';");
        rules.add("⁃ > '-';");
        rules.add("⁄ > '/';");

        rules.add("⁅ > '[';");
        rules.add("⁆ > ']';");
        rules.add("⁇ > '??';");
        rules.add("⁈ > '?!';");
        rules.add("⁉ > '!?';");

        rules.add("⁊ > ' ';");
        rules.add("⁋ > '¶';");
        rules.add("⁌ > ' ';");
        rules.add("⁍ > ' ';");
        rules.add("⁎ > '*';");
        rules.add("⁏ > ';';");
        rules.add("⁐ > ' ';");
        rules.add("⁑ > '**';");
        rules.add("⁒ > '-';");
        rules.add("⁓ > '~';");
        rules.add("⁔ > ' ';");
        rules.add("⁕ > '*';");
        rules.add("⁖ > ' ';");
        rules.add("⁗ > '''''''';");
        rules.add("⁘ > ' ';");
        rules.add("⁙ > ' ';");
        rules.add("⁚ > ':';");
        rules.add("⁛ > ' ';");
        rules.add("⁜ > '+';");
        rules.add("⁝ > ':';");
        rules.add("⁞ > ':';");
        rules.add("\u205F > ' ';");

        rules.add("\\u2060 > ;");
        rules.add("\\u2061 > ;");
        rules.add("\\u2062 > ;");
        rules.add("\\u2063 > ;");
        rules.add("\\u2064 > ;");

        rules.add("\\u206A > ;");
        rules.add("\\u206B > ;");
        rules.add("\\u206C > ;");
        rules.add("\\u206D > ;");
        rules.add("\\u206E > ;");
        rules.add("\\u206F > ;");

        rules.add("\\u2028 > ;");
        rules.add("\\u2029 > ;");
        rules.add("\\u202A > ;");
        rules.add("\\u202B > ;");
        rules.add("\\u202C > ;");
        rules.add("\\u202D > ;");
        rules.add("\\u202E > ;");

        rules.add("\\u202F > ' ';");

        rules.add("\\u2066 > ;");
        rules.add("\\u2067 > ;");
        rules.add("\\u2068 > ;");
        rules.add("\\u2069 > ;");

        String rule = Icu4jUtils.createIcu4jRule(GeneralPunctuationMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("GeneralPunctuation-Normalized", rule, Transliterator.FORWARD);
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
