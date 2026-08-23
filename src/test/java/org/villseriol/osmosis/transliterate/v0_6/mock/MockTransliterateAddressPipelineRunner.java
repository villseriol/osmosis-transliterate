// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.mock;

import org.openstreetmap.osmosis.testutil.TestDataUtilities;
import org.villseriol.osmosis.transliterate.v0_6.TransliteratePipelineRunner;
import org.villseriol.osmosis.transliterate.v0_6.config.loader.XmlLoader;
import org.villseriol.osmosis.transliterate.v0_6.config.model.NormalizeConfiguration;


public class MockTransliterateAddressPipelineRunner {
    private final TestDataUtilities dataUtils;
    private final TransliteratePipelineRunner preRunner = new TransliteratePipelineRunner();
    private final TransliteratePipelineRunner nameRunner = new TransliteratePipelineRunner();
    private final TransliteratePipelineRunner postRunner = new TransliteratePipelineRunner();
    private final XmlLoader<NormalizeConfiguration> loader = XmlLoader.getInstance(NormalizeConfiguration.class);

    public MockTransliterateAddressPipelineRunner(TestDataUtilities dataUtils) {
        this.dataUtils = dataUtils;

        preRunner.init(loadConfig("v0_6/pre-processing-config.xml"));
        nameRunner.init(loadConfig("v0_6/standard-address-config.xml"));
        postRunner.init(loadConfig("v0_6/post-processing-config.xml"));
    }


    private NormalizeConfiguration loadConfig(String path) {
        return loader.load(dataUtils.createDataFile(path));
    }


    public String run(String value) {
        return postRunner.run("ref", nameRunner.run("ref", preRunner.run("ref", value)));
    }
}
