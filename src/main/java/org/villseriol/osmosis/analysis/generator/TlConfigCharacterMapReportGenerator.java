// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.villseriol.osmosis.detective.v0_6.builder.TlConfigCharacterMapReportBuilder;
import org.villseriol.osmosis.detective.v0_6.report.TlConfigCharacterMapReport;
import org.villseriol.osmosis.transliterate.v0_6.TransliteratePipelineBuilder;
import org.villseriol.osmosis.transliterate.v0_6.config.loader.XmlLoader;
import org.villseriol.osmosis.transliterate.v0_6.config.model.NormalizeConfiguration;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public final class TlConfigCharacterMapReportGenerator {

    private TlConfigCharacterMapReportGenerator() {
        super();
    }


    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IllegalArgumentException("Usage: TlConfigCharacterMapReportGenerator <configFile> <outputFile>");
        }

        Path configFile = Path.of(args[0]);
        Path outputFile = Path.of(args[1]);

        XmlLoader<NormalizeConfiguration> loader = XmlLoader.getInstance(NormalizeConfiguration.class);
        NormalizeConfiguration configuration = loader.load(configFile.toString());
        Unimap unimap = new TransliteratePipelineBuilder(configuration).build();

        TlConfigCharacterMapReportBuilder builder = new TlConfigCharacterMapReportBuilder();
        builder.process(unimap);

        TlConfigCharacterMapReport report = builder.build();

        Path outputDir = outputFile.toAbsolutePath().getParent();
        if (outputDir != null) {
            Files.createDirectories(outputDir);
        }

        Files.deleteIfExists(outputFile);

        report.generate(outputFile);
    }
}
