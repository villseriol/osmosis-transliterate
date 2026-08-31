// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode;

public interface Unimap {
    String action(String input);


    void action(StringBuffer input);
}
