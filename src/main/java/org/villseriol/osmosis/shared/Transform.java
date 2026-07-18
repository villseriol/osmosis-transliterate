// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.shared;

public interface Transform {
    String action(String input);


    void action(StringBuffer input);
}
