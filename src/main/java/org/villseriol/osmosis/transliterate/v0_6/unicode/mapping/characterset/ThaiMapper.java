// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/thai/
public class ThaiMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR = Transliterator
            .getInstance("[[:Thai:]] Thai-Latin; Latin-ASCII");

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
