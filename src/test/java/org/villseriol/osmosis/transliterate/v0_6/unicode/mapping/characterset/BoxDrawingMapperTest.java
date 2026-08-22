// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public class BoxDrawingMapperTest {

    private final BoxDrawingMapper transform = new BoxDrawingMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.BOX_DRAWING) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }


    /**
     * Verifies each character in the Box Drawing block (U+2500-U+257F) against
     * its ASCII equivalent.
     *
     * <ul>
     * <li>2500 BOX DRAWINGS LIGHT HORIZONTAL</li>
     * <li>2501 BOX DRAWINGS HEAVY HORIZONTAL</li>
     * <li>2502 BOX DRAWINGS LIGHT VERTICAL</li>
     * <li>2503 BOX DRAWINGS HEAVY VERTICAL</li>
     * <li>2504 BOX DRAWINGS LIGHT TRIPLE DASH HORIZONTAL</li>
     * <li>2505 BOX DRAWINGS HEAVY TRIPLE DASH HORIZONTAL</li>
     * <li>2506 BOX DRAWINGS LIGHT TRIPLE DASH VERTICAL</li>
     * <li>2507 BOX DRAWINGS HEAVY TRIPLE DASH VERTICAL</li>
     * <li>2508 BOX DRAWINGS LIGHT QUADRUPLE DASH HORIZONTAL</li>
     * <li>2509 BOX DRAWINGS HEAVY QUADRUPLE DASH HORIZONTAL</li>
     * <li>250A BOX DRAWINGS LIGHT QUADRUPLE DASH VERTICAL</li>
     * <li>250B BOX DRAWINGS HEAVY QUADRUPLE DASH VERTICAL</li>
     * <li>250C BOX DRAWINGS LIGHT DOWN AND RIGHT</li>
     * <li>250D BOX DRAWINGS DOWN LIGHT AND RIGHT HEAVY</li>
     * <li>250E BOX DRAWINGS DOWN HEAVY AND RIGHT LIGHT</li>
     * <li>250F BOX DRAWINGS HEAVY DOWN AND RIGHT</li>
     * <li>2510 BOX DRAWINGS LIGHT DOWN AND LEFT</li>
     * <li>2511 BOX DRAWINGS DOWN LIGHT AND LEFT HEAVY</li>
     * <li>2512 BOX DRAWINGS DOWN HEAVY AND LEFT LIGHT</li>
     * <li>2513 BOX DRAWINGS HEAVY DOWN AND LEFT</li>
     * <li>2514 BOX DRAWINGS LIGHT UP AND RIGHT</li>
     * <li>2515 BOX DRAWINGS UP LIGHT AND RIGHT HEAVY</li>
     * <li>2516 BOX DRAWINGS UP HEAVY AND RIGHT LIGHT</li>
     * <li>2517 BOX DRAWINGS HEAVY UP AND RIGHT</li>
     * <li>2518 BOX DRAWINGS LIGHT UP AND LEFT</li>
     * <li>2519 BOX DRAWINGS UP LIGHT AND LEFT HEAVY</li>
     * <li>251A BOX DRAWINGS UP HEAVY AND LEFT LIGHT</li>
     * <li>251B BOX DRAWINGS HEAVY UP AND LEFT</li>
     * <li>251C BOX DRAWINGS LIGHT VERTICAL AND RIGHT</li>
     * <li>251D BOX DRAWINGS VERTICAL LIGHT AND RIGHT HEAVY</li>
     * <li>251E BOX DRAWINGS UP HEAVY AND RIGHT DOWN LIGHT</li>
     * <li>251F BOX DRAWINGS DOWN HEAVY AND RIGHT UP LIGHT</li>
     * <li>2520 BOX DRAWINGS VERTICAL HEAVY AND RIGHT LIGHT</li>
     * <li>2521 BOX DRAWINGS DOWN LIGHT AND RIGHT UP HEAVY</li>
     * <li>2522 BOX DRAWINGS UP LIGHT AND RIGHT DOWN HEAVY</li>
     * <li>2523 BOX DRAWINGS HEAVY VERTICAL AND RIGHT</li>
     * <li>2524 BOX DRAWINGS LIGHT VERTICAL AND LEFT</li>
     * <li>2525 BOX DRAWINGS VERTICAL LIGHT AND LEFT HEAVY</li>
     * <li>2526 BOX DRAWINGS UP HEAVY AND LEFT DOWN LIGHT</li>
     * <li>2527 BOX DRAWINGS DOWN HEAVY AND LEFT UP LIGHT</li>
     * <li>2528 BOX DRAWINGS VERTICAL HEAVY AND LEFT LIGHT</li>
     * <li>2529 BOX DRAWINGS DOWN LIGHT AND LEFT UP HEAVY</li>
     * <li>252A BOX DRAWINGS UP LIGHT AND LEFT DOWN HEAVY</li>
     * <li>252B BOX DRAWINGS HEAVY VERTICAL AND LEFT</li>
     * <li>252C BOX DRAWINGS LIGHT DOWN AND HORIZONTAL</li>
     * <li>252D BOX DRAWINGS LEFT HEAVY AND RIGHT DOWN LIGHT</li>
     * <li>252E BOX DRAWINGS RIGHT HEAVY AND LEFT DOWN LIGHT</li>
     * <li>252F BOX DRAWINGS DOWN LIGHT AND HORIZONTAL HEAVY</li>
     * <li>2530 BOX DRAWINGS DOWN HEAVY AND HORIZONTAL LIGHT</li>
     * <li>2531 BOX DRAWINGS RIGHT LIGHT AND LEFT DOWN HEAVY</li>
     * <li>2532 BOX DRAWINGS LEFT LIGHT AND RIGHT DOWN HEAVY</li>
     * <li>2533 BOX DRAWINGS HEAVY DOWN AND HORIZONTAL</li>
     * <li>2534 BOX DRAWINGS LIGHT UP AND HORIZONTAL</li>
     * <li>2535 BOX DRAWINGS LEFT HEAVY AND RIGHT UP LIGHT</li>
     * <li>2536 BOX DRAWINGS RIGHT HEAVY AND LEFT UP LIGHT</li>
     * <li>2537 BOX DRAWINGS UP LIGHT AND HORIZONTAL HEAVY</li>
     * <li>2538 BOX DRAWINGS UP HEAVY AND HORIZONTAL LIGHT</li>
     * <li>2539 BOX DRAWINGS RIGHT LIGHT AND LEFT UP HEAVY</li>
     * <li>253A BOX DRAWINGS LEFT LIGHT AND RIGHT UP HEAVY</li>
     * <li>253B BOX DRAWINGS HEAVY UP AND HORIZONTAL</li>
     * <li>253C BOX DRAWINGS LIGHT VERTICAL AND HORIZONTAL</li>
     * <li>253D BOX DRAWINGS LEFT HEAVY AND RIGHT VERTICAL LIGHT</li>
     * <li>253E BOX DRAWINGS RIGHT HEAVY AND LEFT VERTICAL LIGHT</li>
     * <li>253F BOX DRAWINGS VERTICAL LIGHT AND HORIZONTAL HEAVY</li>
     * <li>2540 BOX DRAWINGS UP HEAVY AND DOWN HORIZONTAL LIGHT</li>
     * <li>2541 BOX DRAWINGS DOWN HEAVY AND UP HORIZONTAL LIGHT</li>
     * <li>2542 BOX DRAWINGS VERTICAL HEAVY AND HORIZONTAL LIGHT</li>
     * <li>2543 BOX DRAWINGS LEFT UP HEAVY AND RIGHT DOWN LIGHT</li>
     * <li>2544 BOX DRAWINGS RIGHT UP HEAVY AND LEFT DOWN LIGHT</li>
     * <li>2545 BOX DRAWINGS LEFT DOWN HEAVY AND RIGHT UP LIGHT</li>
     * <li>2546 BOX DRAWINGS RIGHT DOWN HEAVY AND LEFT UP LIGHT</li>
     * <li>2547 BOX DRAWINGS DOWN LIGHT AND UP HORIZONTAL HEAVY</li>
     * <li>2548 BOX DRAWINGS UP LIGHT AND DOWN HORIZONTAL HEAVY</li>
     * <li>2549 BOX DRAWINGS RIGHT LIGHT AND LEFT VERTICAL HEAVY</li>
     * <li>254A BOX DRAWINGS LEFT LIGHT AND RIGHT VERTICAL HEAVY</li>
     * <li>254B BOX DRAWINGS HEAVY VERTICAL AND HORIZONTAL</li>
     * <li>254C BOX DRAWINGS LIGHT DOUBLE DASH HORIZONTAL</li>
     * <li>254D BOX DRAWINGS HEAVY DOUBLE DASH HORIZONTAL</li>
     * <li>254E BOX DRAWINGS LIGHT DOUBLE DASH VERTICAL</li>
     * <li>254F BOX DRAWINGS HEAVY DOUBLE DASH VERTICAL</li>
     * <li>2550 BOX DRAWINGS DOUBLE HORIZONTAL</li>
     * <li>2551 BOX DRAWINGS DOUBLE VERTICAL</li>
     * <li>2552 BOX DRAWINGS DOWN SINGLE AND RIGHT DOUBLE</li>
     * <li>2553 BOX DRAWINGS DOWN DOUBLE AND RIGHT SINGLE</li>
     * <li>2554 BOX DRAWINGS DOUBLE DOWN AND RIGHT</li>
     * <li>2555 BOX DRAWINGS DOWN SINGLE AND LEFT DOUBLE</li>
     * <li>2556 BOX DRAWINGS DOWN DOUBLE AND LEFT SINGLE</li>
     * <li>2557 BOX DRAWINGS DOUBLE DOWN AND LEFT</li>
     * <li>2558 BOX DRAWINGS UP SINGLE AND RIGHT DOUBLE</li>
     * <li>2559 BOX DRAWINGS UP DOUBLE AND RIGHT SINGLE</li>
     * <li>255A BOX DRAWINGS DOUBLE UP AND RIGHT</li>
     * <li>255B BOX DRAWINGS UP SINGLE AND LEFT DOUBLE</li>
     * <li>255C BOX DRAWINGS UP DOUBLE AND LEFT SINGLE</li>
     * <li>255D BOX DRAWINGS DOUBLE UP AND LEFT</li>
     * <li>255E BOX DRAWINGS VERTICAL SINGLE AND RIGHT DOUBLE</li>
     * <li>255F BOX DRAWINGS VERTICAL DOUBLE AND RIGHT SINGLE</li>
     * <li>2560 BOX DRAWINGS DOUBLE VERTICAL AND RIGHT</li>
     * <li>2561 BOX DRAWINGS VERTICAL SINGLE AND LEFT DOUBLE</li>
     * <li>2562 BOX DRAWINGS VERTICAL DOUBLE AND LEFT SINGLE</li>
     * <li>2563 BOX DRAWINGS DOUBLE VERTICAL AND LEFT</li>
     * <li>2564 BOX DRAWINGS DOWN SINGLE AND HORIZONTAL DOUBLE</li>
     * <li>2565 BOX DRAWINGS DOWN DOUBLE AND HORIZONTAL SINGLE</li>
     * <li>2566 BOX DRAWINGS DOUBLE DOWN AND HORIZONTAL</li>
     * <li>2567 BOX DRAWINGS UP SINGLE AND HORIZONTAL DOUBLE</li>
     * <li>2568 BOX DRAWINGS UP DOUBLE AND HORIZONTAL SINGLE</li>
     * <li>2569 BOX DRAWINGS DOUBLE UP AND HORIZONTAL</li>
     * <li>256A BOX DRAWINGS VERTICAL SINGLE AND HORIZONTAL DOUBLE</li>
     * <li>256B BOX DRAWINGS VERTICAL DOUBLE AND HORIZONTAL SINGLE</li>
     * <li>256C BOX DRAWINGS DOUBLE VERTICAL AND HORIZONTAL</li>
     * <li>256D BOX DRAWINGS LIGHT ARC DOWN AND RIGHT</li>
     * <li>256E BOX DRAWINGS LIGHT ARC DOWN AND LEFT</li>
     * <li>256F BOX DRAWINGS LIGHT ARC UP AND LEFT</li>
     * <li>2570 BOX DRAWINGS LIGHT ARC UP AND RIGHT</li>
     * <li>2571 BOX DRAWINGS LIGHT DIAGONAL UPPER RIGHT TO LOWER LEFT</li>
     * <li>2572 BOX DRAWINGS LIGHT DIAGONAL UPPER LEFT TO LOWER RIGHT</li>
     * <li>2573 BOX DRAWINGS LIGHT DIAGONAL CROSS</li>
     * <li>2574 BOX DRAWINGS LIGHT LEFT</li>
     * <li>2575 BOX DRAWINGS LIGHT UP</li>
     * <li>2576 BOX DRAWINGS LIGHT RIGHT</li>
     * <li>2577 BOX DRAWINGS LIGHT DOWN</li>
     * <li>2578 BOX DRAWINGS HEAVY LEFT</li>
     * <li>2579 BOX DRAWINGS HEAVY UP</li>
     * <li>257A BOX DRAWINGS HEAVY RIGHT</li>
     * <li>257B BOX DRAWINGS HEAVY DOWN</li>
     * <li>257C BOX DRAWINGS LIGHT LEFT AND HEAVY RIGHT</li>
     * <li>257D BOX DRAWINGS LIGHT UP AND HEAVY DOWN</li>
     * <li>257E BOX DRAWINGS HEAVY LEFT AND LIGHT RIGHT</li>
     * <li>257F BOX DRAWINGS HEAVY UP AND LIGHT DOWN</li>
     * </ul>
     */
    @Test
    public void testTransliterated() {
        assertEquals("-", transform.action("─"));
        assertEquals("-", transform.action("━"));
        assertEquals("|", transform.action("│"));
        assertEquals("|", transform.action("┃"));
        assertEquals("-", transform.action("┄"));
        assertEquals("-", transform.action("┅"));
        assertEquals("|", transform.action("┆"));
        assertEquals("|", transform.action("┇"));
        assertEquals("-", transform.action("┈"));
        assertEquals("-", transform.action("┉"));
        assertEquals("|", transform.action("┊"));
        assertEquals("|", transform.action("┋"));
        assertEquals("+", transform.action("┌"));
        assertEquals("+", transform.action("┍"));
        assertEquals("+", transform.action("┎"));
        assertEquals("+", transform.action("┏"));
        assertEquals("+", transform.action("┐"));
        assertEquals("+", transform.action("┑"));
        assertEquals("+", transform.action("┒"));
        assertEquals("+", transform.action("┓"));
        assertEquals("+", transform.action("└"));
        assertEquals("+", transform.action("┕"));
        assertEquals("+", transform.action("┖"));
        assertEquals("+", transform.action("┗"));
        assertEquals("+", transform.action("┘"));
        assertEquals("+", transform.action("┙"));
        assertEquals("+", transform.action("┚"));
        assertEquals("+", transform.action("┛"));
        assertEquals("+", transform.action("├"));
        assertEquals("+", transform.action("┝"));
        assertEquals("+", transform.action("┞"));
        assertEquals("+", transform.action("┟"));
        assertEquals("+", transform.action("┠"));
        assertEquals("+", transform.action("┡"));
        assertEquals("+", transform.action("┢"));
        assertEquals("+", transform.action("┣"));
        assertEquals("+", transform.action("┤"));
        assertEquals("+", transform.action("┥"));
        assertEquals("+", transform.action("┦"));
        assertEquals("+", transform.action("┧"));
        assertEquals("+", transform.action("┨"));
        assertEquals("+", transform.action("┩"));
        assertEquals("+", transform.action("┪"));
        assertEquals("+", transform.action("┫"));
        assertEquals("+", transform.action("┬"));
        assertEquals("+", transform.action("┭"));
        assertEquals("+", transform.action("┮"));
        assertEquals("+", transform.action("┯"));
        assertEquals("+", transform.action("┰"));
        assertEquals("+", transform.action("┱"));
        assertEquals("+", transform.action("┲"));
        assertEquals("+", transform.action("┳"));
        assertEquals("+", transform.action("┴"));
        assertEquals("+", transform.action("┵"));
        assertEquals("+", transform.action("┶"));
        assertEquals("+", transform.action("┷"));
        assertEquals("+", transform.action("┸"));
        assertEquals("+", transform.action("┹"));
        assertEquals("+", transform.action("┺"));
        assertEquals("+", transform.action("┻"));
        assertEquals("+", transform.action("┼"));
        assertEquals("+", transform.action("┽"));
        assertEquals("+", transform.action("┾"));
        assertEquals("+", transform.action("┿"));
        assertEquals("+", transform.action("╀"));
        assertEquals("+", transform.action("╁"));
        assertEquals("+", transform.action("╂"));
        assertEquals("+", transform.action("╃"));
        assertEquals("+", transform.action("╄"));
        assertEquals("+", transform.action("╅"));
        assertEquals("+", transform.action("╆"));
        assertEquals("+", transform.action("╇"));
        assertEquals("+", transform.action("╈"));
        assertEquals("+", transform.action("╉"));
        assertEquals("+", transform.action("╊"));
        assertEquals("+", transform.action("╋"));
        assertEquals("-", transform.action("╌"));
        assertEquals("-", transform.action("╍"));
        assertEquals("|", transform.action("╎"));
        assertEquals("|", transform.action("╏"));
        assertEquals("-", transform.action("═"));
        assertEquals("|", transform.action("║"));
        assertEquals("+", transform.action("╒"));
        assertEquals("+", transform.action("╓"));
        assertEquals("+", transform.action("╔"));
        assertEquals("+", transform.action("╕"));
        assertEquals("+", transform.action("╖"));
        assertEquals("+", transform.action("╗"));
        assertEquals("+", transform.action("╘"));
        assertEquals("+", transform.action("╙"));
        assertEquals("+", transform.action("╚"));
        assertEquals("+", transform.action("╛"));
        assertEquals("+", transform.action("╜"));
        assertEquals("+", transform.action("╝"));
        assertEquals("+", transform.action("╞"));
        assertEquals("+", transform.action("╟"));
        assertEquals("+", transform.action("╠"));
        assertEquals("+", transform.action("╡"));
        assertEquals("+", transform.action("╢"));
        assertEquals("+", transform.action("╣"));
        assertEquals("+", transform.action("╤"));
        assertEquals("+", transform.action("╥"));
        assertEquals("+", transform.action("╦"));
        assertEquals("+", transform.action("╧"));
        assertEquals("+", transform.action("╨"));
        assertEquals("+", transform.action("╩"));
        assertEquals("+", transform.action("╪"));
        assertEquals("+", transform.action("╫"));
        assertEquals("+", transform.action("╬"));
        assertEquals("+", transform.action("╭"));
        assertEquals("+", transform.action("╮"));
        assertEquals("+", transform.action("╯"));
        assertEquals("+", transform.action("╰"));
        assertEquals("+", transform.action("╱"));
        assertEquals("+", transform.action("╲"));
        assertEquals("+", transform.action("╳"));
        assertEquals("-", transform.action("╴"));
        assertEquals("|", transform.action("╵"));
        assertEquals("-", transform.action("╶"));
        assertEquals("|", transform.action("╷"));
        assertEquals("-", transform.action("╸"));
        assertEquals("|", transform.action("╹"));
        assertEquals("-", transform.action("╺"));
        assertEquals("|", transform.action("╻"));
        assertEquals("-", transform.action("╼"));
        assertEquals("|", transform.action("╽"));
        assertEquals("-", transform.action("╾"));
        assertEquals("|", transform.action("╿"));
    }
}
