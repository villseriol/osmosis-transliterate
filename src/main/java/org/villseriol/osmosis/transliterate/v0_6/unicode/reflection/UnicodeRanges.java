// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


/**
 * Marks a class as operating on one or more {@link UnicodeRange} blocks.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface UnicodeRanges {
    /**
     * The Unicode blocks the annotated class operates on.
     *
     * @return the Unicode blocks
     */
    UnicodeRange[] value();
}
