// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.builder;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;
import org.villseriol.osmosis.detective.v0_6.report.NodeCountByCharacterReport;


public class NodeCountByCharacterReportBuilderTest extends AbstractDataTest {
    @Test
    public void testBuildGeneratesReport() throws IOException {
        NodeCountByCharacterReportBuilder builder = new NodeCountByCharacterReportBuilder();
        builder.process("hello");

        NodeCountByCharacterReport report = builder.build();

        File outputFile = dataUtils.newFile();
        report.generate(outputFile.toPath());

        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0);
    }
}
