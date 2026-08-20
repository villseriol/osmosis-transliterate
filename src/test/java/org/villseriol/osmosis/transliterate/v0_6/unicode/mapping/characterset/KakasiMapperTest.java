// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
import org.villseriol.osmosis.common.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.KakasiTransform;


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
            // Skip every block that KakasiTransform's underlying JAPANESE_SET
            // picks up
            // for transliteration.
            if (range == UnicodeRange.CJK_SYMBOLS_AND_PUNCTUATION || range == UnicodeRange.HIRAGANA
                    || range == UnicodeRange.KATAKANA || range == UnicodeRange.KATAKANA_PHONETIC_EXTENSIONS
                    || range == UnicodeRange.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                    || range == UnicodeRange.CJK_UNIFIED_IDEOGRAPHS
                    || range == UnicodeRange.CJK_COMPATIBILITY_IDEOGRAPHS
                    || range == UnicodeRange.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                    || range == UnicodeRange.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C
                    || range == UnicodeRange.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }
}
