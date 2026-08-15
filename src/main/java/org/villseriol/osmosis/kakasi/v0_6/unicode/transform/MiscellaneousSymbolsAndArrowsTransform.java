// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.unicode.transform;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/miscellaneous-symbols-and-arrows/
public class MiscellaneousSymbolsAndArrowsTransform implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Miscellaneous Symbols and Arrows
        // block only
        rules.add("::[\\u2B00-\\u2B59];");

        // Miscellaneous Symbols and Arrows block (U+2B00-U+2B59) - arrows use
        // the
        // same vocabulary as ArrowTransform: < > - = ^ v ~

        // Basic 8-direction white/black arrows
        rules.add("[⬀] > '(NE)';"); // 2B00 NORTH EAST WHITE ARROW
        rules.add("[⬁] > '(NW)';"); // 2B01 NORTH WEST WHITE ARROW
        rules.add("[⬂] > '(SE)';"); // 2B02 SOUTH EAST WHITE ARROW
        rules.add("[⬃] > '(SW)';"); // 2B03 SOUTH WEST WHITE ARROW
        rules.add("[⬄] > '<->';"); // 2B04 LEFT RIGHT WHITE ARROW
        rules.add("[⬅] > '<-';"); // 2B05 LEFTWARDS BLACK ARROW
        rules.add("[⬆] > '^';"); // 2B06 UPWARDS BLACK ARROW
        rules.add("[⬇] > 'v';"); // 2B07 DOWNWARDS BLACK ARROW
        rules.add("[⬈] > '(NE)';"); // 2B08 NORTH EAST BLACK ARROW
        rules.add("[⬉] > '(NW)';"); // 2B09 NORTH WEST BLACK ARROW
        rules.add("[⬊] > '(SE)';"); // 2B0A SOUTH EAST BLACK ARROW
        rules.add("[⬋] > '(SW)';"); // 2B0B SOUTH WEST BLACK ARROW
        rules.add("[⬌] > '<->';"); // 2B0C LEFT RIGHT BLACK ARROW
        rules.add("[⬍] > '^v';"); // 2B0D UP DOWN BLACK ARROW

        // Tip/corner arrows -> tip dropped, collapse to base direction
        rules.add("[⬎] > '->';"); // 2B0E RIGHTWARDS ARROW WITH TIP DOWNWARDS
        rules.add("[⬏] > '->';"); // 2B0F RIGHTWARDS ARROW WITH TIP UPWARDS
        rules.add("[⬐] > '<-';"); // 2B10 LEFTWARDS ARROW WITH TIP DOWNWARDS
        rules.add("[⬑] > '<-';"); // 2B11 LEFTWARDS ARROW WITH TIP UPWARDS

        // Non-arrow symbols in this block are left unmapped for now
        rules.add("⬒ > ' ';"); // 2B12 SQUARE WITH TOP HALF BLACK
        rules.add("⬓ > ' ';"); // 2B13 SQUARE WITH BOTTOM HALF BLACK
        rules.add("⬔ > ' ';"); // 2B14 SQUARE WITH UPPER RIGHT DIAGONAL HALF
                               // BLACK
        rules.add("⬕ > ' ';"); // 2B15 SQUARE WITH LOWER LEFT DIAGONAL HALF
                               // BLACK
        rules.add("⬖ > ' ';"); // 2B16 DIAMOND WITH LEFT HALF BLACK
        rules.add("⬗ > ' ';"); // 2B17 DIAMOND WITH RIGHT HALF BLACK
        rules.add("⬘ > ' ';"); // 2B18 DIAMOND WITH TOP HALF BLACK
        rules.add("⬙ > ' ';"); // 2B19 DIAMOND WITH BOTTOM HALF BLACK
        rules.add("⬚ > ' ';"); // 2B1A DOTTED SQUARE
        rules.add("⬛ > ' ';"); // 2B1B BLACK LARGE SQUARE
        rules.add("⬜ > ' ';"); // 2B1C WHITE LARGE SQUARE
        rules.add("⬝ > ' ';"); // 2B1D BLACK VERY SMALL SQUARE
        rules.add("⬞ > ' ';"); // 2B1E WHITE VERY SMALL SQUARE
        rules.add("⬟ > ' ';"); // 2B1F BLACK PENTAGON
        rules.add("⬠ > ' ';"); // 2B20 WHITE PENTAGON
        rules.add("⬡ > ' ';"); // 2B21 WHITE HEXAGON
        rules.add("⬢ > ' ';"); // 2B22 BLACK HEXAGON
        rules.add("⬣ > ' ';"); // 2B23 HORIZONTAL BLACK HEXAGON
        rules.add("⬤ > ' ';"); // 2B24 BLACK LARGE CIRCLE
        rules.add("⬥ > ' ';"); // 2B25 BLACK MEDIUM DIAMOND
        rules.add("⬦ > ' ';"); // 2B26 WHITE MEDIUM DIAMOND
        rules.add("⬧ > ' ';"); // 2B27 BLACK MEDIUM LOZENGE
        rules.add("⬨ > ' ';"); // 2B28 WHITE MEDIUM LOZENGE
        rules.add("⬩ > ' ';"); // 2B29 BLACK SMALL DIAMOND
        rules.add("⬪ > ' ';"); // 2B2A BLACK SMALL LOZENGE
        rules.add("⬫ > ' ';"); // 2B2B WHITE SMALL LOZENGE
        rules.add("⬬ > ' ';"); // 2B2C BLACK HORIZONTAL ELLIPSE
        rules.add("⬭ > ' ';"); // 2B2D WHITE HORIZONTAL ELLIPSE
        rules.add("⬮ > ' ';"); // 2B2E BLACK VERTICAL ELLIPSE
        rules.add("⬯ > ' ';"); // 2B2F WHITE VERTICAL ELLIPSE

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

        // Zigzag / slanted arrows
        rules.add("[⭍] > ' ';"); // 2B4D DOWNWARDS TRIANGLE-HEADED ZIGZAG ARROW
        rules.add("[⭎] > '^';"); // 2B4E SHORT SLANTED NORTH ARROW
        rules.add("[⭏] > 'v';"); // 2B4F SHORT BACKSLANTED SOUTH ARROW

        // Non-arrow symbols in this block are left unmapped for now
        rules.add("⭐ > ' ';"); // 2B50 WHITE MEDIUM STAR
        rules.add("⭑ > ' ';"); // 2B51 BLACK SMALL STAR
        rules.add("⭒ > ' ';"); // 2B52 WHITE SMALL STAR
        rules.add("⭓ > ' ';"); // 2B53 BLACK RIGHT-POINTING PENTAGON
        rules.add("⭔ > ' ';"); // 2B54 WHITE RIGHT-POINTING PENTAGON
        rules.add("⭕ > ' ';"); // 2B55 HEAVY LARGE CIRCLE
        rules.add("⭖ > ' ';"); // 2B56 HEAVY OVAL WITH OVAL INSIDE
        rules.add("⭗ > ' ';"); // 2B57 HEAVY CIRCLE WITH CIRCLE INSIDE
        rules.add("⭘ > ' ';"); // 2B58 HEAVY CIRCLE
        rules.add("⭙ > ' ';"); // 2B59 HEAVY CIRCLED SALTIRE

        TRANSLITERATOR = Transliterator.createFromRules("MiscellaneousSymbolsAndArrows-BasicLatin",
                String.join("\n", rules), Transliterator.FORWARD);
    }

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
