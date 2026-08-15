// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.unicode.transform.nonspecific;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;


public class BracketTrimTransform implements Unimap {
    // Matches an opening bracket ( { [ followed by one or more whitespace
    // characters, with a closing bracket ) } ] somewhere later in the string.
    // Group 1 captures the opening bracket plus the whitespace, group 2
    // captures
    // everything from there through the rest of the string, including the
    // string before the closing bracket, so the match always spans to the end
    // of the input
    private static final Pattern LEFT_BRACKET_PATTERN = Pattern.compile("([(\\[{]\\s+)(.*[)\\]}].*)", Pattern.DOTALL);

    // Matches one or more whitespace characters immediately before a closing
    // bracket ) } ], as long as an opening bracket appears somewhere earlier.
    // Group 1 captures everything before the whitespace, group 2 captures the
    // whitespace plus the closing bracket through the rest of the string, e.g.
    // "(a )" -> "(a)"
    private static final Pattern RIGHT_BRACKET_PATTERN = Pattern.compile("(.*[(\\[{].*)(\\s+[)\\]}].*)",
            Pattern.DOTALL);

    @Override
    public String action(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        if (!input.contains("(") && !input.contains(")") && !input.contains("[") && !input.contains("]")
                && !input.contains("{") && !input.contains("}")) {
            return input;
        }

        String result = input;
        Matcher matcher = LEFT_BRACKET_PATTERN.matcher(result);
        while (matcher.find()) {
            String left = matcher.group(1).trim();
            String right = matcher.group(2);
            result = result.substring(0, matcher.start()) + left + right + result.substring(matcher.end());
            matcher = LEFT_BRACKET_PATTERN.matcher(result);
        }

        matcher = RIGHT_BRACKET_PATTERN.matcher(result);
        while (matcher.find()) {
            String left = matcher.group(1);
            String right = matcher.group(2).replaceFirst("^\\s+", "");
            result = result.substring(0, matcher.start()) + left + right + result.substring(matcher.end());
            matcher = RIGHT_BRACKET_PATTERN.matcher(result);
        }
        return result;
    }


    @Override
    public void action(StringBuffer input) {
        String result = action(input.toString());
        input.setLength(0);
        input.append(result);
    }
}
