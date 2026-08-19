// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class TrimTransform implements Unimap {

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
