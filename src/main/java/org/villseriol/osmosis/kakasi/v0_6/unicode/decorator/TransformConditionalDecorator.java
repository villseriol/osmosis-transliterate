// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.unicode.decorator;

import java.util.Objects;
import java.util.function.Supplier;

import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;


public class TransformConditionalDecorator extends TransformDecorator {
    private final Supplier<Boolean> condition;

    public TransformConditionalDecorator(Unimap target, Supplier<Boolean> condition) {
        super(target);

        this.condition = Objects.requireNonNull(condition);
    }


    @Override
    public String action(String input) {
        if (!condition.get()) {
            return input;
        }

        return getTarget().action(input);
    }


    @Override
    public void action(StringBuffer input) {
        if (!condition.get()) {
            return;
        }

        getTarget().action(input);
    }

}
