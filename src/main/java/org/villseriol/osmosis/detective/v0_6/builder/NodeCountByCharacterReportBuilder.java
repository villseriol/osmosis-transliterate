// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.builder;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.domain.v0_6.Entity;
import org.openstreetmap.osmosis.core.domain.v0_6.Tag;
import org.villseriol.osmosis.detective.v0_6.model.NodeCountByCharacterRecord;


public class NodeCountByCharacterReportBuilder {
    private final Map<Character, NodeCountByCharacterRecord> records = new HashMap<>();

    public void process(EntityContainer entityContainer) {
        Entity entity = entityContainer.getEntity();

        for (Tag tag : entity.getTags()) {
            String value = tag.getValue();

            for (int i = 0; i < value.length(); i++) {
                char character = value.charAt(i);

                NodeCountByCharacterRecord record = records.computeIfAbsent(character, NodeCountByCharacterRecord::new);
                record.incrementOccurences();
                record.addExample(value);
            }
        }
    }

}
