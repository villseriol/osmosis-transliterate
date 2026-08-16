// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/greek-and-coptic/
public class GreekTransform implements Unimap {
    private static final Transliterator LIGATURE_ASCII = Transliterator
            .getInstance("[[:Greek:]]; Greek-Latin; Latin-ASCII");

    @Override
    public String action(String input) {
        return LIGATURE_ASCII.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        LIGATURE_ASCII.transliterate(new ReplaceableString(input));
    }
}
