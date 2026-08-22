// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public abstract class GreekMapperTest {
    /** The transform under test. */
    protected final GreekMapper transform = new GreekMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            // Skip every block that contains at least one Script=Greek code
            // point, since GreekMapper's underlying [[:Greek:]] filter picks
            // those up wherever they live -- not just the two dedicated
            // Greek blocks, but also scattered Greek-derived phonetic and
            // symbolic characters in these other blocks.
            if (range == UnicodeRange.GREEK_AND_COPTIC || range == UnicodeRange.GREEK_EXTENDED
                    || range == UnicodeRange.PHONETIC_EXTENSIONS || range == UnicodeRange.PHONETIC_EXTENSIONS_SUPPLEMENT
                    || range == UnicodeRange.LETTERLIKE_SYMBOLS || range == UnicodeRange.ANCIENT_GREEK_NUMBERS
                    || range == UnicodeRange.ANCIENT_GREEK_MUSICAL_NOTATION) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }
}
