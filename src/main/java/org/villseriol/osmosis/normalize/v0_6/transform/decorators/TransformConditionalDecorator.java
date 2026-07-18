// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6.transform.decorators;

import java.util.function.Supplier;

import org.villseriol.osmosis.shared.Transform;
import org.villseriol.osmosis.shared.TransformDecorator;


public class TransformConditionalDecorator extends TransformDecorator {
    private final Supplier<Boolean> condition;

    public TransformConditionalDecorator(Transform target, Supplier<Boolean> condition) {
        super(target);

        this.condition = condition;
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
