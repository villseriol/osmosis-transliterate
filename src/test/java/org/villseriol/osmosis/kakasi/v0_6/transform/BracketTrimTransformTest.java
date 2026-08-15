// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.BracketTrimTransform;


public class BracketTrimTransformTest {

    private final BracketTrimTransform transform = new BracketTrimTransform();

    @Test
    public void testNoBracketsUnchanged() {
        assertEquals("hello world", transform.action("hello world"));
    }


    @Test
    public void testEmptyInputReturnsEmpty() {
        assertEquals("", transform.action(""));
    }


    @Test
    public void testNullInputReturnsNull() {
        assertNull(transform.action((String) null));
    }


    @Test
    public void testEmptyParenthesesWithSingleSpaceCollapsed() {
        assertEquals("()", transform.action("( )"));
    }


    @Test
    public void testEmptyParenthesesWithMultipleSpacesCollapsed() {
        assertEquals("()", transform.action("(   )"));
    }


    @Test
    public void testEmptySquareBracketsCollapsed() {
        assertEquals("[]", transform.action("[ ]"));
    }


    @Test
    public void testEmptyCurlyBracesCollapsed() {
        assertEquals("{}", transform.action("{ }"));
    }


    @Test
    public void testSurroundingTextPreserved() {
        assertEquals("foo () bar", transform.action("foo ( ) bar"));
    }


    @Test
    public void testMultipleEmptyBracketPairsCollapsedAndMerged() {
        assertEquals("() [] {}", transform.action("(  ) [ ] { }"));
    }


    @Test
    public void testAdjacentBracketPairsMerged() {
        assertEquals("(a) (b)", transform.action("(a) (b)"));
    }


    @Test
    public void testMultipleAdjacentBracketPairsMerged() {
        assertEquals("(a) (b) (c)", transform.action("(a) (b) (c)"));
    }


    @Test
    public void testNestedEmptyBracketsCollapsed() {
        assertEquals("{[()]}", transform.action("{[( )]}"));
    }


    @Test
    public void testNonWhitespaceContentInBracketsUnchanged() {
        assertEquals("(a)", transform.action("( a )"));
    }


    @Test
    public void testTrailingWhitespaceInsideBracketsUnchanged() {
        assertEquals("(a)", transform.action("(a )"));
    }


    @Test
    public void testLeadingWhitespaceInsideBracketsUnchanged() {
        assertEquals("(a)", transform.action("( a)"));
    }


    @Test
    public void testUnmatchedOpeningBracketUnchanged() {
        assertEquals("(", transform.action("("));
    }


    @Test
    public void testUnmatchedClosingBracketUnchanged() {
        assertEquals(")", transform.action(")"));
    }


    @Test
    public void testAlreadyCollapsedBracketsUnchanged() {
        assertEquals("()", transform.action("()"));
    }


    @Test
    public void testActionOnStringBuffer() {
        StringBuffer buffer = new StringBuffer("(  ) [ ] { }");
        transform.action(buffer);

        assertEquals("() [] {}", buffer.toString());
    }


    @Test
    public void testActionOnStringBufferWithNoBrackets() {
        StringBuffer buffer = new StringBuffer("hello world");
        transform.action(buffer);

        assertEquals("hello world", buffer.toString());
    }
}
