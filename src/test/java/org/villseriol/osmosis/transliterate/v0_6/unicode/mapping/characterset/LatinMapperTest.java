// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public abstract class LatinMapperTest {
    /** The transform under test. */
    protected final LatinMapper transform = new LatinMapper();

    @Test
    public void testUntouched() {
        List<UnicodeRange> annotatedRanges = Arrays.asList(Icu4jUtils.getAnnotatedUnicodeRanges(LatinMapper.class));

        for (UnicodeRange range : UnicodeRange.values()) {
            if (annotatedRanges.contains(range)) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }
}
