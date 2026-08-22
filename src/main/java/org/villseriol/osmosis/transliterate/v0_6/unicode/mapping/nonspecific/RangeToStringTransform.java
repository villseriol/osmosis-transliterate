// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.utils.Icu4jUtils;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


public class RangeToStringTransform implements Unimap {
    private final Transliterator transliterator;

    public RangeToStringTransform(UnicodeRange range, String replacement) {
        this.transliterator = Transliterator.createFromRules("RangeToString-" + range.name(),
                Icu4jUtils.toIcuFallbackRule(replacement, range), Transliterator.FORWARD);
    }


    @Override
    public String action(String input) {
        return transliterator.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        transliterator.transliterate(new ReplaceableString(input));
    }
}
