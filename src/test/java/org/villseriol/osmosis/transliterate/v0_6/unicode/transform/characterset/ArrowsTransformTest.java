// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ArrowsTransformTest {

    private final ArrowsTransform transform = new ArrowsTransform();

    @Test
    public void testBasicArrows() {
        assertEquals("<-", transform.action("←"));
        assertEquals(" ", transform.action("↑"));
        assertEquals("->", transform.action("→"));
        assertEquals(" ", transform.action("↓"));
        assertEquals("<->", transform.action("↔"));
        assertEquals(" ", transform.action("↕"));
        assertEquals(" ", transform.action("↖"));
        assertEquals(" ", transform.action("↗"));
        assertEquals(" ", transform.action("↘"));
        assertEquals(" ", transform.action("↙"));
    }


    @Test
    public void testStrokeNegatedArrows() {
        assertEquals("<-", transform.action("↚"));
        assertEquals("->", transform.action("↛"));
    }


    @Test
    public void testWaveArrows() {
        assertEquals("<~", transform.action("↜"));
        assertEquals("~>", transform.action("↝"));
    }


    @Test
    public void testTwoHeadedArrows() {
        assertEquals("<-", transform.action("↞"));
        assertEquals(" ", transform.action("↟"));
        assertEquals("->", transform.action("↠"));
        assertEquals(" ", transform.action("↡"));
    }


    @Test
    public void testTailArrows() {
        assertEquals("<-", transform.action("↢"));
        assertEquals("->", transform.action("↣"));
    }


    @Test
    public void testBarArrows() {
        assertEquals("<-", transform.action("↤"));
        assertEquals(" ", transform.action("↥"));
        assertEquals("->", transform.action("↦"));
        assertEquals(" ", transform.action("↧"));
        assertEquals(" ", transform.action("↨"));
    }


    @Test
    public void testHookedAndLoopedArrows() {
        assertEquals("<-", transform.action("↩"));
        assertEquals("->", transform.action("↪"));
        assertEquals("<-", transform.action("↫"));
        assertEquals("->", transform.action("↬"));
    }


    @Test
    public void testWaveStrokeAndZigzagArrows() {
        assertEquals("<~>", transform.action("↭"));
        assertEquals("<->", transform.action("↮"));
        assertEquals(" ", transform.action("↯"));
    }


    @Test
    public void testTipAndCornerArrows() {
        assertEquals(" ", transform.action("↰"));
        assertEquals(" ", transform.action("↱"));
        assertEquals(" ", transform.action("↲"));
        assertEquals(" ", transform.action("↳"));
        assertEquals(" ", transform.action("↴"));
        assertEquals(" ", transform.action("↵"));
    }


    @Test
    public void testSemicircleAndCircleArrows() {
        assertEquals(" ", transform.action("↶"));
        assertEquals(" ", transform.action("↷"));
        assertEquals(" ", transform.action("↸"));
        assertEquals("<->", transform.action("↹"));
        assertEquals(" ", transform.action("↺"));
        assertEquals(" ", transform.action("↻"));
    }


    @Test
    public void testHarpoons() {
        assertEquals("<-", transform.action("↼"));
        assertEquals("<-", transform.action("↽"));
        assertEquals(" ", transform.action("↾"));
        assertEquals(" ", transform.action("↿"));
        assertEquals("->", transform.action("⇀"));
        assertEquals("->", transform.action("⇁"));
        assertEquals(" ", transform.action("⇂"));
        assertEquals(" ", transform.action("⇃"));
    }


    @Test
    public void testPairedAndExchangeArrows() {
        assertEquals("<->", transform.action("⇄"));
        assertEquals(" ", transform.action("⇅"));
        assertEquals("<->", transform.action("⇆"));
        assertEquals("<=", transform.action("⇇"));
        assertEquals(" ", transform.action("⇈"));
        assertEquals("=>", transform.action("⇉"));
        assertEquals(" ", transform.action("⇊"));
    }


    @Test
    public void testChemicalEquilibriumArrows() {
        assertEquals("<=>", transform.action("⇋"));
        assertEquals("<=>", transform.action("⇌"));
    }


    @Test
    public void testDoubleLineArrows() {
        assertEquals("<=", transform.action("⇍"));
        assertEquals("<=>", transform.action("⇎"));
        assertEquals("=>", transform.action("⇏"));
        assertEquals("<=", transform.action("⇐"));
        assertEquals(" ", transform.action("⇑"));
        assertEquals("=>", transform.action("⇒"));
        assertEquals(" ", transform.action("⇓"));
        assertEquals("<=>", transform.action("⇔"));
        assertEquals(" ", transform.action("⇕"));
        assertEquals(" ", transform.action("⇖"));
        assertEquals(" ", transform.action("⇗"));
        assertEquals(" ", transform.action("⇘"));
        assertEquals(" ", transform.action("⇙"));
        assertEquals("<=", transform.action("⇚"));
        assertEquals("=>", transform.action("⇛"));
    }


    @Test
    public void testSquiggleAndDoubleStrokeArrows() {
        assertEquals("<~", transform.action("⇜"));
        assertEquals("~>", transform.action("⇝"));
        assertEquals(" ", transform.action("⇞"));
        assertEquals(" ", transform.action("⇟"));
    }


    @Test
    public void testDashedAndBarArrows() {
        assertEquals("<-", transform.action("⇠"));
        assertEquals(" ", transform.action("⇡"));
        assertEquals("->", transform.action("⇢"));
        assertEquals(" ", transform.action("⇣"));
        assertEquals("<-", transform.action("⇤"));
        assertEquals("->", transform.action("⇥"));
    }


    @Test
    public void testWhiteArrows() {
        assertEquals("<-", transform.action("⇦"));
        assertEquals(" ", transform.action("⇧"));
        assertEquals("->", transform.action("⇨"));
        assertEquals(" ", transform.action("⇩"));
        assertEquals(" ", transform.action("⇪"));
        assertEquals(" ", transform.action("⇫"));
        assertEquals(" ", transform.action("⇬"));
        assertEquals(" ", transform.action("⇭"));
        assertEquals(" ", transform.action("⇮"));
        assertEquals(" ", transform.action("⇯"));
        assertEquals("->", transform.action("⇰"));
        assertEquals(" ", transform.action("⇱"));
        assertEquals(" ", transform.action("⇲"));
        assertEquals(" ", transform.action("⇳"));
    }


    @Test
    public void testCircledAndTripleArrows() {
        assertEquals("->", transform.action("⇴"));
        assertEquals(" ", transform.action("⇵"));
        assertEquals("=>", transform.action("⇶"));
    }


    @Test
    public void testVerticalStrokeArrows() {
        assertEquals("<-", transform.action("⇷"));
        assertEquals("->", transform.action("⇸"));
        assertEquals("<->", transform.action("⇹"));
        assertEquals("<-", transform.action("⇺"));
        assertEquals("->", transform.action("⇻"));
        assertEquals("<->", transform.action("⇼"));
    }


    @Test
    public void testOpenHeadedArrows() {
        assertEquals("<-", transform.action("⇽"));
        assertEquals("->", transform.action("⇾"));
        assertEquals("<->", transform.action("⇿"));
    }


    @Test
    public void testMixedInput() {
        assertEquals("A -> B <- C", transform.action("A → B ← C"));
        assertEquals("東京->大阪", transform.action("東京→大阪"));
        assertEquals("no arrows here", transform.action("no arrows here"));
        assertEquals("A   B", transform.action("A ↑ B"));
    }
}
