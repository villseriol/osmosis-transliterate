// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TransliteratePreProcessingCharacterMapRecordTest {
    @Test
    public void testGetFromAndGetTo() {
        TransliteratePreProcessingCharacterMapRecord record = new TransliteratePreProcessingCharacterMapRecord("a",
                "b");

        assertEquals("a", record.getFrom());
        assertEquals("b", record.getTo());
    }


    @Test
    public void testSetFromAndSetTo() {
        TransliteratePreProcessingCharacterMapRecord record = new TransliteratePreProcessingCharacterMapRecord("a",
                "b");

        record.setFrom("c");
        record.setTo("d");

        assertEquals("c", record.getFrom());
        assertEquals("d", record.getTo());
    }


    @Test
    public void testGetFromNameAndGetToNameSingleCharacter() {
        TransliteratePreProcessingCharacterMapRecord record = new TransliteratePreProcessingCharacterMapRecord("a",
                "b");

        assertEquals("LATIN SMALL LETTER A", record.getFromName());
        assertEquals("LATIN SMALL LETTER B", record.getToName());
    }


    @Test
    public void testGetFromNameAndGetToNameJoinsMultipleCharacters() {
        TransliteratePreProcessingCharacterMapRecord record = new TransliteratePreProcessingCharacterMapRecord("ab",
                "cd");

        assertEquals("LATIN SMALL LETTER A + LATIN SMALL LETTER B", record.getFromName());
        assertEquals("LATIN SMALL LETTER C + LATIN SMALL LETTER D", record.getToName());
    }


    @Test
    public void testGetFromCodePointsAndGetToCodePointsSingleCharacter() {
        TransliteratePreProcessingCharacterMapRecord record = new TransliteratePreProcessingCharacterMapRecord("a",
                "b");

        assertEquals(Integer.toString('a'), record.getFromCodePoints());
        assertEquals(Integer.toString('b'), record.getToCodePoints());
    }


    @Test
    public void testGetFromCodePointsAndGetToCodePointsJoinsMultipleCharacters() {
        TransliteratePreProcessingCharacterMapRecord record = new TransliteratePreProcessingCharacterMapRecord("ab",
                "cd");

        assertEquals("a".codePointAt(0) + " + " + "b".codePointAt(0), record.getFromCodePoints());
        assertEquals("c".codePointAt(0) + " + " + "d".codePointAt(0), record.getToCodePoints());
    }
}
