// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/arrows/
public class ArrowsMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Arrow block only
        rules.add("::[\\u2190-\\u21FF];");

        // Arrows block (U+2190-U+21FF) - only left/right-pointing arrows are
        // supported, vocabulary: < > = ~; everything else (up, down,
        // diagonal, rotate, up-down pairs, etc.) falls back to ' '

        // Basic arrows
        rules.add("[←] > '<-';"); // 2190 LEFTWARDS ARROW
        rules.add("[→] > '->';"); // 2192 RIGHTWARDS ARROW
        rules.add("[↔] > '<->';"); // 2194 LEFT RIGHT ARROW

        // Stroke-negated arrows -> style dropped, collapse to base direction
        rules.add("[↚] > '<-';"); // 219A LEFTWARDS ARROW WITH STROKE
        rules.add("[↛] > '->';"); // 219B RIGHTWARDS ARROW WITH STROKE

        // Wave arrows
        rules.add("[↜] > '<~';"); // 219C LEFTWARDS WAVE ARROW
        rules.add("[↝] > '~>';"); // 219D RIGHTWARDS WAVE ARROW

        // Two-headed arrows
        rules.add("[↞] > '<-';"); // 219E LEFTWARDS TWO HEADED ARROW
        rules.add("[↠] > '->';"); // 21A0 RIGHTWARDS TWO HEADED ARROW

        // Tail arrows -> tail dropped, collapse to base
        rules.add("[↢] > '<-';"); // 21A2 LEFTWARDS ARROW WITH TAIL
        rules.add("[↣] > '->';"); // 21A3 RIGHTWARDS ARROW WITH TAIL

        // Bar / mapsto arrows -> bar dropped, collapse to base
        rules.add("[↤] > '<-';"); // 21A4 LEFTWARDS ARROW FROM BAR
        rules.add("[↦] > '->';"); // 21A6 RIGHTWARDS ARROW FROM BAR ("mapsto")

        // Hooked arrows -> hook dropped, collapse to base
        rules.add("[↩] > '<-';"); // 21A9 LEFTWARDS ARROW WITH HOOK
        rules.add("[↪] > '->';"); // 21AA RIGHTWARDS ARROW WITH HOOK

        // Looped arrows -> loop dropped, collapse to base
        rules.add("[↫] > '<-';"); // 21AB LEFTWARDS ARROW WITH LOOP
        rules.add("[↬] > '->';"); // 21AC RIGHTWARDS ARROW WITH LOOP

        rules.add("[↭] > '<~>';"); // 21AD LEFT RIGHT WAVE ARROW
        rules.add("[↮] > '<->';"); // 21AE LEFT RIGHT ARROW WITH STROKE

        // Bar-compound arrow
        rules.add("[↹] > '<->';"); // 21B9 LEFTWARDS ARROW TO BAR OVER
                                   // RIGHTWARDS ARROW TO BAR

        // Harpoons -> barb direction dropped, collapse to base
        rules.add("[↼] > '<-';"); // 21BC LEFTWARDS HARPOON WITH BARB UPWARDS
        rules.add("[↽] > '<-';"); // 21BD LEFTWARDS HARPOON WITH BARB DOWNWARDS
        rules.add("[⇀] > '->';"); // 21C0 RIGHTWARDS HARPOON WITH BARB UPWARDS
        rules.add("[⇁] > '->';"); // 21C1 RIGHTWARDS HARPOON WITH BARB DOWNWARDS

        // Paired / exchange arrows
        rules.add("[⇄] > '<->';"); // 21C4 RIGHTWARDS ARROW OVER LEFTWARDS ARROW
        rules.add("[⇆] > '<->';"); // 21C6 LEFTWARDS ARROW OVER RIGHTWARDS ARROW
        rules.add("[⇇] > '<=';"); // 21C7 LEFTWARDS PAIRED ARROWS
        rules.add("[⇉] > '=>';"); // 21C9 RIGHTWARDS PAIRED ARROWS

        // Chemical equilibrium arrows
        rules.add("[⇋] > '<=>';"); // 21CB LEFTWARDS HARPOON OVER RIGHTWARDS
                                   // HARPOON
        rules.add("[⇌] > '<=>';"); // 21CC RIGHTWARDS HARPOON OVER LEFTWARDS
                                   // HARPOON

        // Double-line stroke-negated arrows -> style dropped, collapse to
        // double-line base
        rules.add("[⇍] > '<=';"); // 21CD LEFTWARDS DOUBLE ARROW WITH STROKE
        rules.add("[⇎] > '<=>';"); // 21CE LEFT RIGHT DOUBLE ARROW WITH STROKE
        rules.add("[⇏] > '=>';"); // 21CF RIGHTWARDS DOUBLE ARROW WITH STROKE

        // Double-line arrows
        rules.add("[⇐] > '<=';"); // 21D0 LEFTWARDS DOUBLE ARROW
        rules.add("[⇒] > '=>';"); // 21D2 RIGHTWARDS DOUBLE ARROW
        rules.add("[⇔] > '<=>';"); // 21D4 LEFT RIGHT DOUBLE ARROW

        rules.add("[⇚] > '<=';"); // 21DA LEFTWARDS TRIPLE ARROW
        rules.add("[⇛] > '=>';"); // 21DB RIGHTWARDS TRIPLE ARROW

        // Squiggle arrows
        rules.add("[⇜] > '<~';"); // 21DC LEFTWARDS SQUIGGLE ARROW
        rules.add("[⇝] > '~>';"); // 21DD RIGHTWARDS SQUIGGLE ARROW

        // Dashed arrows -> style dropped, collapse to base
        rules.add("[⇠] > '<-';"); // 21E0 LEFTWARDS DASHED ARROW
        rules.add("[⇢] > '->';"); // 21E2 RIGHTWARDS DASHED ARROW

        // Arrow to bar -> bar dropped, collapse to base
        rules.add("[⇤] > '<-';"); // 21E4 LEFTWARDS ARROW TO BAR
        rules.add("[⇥] > '->';"); // 21E5 RIGHTWARDS ARROW TO BAR

        // "White" (outline/keyboard-glyph) arrows -> pedestal/outline dropped,
        // collapse to base
        rules.add("[⇦] > '<-';"); // 21E6 LEFTWARDS WHITE ARROW
        rules.add("[⇨] > '->';"); // 21E8 RIGHTWARDS WHITE ARROW
        rules.add("[⇰] > '->';"); // 21F0 RIGHTWARDS WHITE ARROW FROM WALL

        rules.add("[⇴] > '->';"); // 21F4 RIGHT ARROW WITH SMALL CIRCLE
        rules.add("[⇶] > '=>';"); // 21F6 THREE RIGHTWARDS ARROWS

        // Vertical-stroke / double-vertical-stroke arrows -> stroke dropped,
        // collapse to base
        rules.add("[⇷] > '<-';"); // 21F7 LEFTWARDS ARROW WITH VERTICAL STROKE
        rules.add("[⇸] > '->';"); // 21F8 RIGHTWARDS ARROW WITH VERTICAL STROKE
        rules.add("[⇹] > '<->';"); // 21F9 LEFT RIGHT ARROW WITH VERTICAL STROKE
        rules.add("[⇺] > '<-';"); // 21FA LEFTWARDS ARROW WITH DOUBLE VERTICAL
                                  // STROKE
        rules.add("[⇻] > '->';"); // 21FB RIGHTWARDS ARROW WITH DOUBLE VERTICAL
                                  // STROKE
        rules.add("[⇼] > '<->';"); // 21FC LEFT RIGHT ARROW WITH DOUBLE VERTICAL
                                   // STROKE

        // Open-headed arrows
        rules.add("[⇽] > '<-';"); // 21FD LEFTWARDS OPEN-HEADED ARROW
        rules.add("[⇾] > '->';"); // 21FE RIGHTWARDS OPEN-HEADED ARROW
        rules.add("[⇿] > '<->';"); // 21FF LEFT RIGHT OPEN-HEADED ARROW

        // Fallback: anything not left/right-pointing (up, down, diagonal,
        // rotate, up-down pairs, etc.) becomes ' '
        rules.add("[\\u2190-\\u21FF] > ' ';");

        TRANSLITERATOR = Transliterator.createFromRules("Arrow-BasicLatin", String.join("\n", rules),
                Transliterator.FORWARD);
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
