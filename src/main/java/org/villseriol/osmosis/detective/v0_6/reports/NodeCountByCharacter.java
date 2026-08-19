// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.reports;

import java.util.Collection;

import org.apache.poi.ss.usermodel.Workbook;
import org.villseriol.osmosis.detective.v0_6.reports.models.NodeCountByCharacterRecord;


public class NodeCountByCharacter extends DetReport {
    private final Collection<NodeCountByCharacterRecord> data;

    public NodeCountByCharacter(Collection<NodeCountByCharacterRecord> data) {
        this.data = data;
    }


    @Override
    protected void generate(Workbook workbook) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
