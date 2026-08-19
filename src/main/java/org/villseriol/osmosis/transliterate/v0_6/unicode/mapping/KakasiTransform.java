// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping;

import java.util.Objects;
import java.util.logging.Logger;

import org.villseriol.kakasi.api.Kakasi;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.osmosis.common.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.utils.StringUtils;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.text.UnicodeSet.SpanCondition;


public class KakasiTransform implements Unimap {
    private static final Logger LOG = Logger.getLogger(KakasiTransform.class.getName());

    // CJK Symbols and Punctuation, Hiragana, Katakana, Katakana Phonetic
    // Extensions, CJK Unified Ideographs (+ Extensions A, B, C, D), CJK
    // Compatibility Ideographs, and Halfwidth and Fullwidth Forms (halfwidth
    // katakana + voicing marks live here)
    private static final UnicodeSet JAPANESE_SET = new UnicodeSet(
            StringUtils.toIcuRange(UnicodeRange.CJK_SYMBOLS_AND_PUNCTUATION, UnicodeRange.HIRAGANA,
                    UnicodeRange.KATAKANA, UnicodeRange.KATAKANA_PHONETIC_EXTENSIONS,
                    UnicodeRange.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, UnicodeRange.CJK_UNIFIED_IDEOGRAPHS,
                    UnicodeRange.CJK_COMPATIBILITY_IDEOGRAPHS, UnicodeRange.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B,
                    UnicodeRange.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C, UnicodeRange.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D))
                            .freeze();

    private final Kakasi kakasi;

    public KakasiTransform(KakasiConfig config) {
        this.kakasi = new Kakasi(Objects.requireNonNull(config));

        // ensure correct initialization of kakasi buffers
        String first = kakasi.run("にほんご");
        if ("nihongo".equalsIgnoreCase(first)) {
            LOG.fine("Kakasi initialized");
        } else {
            LOG.severe("Failed to convert '日本語' to 'nihongo'");
            throw new RuntimeException("Kakasi initialization error");
        }
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

                if (Character.isLetterOrDigit(previous) || isClosingBracket(previous) || isPunctuation(previous)) {
                    result.append(' ');
                }
            }

            result.append(kakasi.run(input.subSequence(i, japaneseEnd)));

            if (japaneseEnd < length) {
                char next = input.charAt(japaneseEnd);

                if (Character.isLetterOrDigit(next) || isOpeningBracket(next)) {
                    result.append(' ');
                }
            }

            i = japaneseEnd;
        }

        return result.toString();
    }


    @Override
    public void action(StringBuffer input) {
        String result = action(input.toString());
        input.setLength(0);
        input.append(result);
    }


    public static boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }


    public static boolean isClosingBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }


    public static boolean isPunctuation(char c) {
        return c == '.' || c == ',' || c == '?' || c == '!' || c == ';' || c == ':';
    }
}
