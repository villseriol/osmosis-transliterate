// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.utils;

import java.util.Objects;


public abstract class TransformDecorator implements Transform {
    private final Transform target;

    public TransformDecorator(Transform target) {
        this.target = Objects.requireNonNull(target);
    }


    public Transform getTarget() {
        return target;
    }
}
