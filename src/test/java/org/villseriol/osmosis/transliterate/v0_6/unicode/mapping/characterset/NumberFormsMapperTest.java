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
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("⅐", transform.action("⅐"));
        assertEquals("⅑", transform.action("⅑"));
        assertEquals("⅒", transform.action("⅒"));
        assertEquals("⅓", transform.action("⅓"));
        assertEquals("⅔", transform.action("⅔"));
        assertEquals("⅕", transform.action("⅕"));
        assertEquals("⅖", transform.action("⅖"));
        assertEquals("⅗", transform.action("⅗"));
        assertEquals("⅘", transform.action("⅘"));
        assertEquals("⅙", transform.action("⅙"));
        assertEquals("⅚", transform.action("⅚"));
        assertEquals("⅛", transform.action("⅛"));
        assertEquals("⅜", transform.action("⅜"));
        assertEquals("⅝", transform.action("⅝"));
        assertEquals("⅞", transform.action("⅞"));
        assertEquals("⅟", transform.action("⅟"));
        assertEquals("ↀ", transform.action("ↀ"));
        assertEquals("ↁ", transform.action("ↁ"));
        assertEquals("ↂ", transform.action("ↂ"));
        assertEquals("Ↄ", transform.action("Ↄ"));
        assertEquals("ↄ", transform.action("ↄ"));
        assertEquals("ↅ", transform.action("ↅ"));
        assertEquals("ↆ", transform.action("ↆ"));
        assertEquals("ↇ", transform.action("ↇ"));
        assertEquals("ↈ", transform.action("ↈ"));
        assertEquals("↉", transform.action("↉"));
    }
}
