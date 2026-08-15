// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.unicode.decorator;

import java.util.Objects;

import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;


public abstract class TransformDecorator implements Unimap {
    private final Unimap target;

    public TransformDecorator(Unimap target) {
        this.target = Objects.requireNonNull(target);
    }


    public Unimap getTarget() {
        return target;
    }
}
