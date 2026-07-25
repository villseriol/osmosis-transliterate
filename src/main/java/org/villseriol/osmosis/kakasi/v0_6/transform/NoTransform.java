// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.Transform;


public class NoTransform implements Transform {

    @Override
    public String action(String input) {
        return input;
    }


    @Override
    public void action(StringBuffer input) {
    }

}
