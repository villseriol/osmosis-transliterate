// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.Transform;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/latin-extended-a/
public class LatinTransform implements Transform {
    private static final Transliterator LIGATURE_ASCII = Transliterator
            .getInstance("[[:Latin:]-[\\u0000-\\u00FF]]; Any-Latin; Latin-ASCII");

    @Override
    public String action(String input) {
        return LIGATURE_ASCII.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        LIGATURE_ASCII.transliterate(new ReplaceableString(input));
    }
}
