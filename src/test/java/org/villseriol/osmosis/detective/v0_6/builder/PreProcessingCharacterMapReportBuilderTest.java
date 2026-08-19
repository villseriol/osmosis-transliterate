// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import org.villseriol.osmosis.common.UnicodeRange;
import org.villseriol.osmosis.detective.v0_6.model.TlConfigCharacterMapRecord;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class PreProcessingCharacterMapReportBuilderTest {
    private static final Unimap SINGLE_CHARACTER_REMAP = new Unimap() {
        @Override
        public String action(String input) {
            if ("a".equals(input)) {
                return "b";
            }

            return input;
        }


        @Override
        public void action(StringBuffer input) {
        }
    };

    @Test
    public void testProcessGroupsRemappedCharacterByUnicodeRange() {
        TlConfigCharacterMapReportBuilder builder = new TlConfigCharacterMapReportBuilder();
        builder.process(SINGLE_CHARACTER_REMAP);

        Map<UnicodeRange, Collection<TlConfigCharacterMapRecord>> data = builder.getData();

        assertTrue(data.containsKey(UnicodeRange.BASIC_LATIN));
        assertEquals(1, data.get(UnicodeRange.BASIC_LATIN).size());
    }


    @Test
    public void testProcessRecordsFromAndToForRemappedCharacter() {
        TlConfigCharacterMapReportBuilder builder = new TlConfigCharacterMapReportBuilder();
        builder.process(SINGLE_CHARACTER_REMAP);

        TlConfigCharacterMapRecord record = builder.getData().get(UnicodeRange.BASIC_LATIN).iterator().next();

        assertEquals(Character.valueOf('a'), record.getFrom());
        assertEquals(Character.valueOf('b'), record.getTo());
    }


    @Test
    public void testProcessSkipsCharactersUnimapLeavesUnchanged() {
        Unimap identity = new Unimap() {
            @Override
            public String action(String input) {
                return input;
            }


            @Override
            public void action(StringBuffer input) {
            }
        };

        TlConfigCharacterMapReportBuilder builder = new TlConfigCharacterMapReportBuilder();
        builder.process(identity);

        assertTrue(builder.getData().isEmpty());
    }
}
