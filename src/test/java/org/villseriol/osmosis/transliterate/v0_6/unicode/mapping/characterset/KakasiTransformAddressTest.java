// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
import org.villseriol.osmosis.transliterate.v0_6.config.loader.DictionaryLoader;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.KakasiTransform;


public class KakasiTransformAddressTest {
    private KakasiTransform transform;

    @Before
    public void setUp() {
        try {
            Path station = DictionaryLoader.load("station");
            Path geo = DictionaryLoader.load("geo");

            KakasiConfig config = new KakasiConfig(KakasiConstants.ASCII_CONFIG);
            config.setSeparator(" ");
            config.setDictionaries(new ArrayList<>() {
                {
                    add(station.toString());
                    add(geo.toString());
                }
            });

            this.transform = new KakasiTransform(config);
        } catch (Exception e) {
            fail();
        }
    }


    /**
     * This is an incomplete test but it shows the need to create my own
     * dictionary for geo-names using japan post datasource.
     *
     * https://www.post.japanpost.jp/service/search/zipcode/download/oogaki-zip.html
     */
    @Test
    public void test200() {
        // ichimichi vs. shidou
        assertEquals("iwaki ichimichi zaimokuchou 2 gousen", transform.action("いわき市道材木町2号線"));

        // amago cho vs. amakocho
        assertEquals("iwaki ichimichi kotaroumachi amago chou sen", transform.action("いわき市道小太郎町尼子町線"));
    }
}
