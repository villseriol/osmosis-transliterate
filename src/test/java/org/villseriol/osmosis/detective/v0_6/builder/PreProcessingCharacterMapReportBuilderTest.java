// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.builder;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;
import org.villseriol.osmosis.detective.v0_6.report.PreProcessingCharacterMapReport;
import org.villseriol.osmosis.transliterate.v0_6.TransliteratePipelineBuilder;
import org.villseriol.osmosis.transliterate.v0_6.config.loader.XmlLoader;
import org.villseriol.osmosis.transliterate.v0_6.config.model.NormalizeConfiguration;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class PreProcessingCharacterMapReportBuilderTest extends AbstractDataTest {
    private final XmlLoader<NormalizeConfiguration> loader = XmlLoader.getInstance(NormalizeConfiguration.class);

    @Test
    public void testBuildGeneratesReport() throws IOException {
        NormalizeConfiguration configuration = loader.load(dataUtils.createDataFile("v0_6/pre-processing-config.xml"));
        Unimap unimap = new TransliteratePipelineBuilder(configuration).build();

        PreProcessingCharacterMapReportBuilder builder = new PreProcessingCharacterMapReportBuilder();
        builder.process(unimap);

        PreProcessingCharacterMapReport report = builder.build();

        File outputFile = dataUtils.newFile();
        report.generate(outputFile.toPath());

        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0);
    }
}
