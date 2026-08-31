// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.KakasiTransform;


public abstract class KakasiMapperTest {
    /** The transform under test. */
    protected KakasiTransform transform;

    @Before
    public void setUp() {
        KakasiConfig config = new KakasiConfig(KakasiConstants.ASCII_CONFIG);
        config.setSeparator(" ");

        this.transform = new KakasiTransform(config);
    }


    @Test
    public void testUntouched() {
        List<UnicodeRange> annotatedRanges = Arrays.asList(Icu4jUtils.getAnnotatedUnicodeRanges(KakasiTransform.class));

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
