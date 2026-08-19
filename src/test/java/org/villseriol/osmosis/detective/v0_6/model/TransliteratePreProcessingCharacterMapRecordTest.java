// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TransliteratePreProcessingCharacterMapRecordTest {
    @Test
    public void testGetFromAndGetTo() {
        TlConfigCharacterMapRecord record = new TlConfigCharacterMapRecord('a', "b");

        assertEquals(Character.valueOf('a'), record.getFrom());
        assertEquals("b", record.getTo());
    }


    @Test
    public void testSetFromAndSetTo() {
        TlConfigCharacterMapRecord record = new TlConfigCharacterMapRecord('a', "b");

        record.setFrom('c');
        record.setTo("d");

        assertEquals(Character.valueOf('c'), record.getFrom());
        assertEquals("d", record.getTo());
    }


    @Test
    public void testGetFromNameAndGetToName() {
        TlConfigCharacterMapRecord record = new TlConfigCharacterMapRecord('a', "b");

        assertEquals("LATIN SMALL LETTER A", record.getFromName());
        assertEquals("LATIN SMALL LETTER B", record.getToName());
    }


    @Test
    public void testGetFromCodePointsAndGetToCodePoints() {
        TlConfigCharacterMapRecord record = new TlConfigCharacterMapRecord('a', "b");

        assertEquals("U+0061", record.getFromCodePoints());
        assertEquals("U+0062", record.getToCodePoints());
    }


    @Test
    public void testIsFromReservedAndIsToReservedFalseForDefinedCharacters() {
        TlConfigCharacterMapRecord record = new TlConfigCharacterMapRecord('a', "b");

        assertFalse(record.isFromReserved());
        assertFalse(record.isToReserved());
    }


    @Test
    public void testIsFromReservedAndIsToReservedTrueForUnassignedCharacters() {
        char unassigned = '￿';
        TlConfigCharacterMapRecord record = new TlConfigCharacterMapRecord(unassigned, String.valueOf(unassigned));

        assertTrue(record.isFromReserved());
        assertTrue(record.isToReserved());
    }
}
