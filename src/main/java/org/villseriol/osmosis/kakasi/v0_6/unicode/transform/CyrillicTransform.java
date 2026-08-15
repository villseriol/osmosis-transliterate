// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.unicode.transform;

import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


public class CyrillicTransform implements Unimap {
    private static final Transliterator TRANSLITERATOR = Transliterator
            .getInstance("[[:Cyrillic:]] Cyrillic-Latin; Latin-ASCII");

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
