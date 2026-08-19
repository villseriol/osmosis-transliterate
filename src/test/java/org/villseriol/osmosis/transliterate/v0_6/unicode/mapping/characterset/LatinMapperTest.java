// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.common.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.LatinTransform;


public abstract class LatinMapperTest {
    /** The transform under test. */
    protected final LatinTransform transform = new LatinTransform();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.LATIN_EXTENDED_A || range == UnicodeRange.LATIN_EXTENDED_B
                    || range == UnicodeRange.IPA_EXTENSIONS || range == UnicodeRange.NUMBER_FORMS
                    || range == UnicodeRange.PHONETIC_EXTENSIONS || range == UnicodeRange.PHONETIC_EXTENSIONS_SUPPLEMENT
                    || range == UnicodeRange.LATIN_EXTENDED_ADDITIONAL || range == UnicodeRange.LATIN_EXTENDED_C
                    || range == UnicodeRange.LATIN_EXTENDED_D || range == UnicodeRange.ALPHABETIC_PRESENTATION_FORMS) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }
}
