// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.Transform;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


public class UnAccentTransform implements Transform {
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
