// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.decorator;

import java.util.ArrayList;
import java.util.Collection;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class TransformSequenceDecorator extends TransformDecorator {
    private final Collection<Unimap> targets = new ArrayList<>();

    public TransformSequenceDecorator(Unimap target, Unimap... rest) {
        super(target);

        this.targets.add(target);
        for (Unimap t : rest) {
            this.targets.add(t);
        }
    }


    public TransformSequenceDecorator(Collection<Unimap> targets) {
        super(firstOf(targets));

        this.targets.addAll(targets);
    }


    private static Unimap firstOf(Collection<Unimap> targets) {
        if (targets.isEmpty()) {
            throw new IllegalArgumentException("At least one transform is required");
        }

        return targets.iterator().next();
    }


    @Override
    public String action(String input) {
        String current = input;

        for (Unimap t : targets) {
            current = t.action(current);
        }

        return current;
    }


    @Override
    public void action(StringBuffer input) {
        for (Unimap t : targets) {
            t.action(input);
        }
    }

}
