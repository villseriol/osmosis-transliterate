// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.RangeToWhitespaceTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/miscellaneous-symbols-and-arrows/
public class MiscellaneousSymbolsAndArrowsTransform implements Unimap {
    private static final Unimap FALLBACK = new RangeToWhitespaceTransform(
            UnicodeRange.MISCELLANEOUS_SYMBOLS_AND_ARROWS);
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Miscellaneous Symbols and Arrows
        // block only
        rules.add("::[\\u2B00-\\u2B59];");

        // Miscellaneous Symbols and Arrows block (U+2B00-U+2B59) - only
        // horizontal (left/right-pointing) arrows are supported, vocabulary:
        // < > = ~; everything else (vertical, diagonal, and all non-arrow
        // symbols) falls back to ' '

        rules.add("[⬄] > '<->';"); // 2B04 LEFT RIGHT WHITE ARROW
        rules.add("[⬅] > '<-';"); // 2B05 LEFTWARDS BLACK ARROW
        rules.add("[⬌] > '<->';"); // 2B0C LEFT RIGHT BLACK ARROW

        // Tip/corner arrows -> tip dropped, collapse to base direction
        rules.add("[⬎] > '->';"); // 2B0E RIGHTWARDS ARROW WITH TIP DOWNWARDS
        rules.add("[⬏] > '->';"); // 2B0F RIGHTWARDS ARROW WITH TIP UPWARDS
        rules.add("[⬐] > '<-';"); // 2B10 LEFTWARDS ARROW WITH TIP DOWNWARDS
        rules.add("[⬑] > '<-';"); // 2B11 LEFTWARDS ARROW WITH TIP UPWARDS

        // Decorated leftwards arrows -> decoration dropped, collapse to base
        rules.add("[⬰] > '<-';"); // 2B30 LEFT ARROW WITH SMALL CIRCLE
        rules.add("[⬱] > '<=';"); // 2B31 THREE LEFTWARDS ARROWS
        rules.add("[⬲] > '<-';"); // 2B32 LEFT ARROW WITH CIRCLED PLUS
        rules.add("[⬳] > '<~';"); // 2B33 LONG LEFTWARDS SQUIGGLE ARROW
        rules.add("[⬴] > '<-';"); // 2B34 LEFTWARDS TWO-HEADED ARROW WITH
                                  // VERTICAL
                                  // STROKE
        rules.add("[⬵] > '<-';"); // 2B35 LEFTWARDS TWO-HEADED ARROW WITH DOUBLE
                                  // VERTICAL STROKE
        rules.add("[⬶] > '<-';"); // 2B36 LEFTWARDS TWO-HEADED ARROW FROM BAR
        rules.add("[⬷] > '<-';"); // 2B37 LEFTWARDS TWO-HEADED TRIPLE DASH ARROW
        rules.add("[⬸] > '<-';"); // 2B38 LEFTWARDS ARROW WITH DOTTED STEM
        rules.add("[⬹] > '<-';"); // 2B39 LEFTWARDS ARROW WITH TAIL WITH
                                  // VERTICAL
                                  // STROKE
        rules.add("[⬺] > '<-';"); // 2B3A LEFTWARDS ARROW WITH TAIL WITH DOUBLE
                                  // VERTICAL STROKE
        rules.add("[⬻] > '<-';"); // 2B3B LEFTWARDS TWO-HEADED ARROW WITH TAIL
        rules.add("[⬼] > '<-';"); // 2B3C LEFTWARDS TWO-HEADED ARROW WITH TAIL
                                  // WITH
                                  // VERTICAL STROKE
        rules.add("[⬽] > '<-';"); // 2B3D LEFTWARDS TWO-HEADED ARROW WITH TAIL
                                  // WITH
                                  // DOUBLE VERTICAL STROKE
        rules.add("[⬾] > '<-';"); // 2B3E LEFTWARDS ARROW THROUGH X
        rules.add("[⬿] > '<~';"); // 2B3F WAVE ARROW POINTING DIRECTLY LEFT

        // Arrows with equals/tilde/almost-equal decorations
        rules.add("[⭀] > '<=';"); // 2B40 EQUALS SIGN ABOVE LEFTWARDS ARROW
        rules.add("[⭁] > '<~';"); // 2B41 REVERSE TILDE OPERATOR ABOVE LEFTWARDS
                                  // ARROW
        rules.add("[⭂] > '<~';"); // 2B42 LEFTWARDS ARROW ABOVE REVERSE ALMOST
                                  // EQUAL TO
        rules.add("[⭃] > '->';"); // 2B43 RIGHTWARDS ARROW THROUGH GREATER-THAN
        rules.add("[⭄] > '->';"); // 2B44 RIGHTWARDS ARROW THROUGH SUPERSET
        rules.add("[⭅] > '<=';"); // 2B45 LEFTWARDS QUADRUPLE ARROW
        rules.add("[⭆] > '=>';"); // 2B46 RIGHTWARDS QUADRUPLE ARROW
        rules.add("[⭇] > '~>';"); // 2B47 REVERSE TILDE OPERATOR ABOVE
                                  // RIGHTWARDS
                                  // ARROW
        rules.add("[⭈] > '~>';"); // 2B48 RIGHTWARDS ARROW ABOVE REVERSE ALMOST
                                  // EQUAL TO
        rules.add("[⭉] > '<~';"); // 2B49 TILDE OPERATOR ABOVE LEFTWARDS ARROW
        rules.add("[⭊] > '<~';"); // 2B4A LEFTWARDS ARROW ABOVE ALMOST EQUAL TO
        rules.add("[⭋] > '<~';"); // 2B4B LEFTWARDS ARROW ABOVE REVERSE TILDE
                                  // OPERATOR
        rules.add("[⭌] > '~>';"); // 2B4C RIGHTWARDS ARROW ABOVE REVERSE TILDE
                                  // OPERATOR

        TRANSLITERATOR = Transliterator.createFromRules("MiscellaneousSymbolsAndArrows-BasicLatin",
                String.join("\n", rules), Transliterator.FORWARD);
    }

    @Override
    public String action(String input) {
        return FALLBACK.action(TRANSLITERATOR.transliterate(input));
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
        FALLBACK.action(input);
    }
}
