// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.utils;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public final class Icu4jUtils {

    private Icu4jUtils() {
    }


    /**
     * Renders one or more {@link UnicodeRange}s as a single ICU4J UnicodeSet
     * pattern, e.g. {@code [─-╿]}. Code points outside the Basic Multilingual
     * Plane are escaped with the 8-digit {@code \U} form, as required by the
     * ICU rule syntax.
     *
     * @param range the Unicode block to render
     * @param ranges additional Unicode blocks to include in the same set
     * @return the ICU4J UnicodeSet pattern covering the given blocks
     */
    public static String toIcuRange(UnicodeRange range, UnicodeRange... ranges) {
        StringBuilder result = new StringBuilder("[");
        result.append(toIcuEscapedCodePoint(range.getLower())).append('-')
                .append(toIcuEscapedCodePoint(range.getUpper()));
        for (UnicodeRange additional : ranges) {
            result.append(toIcuEscapedCodePoint(additional.getLower())).append('-')
                    .append(toIcuEscapedCodePoint(additional.getUpper()));
        }
        return result.append(']').toString();
    }


    /**
     * Renders one or more {@link UnicodeRange}s as an ICU4J transliterator
     * global filter rule restricting a ruleset to those blocks, e.g.
     * {@code ::[─-╿];}.
     *
     * @param range the Unicode block to restrict to
     * @param ranges additional Unicode blocks to include in the same filter
     * @return the ICU4J transliterator filter rule for the given blocks
     */
    public static String toIcuFilterRule(UnicodeRange range, UnicodeRange... ranges) {
        return "::" + toIcuRange(range, ranges) + ";";
    }


    /**
     * Renders one or more {@link UnicodeRange}s as an ICU4J transliterator
     * catch-all rule that replaces any unmapped code point in those blocks with
     * the given fallback string, e.g. {@code [─-╿] > '(?)';}.
     *
     * @param fallback the replacement to use for any unmapped code point
     * @param range the Unicode block to fall back on
     * @param ranges additional Unicode blocks to include in the same fallback
     * @return the ICU4J transliterator fallback rule for the given blocks
     */
    public static String toIcuFallbackRule(String fallback, UnicodeRange range, UnicodeRange... ranges) {
        if (fallback.isEmpty()) {
            // A pair of ICU quotes ('') is not an empty literal -- it is the
            // escape sequence for a single quote character. An empty
            // replacement must therefore be written with no quotes at all.
            return toIcuRange(range, ranges) + " > ;";
        }

        return toIcuRange(range, ranges) + " > '" + fallback + "';";
    }


    private static String toIcuEscapedCodePoint(int codePoint) {
        if (codePoint > 0xFFFF) {
            return String.format("\\U%08X", codePoint);
        }
        return String.format("\\u%04X", codePoint);
    }

}
