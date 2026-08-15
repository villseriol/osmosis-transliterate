// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openstreetmap.osmosis.core.Osmosis;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;


public class KakasiPluginLoaderTest extends AbstractDataTest {
    @Test
    public void testHospitalNode() throws IOException {
        File sourceFile = dataUtils.createDataFile("v0_6/hospital/385218500.xml");
        File expectedFile = dataUtils.createDataFile("v0_6/hospital/385218500-expected.xml");
        File outputFile = dataUtils.newFile();

        File preConfigFile = dataUtils.createDataFile("v0_6/pre-processing-config.xml");
        File nameConfigFile = dataUtils.createDataFile("v0_6/standard-name-config.xml");
        File postConfigFile = dataUtils.createDataFile("v0_6/post-processing-config.xml");

        // @formatter:off
        Osmosis.run(new String[] {
            "-q",
            "-p",
            "org.villseriol.osmosis.kakasi.KakasiPluginLoader",
            "--read-xml-0.6",
            sourceFile.getPath(),
            "--kakasi-0.6",
            "file=" + preConfigFile,
            "--kakasi-0.6",
            "file=" + nameConfigFile,
            "--kakasi-0.6",
            "file=" + postConfigFile,
            "--tag-sort-0.6",
            "--write-xml-0.6", outputFile.getPath() });
        // @formatter:on

        dataUtils.compareFiles(outputFile, expectedFile);
    }


    /**
     * Tests a cafe in the Tokushima region with a dot in its name.
     *
     * @see N34° 03.054 E134° 33.034
     * @throws IOException
     */
    @Test
    public void testCafeNode() throws IOException {
        File sourceFile = dataUtils.createDataFile("v0_6/cafe/226504231.xml");
        File expectedFile = dataUtils.createDataFile("v0_6/cafe/226504231-expected.xml");
        File outputFile = dataUtils.newFile();

        File preConfigFile = dataUtils.createDataFile("v0_6/pre-processing-config.xml");
        File nameConfigFile = dataUtils.createDataFile("v0_6/standard-name-config.xml");
        File postConfigFile = dataUtils.createDataFile("v0_6/post-processing-config.xml");

        // @formatter:off
        Osmosis.run(new String[] {
            "-q",
            "-p",
            "org.villseriol.osmosis.kakasi.KakasiPluginLoader",
            "--read-xml-0.6",
            sourceFile.getPath(),
            "--kakasi-0.6",
            "file=" + preConfigFile,
            "--kakasi-0.6",
            "file=" + nameConfigFile,
            "--kakasi-0.6",
            "file=" + postConfigFile,
            "--tag-sort-0.6",
            "--write-xml-0.6", outputFile.getPath() });
        // @formatter:on

        dataUtils.compareFiles(outputFile, expectedFile);
    }


    /**
     * Tests a hotel in the Tokushima region with two dots in its name.
     *
     * @see N34° 04.012 E134° 32.861
     * @throws IOException
     */
    @Test
    public void testHotelNode() throws IOException {
        File sourceFile = dataUtils.createDataFile("v0_6/hotel/310173328.xml");
        File expectedFile = dataUtils.createDataFile("v0_6/hotel/310173328-expected.xml");
        File outputFile = dataUtils.newFile();

        File preConfigFile = dataUtils.createDataFile("v0_6/pre-processing-config.xml");
        File nameConfigFile = dataUtils.createDataFile("v0_6/standard-name-config.xml");
        File addressConfigFile = dataUtils.createDataFile("v0_6/standard-address-config.xml");
        File postConfigFile = dataUtils.createDataFile("v0_6/post-processing-config.xml");

        // @formatter:off
        Osmosis.run(new String[] {
            "-q",
            "-p",
            "org.villseriol.osmosis.kakasi.KakasiPluginLoader",
            "--read-xml-0.6",
            sourceFile.getPath(),
            "--kakasi-0.6",
            "file=" + preConfigFile,
            "--kakasi-0.6",
            "file=" + nameConfigFile,
            "--kakasi-0.6",
            "file=" + addressConfigFile,
            "--kakasi-0.6",
            "file=" + postConfigFile,
            "--tag-sort-0.6",
            "--write-xml-0.6", outputFile.getPath() });
        // @formatter:on

        dataUtils.compareFiles(outputFile, expectedFile);
    }


    /**
     * Tests a post office in the Tokushima region with address processing as
     * well.
     *
     * @see 34.0675660, 134.5478650
     * @throws IOException
     */
    @Test
    public void testPostOfficeNode() throws IOException {
        File sourceFile = dataUtils.createDataFile("v0_6/post-office/1423657675.xml");
        File expectedFile = dataUtils.createDataFile("v0_6/post-office/1423657675-expected.xml");
        File outputFile = dataUtils.newFile();

        File preConfigFile = dataUtils.createDataFile("v0_6/pre-processing-config.xml");
        File nameConfigFile = dataUtils.createDataFile("v0_6/standard-name-config.xml");
        File addressConfigFile = dataUtils.createDataFile("v0_6/standard-address-config.xml");
        File postConfigFile = dataUtils.createDataFile("v0_6/post-processing-config.xml");

        // @formatter:off
        Osmosis.run(new String[] {
            "-q",
            "-p",
            "org.villseriol.osmosis.kakasi.KakasiPluginLoader",
            "--read-xml-0.6",
            sourceFile.getPath(),
            "--kakasi-0.6",
            "file=" + preConfigFile,
            "--kakasi-0.6",
            "file=" + nameConfigFile,
            "--kakasi-0.6",
            "file=" + addressConfigFile,
            "--kakasi-0.6",
            "file=" + postConfigFile,
            "--tag-sort-0.6",
            "--write-xml-0.6", outputFile.getPath() });
        // @formatter:on

        dataUtils.compareFiles(outputFile, expectedFile);
    }
}
