// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.unicode.decorator.SequenceDecorator;


public class CjkRadicalsSupplementMapperTest extends KakasiMapperTest {

    private Unimap composed;

    @Before
    public void setUpComposed() {
        composed = new SequenceDecorator(new CjkRadicalsSupplementMapper(), transform);
    }


    @Test
    public void testMappedCharacters() {
        assertEquals("?", composed.action("⺀"));
        assertEquals("?", composed.action("⺁"));
        assertEquals("?", composed.action("⺂"));
        assertEquals("azusa", composed.action("⺃"));
        assertEquals("?", composed.action("⺄"));
        assertEquals("?", composed.action("⺅"));
        assertEquals("?", composed.action("⺆"));
        assertEquals("?", composed.action("⺇"));
        assertEquals("?", composed.action("⺈"));
        assertEquals("seki", composed.action("⺉"));
        assertEquals("?", composed.action("⺊"));
        assertEquals("?", composed.action("⺋"));
        assertEquals("?", composed.action("⺌"));
        assertEquals("𭕄", composed.action("⺍"));
        assertEquals("kotsu", composed.action("⺎"));
        assertEquals("sagi", composed.action("⺏"));
        assertEquals("yuu", composed.action("⺐"));
        assertEquals("?", composed.action("⺑"));
        assertEquals("shi", composed.action("⺒"));
        assertEquals("you", composed.action("⺓"));
        assertEquals("kei", composed.action("⺔"));
        assertEquals("?", composed.action("⺕"));
        assertEquals("shuu", composed.action("⺖"));
        assertEquals("?", composed.action("⺗"));
        assertEquals("shin", composed.action("⺘"));
        assertEquals("hoku", composed.action("⺙"));
        assertEquals("?", composed.action("⺚"));
        assertEquals("ki", composed.action("⺛"));
        assertEquals("?", composed.action("⺜"));
        assertEquals("?", composed.action("⺝"));
        assertEquals("?", composed.action("⺞"));
        assertEquals("haha", composed.action("⺟"));
        assertEquals("tami", composed.action("⺠"));
        assertEquals("tori", composed.action("⺡"));
        assertEquals("?", composed.action("⺢"));
        assertEquals("nae", composed.action("⺣"));
        assertEquals("heki", composed.action("⺤"));
        assertEquals("?", composed.action("⺥"));
        assertEquals("?", composed.action("⺦"));
        assertEquals("?", composed.action("⺧"));
        assertEquals("bo", composed.action("⺨"));
        assertEquals("?", composed.action("⺩"));
        assertEquals("?", composed.action("⺪"));
        assertEquals("ki", composed.action("⺫"));
        assertEquals("?", composed.action("⺬"));
        assertEquals("kitsu", composed.action("⺭"));
        assertEquals("?", composed.action("⺮"));
        assertEquals("?", composed.action("⺯"));
        assertEquals("?", composed.action("⺰"));
        assertEquals("eki", composed.action("⺱"));
        assertEquals("ki", composed.action("⺲"));
        assertEquals("?", composed.action("⺳"));
        assertEquals("?", composed.action("⺴"));
        assertEquals("?", composed.action("⺵"));
        assertEquals("?", composed.action("⺶"));
        assertEquals("?", composed.action("⺷"));
        assertEquals("?", composed.action("⺸"));
        assertEquals("?", composed.action("⺹"));
        assertEquals("?", composed.action("⺺"));
        assertEquals("?", composed.action("⺻"));
        assertEquals("?", composed.action("⺼"));
        assertEquals("?", composed.action("⺽"));
        assertEquals("?", composed.action("⺾"));
        assertEquals("?", composed.action("⺿"));
        assertEquals("?", composed.action("⻀"));
        assertEquals("?", composed.action("⻁"));
        assertEquals("ei", composed.action("⻂"));
        assertEquals("?", composed.action("⻃"));
        assertEquals("nishi", composed.action("⻄"));
        assertEquals("?", composed.action("⻅"));
        assertEquals("?", composed.action("⻆"));
        assertEquals("?", composed.action("⻇"));
        assertEquals("?", composed.action("⻈"));
        assertEquals("?", composed.action("⻉"));
        assertEquals("?", composed.action("⻊"));
        assertEquals("?", composed.action("⻋"));
        assertEquals("so", composed.action("⻌"));
        assertEquals("so", composed.action("⻍"));
        assertEquals("?", composed.action("⻎"));
        assertEquals("?", composed.action("⻏"));
        assertEquals("?", composed.action("⻐"));
        assertEquals("chou", composed.action("⻑"));
        assertEquals("kou", composed.action("⻒"));
        assertEquals("?", composed.action("⻓"));
        assertEquals("?", composed.action("⻔"));
        assertEquals("?", composed.action("⻕"));
        assertEquals("yoku", composed.action("⻖"));
        assertEquals("?", composed.action("⻗"));
        assertEquals("ao", composed.action("⻘"));
        assertEquals("?", composed.action("⻙"));
        assertEquals("?", composed.action("⻚"));
        assertEquals("?", composed.action("⻛"));
        assertEquals("?", composed.action("⻜"));
        assertEquals("?", composed.action("⻝"));
        assertEquals("?", composed.action("⻞"));
        assertEquals("?", composed.action("⻟"));
        assertEquals("?", composed.action("⻠"));
        assertEquals("?", composed.action("⻡"));
        assertEquals("?", composed.action("⻢"));
        assertEquals("?", composed.action("⻣"));
        assertEquals("?", composed.action("⻤"));
        assertEquals("?", composed.action("⻥"));
        assertEquals("?", composed.action("⻦"));
        assertEquals("?", composed.action("⻧"));
        assertEquals("mugi", composed.action("⻨"));
        assertEquals("ki", composed.action("⻩"));
        assertEquals("?", composed.action("⻪"));
        assertEquals("sei", composed.action("⻫"));
        assertEquals("?", composed.action("⻬"));
        assertEquals("ha", composed.action("⻭"));
        assertEquals("?", composed.action("⻮"));
        assertEquals("ryuu", composed.action("⻯"));
        assertEquals("?", composed.action("⻰"));
        assertEquals("?", composed.action("⻱"));
        assertEquals("kame", composed.action("⻲"));
        assertEquals("?", composed.action("⻳"));
    }
}
