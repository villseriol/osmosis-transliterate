// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.configuration;

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
import org.villseriol.osmosis.kakasi.v0_6.configuration.model.DictionaryEntry;
import org.villseriol.osmosis.kakasi.v0_6.configuration.model.UserConfiguration;


public class UserConfigurationLoaderTest extends AbstractDataTest {
    private UserConfigurationLoader loader = UserConfigurationLoader.getInstance();

    @Test
    public void testEmptyConfiguration() {
        File sourceFile = dataUtils.createDataFile("v0_6/empty-user-config.xml");
        UserConfiguration config = loader.load(sourceFile);
        assertNotNull(config);
        List<DictionaryEntry> dictionaries = config.getDictionaryEntries();
        assertNotNull(dictionaries);
        assertTrue(dictionaries.isEmpty());

        List<Replacement> replacements = config.getReplacements();
        assertNotNull(replacements);
        assertTrue(replacements.isEmpty());

        List<TagMatch> matches = config.getTagMatches();
        assertNotNull(matches);
        assertTrue(matches.isEmpty());
    }


    @Test
    public void testEntityExclusionConfiguration() {
        File sourceFile = dataUtils.createDataFile("v0_6/exclusion-user-config.xml");
        UserConfiguration config = loader.load(sourceFile);
        assertNotNull(config);

        assertTrue(config.isExcludeWays());
        assertTrue(config.isExcludeRelations());
        assertFalse(config.isExcludeNodes());
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
        UserConfiguration config = loader.load(sourceFile);
        assertNotNull(config);
        List<Replacement> replacements = config.getReplacements();
        assertNotNull(replacements);
        assertFalse(replacements.isEmpty());
        assertEquals(replacements.size(), 11);
    }
}
