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
        assertEquals("יִ", transform.action("יִ"));
        assertEquals("ﬞ", transform.action("ﬞ"));
        assertEquals("ײַ", transform.action("ײַ"));
        assertEquals("ﬠ", transform.action("ﬠ"));
        assertEquals("ﬡ", transform.action("ﬡ"));
        assertEquals("ﬢ", transform.action("ﬢ"));
        assertEquals("ﬣ", transform.action("ﬣ"));
        assertEquals("ﬤ", transform.action("ﬤ"));
        assertEquals("ﬥ", transform.action("ﬥ"));
        assertEquals("ﬦ", transform.action("ﬦ"));
        assertEquals("ﬧ", transform.action("ﬧ"));
        assertEquals("ﬨ", transform.action("ﬨ"));
        assertEquals("﬩", transform.action("﬩"));
        assertEquals("שׁ", transform.action("שׁ"));
        assertEquals("שׂ", transform.action("שׂ"));
        assertEquals("שּׁ", transform.action("שּׁ"));
        assertEquals("שּׂ", transform.action("שּׂ"));
        assertEquals("אַ", transform.action("אַ"));
        assertEquals("אָ", transform.action("אָ"));
        assertEquals("אּ", transform.action("אּ"));
        assertEquals("בּ", transform.action("בּ"));
        assertEquals("גּ", transform.action("גּ"));
        assertEquals("דּ", transform.action("דּ"));
        assertEquals("הּ", transform.action("הּ"));
        assertEquals("וּ", transform.action("וּ"));
        assertEquals("זּ", transform.action("זּ"));
        assertEquals("﬷", transform.action("﬷"));
        assertEquals("טּ", transform.action("טּ"));
        assertEquals("יּ", transform.action("יּ"));
        assertEquals("ךּ", transform.action("ךּ"));
        assertEquals("כּ", transform.action("כּ"));
        assertEquals("לּ", transform.action("לּ"));
        assertEquals("﬽", transform.action("﬽"));
        assertEquals("מּ", transform.action("מּ"));
        assertEquals("﬿", transform.action("﬿"));
        assertEquals("נּ", transform.action("נּ"));
        assertEquals("סּ", transform.action("סּ"));
        assertEquals("﭂", transform.action("﭂"));
        assertEquals("ףּ", transform.action("ףּ"));
        assertEquals("פּ", transform.action("פּ"));
        assertEquals("﭅", transform.action("﭅"));
        assertEquals("צּ", transform.action("צּ"));
        assertEquals("קּ", transform.action("קּ"));
        assertEquals("רּ", transform.action("רּ"));
        assertEquals("שּ", transform.action("שּ"));
        assertEquals("תּ", transform.action("תּ"));
        assertEquals("וֹ", transform.action("וֹ"));
        assertEquals("בֿ", transform.action("בֿ"));
        assertEquals("כֿ", transform.action("כֿ"));
        assertEquals("פֿ", transform.action("פֿ"));
        assertEquals("ﭏ", transform.action("ﭏ"));
    }
}
