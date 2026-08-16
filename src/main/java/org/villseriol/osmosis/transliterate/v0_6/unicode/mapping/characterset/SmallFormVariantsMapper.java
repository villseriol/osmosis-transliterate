// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/small-form-variants/
public class SmallFormVariantsMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the full Small Form Variants block,
        // as one continuous range (includes the unassigned U+FE53 and U+FE67
        // slots, which fall through to the '(?)' catch-all below).
        rules.add("::[\\uFE50-\\uFE6B];");

        rules.add("﹐ > ',';"); // FE50 SMALL COMMA
        rules.add("﹑ > ',';"); // FE51 SMALL IDEOGRAPHIC COMMA (dup)
        rules.add("﹒ > '.';"); // FE52 SMALL FULL STOP
        // FE53 unassigned -- falls through to catch-all
        rules.add("﹔ > ';';"); // FE54 SMALL SEMICOLON
        rules.add("﹕ > ':';"); // FE55 SMALL COLON
        rules.add("﹖ > '?';"); // FE56 SMALL QUESTION MARK
        rules.add("﹗ > '!';"); // FE57 SMALL EXCLAMATION MARK
        rules.add("﹘ > '-';"); // FE58 SMALL EM DASH
        rules.add("﹙ > '(';"); // FE59 SMALL LEFT PARENTHESIS
        rules.add("﹚ > ')';"); // FE5A SMALL RIGHT PARENTHESIS
        rules.add("﹛ > '{';"); // FE5B SMALL LEFT CURLY BRACKET
        rules.add("﹜ > '}';"); // FE5C SMALL RIGHT CURLY BRACKET
        rules.add("﹝ > '[';"); // FE5D SMALL LEFT TORTOISE SHELL BRACKET
        rules.add("﹞ > ']';"); // FE5E SMALL RIGHT TORTOISE SHELL BRACKET
        rules.add("﹟ > '#';"); // FE5F SMALL NUMBER SIGN
        rules.add("﹠ > '&';"); // FE60 SMALL AMPERSAND
        rules.add("﹡ > '*';"); // FE61 SMALL ASTERISK
        rules.add("﹢ > '+';"); // FE62 SMALL PLUS SIGN
        rules.add("﹣ > '-';"); // FE63 SMALL HYPHEN-MINUS (dup of em dash token)
        rules.add("﹤ > '<';"); // FE64 SMALL LESS-THAN SIGN
        rules.add("﹥ > '>';"); // FE65 SMALL GREATER-THAN SIGN
        rules.add("﹦ > '=';"); // FE66 SMALL EQUALS SIGN
        // FE67 unassigned -- falls through to catch-all
        rules.add("﹨ > '\\';"); // FE68 SMALL REVERSE SOLIDUS -> literal
                                // backslash
        rules.add("﹩ > '$';"); // FE69 SMALL DOLLAR SIGN
        rules.add("﹪ > '%';"); // FE6A SMALL PERCENT SIGN
        rules.add("﹫ > '@';"); // FE6B SMALL COMMERCIAL AT

        TRANSLITERATOR = Transliterator.createFromRules("SmallFormVariants-BasicLatin", String.join("\n", rules),
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
