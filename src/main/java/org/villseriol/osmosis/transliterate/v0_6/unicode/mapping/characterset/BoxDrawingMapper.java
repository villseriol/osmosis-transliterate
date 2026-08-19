// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/box-drawing/
public class BoxDrawingMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();
        // Restrict the transliterator to the Box Drawing block only
        rules.add("::[\\u2500-\\u257F];");

        // Box Drawing block (U+2500–U+257F), vocabulary: '+' '-' '|' only.
        // Weight (light/heavy) and dash-count/double-line variants are not
        // distinguishable
        // in this vocabulary and collapse onto the plain equivalent.

        // Straight lines (horizontal / vertical), all weights and dash patterns
        rules.add("─ > '-';"); // 2500 LIGHT HORIZONTAL
        rules.add("━ > '-';"); // 2501 HEAVY HORIZONTAL
        rules.add("│ > '|';"); // 2502 LIGHT VERTICAL
        rules.add("┃ > '|';"); // 2503 HEAVY VERTICAL
        rules.add("┄ > '-';"); // 2504 LIGHT TRIPLE DASH HORIZONTAL
        rules.add("┅ > '-';"); // 2505 HEAVY TRIPLE DASH HORIZONTAL
        rules.add("┆ > '|';"); // 2506 LIGHT TRIPLE DASH VERTICAL
        rules.add("┇ > '|';"); // 2507 HEAVY TRIPLE DASH VERTICAL
        rules.add("┈ > '-';"); // 2508 LIGHT QUADRUPLE DASH HORIZONTAL
        rules.add("┉ > '-';"); // 2509 HEAVY QUADRUPLE DASH HORIZONTAL
        rules.add("┊ > '|';"); // 250A LIGHT QUADRUPLE DASH VERTICAL
        rules.add("┋ > '|';"); // 250B HEAVY QUADRUPLE DASH VERTICAL

        // Corners (single line weight combinations) -> all junctions collapse
        // to '+'
        rules.add("┌ > '+';"); // 250C LIGHT DOWN AND RIGHT
        rules.add("┍ > '+';"); // 250D DOWN LIGHT AND RIGHT HEAVY
        rules.add("┎ > '+';"); // 250E DOWN HEAVY AND RIGHT LIGHT
        rules.add("┏ > '+';"); // 250F HEAVY DOWN AND RIGHT
        rules.add("┐ > '+';"); // 2510 LIGHT DOWN AND LEFT
        rules.add("┑ > '+';"); // 2511 DOWN LIGHT AND LEFT HEAVY
        rules.add("┒ > '+';"); // 2512 DOWN HEAVY AND LEFT LIGHT
        rules.add("┓ > '+';"); // 2513 HEAVY DOWN AND LEFT
        rules.add("└ > '+';"); // 2514 LIGHT UP AND RIGHT
        rules.add("┕ > '+';"); // 2515 UP LIGHT AND RIGHT HEAVY
        rules.add("┖ > '+';"); // 2516 UP HEAVY AND RIGHT LIGHT
        rules.add("┗ > '+';"); // 2517 HEAVY UP AND RIGHT
        rules.add("┘ > '+';"); // 2518 LIGHT UP AND LEFT
        rules.add("┙ > '+';"); // 2519 UP LIGHT AND LEFT HEAVY
        rules.add("┚ > '+';"); // 251A UP HEAVY AND LEFT LIGHT
        rules.add("┛ > '+';"); // 251B HEAVY UP AND LEFT

        // T-junctions (vertical + one horizontal direction), all weight
        // combinations -> '+'
        rules.add("├ > '+';"); // 251C LIGHT VERTICAL AND RIGHT
        rules.add("┝ > '+';"); // 251D VERTICAL LIGHT AND RIGHT HEAVY
        rules.add("┞ > '+';"); // 251E UP HEAVY AND RIGHT DOWN LIGHT
        rules.add("┟ > '+';"); // 251F DOWN HEAVY AND RIGHT UP LIGHT
        rules.add("┠ > '+';"); // 2520 VERTICAL HEAVY AND RIGHT LIGHT
        rules.add("┡ > '+';"); // 2521 DOWN LIGHT AND RIGHT UP HEAVY
        rules.add("┢ > '+';"); // 2522 UP LIGHT AND RIGHT DOWN HEAVY
        rules.add("┣ > '+';"); // 2523 HEAVY VERTICAL AND RIGHT
        rules.add("┤ > '+';"); // 2524 LIGHT VERTICAL AND LEFT
        rules.add("┥ > '+';"); // 2525 VERTICAL LIGHT AND LEFT HEAVY
        rules.add("┦ > '+';"); // 2526 UP HEAVY AND LEFT DOWN LIGHT
        rules.add("┧ > '+';"); // 2527 DOWN HEAVY AND LEFT UP LIGHT
        rules.add("┨ > '+';"); // 2528 VERTICAL HEAVY AND LEFT LIGHT
        rules.add("┩ > '+';"); // 2529 DOWN LIGHT AND LEFT UP HEAVY
        rules.add("┪ > '+';"); // 252A UP LIGHT AND LEFT DOWN HEAVY
        rules.add("┫ > '+';"); // 252B HEAVY VERTICAL AND LEFT

        // T-junctions (horizontal + one vertical direction), all weight
        // combinations -> '+'
        rules.add("┬ > '+';"); // 252C LIGHT DOWN AND HORIZONTAL
        rules.add("┭ > '+';"); // 252D LEFT HEAVY AND RIGHT DOWN LIGHT
        rules.add("┮ > '+';"); // 252E RIGHT HEAVY AND LEFT DOWN LIGHT
        rules.add("┯ > '+';"); // 252F DOWN LIGHT AND HORIZONTAL HEAVY
        rules.add("┰ > '+';"); // 2530 DOWN HEAVY AND HORIZONTAL LIGHT
        rules.add("┱ > '+';"); // 2531 RIGHT LIGHT AND LEFT DOWN HEAVY
        rules.add("┲ > '+';"); // 2532 LEFT LIGHT AND RIGHT DOWN HEAVY
        rules.add("┳ > '+';"); // 2533 HEAVY DOWN AND HORIZONTAL
        rules.add("┴ > '+';"); // 2534 LIGHT UP AND HORIZONTAL
        rules.add("┵ > '+';"); // 2535 LEFT HEAVY AND RIGHT UP LIGHT
        rules.add("┶ > '+';"); // 2536 RIGHT HEAVY AND LEFT UP LIGHT
        rules.add("┷ > '+';"); // 2537 UP LIGHT AND HORIZONTAL HEAVY
        rules.add("┸ > '+';"); // 2538 UP HEAVY AND HORIZONTAL LIGHT
        rules.add("┹ > '+';"); // 2539 RIGHT LIGHT AND LEFT UP HEAVY
        rules.add("┺ > '+';"); // 253A LEFT LIGHT AND RIGHT UP HEAVY
        rules.add("┻ > '+';"); // 253B HEAVY UP AND HORIZONTAL

        // Full crosses, all weight combinations -> '+'
        rules.add("┼ > '+';"); // 253C LIGHT VERTICAL AND HORIZONTAL
        rules.add("┽ > '+';"); // 253D LEFT HEAVY AND RIGHT VERTICAL LIGHT
        rules.add("┾ > '+';"); // 253E RIGHT HEAVY AND LEFT VERTICAL LIGHT
        rules.add("┿ > '+';"); // 253F VERTICAL LIGHT AND HORIZONTAL HEAVY
        rules.add("╀ > '+';"); // 2540 UP HEAVY AND DOWN HORIZONTAL LIGHT
        rules.add("╁ > '+';"); // 2541 DOWN HEAVY AND UP HORIZONTAL LIGHT
        rules.add("╂ > '+';"); // 2542 VERTICAL HEAVY AND HORIZONTAL LIGHT
        rules.add("╃ > '+';"); // 2543 LEFT UP HEAVY AND RIGHT DOWN LIGHT
        rules.add("╄ > '+';"); // 2544 RIGHT UP HEAVY AND LEFT DOWN LIGHT
        rules.add("╅ > '+';"); // 2545 LEFT DOWN HEAVY AND RIGHT UP LIGHT
        rules.add("╆ > '+';"); // 2546 RIGHT DOWN HEAVY AND LEFT UP LIGHT
        rules.add("╇ > '+';"); // 2547 DOWN LIGHT AND UP HORIZONTAL HEAVY
        rules.add("╈ > '+';"); // 2548 UP LIGHT AND DOWN HORIZONTAL HEAVY
        rules.add("╉ > '+';"); // 2549 RIGHT LIGHT AND LEFT VERTICAL HEAVY
        rules.add("╊ > '+';"); // 254A LEFT LIGHT AND RIGHT VERTICAL HEAVY
        rules.add("╋ > '+';"); // 254B HEAVY VERTICAL AND HORIZONTAL

        // Double-dash lines
        rules.add("╌ > '-';"); // 254C LIGHT DOUBLE DASH HORIZONTAL
        rules.add("╍ > '-';"); // 254D HEAVY DOUBLE DASH HORIZONTAL
        rules.add("╎ > '|';"); // 254E LIGHT DOUBLE DASH VERTICAL
        rules.add("╏ > '|';"); // 254F HEAVY DOUBLE DASH VERTICAL

        // Double-line straight
        rules.add("═ > '-';"); // 2550 DOUBLE HORIZONTAL
        rules.add("║ > '|';"); // 2551 DOUBLE VERTICAL

        // Double-line corners
        rules.add("╒ > '+';"); // 2552 DOWN SINGLE AND RIGHT DOUBLE
        rules.add("╓ > '+';"); // 2553 DOWN DOUBLE AND RIGHT SINGLE
        rules.add("╔ > '+';"); // 2554 DOUBLE DOWN AND RIGHT
        rules.add("╕ > '+';"); // 2555 DOWN SINGLE AND LEFT DOUBLE
        rules.add("╖ > '+';"); // 2556 DOWN DOUBLE AND LEFT SINGLE
        rules.add("╗ > '+';"); // 2557 DOUBLE DOWN AND LEFT
        rules.add("╘ > '+';"); // 2558 UP SINGLE AND RIGHT DOUBLE
        rules.add("╙ > '+';"); // 2559 UP DOUBLE AND RIGHT SINGLE
        rules.add("╚ > '+';"); // 255A DOUBLE UP AND RIGHT
        rules.add("╛ > '+';"); // 255B UP SINGLE AND LEFT DOUBLE
        rules.add("╜ > '+';"); // 255C UP DOUBLE AND LEFT SINGLE
        rules.add("╝ > '+';"); // 255D DOUBLE UP AND LEFT

        // Double-line T-junctions
        rules.add("╞ > '+';"); // 255E VERTICAL SINGLE AND RIGHT DOUBLE
        rules.add("╟ > '+';"); // 255F VERTICAL DOUBLE AND RIGHT SINGLE
        rules.add("╠ > '+';"); // 2560 DOUBLE VERTICAL AND RIGHT
        rules.add("╡ > '+';"); // 2561 VERTICAL SINGLE AND LEFT DOUBLE
        rules.add("╢ > '+';"); // 2562 VERTICAL DOUBLE AND LEFT SINGLE
        rules.add("╣ > '+';"); // 2563 DOUBLE VERTICAL AND LEFT
        rules.add("╤ > '+';"); // 2564 DOWN SINGLE AND HORIZONTAL DOUBLE
        rules.add("╥ > '+';"); // 2565 DOWN DOUBLE AND HORIZONTAL SINGLE
        rules.add("╦ > '+';"); // 2566 DOUBLE DOWN AND HORIZONTAL
        rules.add("╧ > '+';"); // 2567 UP SINGLE AND HORIZONTAL DOUBLE
        rules.add("╨ > '+';"); // 2568 UP DOUBLE AND HORIZONTAL SINGLE
        rules.add("╩ > '+';"); // 2569 DOUBLE UP AND HORIZONTAL

        // Double-line crosses
        rules.add("╪ > '+';"); // 256A VERTICAL SINGLE AND HORIZONTAL DOUBLE
        rules.add("╫ > '+';"); // 256B VERTICAL DOUBLE AND HORIZONTAL SINGLE
        rules.add("╬ > '+';"); // 256C DOUBLE VERTICAL AND HORIZONTAL

        // Rounded (arc) corners -> collapse to same '+' as square corners
        // (curvature dropped)
        rules.add("╭ > '+';"); // 256D LIGHT ARC DOWN AND RIGHT
        rules.add("╮ > '+';"); // 256E LIGHT ARC DOWN AND LEFT
        rules.add("╯ > '+';"); // 256F LIGHT ARC UP AND LEFT
        rules.add("╰ > '+';"); // 2570 LIGHT ARC UP AND RIGHT

        // Diagonals -> no horizontal/vertical representation exists in this
        // vocabulary;
        // approximated as '+' (nearest available concept: a
        // crossing/intersection point).
        // This is the least faithful mapping in this ruleset — flagged
        // explicitly.
        rules.add("╱ > '+';"); // 2571 LIGHT DIAGONAL UPPER RIGHT TO LOWER LEFT
        rules.add("╲ > '+';"); // 2572 LIGHT DIAGONAL UPPER LEFT TO LOWER RIGHT
        rules.add("╳ > '+';"); // 2573 LIGHT DIAGONAL CROSS

        // Half-lines / stubs (line extends in only one direction from center)
        rules.add("╴ > '-';"); // 2574 LIGHT LEFT
        rules.add("╵ > '|';"); // 2575 LIGHT UP
        rules.add("╶ > '-';"); // 2576 LIGHT RIGHT
        rules.add("╷ > '|';"); // 2577 LIGHT DOWN
        rules.add("╸ > '-';"); // 2578 HEAVY LEFT
        rules.add("╹ > '|';"); // 2579 HEAVY UP
        rules.add("╺ > '-';"); // 257A HEAVY RIGHT
        rules.add("╻ > '|';"); // 257B HEAVY DOWN
        rules.add("╼ > '-';"); // 257C LIGHT LEFT AND HEAVY RIGHT
        rules.add("╽ > '|';"); // 257D LIGHT UP AND HEAVY DOWN
        rules.add("╾ > '-';"); // 257E HEAVY LEFT AND LIGHT RIGHT
        rules.add("╿ > '|';"); // 257F HEAVY UP AND LIGHT DOWN

        TRANSLITERATOR = Transliterator.createFromRules("BoxDrawing-BasicLatin", String.join("\n", rules),
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
