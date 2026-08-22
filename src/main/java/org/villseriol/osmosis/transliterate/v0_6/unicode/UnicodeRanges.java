// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks a class as operating on a {@link UnicodeRange} block. May be applied
 * multiple times to a single class to mark it as operating on more than one
 * block.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(UnicodeRanges.Container.class)
public @interface UnicodeRanges {
    /**
     * The Unicode block the annotated class operates on.
     *
     * @return the Unicode block
     */
    UnicodeRange value();

    /**
     * Container for repeated {@link UnicodeRanges} annotations.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface Container {
        /**
         * The repeated {@link UnicodeRanges} annotations.
         *
         * @return the repeated annotations
         */
        UnicodeRanges[] value();
    }
}
