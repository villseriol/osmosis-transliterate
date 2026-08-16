// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DuplicateSpaceTransformTest {

    private final DuplicateSpaceTransform transform = new DuplicateSpaceTransform();

    @Test
    public void testSingleSpaceIsUnchanged() {
        assertEquals("hello world", transform.action("hello world"));
    }


    @Test
    public void testDuplicateSpacesCollapsed() {
        assertEquals("hello world", transform.action("hello   world"));
    }


    @Test
    public void testMultipleRunsOfDuplicateSpaces() {
        assertEquals("hello world foo bar", transform.action("hello   world  foo    bar"));
    }


    @Test
    public void testLeadingAndTrailingDuplicateSpaces() {
        assertEquals(" hello world ", transform.action("   hello world     "));
    }


    @Test
    public void testMixedWhitespaceCharacters() {
        assertEquals("hello world", transform.action("hello \t\n world"));
    }


    @Test
    public void testNoWhitespace() {
        assertEquals("hello", transform.action("hello"));
    }


    @Test
    public void testEmptyInput() {
        assertEquals("", transform.action(""));
    }


    @Test
    public void testAllWhitespaceInput() {
        assertEquals(" ", transform.action("     "));
    }


    @Test
    public void testActionOnStringBuffer() {
        StringBuffer buffer = new StringBuffer("hello    world");
        transform.action(buffer);

        assertEquals("hello world", buffer.toString());
    }


    @Test
    public void testActionOnStringBufferWithMixedWhitespace() {
        StringBuffer buffer = new StringBuffer("hello \t\n\t world");
        transform.action(buffer);

        assertEquals("hello world", buffer.toString());
    }


    @Test
    public void testActionOnStringBufferWithNoWhitespace() {
        StringBuffer buffer = new StringBuffer("hello");
        transform.action(buffer);

        assertEquals("hello", buffer.toString());
    }
}
