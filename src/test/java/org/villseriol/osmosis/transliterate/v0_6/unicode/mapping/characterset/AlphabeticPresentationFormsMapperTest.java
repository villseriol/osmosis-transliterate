// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AlphabeticPresentationFormsMapperTest extends LatinMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals("ff", transform.action("ﬀ"));
        assertEquals("fi", transform.action("ﬁ"));
        assertEquals("fl", transform.action("ﬂ"));
        assertEquals("ffi", transform.action("ﬃ"));
        assertEquals("ffl", transform.action("ﬄ"));
        assertEquals("st", transform.action("ﬅ"));
        assertEquals("st", transform.action("ﬆ"));
        assertEquals("yi", transform.action("יִ"));
        assertEquals("yya", transform.action("ײַ"));
        assertEquals("'", transform.action("ﬠ"));
        assertEquals("'", transform.action("ﬡ"));
        assertEquals("d", transform.action("ﬢ"));
        assertEquals("h", transform.action("ﬣ"));
        assertEquals("k", transform.action("ﬤ"));
        assertEquals("l", transform.action("ﬥ"));
        assertEquals("m", transform.action("ﬦ"));
        assertEquals("r", transform.action("ﬧ"));
        assertEquals("t", transform.action("ﬨ"));
        assertEquals("+", transform.action("﬩"));
        assertEquals("s", transform.action("שׁ"));
        assertEquals("s", transform.action("שׂ"));
        assertEquals("s", transform.action("שּׁ"));
        assertEquals("s", transform.action("שּׂ"));
        assertEquals("'a", transform.action("אַ"));
        assertEquals("'a", transform.action("אָ"));
        assertEquals("'̇", transform.action("אּ"));
        assertEquals("b", transform.action("בּ"));
        assertEquals("g", transform.action("גּ"));
        assertEquals("d", transform.action("דּ"));
        assertEquals("h", transform.action("הּ"));
        assertEquals("w", transform.action("וּ"));
        assertEquals("z", transform.action("זּ"));
        assertEquals("t", transform.action("טּ"));
        assertEquals("y", transform.action("יּ"));
        assertEquals("k", transform.action("ךּ"));
        assertEquals("k", transform.action("כּ"));
        assertEquals("l", transform.action("לּ"));
        assertEquals("m", transform.action("מּ"));
        assertEquals("n", transform.action("נּ"));
        assertEquals("s", transform.action("סּ"));
        assertEquals("p", transform.action("ףּ"));
        assertEquals("p", transform.action("פּ"));
        assertEquals("z", transform.action("צּ"));
        assertEquals("q", transform.action("קּ"));
        assertEquals("r", transform.action("רּ"));
        assertEquals("s", transform.action("שּ"));
        assertEquals("t", transform.action("תּ"));
        assertEquals("wo", transform.action("וֹ"));
        assertEquals("b", transform.action("בֿ"));
        assertEquals("k", transform.action("כֿ"));
        assertEquals("p", transform.action("פֿ"));
        assertEquals("'l", transform.action("ﭏ"));
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("﬇", transform.action("﬇"));
        assertEquals("﬈", transform.action("﬈"));
        assertEquals("﬉", transform.action("﬉"));
        assertEquals("﬊", transform.action("﬊"));
        assertEquals("﬋", transform.action("﬋"));
        assertEquals("﬌", transform.action("﬌"));
        assertEquals("﬍", transform.action("﬍"));
        assertEquals("﬎", transform.action("﬎"));
        assertEquals("﬏", transform.action("﬏"));
        assertEquals("﬐", transform.action("﬐"));
        assertEquals("﬑", transform.action("﬑"));
        assertEquals("﬒", transform.action("﬒"));
        assertEquals("ﬓ", transform.action("ﬓ"));
        assertEquals("ﬔ", transform.action("ﬔ"));
        assertEquals("ﬕ", transform.action("ﬕ"));
        assertEquals("ﬖ", transform.action("ﬖ"));
        assertEquals("ﬗ", transform.action("ﬗ"));
        assertEquals("﬘", transform.action("﬘"));
        assertEquals("﬙", transform.action("﬙"));
        assertEquals("﬚", transform.action("﬚"));
        assertEquals("﬛", transform.action("﬛"));
        assertEquals("﬜", transform.action("﬜"));
        assertEquals("ﬞ", transform.action("ﬞ"));
        assertEquals("﬷", transform.action("﬷"));
        assertEquals("﬽", transform.action("﬽"));
        assertEquals("﬿", transform.action("﬿"));
        assertEquals("﭂", transform.action("﭂"));
        assertEquals("﭅", transform.action("﭅"));
    }
}
