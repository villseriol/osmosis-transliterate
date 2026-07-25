// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.Transform;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/arrows/
public class ArrowTransform implements Transform {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Arrow block only
        rules.add("::[\\u2190-\\u21FF];");

        // Arrows block (U+2190–U+21FF) - full coverage, vocabulary: < > - = ^ v
        // ~

        // Basic 8-direction arrows
        rules.add("[←] > '<-';"); // 2190 LEFTWARDS ARROW
        rules.add("[↑] > '^';"); // 2191 UPWARDS ARROW
        rules.add("[→] > '->';"); // 2192 RIGHTWARDS ARROW
        rules.add("[↓] > 'v';"); // 2193 DOWNWARDS ARROW
        rules.add("[↔] > '<->';"); // 2194 LEFT RIGHT ARROW
        rules.add("[↕] > '^v';"); // 2195 UP DOWN ARROW
        rules.add("[↖] > '^<';"); // 2196 NORTH WEST ARROW
        rules.add("[↗] > '^>';"); // 2197 NORTH EAST ARROW
        rules.add("[↘] > 'v>';"); // 2198 SOUTH EAST ARROW
        rules.add("[↙] > 'v<';"); // 2199 SOUTH WEST ARROW

        // Stroke-negated arrows -> style dropped, collapse to base direction
        rules.add("[↚] > '<-';"); // 219A LEFTWARDS ARROW WITH STROKE
        rules.add("[↛] > '->';"); // 219B RIGHTWARDS ARROW WITH STROKE

        // Wave arrows
        rules.add("[↜] > '<~';"); // 219C LEFTWARDS WAVE ARROW
        rules.add("[↝] > '~>';"); // 219D RIGHTWARDS WAVE ARROW

        // Two-headed arrows
        rules.add("[↞] > '<-';"); // 219E LEFTWARDS TWO HEADED ARROW
        rules.add("[↟] > '^^';"); // 219F UPWARDS TWO HEADED ARROW
        rules.add("[↠] > '->';"); // 21A0 RIGHTWARDS TWO HEADED ARROW
        rules.add("[↡] > 'vv';"); // 21A1 DOWNWARDS TWO HEADED ARROW

        // Tail arrows -> tail dropped, collapse to base
        rules.add("[↢] > '<-';"); // 21A2 LEFTWARDS ARROW WITH TAIL
        rules.add("[↣] > '->';"); // 21A3 RIGHTWARDS ARROW WITH TAIL

        // Bar / mapsto arrows -> bar dropped, collapse to base
        rules.add("[↤] > '<-';"); // 21A4 LEFTWARDS ARROW FROM BAR
        rules.add("[↥] > '^';"); // 21A5 UPWARDS ARROW FROM BAR
        rules.add("[↦] > '->';"); // 21A6 RIGHTWARDS ARROW FROM BAR ("mapsto")
        rules.add("[↧] > 'v';"); // 21A7 DOWNWARDS ARROW FROM BAR
        rules.add("[↨] > '^v';"); // 21A8 UP DOWN ARROW WITH BASE

        // Hooked arrows -> hook dropped, collapse to base
        rules.add("[↩] > '<-';"); // 21A9 LEFTWARDS ARROW WITH HOOK
        rules.add("[↪] > '->';"); // 21AA RIGHTWARDS ARROW WITH HOOK

        // Looped arrows -> loop dropped, collapse to base
        rules.add("[↫] > '<-';"); // 21AB LEFTWARDS ARROW WITH LOOP
        rules.add("[↬] > '->';"); // 21AC RIGHTWARDS ARROW WITH LOOP

        rules.add("[↭] > '<~>';"); // 21AD LEFT RIGHT WAVE ARROW
        rules.add("[↮] > '<->';"); // 21AE LEFT RIGHT ARROW WITH STROKE
        rules.add("[↯] > '~v';"); // 21AF DOWNWARDS ZIGZAG ARROW

        // Tip/corner arrows
        rules.add("[↰] > '^<';"); // 21B0 UPWARDS ARROW WITH TIP LEFTWARDS
        rules.add("[↱] > '^>';"); // 21B1 UPWARDS ARROW WITH TIP RIGHTWARDS
        rules.add("[↲] > 'v<';"); // 21B2 DOWNWARDS ARROW WITH TIP LEFTWARDS
        rules.add("[↳] > 'v>';"); // 21B3 DOWNWARDS ARROW WITH TIP RIGHTWARDS
        rules.add("[↴] > '>v';"); // 21B4 RIGHTWARDS ARROW WITH CORNER DOWNWARDS
        rules.add("[↵] > 'v<';"); // 21B5 DOWNWARDS ARROW WITH CORNER LEFTWARDS

        // Semicircle rotate arrows -> approximated by implied rotation
        // direction
        rules.add("[↶] > '<-';"); // 21B6 ANTICLOCKWISE TOP SEMICIRCLE ARROW
        rules.add("[↷] > '->';"); // 21B7 CLOCKWISE TOP SEMICIRCLE ARROW

        // Bar-compound arrows
        rules.add("[↸] > '^<';"); // 21B8 NORTH WEST ARROW TO LONG BAR
        rules.add("[↹] > '<->';"); // 21B9 LEFTWARDS ARROW TO BAR OVER
                                   // RIGHTWARDS
                                   // ARROW TO BAR

        // Open circle rotate arrows -> approximated by implied rotation
        // direction
        rules.add("[↺] > '<-';"); // 21BA ANTICLOCKWISE OPEN CIRCLE ARROW
        rules.add("[↻] > '->';"); // 21BB CLOCKWISE OPEN CIRCLE ARROW

        // Harpoons -> barb direction dropped, collapse to base
        rules.add("[↼] > '<-';"); // 21BC LEFTWARDS HARPOON WITH BARB UPWARDS
        rules.add("[↽] > '<-';"); // 21BD LEFTWARDS HARPOON WITH BARB DOWNWARDS
        rules.add("[↾] > '^';"); // 21BE UPWARDS HARPOON WITH BARB RIGHTWARDS
        rules.add("[↿] > '^';"); // 21BF UPWARDS HARPOON WITH BARB LEFTWARDS
        rules.add("[⇀] > '->';"); // 21C0 RIGHTWARDS HARPOON WITH BARB UPWARDS
        rules.add("[⇁] > '->';"); // 21C1 RIGHTWARDS HARPOON WITH BARB DOWNWARDS
        rules.add("[⇂] > 'v';"); // 21C2 DOWNWARDS HARPOON WITH BARB RIGHTWARDS
        rules.add("[⇃] > 'v';"); // 21C3 DOWNWARDS HARPOON WITH BARB LEFTWARDS

        // Paired / exchange arrows
        rules.add("[⇄] > '<->';"); // 21C4 RIGHTWARDS ARROW OVER LEFTWARDS ARROW
        rules.add("[⇅] > '^v';"); // 21C5 UPWARDS ARROW LEFTWARDS OF DOWNWARDS
                                  // ARROW
        rules.add("[⇆] > '<->';"); // 21C6 LEFTWARDS ARROW OVER RIGHTWARDS ARROW
        rules.add("[⇇] > '<=';"); // 21C7 LEFTWARDS PAIRED ARROWS
        rules.add("[⇈] > '^^';"); // 21C8 UPWARDS PAIRED ARROWS
        rules.add("[⇉] > '=>';"); // 21C9 RIGHTWARDS PAIRED ARROWS
        rules.add("[⇊] > 'vv';"); // 21CA DOWNWARDS PAIRED ARROWS

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
        rules.add("[⇑] > '^^';"); // 21D1 UPWARDS DOUBLE ARROW
        rules.add("[⇒] > '=>';"); // 21D2 RIGHTWARDS DOUBLE ARROW
        rules.add("[⇓] > 'vv';"); // 21D3 DOWNWARDS DOUBLE ARROW
        rules.add("[⇔] > '<=>';"); // 21D4 LEFT RIGHT DOUBLE ARROW
        rules.add("[⇕] > '^v';"); // 21D5 UP DOWN DOUBLE ARROW
        rules.add("[⇖] > '^<';"); // 21D6 NORTH WEST DOUBLE ARROW
        rules.add("[⇗] > '^>';"); // 21D7 NORTH EAST DOUBLE ARROW
        rules.add("[⇘] > 'v>';"); // 21D8 SOUTH EAST DOUBLE ARROW
        rules.add("[⇙] > 'v<';"); // 21D9 SOUTH WEST DOUBLE ARROW

        rules.add("[⇚] > '<=';"); // 21DA LEFTWARDS TRIPLE ARROW
        rules.add("[⇛] > '=>';"); // 21DB RIGHTWARDS TRIPLE ARROW

        // Squiggle arrows
        rules.add("[⇜] > '<~';"); // 21DC LEFTWARDS SQUIGGLE ARROW
        rules.add("[⇝] > '~>';"); // 21DD RIGHTWARDS SQUIGGLE ARROW

        // Double-stroke arrows -> style dropped, collapse to base
        rules.add("[⇞] > '^';"); // 21DE UPWARDS ARROW WITH DOUBLE STROKE
        rules.add("[⇟] > 'v';"); // 21DF DOWNWARDS ARROW WITH DOUBLE STROKE

        // Dashed arrows -> style dropped, collapse to base
        rules.add("[⇠] > '<-';"); // 21E0 LEFTWARDS DASHED ARROW
        rules.add("[⇡] > '^';"); // 21E1 UPWARDS DASHED ARROW
        rules.add("[⇢] > '->';"); // 21E2 RIGHTWARDS DASHED ARROW
        rules.add("[⇣] > 'v';"); // 21E3 DOWNWARDS DASHED ARROW

        // Arrow to bar -> bar dropped, collapse to base
        rules.add("[⇤] > '<-';"); // 21E4 LEFTWARDS ARROW TO BAR
        rules.add("[⇥] > '->';"); // 21E5 RIGHTWARDS ARROW TO BAR

        // "White" (outline/keyboard-glyph) arrows -> pedestal/outline dropped,
        // collapse to base
        rules.add("[⇦] > '<-';"); // 21E6 LEFTWARDS WHITE ARROW
        rules.add("[⇧] > '^';"); // 21E7 UPWARDS WHITE ARROW
        rules.add("[⇨] > '->';"); // 21E8 RIGHTWARDS WHITE ARROW
        rules.add("[⇩] > 'v';"); // 21E9 DOWNWARDS WHITE ARROW
        rules.add("[⇪] > '^';"); // 21EA UPWARDS WHITE ARROW FROM BAR
        rules.add("[⇫] > '^';"); // 21EB UPWARDS WHITE ARROW ON PEDESTAL
        rules.add("[⇬] > '^';"); // 21EC ...ON PEDESTAL WITH HORIZONTAL BAR
        rules.add("[⇭] > '^';"); // 21ED ...ON PEDESTAL WITH VERTICAL BAR
        rules.add("[⇮] > '^^';"); // 21EE UPWARDS WHITE DOUBLE ARROW
        rules.add("[⇯] > '^^';"); // 21EF ...ON PEDESTAL
        rules.add("[⇰] > '->';"); // 21F0 RIGHTWARDS WHITE ARROW FROM WALL
        rules.add("[⇱] > '^<';"); // 21F1 NORTH WEST ARROW TO CORNER
        rules.add("[⇲] > 'v>';"); // 21F2 SOUTH EAST ARROW TO CORNER
        rules.add("[⇳] > '^v';"); // 21F3 UP DOWN WHITE ARROW

        rules.add("[⇴] > '->';"); // 21F4 RIGHT ARROW WITH SMALL CIRCLE
        rules.add("[⇵] > 'v^';"); // 21F5 DOWNWARDS ARROW LEFTWARDS OF UPWARDS
                                  // ARROW
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
