// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.TrimTransform;


public class TrimTransformTest {

    private final TrimTransform transform = new TrimTransform();

    @Test
    public void testLeadingWhitespace() {
        assertEquals("hello", transform.action("   hello"));
    }


    @Test
    public void testTrailingWhitespace() {
        assertEquals("hello", transform.action("hello   "));
    }


    @Test
    public void testLeadingAndTrailingWhitespace() {
        assertEquals("hello", transform.action("   hello   "));
    }


    @Test
    public void testInternalWhitespaceIsUnchanged() {
        assertEquals("hello   world", transform.action("   hello   world   "));
    }


    @Test
    public void testMixedWhitespaceCharacters() {
        assertEquals("hello", transform.action("\t\n hello \n\t"));
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
        assertEquals("", transform.action("     "));
    }


    @Test
    public void testActionOnStringBuffer() {
        StringBuffer buffer = new StringBuffer("   hello world   ");
        transform.action(buffer);

        assertEquals("hello world", buffer.toString());
    }


    @Test
    public void testActionOnStringBufferWithNoWhitespace() {
        StringBuffer buffer = new StringBuffer("hello");
        transform.action(buffer);

        assertEquals("hello", buffer.toString());
    }


    @Test
    public void testActionOnStringBufferAllWhitespace() {
        StringBuffer buffer = new StringBuffer("     ");
        transform.action(buffer);

        assertEquals("", buffer.toString());
    }
}
