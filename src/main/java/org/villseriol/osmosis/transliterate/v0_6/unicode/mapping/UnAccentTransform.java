// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


public class UnAccentTransform implements Unimap {
    private static final Transliterator TRANSLITERATOR = Transliterator
            .getInstance("[[:Latin:]-[\\u0000-\\u00FF]]; NFD; [:Nonspacing Mark:] Remove; NFC");

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
