// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.analysis.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;
import org.villseriol.osmosis.analysis.model.NodeCountByCharacterRecord;


public class NodeCountByCharacterReportBuilderTest {
    @Test
    public void testProcessAggregatesDistinctCharacters() {
        NodeCountByCharacterReportBuilder builder = new NodeCountByCharacterReportBuilder();
        builder.process("hello");

        Map<Character, NodeCountByCharacterRecord> data = builder.getData();

        assertEquals(4, data.size());
        assertTrue(data.containsKey('h'));
        assertTrue(data.containsKey('e'));
        assertTrue(data.containsKey('l'));
        assertTrue(data.containsKey('o'));
    }


    @Test
    public void testProcessCountsRepeatedCharacterOncePerCall() {
        NodeCountByCharacterReportBuilder builder = new NodeCountByCharacterReportBuilder();
        builder.process("hello");

        Map<Character, NodeCountByCharacterRecord> data = builder.getData();

        assertEquals(Long.valueOf(1L), data.get('l').getOccurences());
        assertEquals(2, data.get('l').getExamples().size());
    }


    @Test
    public void testProcessAccumulatesOccurencesAcrossCalls() {
        NodeCountByCharacterReportBuilder builder = new NodeCountByCharacterReportBuilder();
        builder.process("hi");
        builder.process("hello");

        Map<Character, NodeCountByCharacterRecord> data = builder.getData();

        assertEquals(Long.valueOf(2L), data.get('h').getOccurences());
    }


    @Test
    public void testProcessRecordsExamplesForCharacter() {
        NodeCountByCharacterReportBuilder builder = new NodeCountByCharacterReportBuilder();
        builder.process("hi");
        builder.process("hello");

        Map<Character, NodeCountByCharacterRecord> data = builder.getData();

        assertTrue(data.get('h').getExamples().contains("hi"));
        assertTrue(data.get('h').getExamples().contains("hello"));
    }
}
