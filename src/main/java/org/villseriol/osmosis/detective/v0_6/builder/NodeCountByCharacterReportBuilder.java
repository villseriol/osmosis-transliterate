// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.builder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.domain.v0_6.Entity;
import org.openstreetmap.osmosis.core.domain.v0_6.Tag;
import org.villseriol.osmosis.detective.v0_6.model.NodeCountByCharacterRecord;
import org.villseriol.osmosis.detective.v0_6.report.NodeCountByCharacterReport;


public class NodeCountByCharacterReportBuilder {
    private final Map<Character, NodeCountByCharacterRecord> data = new HashMap<>();

    public void process(EntityContainer entityContainer) {
        Entity entity = entityContainer.getEntity();

        Set<Character> seen = new HashSet<>();

        for (Tag tag : entity.getTags()) {
            process(tag.getValue(), seen);
        }
    }


    public Map<Character, NodeCountByCharacterRecord> getData() {
        return data;
    }


    public void process(String value) {
        process(value, new HashSet<>());
    }


    private void process(String value, final Set<Character> seen) {
        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);

            NodeCountByCharacterRecord record = data.computeIfAbsent(character, NodeCountByCharacterRecord::new);
            record.addExample(value);

            if (seen.add(character)) {
                record.incrementOccurences();
            }
        }
    }


    public NodeCountByCharacterReport build() {
        return new NodeCountByCharacterReport(data);
    }
}
