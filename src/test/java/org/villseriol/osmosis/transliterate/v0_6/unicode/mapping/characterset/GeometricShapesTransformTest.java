// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GeometricShapesTransformTest {

    private final GeometricShapesTransform transform = new GeometricShapesTransform();

    @Test
    public void testSquaresAndFills() {
        assertEquals("#", transform.action("■"));
        assertEquals("[]", transform.action("□"));
        assertEquals("[]", transform.action("▢"));
        assertEquals("[#]", transform.action("▣"));
        assertEquals("[-]", transform.action("▤"));
        assertEquals("[|]", transform.action("▥"));
        assertEquals("[+]", transform.action("▦"));
        assertEquals("[\\]", transform.action("▧"));
        assertEquals("[/]", transform.action("▨"));
        assertEquals("[x]", transform.action("▩"));
        assertEquals("-", transform.action("▪"));
        assertEquals(".", transform.action("▫"));
        assertEquals("#", transform.action("▬"));
        assertEquals("[]", transform.action("▭"));
        assertEquals("#", transform.action("▮"));
        assertEquals("[]", transform.action("▯"));
        assertEquals("#", transform.action("▰"));
        assertEquals("[]", transform.action("▱"));
        assertEquals("[]", transform.action("◰"));
        assertEquals("[]", transform.action("◱"));
        assertEquals("[]", transform.action("◲"));
        assertEquals("[]", transform.action("◳"));
        assertEquals("[", transform.action("◧"));
        assertEquals("]", transform.action("◨"));
        assertEquals("[\\", transform.action("◩"));
        assertEquals("\\]", transform.action("◪"));
        assertEquals("[|]", transform.action("◫"));
        assertEquals("[]", transform.action("◻"));
        assertEquals("#", transform.action("◼"));
        assertEquals("[]", transform.action("◽"));
        assertEquals("#", transform.action("◾"));
    }


    @Test
    public void testTriangles() {
        assertEquals("^", transform.action("▲"));
        assertEquals("^", transform.action("△"));
        assertEquals("^", transform.action("▴"));
        assertEquals("^", transform.action("▵"));
        assertEquals(">", transform.action("▶"));
        assertEquals(">", transform.action("▷"));
        assertEquals(">", transform.action("▸"));
        assertEquals(">", transform.action("▹"));
        assertEquals(">", transform.action("►"));
        assertEquals(">", transform.action("▻"));
        assertEquals("v", transform.action("▼"));
        assertEquals("v", transform.action("▽"));
        assertEquals("v", transform.action("▾"));
        assertEquals("v", transform.action("▿"));
        assertEquals("<", transform.action("◀"));
        assertEquals("<", transform.action("◁"));
        assertEquals("<", transform.action("◂"));
        assertEquals("<", transform.action("◃"));
        assertEquals("<", transform.action("◄"));
        assertEquals("<", transform.action("◅"));
        assertEquals(">", transform.action("◢"));
        assertEquals("<", transform.action("◣"));
        assertEquals("<", transform.action("◤"));
        assertEquals(">", transform.action("◥"));
        assertEquals("<", transform.action("◸"));
        assertEquals(">", transform.action("◹"));
        assertEquals("<", transform.action("◺"));
        assertEquals(">", transform.action("◿"));
        assertEquals("^.", transform.action("◬"));
        assertEquals("^", transform.action("◭"));
        assertEquals("^", transform.action("◮"));
    }


    @Test
    public void testDiamonds() {
        assertEquals("<*>", transform.action("◆"));
        assertEquals("<>", transform.action("◇"));
        assertEquals("<o>", transform.action("◈"));
        assertEquals("<>", transform.action("◊"));
    }


    @Test
    public void testCirclesAndFills() {
        assertEquals("o", transform.action("○"));
        assertEquals("*", transform.action("●"));
        assertEquals("o", transform.action("◯"));
        assertEquals("o", transform.action("◌"));
        assertEquals("@", transform.action("◉"));
        assertEquals("@", transform.action("◎"));
        assertEquals("@", transform.action("◍"));
        assertEquals("*", transform.action("◘"));
        assertEquals("o", transform.action("◙"));
        assertEquals(".", transform.action("◦"));
    }


    @Test
    public void testHalfAndQuadrantCirclesAndArcs() {
        assertEquals("o", transform.action("◐"));
        assertEquals("o", transform.action("◑"));
        assertEquals("o", transform.action("◒"));
        assertEquals("o", transform.action("◓"));
        assertEquals("o", transform.action("◔"));
        assertEquals("o", transform.action("◕"));
        assertEquals("(", transform.action("◖"));
        assertEquals(")", transform.action("◗"));
        assertEquals("o", transform.action("◚"));
        assertEquals("o", transform.action("◛"));
        assertEquals("(", transform.action("◜"));
        assertEquals(")", transform.action("◝"));
        assertEquals(")", transform.action("◞"));
        assertEquals("(", transform.action("◟"));
        assertEquals("^", transform.action("◠"));
        assertEquals("v", transform.action("◡"));
        assertEquals("o", transform.action("◴"));
        assertEquals("o", transform.action("◵"));
        assertEquals("o", transform.action("◶"));
        assertEquals("o", transform.action("◷"));
    }


    @Test
    public void testMixedInput() {
        assertEquals("@ATM @災害時帰宅支援ステーション", transform.action("◎ATM ◎災害時帰宅支援ステーション"));
        assertEquals("宿&スパイスカレー-ストラム&ファームハウス", transform.action("宿&スパイスカレー▪ストラム&ファームハウス"));
    }
}
