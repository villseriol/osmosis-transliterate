// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.Arrays;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.unicode.reflection.UnicodeRanges;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


@UnicodeRanges(UnicodeRange.CYRILLIC)
public class CyrillicMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        UnicodeRange[] ranges = Icu4jUtils.getAnnotatedUnicodeRanges(CyrillicMapper.class);
        UnicodeRange[] additional = Arrays.copyOfRange(ranges, 1, ranges.length);
        String filter = Icu4jUtils.toIcuRange(ranges[0], additional);

        TRANSLITERATOR = Transliterator.getInstance(filter + " Cyrillic-Latin; Latin-ASCII");
    }

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
