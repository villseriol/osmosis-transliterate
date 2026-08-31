// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SmallFormVariantsMapperTest extends LatinMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals(",", transform.action("﹐")); // SMALL COMMA
        assertEquals(",", transform.action("﹑")); // SMALL IDEOGRAPHIC COMMA
        assertEquals(".", transform.action("﹒")); // SMALL FULL STOP
        assertEquals(";", transform.action("﹔")); // SMALL SEMICOLON
        assertEquals(":", transform.action("﹕")); // SMALL COLON
        assertEquals("?", transform.action("﹖")); // SMALL QUESTION MARK
        assertEquals("!", transform.action("﹗")); // SMALL EXCLAMATION MARK
        assertEquals("-", transform.action("﹘")); // SMALL EM DASH
        assertEquals("(", transform.action("﹙")); // SMALL LEFT PARENTHESIS
        assertEquals(")", transform.action("﹚")); // SMALL RIGHT PARENTHESIS
        assertEquals("{", transform.action("﹛")); // SMALL LEFT CURLY BRACKET
        assertEquals("}", transform.action("﹜")); // SMALL RIGHT CURLY BRACKET
        assertEquals("[", transform.action("﹝")); // SMALL LEFT TORTOISE SHELL BRACKET
        assertEquals("]", transform.action("﹞")); // SMALL RIGHT TORTOISE SHELL BRACKET
        assertEquals("#", transform.action("﹟")); // SMALL NUMBER SIGN
        assertEquals("&", transform.action("﹠")); // SMALL AMPERSAND
        assertEquals("*", transform.action("﹡")); // SMALL ASTERISK
        assertEquals("+", transform.action("﹢")); // SMALL PLUS SIGN
        assertEquals("-", transform.action("﹣")); // SMALL HYPHEN-MINUS
        assertEquals("<", transform.action("﹤")); // SMALL LESS-THAN SIGN
        assertEquals(">", transform.action("﹥")); // SMALL GREATER-THAN SIGN
        assertEquals("=", transform.action("﹦")); // SMALL EQUALS SIGN
        assertEquals("\\", transform.action("﹨")); // SMALL REVERSE SOLIDUS
        assertEquals("$", transform.action("﹩")); // SMALL DOLLAR SIGN
        assertEquals("%", transform.action("﹪")); // SMALL PERCENT SIGN
        assertEquals("@", transform.action("﹫")); // SMALL COMMERCIAL AT
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("﹓", transform.action("﹓")); // reserved
        assertEquals("﹧", transform.action("﹧")); // reserved
    }
}
