// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6.transform;

import org.villseriol.osmosis.shared.Transform;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


public class UnAccentTransform implements Transform {
    private static final Transliterator TRANSLITERATOR = Transliterator
            .getInstance("[[:Latin:]]; NFD; [:Nonspacing Mark:] Remove; NFC");

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
