// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform.decorators;

public interface Transform {
    String action(String input);


    void action(StringBuffer input);
}
