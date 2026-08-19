// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TransliteratePreProcessingCharacterMapRecordTest {
    @Test
    public void testGetFromAndGetTo() {
        PreProcessingCharacterMapRecord record = new PreProcessingCharacterMapRecord('a', 'b');

        assertEquals(Character.valueOf('a'), record.getFrom());
        assertEquals(Character.valueOf('b'), record.getTo());
    }


    @Test
    public void testSetFromAndSetTo() {
        PreProcessingCharacterMapRecord record = new PreProcessingCharacterMapRecord('a', 'b');

        record.setFrom('c');
        record.setTo('d');

        assertEquals(Character.valueOf('c'), record.getFrom());
        assertEquals(Character.valueOf('d'), record.getTo());
    }


    @Test
    public void testGetFromNameAndGetToName() {
        PreProcessingCharacterMapRecord record = new PreProcessingCharacterMapRecord('a', 'b');

        assertEquals("LATIN SMALL LETTER A", record.getFromName());
        assertEquals("LATIN SMALL LETTER B", record.getToName());
    }


    @Test
    public void testGetFromCodePointsAndGetToCodePoints() {
        PreProcessingCharacterMapRecord record = new PreProcessingCharacterMapRecord('a', 'b');

        assertEquals("U+0061", record.getFromCodePoints());
        assertEquals("U+0062", record.getToCodePoints());
    }


    @Test
    public void testIsFromReservedAndIsToReservedFalseForDefinedCharacters() {
        PreProcessingCharacterMapRecord record = new PreProcessingCharacterMapRecord('a', 'b');

        assertFalse(record.isFromReserved());
        assertFalse(record.isToReserved());
    }


    @Test
    public void testIsFromReservedAndIsToReservedTrueForUnassignedCharacters() {
        char unassigned = '￿';
        PreProcessingCharacterMapRecord record = new PreProcessingCharacterMapRecord(unassigned, unassigned);

        assertTrue(record.isFromReserved());
        assertTrue(record.isToReserved());
    }
}
