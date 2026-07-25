// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform.decorators;

import java.util.ArrayList;
import java.util.Collection;


public class TransformSequenceDecorator extends TransformDecorator {
    private final Collection<Transform> targets = new ArrayList<>();

    public TransformSequenceDecorator(Transform target, Transform... rest) {
        super(target);

        this.targets.add(target);
        for (Transform t : rest) {
            this.targets.add(t);
        }
    }


    public TransformSequenceDecorator(Collection<Transform> targets) {
        super(firstOf(targets));

        this.targets.addAll(targets);
    }


    private static Transform firstOf(Collection<Transform> targets) {
        if (targets.isEmpty()) {
            throw new IllegalArgumentException("At least one transform is required");
        }

        return targets.iterator().next();
    }


    @Override
    public String action(String input) {
        String current = input;

        for (Transform t : targets) {
            current = t.action(current);
        }

        return current;
    }


    @Override
    public void action(StringBuffer input) {
        for (Transform t : targets) {
            t.action(input);
        }
    }

}
