// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;


public class RangeToWhitespaceTransform implements Unimap {
    private final Unimap transform;

    public RangeToWhitespaceTransform(UnicodeRange range) {
        this.transform = new RangeToStringTransform(range, " ");
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
