// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode;

import java.util.Arrays;
import java.util.Collection;

import org.villseriol.osmosis.transliterate.v0_6.unicode.reflection.UnicodeRanges;


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


    /**
     * Returns the {@link UnicodeRange}s that the given {@link Unimap} class is
     * annotated with via {@link UnicodeRanges}.
     *
     * @param mapperClass the mapper class to inspect
     * @return the Unicode blocks the mapper class is annotated with
     * @throws IllegalArgumentException if the mapper class is not annotated
     *         with {@link UnicodeRanges}
     */
    public static UnicodeRange[] getAnnotatedUnicodeRanges(Class<? extends Unimap> mapperClass) {
        UnicodeRanges[] annotations = mapperClass.getAnnotationsByType(UnicodeRanges.class);
        if (annotations.length == 0) {
            throw new IllegalArgumentException(
                    mapperClass.getName() + " is not annotated with @" + UnicodeRanges.class.getSimpleName());
        }

        UnicodeRange[] ranges = new UnicodeRange[annotations.length];
        for (int i = 0; i < annotations.length; i++) {
            ranges[i] = annotations[i].value();
        }

        return ranges;
    }


    /**
     * Builds a complete ICU4J rule string for the given {@link Unimap} class,
     * consisting of a global filter rule restricting the transliterator to the
     * mapper class's {@link UnicodeRanges}-annotated blocks, followed by the
     * given body rules.
     *
     * @param mapperClass the mapper class to derive the filter rule from
     * @param rules the body rules to append after the filter rule
     * @return the complete ICU4J rule string, ready for
     *         {@link com.ibm.icu.text.Transliterator#createFromRules}
     * @throws IllegalArgumentException if the mapper class is not annotated
     *         with {@link UnicodeRanges}
     */
    public static String createIcu4jRule(Class<? extends Unimap> mapperClass, Collection<String> rules) {
        UnicodeRange[] ranges = getAnnotatedUnicodeRanges(mapperClass);
        UnicodeRange[] additional = Arrays.copyOfRange(ranges, 1, ranges.length);
        String filter = toIcuFilterRule(ranges[0], additional);

        StringBuilder result = new StringBuilder(filter);
        for (String rule : rules) {
            result.append('\n').append(rule);
        }

        return result.toString();
    }


    /**
     * Builds a complete ICU4J rule string for the given {@link Unimap} class,
     * the same as {@link #createIcu4jRule}, with an additional catch-all rule
     * appended that replaces any code point left unmapped by the given body
     * rules with the given fallback.
     *
     * @param mapperClass the mapper class to derive the filter and fallback
     *        rules from
     * @param rules the body rules to append after the filter rule
     * @param fallback the replacement to use for any unmapped code point
     * @return the complete ICU4J rule string, ready for
     *         {@link com.ibm.icu.text.Transliterator#createFromRules}
     * @throws IllegalArgumentException if the mapper class is not annotated
     *         with {@link UnicodeRanges}
     */
    public static String createIcu4jRuleWithFallback(Class<? extends Unimap> mapperClass, Collection<String> rules,
            CharSequence fallback) {
        UnicodeRange[] ranges = getAnnotatedUnicodeRanges(mapperClass);
        UnicodeRange[] additional = Arrays.copyOfRange(ranges, 1, ranges.length);
        String fallbackRule = toIcuFallbackRule(fallback.toString(), ranges[0], additional);

        return createIcu4jRule(mapperClass, rules) + "\n" + fallbackRule;
    }


    private static String toIcuEscapedCodePoint(int codePoint) {
        if (codePoint > 0xFFFF) {
            return String.format("\\U%08X", codePoint);
        }
        return String.format("\\u%04X", codePoint);
    }

}
