// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class NumberFormsMapperTest extends LatinMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals("I", transform.action("Ⅰ"));
        assertEquals("II", transform.action("Ⅱ"));
        assertEquals("III", transform.action("Ⅲ"));
        assertEquals("IV", transform.action("Ⅳ"));
        assertEquals("V", transform.action("Ⅴ"));
        assertEquals("VI", transform.action("Ⅵ"));
        assertEquals("VII", transform.action("Ⅶ"));
        assertEquals("VIII", transform.action("Ⅷ"));
        assertEquals("IX", transform.action("Ⅸ"));
        assertEquals("X", transform.action("Ⅹ"));
        assertEquals("XI", transform.action("Ⅺ"));
        assertEquals("XII", transform.action("Ⅻ"));
        assertEquals("L", transform.action("Ⅼ"));
        assertEquals("C", transform.action("Ⅽ"));
        assertEquals("D", transform.action("Ⅾ"));
        assertEquals("M", transform.action("Ⅿ"));
        assertEquals("i", transform.action("ⅰ"));
        assertEquals("ii", transform.action("ⅱ"));
        assertEquals("iii", transform.action("ⅲ"));
        assertEquals("iv", transform.action("ⅳ"));
        assertEquals("v", transform.action("ⅴ"));
        assertEquals("vi", transform.action("ⅵ"));
        assertEquals("vii", transform.action("ⅶ"));
        assertEquals("viii", transform.action("ⅷ"));
        assertEquals("ix", transform.action("ⅸ"));
        assertEquals("x", transform.action("ⅹ"));
        assertEquals("xi", transform.action("ⅺ"));
        assertEquals("xii", transform.action("ⅻ"));
        assertEquals("l", transform.action("ⅼ"));
        assertEquals("c", transform.action("ⅽ"));
        assertEquals("d", transform.action("ⅾ"));
        assertEquals("m", transform.action("ⅿ"));

        assertEquals(" 1/7", transform.action("⅐"));
        assertEquals(" 1/9", transform.action("⅑"));
        assertEquals(" 1/10", transform.action("⅒"));
        assertEquals(" 1/3", transform.action("⅓"));
        assertEquals(" 2/3", transform.action("⅔"));
        assertEquals(" 1/5", transform.action("⅕"));
        assertEquals(" 2/5", transform.action("⅖"));
        assertEquals(" 3/5", transform.action("⅗"));
        assertEquals(" 4/5", transform.action("⅘"));
        assertEquals(" 1/6", transform.action("⅙"));
        assertEquals(" 5/6", transform.action("⅚"));
        assertEquals(" 1/8", transform.action("⅛"));
        assertEquals(" 3/8", transform.action("⅜"));
        assertEquals(" 5/8", transform.action("⅝"));
        assertEquals(" 7/8", transform.action("⅞"));
        assertEquals(" 1/", transform.action("⅟"));
        assertEquals(" 0/3", transform.action("↉"));
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("ↀ", transform.action("ↀ"));
        assertEquals("ↁ", transform.action("ↁ"));
        assertEquals("ↂ", transform.action("ↂ"));
        assertEquals("Ↄ", transform.action("Ↄ"));
        assertEquals("ↄ", transform.action("ↄ"));
        assertEquals("ↅ", transform.action("ↅ"));
        assertEquals("ↆ", transform.action("ↆ"));
        assertEquals("ↇ", transform.action("ↇ"));
        assertEquals("ↈ", transform.action("ↈ"));
    }
}
