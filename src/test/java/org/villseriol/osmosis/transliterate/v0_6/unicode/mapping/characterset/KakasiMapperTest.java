// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
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
        for (UnicodeRange range : UnicodeRange.values()) {
            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                if (KakasiTransform.isHandled(codePoint)) {
                    continue;
                }

                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }
}
