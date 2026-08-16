// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.transform.nonspecific;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;


public class DuplicateSpaceTransform implements Unimap {
    private final BracketTrimTransform bracketTrimTransform = new BracketTrimTransform();

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

        return bracketTrimTransform.action(result.toString());
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

        bracketTrimTransform.action(input);
    }

}
