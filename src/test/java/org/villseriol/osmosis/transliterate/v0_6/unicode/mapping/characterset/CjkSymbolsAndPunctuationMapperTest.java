// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CjkSymbolsAndPunctuationMapperTest extends KakasiMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals(" ", transform.action("　"));
        assertEquals(",", transform.action("、"));
        assertEquals(".", transform.action("。"));
        assertEquals("(kurikaesi)", transform.action("〃"));
        assertEquals("?", transform.action("〄"));
        assertEquals("", transform.action("々"));
        assertEquals("", transform.action("〆"));
        assertEquals("(maru)", transform.action("〇"));
        assertEquals("<", transform.action("〈"));
        assertEquals(">", transform.action("〉"));
        assertEquals("<<", transform.action("《"));
        assertEquals(">>", transform.action("》"));
        assertEquals("(", transform.action("「"));
        assertEquals(")", transform.action("」"));
        assertEquals("(", transform.action("『"));
        assertEquals(")", transform.action("』"));
        assertEquals("(", transform.action("【"));
        assertEquals(")", transform.action("】"));
        assertEquals("(kigou)", transform.action("〒"));
        assertEquals("(kigou)", transform.action("〓"));
        assertEquals("[", transform.action("〔"));
        assertEquals("]", transform.action("〕"));
        assertEquals("?", transform.action("〖"));
        assertEquals("?", transform.action("〗"));
        assertEquals("?", transform.action("〘"));
        assertEquals("?", transform.action("〙"));
        assertEquals("?", transform.action("〚"));
        assertEquals("?", transform.action("〛"));
        assertEquals("~", transform.action("〜"));
        assertEquals("?", transform.action("〝"));
        assertEquals("?", transform.action("〞"));
        assertEquals("?", transform.action("〟"));
        assertEquals("?", transform.action("〠"));
        assertEquals("?", transform.action("〡"));
        assertEquals("?", transform.action("〢"));
        assertEquals("?", transform.action("〣"));
        assertEquals("?", transform.action("〤"));
        assertEquals("?", transform.action("〥"));
        assertEquals("?", transform.action("〦"));
        assertEquals("?", transform.action("〧"));
        assertEquals("?", transform.action("〨"));
        assertEquals("?", transform.action("〩"));
        assertEquals("?", transform.action("〪"));
        assertEquals("?", transform.action("〫"));
        assertEquals("?", transform.action("〬"));
        assertEquals("?", transform.action("〭"));
        assertEquals("?", transform.action("〮"));
        assertEquals("?", transform.action("〯"));
        assertEquals("?", transform.action("〰"));
        assertEquals("?", transform.action("〱"));
        assertEquals("?", transform.action("〲"));
        assertEquals("?", transform.action("〳"));
        assertEquals("?", transform.action("〴"));
        assertEquals("?", transform.action("〵"));
        assertEquals("?", transform.action("〶"));
        assertEquals("?", transform.action("〷"));
        assertEquals("?", transform.action("〸"));
        assertEquals("?", transform.action("〹"));
        assertEquals("?", transform.action("〺"));
        assertEquals("?", transform.action("〻"));
        assertEquals("?", transform.action("〼"));
        assertEquals("?", transform.action("〽"));
        assertEquals("?", transform.action("〾"));
        assertEquals("?", transform.action("〿"));
    }
}
