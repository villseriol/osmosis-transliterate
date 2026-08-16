// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


public class Latin1OnlyTransform implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Replace anything outside the Latin-1 character set (U+0000-U+00FF)
        // with whitespace
        rules.add("[^\\u0000-\\u00FF] > ' ';");

        TRANSLITERATOR = Transliterator.createFromRules("Latin1Only-Enforcer", String.join("\n", rules),
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
