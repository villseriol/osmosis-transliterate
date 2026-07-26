// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.Transform;


public class DuplicateSpaceTransform implements Transform {

    @Override
    public String action(String input) {
        StringBuilder result = new StringBuilder(input.length());

        int i = 0;
        while (i < input.length()) {
            char c = input.charAt(i);
            if (Character.isWhitespace(c)) {
                result.append(' ');
                do {
                    i++;
                } while (i < input.length() && Character.isWhitespace(input.charAt(i)));
            } else {
                result.append(c);
                i++;
            }
        }

        return result.toString();
    }


    @Override
    public void action(StringBuffer input) {
        int i = 0;
        while (i < input.length()) {
            if (Character.isWhitespace(input.charAt(i))) {
                int j = i + 1;
                while (j < input.length() && Character.isWhitespace(input.charAt(j))) {
                    j++;
                }
                input.replace(i, j, " ");
            }

            i++;
        }
    }

}
