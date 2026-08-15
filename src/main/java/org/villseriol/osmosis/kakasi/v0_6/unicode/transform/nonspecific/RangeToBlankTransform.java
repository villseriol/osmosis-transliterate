// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.unicode.transform.nonspecific;

import org.villseriol.osmosis.kakasi.v0_6.unicode.types.UnicodeRange;
import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;


public class RangeToBlankTransform implements Unimap {
    private final Unimap transform;

    public RangeToBlankTransform(UnicodeRange range) {
        this.transform = new RangeToStringTransform(range, "");
    }


    @Override
    public String action(String input) {
        return transform.action(input);
    }


    @Override
    public void action(StringBuffer input) {
        transform.action(input);
    }
}
