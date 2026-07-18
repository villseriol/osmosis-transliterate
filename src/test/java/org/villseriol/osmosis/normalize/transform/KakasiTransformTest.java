// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.transform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.villseriol.kakasi.api.Kakasi;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
import org.villseriol.osmosis.normalize.v0_6.transform.KakasiTransform;
import org.villseriol.osmosis.shared.DictionaryLoader;


public class KakasiTransformTest {
    private KakasiTransform transform;
    private Kakasi kakasi;

    @Before
    public void setUp() {
        try {
            Path propernoun = DictionaryLoader.load("propernoun");
            Path fullname = DictionaryLoader.load("fullname");
            Path jinmei = DictionaryLoader.load("jinmei");

            KakasiConfig config = new KakasiConfig(KakasiConstants.ASCII_CONFIG);
            config.setSeparator(" ");
            config.setDictionaries(new ArrayList<>() {
                {
                    add(propernoun.toString());
                    add(fullname.toString());
                    add(jinmei.toString());
                }
            });

            this.kakasi = new Kakasi(config);
            this.transform = new KakasiTransform(kakasi);
        } catch (Exception e) {
            fail();
        }
    }


    @After
    public void tareDown() {
        kakasi.close();
    }


    /**
     * A test comprising 200 random (name=*, name:ja_rm=*) combinations from an
     * osm extract of japan. Used to illustrate the differences between kakasi
     * transliteration when compared to hand-translated values.
     */
    @Test
    public void test200() {
        assertEquals("kamikawa jinja mae", transform.action("上川神社前"));
        assertEquals("edinishinomiya", transform.action("エディニシノミヤ"));
        assertEquals("tamokuteki toire", transform.action("多目的トイレ"));
        assertEquals("nateiru Heart", transform.action("ナティルHeart"));
        assertEquals("Stella chouzai yakkyoku", transform.action("Stella調剤薬局"));
        assertEquals("aoki machi kouen iriguchi", transform.action("青木町公園入口"));
        assertEquals("yamauchi shikaiin", transform.action("山内歯科医院"));
        assertEquals("YOKOHAMA fu^doterasu", transform.action("YOKOHAMAフードテラス"));
        assertEquals("don . kiho^te", transform.action("ドン・キホーテ"));
        assertEquals("daitou machi SS / matsumoto sekiyu", transform.action("大東町SS / 松本石油"));
        assertEquals("BIKE SHOP kotani", transform.action("BIKE SHOP コタニ"));
    }
}
