// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.common.UnicodeRange;


public class HalfWidthFullWidthMapperTest {
    private final HalfWidthFullWidthMapper transform = new HalfWidthFullWidthMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.HALFWIDTH_AND_FULLWIDTH_FORMS) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }


    @Test
    public void testMappedCharacters() {
        // Half-width punctuation in U+FF61-U+FF65
        assertEquals("Half-width ｡ should become full-width 。", ".", transform.action("｡")); // U+FF61
        assertEquals("Half-width ､ should become ,", ",", transform.action("､")); // U+FF64
        assertEquals("Half-width ･ should become middle dot ·", "·", transform.action("･")); // U+FF65

        // Standalone dakuten / handakuten should be excluded
        assertEquals("Half-width ﾞ should be removed when standalone", "", transform.action("ﾞ")); // U+FF9E
        assertEquals("Half-width ﾞﾞ should be removed when standalone", "", transform.action("ﾞﾞ"));
        assertEquals("Half-width ﾟ should be removed when standalone", "", transform.action("ﾟ")); // U+FF9F
        assertEquals("Half-width ﾞﾟﾞﾞ should be removed when standalone", "", transform.action("ﾞﾟﾞﾞ"));
        assertEquals("Half-width ﾞ should be removed when standalone", "ガカ", transform.action("ﾞｶﾞｶ"));

        // Vowels
        assertEquals("Half-width ｱ should become full-width ア", "ア", transform.action("ｱ"));
        assertEquals("Half-width ｲ should become full-width イ", "イ", transform.action("ｲ"));
        assertEquals("Half-width ｳ should become full-width ウ", "ウ", transform.action("ｳ"));
        assertEquals("Half-width ｴ should become full-width エ", "エ", transform.action("ｴ"));
        assertEquals("Half-width ｵ should become full-width オ", "オ", transform.action("ｵ"));

        // K-group
        assertEquals("Half-width ｶ should become full-width カ", "カ", transform.action("ｶ"));
        assertEquals("Half-width ｷ should become full-width キ", "キ", transform.action("ｷ"));
        assertEquals("Half-width ｸ should become full-width ク", "ク", transform.action("ｸ"));
        assertEquals("Half-width ｹ should become full-width ケ", "ケ", transform.action("ｹ"));
        assertEquals("Half-width ｺ should become full-width コ", "コ", transform.action("ｺ"));

        // S-group
        assertEquals("Half-width ｻ should become full-width サ", "サ", transform.action("ｻ"));
        assertEquals("Half-width ｼ should become full-width シ", "シ", transform.action("ｼ"));
        assertEquals("Half-width ｽ should become full-width ス", "ス", transform.action("ｽ"));
        assertEquals("Half-width ｾ should become full-width セ", "セ", transform.action("ｾ"));
        assertEquals("Half-width ｿ should become full-width ソ", "ソ", transform.action("ｿ"));

        // T-group
        assertEquals("Half-width ﾀ should become full-width タ", "タ", transform.action("ﾀ"));
        assertEquals("Half-width ﾁ should become full-width チ", "チ", transform.action("ﾁ"));
        assertEquals("Half-width ﾂ should become full-width ツ", "ツ", transform.action("ﾂ"));
        assertEquals("Half-width ﾃ should become full-width テ", "テ", transform.action("ﾃ"));
        assertEquals("Half-width ﾄ should become full-width ト", "ト", transform.action("ﾄ"));

        // N-group
        assertEquals("Half-width ﾅ should become full-width ナ", "ナ", transform.action("ﾅ"));
        assertEquals("Half-width ﾆ should become full-width ニ", "ニ", transform.action("ﾆ"));
        assertEquals("Half-width ﾇ should become full-width ヌ", "ヌ", transform.action("ﾇ"));
        assertEquals("Half-width ﾈ should become full-width ネ", "ネ", transform.action("ﾈ"));
        assertEquals("Half-width ﾉ should become full-width ノ", "ノ", transform.action("ﾉ"));

        // H-group
        assertEquals("Half-width ﾊ should become full-width ハ", "ハ", transform.action("ﾊ"));
        assertEquals("Half-width ﾋ should become full-width ヒ", "ヒ", transform.action("ﾋ"));
        assertEquals("Half-width ﾌ should become full-width フ", "フ", transform.action("ﾌ"));
        assertEquals("Half-width ﾍ should become full-width ヘ", "ヘ", transform.action("ﾍ"));
        assertEquals("Half-width ﾎ should become full-width ホ", "ホ", transform.action("ﾎ"));

        // M-group
        assertEquals("Half-width ﾏ should become full-width マ", "マ", transform.action("ﾏ"));
        assertEquals("Half-width ﾐ should become full-width ミ", "ミ", transform.action("ﾐ"));
        assertEquals("Half-width ﾑ should become full-width ム", "ム", transform.action("ﾑ"));
        assertEquals("Half-width ﾒ should become full-width メ", "メ", transform.action("ﾒ"));
        assertEquals("Half-width ﾓ should become full-width モ", "モ", transform.action("ﾓ"));

        // Y-group
        assertEquals("Half-width ﾔ should become full-width ヤ", "ヤ", transform.action("ﾔ"));
        assertEquals("Half-width ﾕ should become full-width ユ", "ユ", transform.action("ﾕ"));
        assertEquals("Half-width ﾖ should become full-width ヨ", "ヨ", transform.action("ﾖ"));

        // R-group
        assertEquals("Half-width ﾗ should become full-width ラ", "ラ", transform.action("ﾗ"));
        assertEquals("Half-width ﾘ should become full-width リ", "リ", transform.action("ﾘ"));
        assertEquals("Half-width ﾙ should become full-width ル", "ル", transform.action("ﾙ"));
        assertEquals("Half-width ﾚ should become full-width レ", "レ", transform.action("ﾚ"));
        assertEquals("Half-width ﾛ should become full-width ロ", "ロ", transform.action("ﾛ"));

        // W-group
        assertEquals("Half-width ﾜ should become full-width ワ", "ワ", transform.action("ﾜ"));
        assertEquals("Half-width ｦ should become full-width ヲ", "ヲ", transform.action("ｦ"));
        assertEquals("Half-width ﾝ should become full-width ン", "ン", transform.action("ﾝ"));

        // Dakuten (voiced)
        assertEquals("Half-width ｶﾞ should become full-width ガ", "ガ", transform.action("ｶﾞ"));
        assertEquals("Half-width ｷﾞ should become full-width ギ", "ギ", transform.action("ｷﾞ"));
        assertEquals("Half-width ｸﾞ should become full-width グ", "グ", transform.action("ｸﾞ"));
        assertEquals("Half-width ｹﾞ should become full-width ゲ", "ゲ", transform.action("ｹﾞ"));
        assertEquals("Half-width ｺﾞ should become full-width ゴ", "ゴ", transform.action("ｺﾞ"));

        // Handakuten (p-sounds)
        assertEquals("Half-width ﾊﾟ should become full-width パ", "パ", transform.action("ﾊﾟ"));
        assertEquals("Half-width ﾋﾟ should become full-width ピ", "ピ", transform.action("ﾋﾟ"));
        assertEquals("Half-width ﾌﾟ should become full-width プ", "プ", transform.action("ﾌﾟ"));
        assertEquals("Half-width ﾍﾟ should become full-width ペ", "ペ", transform.action("ﾍﾟ"));
        assertEquals("Half-width ﾎﾟ should become full-width ポ", "ポ", transform.action("ﾎﾟ"));
    }


    @Test
    public void testUnmappedCharacters() {
        // FFE7 is reserved, unassigned in Unicode -- no mapping is
        // provided, so it is left untouched.
        assertEquals("￧", transform.action("￧"));
    }
}
