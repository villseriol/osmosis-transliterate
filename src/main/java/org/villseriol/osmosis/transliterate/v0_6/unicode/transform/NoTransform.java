// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.transform;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;


public class NoTransform implements Unimap {

    @Override
    public String action(String input) {
        return input;
    }


    @Override
    public void action(StringBuffer input) {
    }

}
