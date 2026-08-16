// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.configuration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.openstreetmap.osmosis.core.OsmosisRuntimeException;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;
import org.villseriol.osmosis.transliterate.v0_6.config.NormalizeAlias;
import org.villseriol.osmosis.transliterate.v0_6.config.NormalizeConfiguration;
import org.villseriol.osmosis.transliterate.v0_6.config.ReplaceWithNode;
import org.villseriol.osmosis.transliterate.v0_6.config.RunNode;
import org.villseriol.osmosis.transliterate.v0_6.config.TagNode;
import org.villseriol.osmosis.transliterate.v0_6.config.WhenValueIsNode;
import org.villseriol.osmosis.transliterate.v0_6.utils.XmlLoader;


public class UserConfigurationLoaderTest extends AbstractDataTest {
    private XmlLoader<NormalizeConfiguration> loader = XmlLoader.getInstance(NormalizeConfiguration.class);

    @Test
    public void testEmptyConfiguration() {
        File sourceFile = dataUtils.createDataFile("v0_6/empty-user-config.xml");
        NormalizeConfiguration config = loader.load(sourceFile);
        assertNotNull(config);

        List<RunNode> runs = config.getRuns();
        assertNotNull(runs);
        assertTrue(runs.isEmpty());

        List<TagNode> matches = config.getTags();
        assertNotNull(matches);
        assertTrue(matches.isEmpty());
    }


    @Test
    public void testMalformedConfiguration() {
        File sourceFile = dataUtils.createDataFile("v0_6/malformed-user-config.xml");
        try {
            loader.load(sourceFile);
        } catch (OsmosisRuntimeException e) {
            // pass
        } catch (Exception e) {
            fail();
        }
    }


    @Test
    public void testReplacementsConfiguration() {
        File sourceFile = dataUtils.createDataFile("v0_6/replacements-user-config.xml");
        NormalizeConfiguration config = loader.load(sourceFile);
        assertNotNull(config);

        List<RunNode> runs = config.getRuns();
        assertNotNull(runs);
        assertFalse(runs.isEmpty());

        RunNode first = runs.get(0);
        assertNotNull(first);
        assertEquals(first.getAlias(), NormalizeAlias.CUSTOM);

        List<ReplaceWithNode> replacements = first.getReplaceWiths();
        assertNotNull(replacements);
        assertFalse(replacements.isEmpty());
        assertEquals(replacements.size(), 8);

        ReplaceWithNode dotReplacement = replacements.get(1);
        assertEquals("·", dotReplacement.getValue());

        List<WhenValueIsNode> whenValues = dotReplacement.getWhenValues();
        assertNotNull(whenValues);
        assertEquals(3, whenValues.size());
        assertEquals("・", whenValues.get(0).getValue());
        assertEquals("･", whenValues.get(1).getValue());
        assertEquals("•", whenValues.get(2).getValue());
    }
}
