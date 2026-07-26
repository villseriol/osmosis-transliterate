// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.Transform;


public class TrimTransform implements Transform {

    @Override
    public String action(String input) {
        return input.trim();
    }


    @Override
    public void action(StringBuffer input) {
        int start = 0;
        while (start < input.length() && Character.isWhitespace(input.charAt(start))) {
            start++;
        }

        int end = input.length();
        while (end > start && Character.isWhitespace(input.charAt(end - 1))) {
            end--;
        }

        input.delete(end, input.length());
        input.delete(0, start);
    }

}
