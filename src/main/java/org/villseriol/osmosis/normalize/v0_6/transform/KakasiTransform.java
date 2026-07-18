// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6.transform;

import org.villseriol.kakasi.api.Kakasi;
import org.villseriol.osmosis.normalize.v0_6.utils.StringUtils;
import org.villseriol.osmosis.shared.Transform;
import org.villseriol.osmosis.shared.UnicodeRange;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.text.UnicodeSet.SpanCondition;


public class KakasiTransform implements Transform {
    // CJK Symbols and Punctuation, Hiragana, Katakana, Katakana Phonetic
    // Extensions, CJK Unified Ideographs (+ Extension A), CJK Compatibility
    // Ideographs, and Halfwidth and Fullwidth Forms (halfwidth katakana +
    // voicing marks live here)
    private static final UnicodeSet JAPANESE_SET = new UnicodeSet(
            StringUtils.toIcuRange(UnicodeRange.CJK_SYMBOLS_AND_PUNCTUATION, UnicodeRange.HIRAGANA,
                    UnicodeRange.KATAKANA, UnicodeRange.KATAKANA_PHONETIC_EXTENSIONS,
                    UnicodeRange.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, UnicodeRange.CJK_UNIFIED_IDEOGRAPHS,
                    UnicodeRange.CJK_COMPATIBILITY_IDEOGRAPHS, UnicodeRange.HALFWIDTH_AND_FULLWIDTH_FORMS)).freeze();

    private final Kakasi kakasi;

    public KakasiTransform(Kakasi kakasi) {
        this.kakasi = kakasi;
    }


    @Override
    public String action(String input) {
        int length = input.length();
        StringBuilder result = new StringBuilder(length);
        int i = 0;

        while (i < length) {
            // kakasi transliterates a run of Japanese text at a time rather
            // than a single character at a time, so runs are found via
            // UnicodeSet.span rather than matching character by character
            int nonJapaneseEnd = JAPANESE_SET.span(input, i, SpanCondition.NOT_CONTAINED);
            result.append(input, i, nonJapaneseEnd);
            i = nonJapaneseEnd;

            if (i >= length) {
                break;
            }

            int japaneseEnd = JAPANESE_SET.span(input, i, SpanCondition.CONTAINED);

            if (result.length() > 0) {
                char previous = result.charAt(result.length() - 1);

                if (previous != ' ' && !isBracket(previous)) {
                    result.append(' ');
                }
            }

            result.append(kakasi.run(input.subSequence(i, japaneseEnd)));

            if (japaneseEnd < length) {
                char next = input.charAt(japaneseEnd);

                if (next != ' ' && !isBracket(next)) {
                    result.append(' ');
                }
            }

            i = japaneseEnd;
        }

        return result.toString();
    }


    private static boolean isBracket(char c) {
        return c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}' || c == '<' || c == '>';
    }


    @Override
    public void action(StringBuffer input) {
        String result = action(input.toString());
        input.setLength(0);
        input.append(result);
    }

}
