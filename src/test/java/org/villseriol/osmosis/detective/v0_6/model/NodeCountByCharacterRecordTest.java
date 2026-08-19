// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class NodeCountByCharacterRecordTest {
    @Test
    public void testConstructRecordGoldenPath() {
        NodeCountByCharacterRecord record = new NodeCountByCharacterRecord('a');

        assertEquals(Character.valueOf('a'), record.getCharacter());
        assertEquals(Long.valueOf(0L), record.getOccurences());
        assertTrue(record.getExamples().isEmpty());
    }


    @Test
    public void testAddExampleBeyondMaxSizeIsDropped() {
        NodeCountByCharacterRecord record = new NodeCountByCharacterRecord('a');

        for (int i = 0; i < 15; i++) {
            record.addExample("example" + i);
        }

        assertEquals(10, record.getExamples().size());
        assertTrue(record.getExamples().contains("example0"));
        assertTrue(record.getExamples().contains("example9"));
        assertFalse(record.getExamples().contains("example10"));
        assertFalse(record.getExamples().contains("example14"));
    }
}
