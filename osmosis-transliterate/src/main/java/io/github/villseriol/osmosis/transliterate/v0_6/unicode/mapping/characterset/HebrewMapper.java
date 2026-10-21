// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.Arrays;

import io.github.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRanges;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


@UnicodeRanges(UnicodeRange.HEBREW)
public class HebrewMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        UnicodeRange[] ranges = Icu4jUtils.getAnnotatedUnicodeRanges(HebrewMapper.class);
        UnicodeRange[] additional = Arrays.copyOfRange(ranges, 1, ranges.length);
        String filter = Icu4jUtils.toIcuRange(ranges[0], additional);

        TRANSLITERATOR = Transliterator.getInstance(filter + " Hebrew-Latin; Latin-ASCII");
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
