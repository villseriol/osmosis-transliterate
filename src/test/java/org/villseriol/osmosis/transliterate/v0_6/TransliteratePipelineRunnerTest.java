// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.Before;
import org.junit.Test;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;
import org.villseriol.osmosis.transliterate.v0_6.mock.MockTransliteratePipelineRunner;


public class TransliteratePipelineRunnerTest extends AbstractDataTest {
    private MockTransliteratePipelineRunner runner;

    @Before
    public void setUp() {
        runner = new MockTransliteratePipelineRunner(dataUtils);
    }


    private List<CSVRecord> loadCsv(String path) throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.builder().setHeader().setSkipHeaderRecord(true).get();

        try (Reader reader = Files.newBufferedReader(dataUtils.createDataFile(path).toPath(), StandardCharsets.UTF_8);
                CSVParser parser = format.parse(reader)) {
            return parser.getRecords();
        }
    }


    /**
     * A list of all nodes containing any characters in the unicode arrow group.
     */
    @Test
    public void testArrowsFromExport() throws IOException {
        for (CSVRecord record : loadCsv("v0_6/integration/arrows.csv")) {
            assertEquals(record.get("output"), runner.run(record.get("tag"), record.get("input")));
        }
    }


    /**
     * A list of all nodes containing any characters in the unicode kangxi
     * radicals group.
     */
    @Test
    public void testKangxiRadicalsFromExport() throws IOException {
        for (CSVRecord record : loadCsv("v0_6/integration/kangxi-radicals.csv")) {
            assertEquals(record.get("output"), runner.run(record.get("tag"), record.get("input")));
        }
    }


    /**
     * A list of all nodes containing any characters in the unicode cjk
     * radicals supplement group.
     */
    @Test
    public void testCjkRadicalsSupplementFromExport() throws IOException {
        for (CSVRecord record : loadCsv("v0_6/integration/cjk-radicals-supplement.csv")) {
            assertEquals(record.get("output"), runner.run(record.get("tag"), record.get("input")));
        }
    }


    /**
     * A list of all nodes containing any characters in the unicode halfwidth
     * and fullwidth forms group.
     */
    @Test
    public void testHalfwidthAndFullwidthFormsFromExport() throws IOException {
        for (CSVRecord record : loadCsv("v0_6/integration/halfwidth-and-fullwidth-forms.csv")) {
            assertEquals(record.get("output"), runner.run(record.get("tag"), record.get("input")));
        }
    }


    /**
     * A list of all nodes containing any characters in the unicode latin
     * extended-b group.
     */
    @Test
    public void testLatinExtendedBFromExport() throws IOException {
        for (CSVRecord record : loadCsv("v0_6/integration/latin-extended-b.csv")) {
            assertEquals(record.get("output"), runner.run(record.get("tag"), record.get("input")));
        }
    }


    /**
     * A list of all nodes containing any characters in the unicode box
     * drawing group.
     */
    @Test
    public void testBoxDrawingFromExport() throws IOException {
        for (CSVRecord record : loadCsv("v0_6/integration/box-drawing.csv")) {
            assertEquals(record.get("output"), runner.run(record.get("tag"), record.get("input")));
        }
    }
}
