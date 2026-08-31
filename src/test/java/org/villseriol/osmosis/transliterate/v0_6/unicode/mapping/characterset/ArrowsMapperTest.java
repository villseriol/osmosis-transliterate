// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public class ArrowsMapperTest {

    private final ArrowsMapper transform = new ArrowsMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.ARROWS) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }


    /**
     * Verifies the characters in the Arrows block (U+2190-U+21FF) that are
     * mapped to an ASCII arrow equivalent.
     *
     * <ul>
     * <li>2190 LEFTWARDS ARROW</li>
     * <li>2192 RIGHTWARDS ARROW</li>
     * <li>2194 LEFT RIGHT ARROW</li>
     * <li>219A LEFTWARDS ARROW WITH STROKE</li>
     * <li>219B RIGHTWARDS ARROW WITH STROKE</li>
     * <li>219C LEFTWARDS WAVE ARROW</li>
     * <li>219D RIGHTWARDS WAVE ARROW</li>
     * <li>219E LEFTWARDS TWO HEADED ARROW</li>
     * <li>21A0 RIGHTWARDS TWO HEADED ARROW</li>
     * <li>21A2 LEFTWARDS ARROW WITH TAIL</li>
     * <li>21A3 RIGHTWARDS ARROW WITH TAIL</li>
     * <li>21A4 LEFTWARDS ARROW FROM BAR</li>
     * <li>21A6 RIGHTWARDS ARROW FROM BAR</li>
     * <li>21A9 LEFTWARDS ARROW WITH HOOK</li>
     * <li>21AA RIGHTWARDS ARROW WITH HOOK</li>
     * <li>21AB LEFTWARDS ARROW WITH LOOP</li>
     * <li>21AC RIGHTWARDS ARROW WITH LOOP</li>
     * <li>21AD LEFT RIGHT WAVE ARROW</li>
     * <li>21AE LEFT RIGHT ARROW WITH STROKE</li>
     * <li>21B9 LEFTWARDS ARROW TO BAR OVER RIGHTWARDS ARROW TO BAR</li>
     * <li>21BC LEFTWARDS HARPOON WITH BARB UPWARDS</li>
     * <li>21BD LEFTWARDS HARPOON WITH BARB DOWNWARDS</li>
     * <li>21C0 RIGHTWARDS HARPOON WITH BARB UPWARDS</li>
     * <li>21C1 RIGHTWARDS HARPOON WITH BARB DOWNWARDS</li>
     * <li>21C4 RIGHTWARDS ARROW OVER LEFTWARDS ARROW</li>
     * <li>21C6 LEFTWARDS ARROW OVER RIGHTWARDS ARROW</li>
     * <li>21C7 LEFTWARDS PAIRED ARROWS</li>
     * <li>21C9 RIGHTWARDS PAIRED ARROWS</li>
     * <li>21CB LEFTWARDS HARPOON OVER RIGHTWARDS HARPOON</li>
     * <li>21CC RIGHTWARDS HARPOON OVER LEFTWARDS HARPOON</li>
     * <li>21CD LEFTWARDS DOUBLE ARROW WITH STROKE</li>
     * <li>21CE LEFT RIGHT DOUBLE ARROW WITH STROKE</li>
     * <li>21CF RIGHTWARDS DOUBLE ARROW WITH STROKE</li>
     * <li>21D0 LEFTWARDS DOUBLE ARROW</li>
     * <li>21D2 RIGHTWARDS DOUBLE ARROW</li>
     * <li>21D4 LEFT RIGHT DOUBLE ARROW</li>
     * <li>21DA LEFTWARDS TRIPLE ARROW</li>
     * <li>21DB RIGHTWARDS TRIPLE ARROW</li>
     * <li>21DC LEFTWARDS SQUIGGLE ARROW</li>
     * <li>21DD RIGHTWARDS SQUIGGLE ARROW</li>
     * <li>21E0 LEFTWARDS DASHED ARROW</li>
     * <li>21E2 RIGHTWARDS DASHED ARROW</li>
     * <li>21E4 LEFTWARDS ARROW TO BAR</li>
     * <li>21E5 RIGHTWARDS ARROW TO BAR</li>
     * <li>21E6 LEFTWARDS WHITE ARROW</li>
     * <li>21E8 RIGHTWARDS WHITE ARROW</li>
     * <li>21F0 RIGHTWARDS WHITE ARROW FROM WALL</li>
     * <li>21F4 RIGHT ARROW WITH SMALL CIRCLE</li>
     * <li>21F6 THREE RIGHTWARDS ARROWS</li>
     * <li>21F7 LEFTWARDS ARROW WITH VERTICAL STROKE</li>
     * <li>21F8 RIGHTWARDS ARROW WITH VERTICAL STROKE</li>
     * <li>21F9 LEFT RIGHT ARROW WITH VERTICAL STROKE</li>
     * <li>21FA LEFTWARDS ARROW WITH DOUBLE VERTICAL STROKE</li>
     * <li>21FB RIGHTWARDS ARROW WITH DOUBLE VERTICAL STROKE</li>
     * <li>21FC LEFT RIGHT ARROW WITH DOUBLE VERTICAL STROKE</li>
     * <li>21FD LEFTWARDS OPEN-HEADED ARROW</li>
     * <li>21FE RIGHTWARDS OPEN-HEADED ARROW</li>
     * <li>21FF LEFT RIGHT OPEN-HEADED ARROW</li>
     * </ul>
     */
    @Test
    public void testTransliterated() {
        assertEquals("<-", transform.action("←"));
        assertEquals("->", transform.action("→"));
        assertEquals("<->", transform.action("↔"));

        assertEquals("<-", transform.action("↚"));
        assertEquals("->", transform.action("↛"));

        assertEquals("<~", transform.action("↜"));
        assertEquals("~>", transform.action("↝"));

        assertEquals("<-", transform.action("↞"));
        assertEquals("->", transform.action("↠"));

        assertEquals("<-", transform.action("↢"));
        assertEquals("->", transform.action("↣"));

        assertEquals("<-", transform.action("↤"));
        assertEquals("->", transform.action("↦"));

        assertEquals("<-", transform.action("↩"));
        assertEquals("->", transform.action("↪"));
        assertEquals("<-", transform.action("↫"));
        assertEquals("->", transform.action("↬"));

        assertEquals("<~>", transform.action("↭"));
        assertEquals("<->", transform.action("↮"));

        assertEquals("<->", transform.action("↹"));

        assertEquals("<-", transform.action("↼"));
        assertEquals("<-", transform.action("↽"));
        assertEquals("->", transform.action("⇀"));
        assertEquals("->", transform.action("⇁"));

        assertEquals("<->", transform.action("⇄"));
        assertEquals("<->", transform.action("⇆"));
        assertEquals("<=", transform.action("⇇"));
        assertEquals("=>", transform.action("⇉"));

        assertEquals("<=>", transform.action("⇋"));
        assertEquals("<=>", transform.action("⇌"));

        assertEquals("<=", transform.action("⇍"));
        assertEquals("<=>", transform.action("⇎"));
        assertEquals("=>", transform.action("⇏"));
        assertEquals("<=", transform.action("⇐"));
        assertEquals("=>", transform.action("⇒"));
        assertEquals("<=>", transform.action("⇔"));
        assertEquals("<=", transform.action("⇚"));
        assertEquals("=>", transform.action("⇛"));

        assertEquals("<~", transform.action("⇜"));
        assertEquals("~>", transform.action("⇝"));

        assertEquals("<-", transform.action("⇠"));
        assertEquals("->", transform.action("⇢"));
        assertEquals("<-", transform.action("⇤"));
        assertEquals("->", transform.action("⇥"));

        assertEquals("<-", transform.action("⇦"));
        assertEquals("->", transform.action("⇨"));
        assertEquals("->", transform.action("⇰"));

        assertEquals("->", transform.action("⇴"));
        assertEquals("=>", transform.action("⇶"));

        assertEquals("<-", transform.action("⇷"));
        assertEquals("->", transform.action("⇸"));
        assertEquals("<->", transform.action("⇹"));
        assertEquals("<-", transform.action("⇺"));
        assertEquals("->", transform.action("⇻"));
        assertEquals("<->", transform.action("⇼"));

        assertEquals("<-", transform.action("⇽"));
        assertEquals("->", transform.action("⇾"));
        assertEquals("<->", transform.action("⇿"));
    }


    /**
     * Verifies the characters in the Arrows block (U+2190-U+21FF) that have no
     * reasonable ASCII arrow equivalent and are mapped to a single ASCII space.
     *
     * <ul>
     * <li>2191 UPWARDS ARROW</li>
     * <li>2193 DOWNWARDS ARROW</li>
     * <li>2195 UP DOWN ARROW</li>
     * <li>2196 NORTH WEST ARROW</li>
     * <li>2197 NORTH EAST ARROW</li>
     * <li>2198 SOUTH EAST ARROW</li>
     * <li>2199 SOUTH WEST ARROW</li>
     * <li>219F UPWARDS TWO HEADED ARROW</li>
     * <li>21A1 DOWNWARDS TWO HEADED ARROW</li>
     * <li>21A5 UPWARDS ARROW FROM BAR</li>
     * <li>21A7 DOWNWARDS ARROW FROM BAR</li>
     * <li>21A8 UP DOWN ARROW WITH BASE</li>
     * <li>21AF DOWNWARDS ZIGZAG ARROW</li>
     * <li>21B0 UPWARDS ARROW WITH TIP LEFTWARDS</li>
     * <li>21B1 UPWARDS ARROW WITH TIP RIGHTWARDS</li>
     * <li>21B2 DOWNWARDS ARROW WITH TIP LEFTWARDS</li>
     * <li>21B3 DOWNWARDS ARROW WITH TIP RIGHTWARDS</li>
     * <li>21B4 RIGHTWARDS ARROW WITH CORNER DOWNWARDS</li>
     * <li>21B5 DOWNWARDS ARROW WITH CORNER LEFTWARDS</li>
     * <li>21B6 ANTICLOCKWISE TOP SEMICIRCLE ARROW</li>
     * <li>21B7 CLOCKWISE TOP SEMICIRCLE ARROW</li>
     * <li>21B8 NORTH WEST ARROW TO LONG BAR</li>
     * <li>21BA ANTICLOCKWISE OPEN CIRCLE ARROW</li>
     * <li>21BB CLOCKWISE OPEN CIRCLE ARROW</li>
     * <li>21BE UPWARDS HARPOON WITH BARB RIGHTWARDS</li>
     * <li>21BF UPWARDS HARPOON WITH BARB LEFTWARDS</li>
     * <li>21C2 DOWNWARDS HARPOON WITH BARB RIGHTWARDS</li>
     * <li>21C3 DOWNWARDS HARPOON WITH BARB LEFTWARDS</li>
     * <li>21C5 UPWARDS ARROW LEFTWARDS OF DOWNWARDS ARROW</li>
     * <li>21C8 UPWARDS PAIRED ARROWS</li>
     * <li>21CA DOWNWARDS PAIRED ARROWS</li>
     * <li>21D1 UPWARDS DOUBLE ARROW</li>
     * <li>21D3 DOWNWARDS DOUBLE ARROW</li>
     * <li>21D5 UP DOWN DOUBLE ARROW</li>
     * <li>21D6 NORTH WEST DOUBLE ARROW</li>
     * <li>21D7 NORTH EAST DOUBLE ARROW</li>
     * <li>21D8 SOUTH EAST DOUBLE ARROW</li>
     * <li>21D9 SOUTH WEST DOUBLE ARROW</li>
     * <li>21DE UPWARDS ARROW WITH DOUBLE STROKE</li>
     * <li>21DF DOWNWARDS ARROW WITH DOUBLE STROKE</li>
     * <li>21E1 UPWARDS DASHED ARROW</li>
     * <li>21E3 DOWNWARDS DASHED ARROW</li>
     * <li>21E7 UPWARDS WHITE ARROW</li>
     * <li>21E9 DOWNWARDS WHITE ARROW</li>
     * <li>21EA UPWARDS WHITE ARROW FROM BAR</li>
     * <li>21EB UPWARDS WHITE ARROW ON PEDESTAL</li>
     * <li>21EC UPWARDS WHITE ARROW ON PEDESTAL WITH HORIZONTAL BAR</li>
     * <li>21ED UPWARDS WHITE ARROW ON PEDESTAL WITH VERTICAL BAR</li>
     * <li>21EE UPWARDS WHITE DOUBLE ARROW</li>
     * <li>21EF UPWARDS WHITE DOUBLE ARROW ON PEDESTAL</li>
     * <li>21F1 NORTH WEST ARROW TO CORNER</li>
     * <li>21F2 SOUTH EAST ARROW TO CORNER</li>
     * <li>21F3 UP DOWN WHITE ARROW</li>
     * <li>21F5 DOWNWARDS ARROW LEFTWARDS OF UPWARDS ARROW</li>
     * </ul>
     */
    @Test
    public void testWhitespace() {
        assertEquals(" ", transform.action("↑"));
        assertEquals(" ", transform.action("↓"));
        assertEquals(" ", transform.action("↕"));
        assertEquals(" ", transform.action("↖"));
        assertEquals(" ", transform.action("↗"));
        assertEquals(" ", transform.action("↘"));
        assertEquals(" ", transform.action("↙"));

        assertEquals(" ", transform.action("↟"));
        assertEquals(" ", transform.action("↡"));

        assertEquals(" ", transform.action("↥"));
        assertEquals(" ", transform.action("↧"));
        assertEquals(" ", transform.action("↨"));

        assertEquals(" ", transform.action("↯"));

        assertEquals(" ", transform.action("↰"));
        assertEquals(" ", transform.action("↱"));
        assertEquals(" ", transform.action("↲"));
        assertEquals(" ", transform.action("↳"));
        assertEquals(" ", transform.action("↴"));
        assertEquals(" ", transform.action("↵"));

        assertEquals(" ", transform.action("↶"));
        assertEquals(" ", transform.action("↷"));
        assertEquals(" ", transform.action("↸"));
        assertEquals(" ", transform.action("↺"));
        assertEquals(" ", transform.action("↻"));

        assertEquals(" ", transform.action("↾"));
        assertEquals(" ", transform.action("↿"));
        assertEquals(" ", transform.action("⇂"));
        assertEquals(" ", transform.action("⇃"));

        assertEquals(" ", transform.action("⇅"));
        assertEquals(" ", transform.action("⇈"));
        assertEquals(" ", transform.action("⇊"));

        assertEquals(" ", transform.action("⇑"));
        assertEquals(" ", transform.action("⇓"));
        assertEquals(" ", transform.action("⇕"));
        assertEquals(" ", transform.action("⇖"));
        assertEquals(" ", transform.action("⇗"));
        assertEquals(" ", transform.action("⇘"));
        assertEquals(" ", transform.action("⇙"));

        assertEquals(" ", transform.action("⇞"));
        assertEquals(" ", transform.action("⇟"));

        assertEquals(" ", transform.action("⇡"));
        assertEquals(" ", transform.action("⇣"));

        assertEquals(" ", transform.action("⇧"));
        assertEquals(" ", transform.action("⇩"));
        assertEquals(" ", transform.action("⇪"));
        assertEquals(" ", transform.action("⇫"));
        assertEquals(" ", transform.action("⇬"));
        assertEquals(" ", transform.action("⇭"));
        assertEquals(" ", transform.action("⇮"));
        assertEquals(" ", transform.action("⇯"));
        assertEquals(" ", transform.action("⇱"));
        assertEquals(" ", transform.action("⇲"));
        assertEquals(" ", transform.action("⇳"));

        assertEquals(" ", transform.action("⇵"));
    }


    @Test
    public void testMixedInput() {
        assertEquals("A -> B <- C", transform.action("A → B ← C"));
        assertEquals("東京->大阪", transform.action("東京→大阪"));
        assertEquals("no arrows here", transform.action("no arrows here"));
        assertEquals("A   B", transform.action("A ↑ B"));
    }
}
