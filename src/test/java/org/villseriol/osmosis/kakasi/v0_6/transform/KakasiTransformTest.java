// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.villseriol.kakasi.api.KakasiConfig;
import org.villseriol.kakasi.api.KakasiConstants;
import org.villseriol.osmosis.kakasi.v0_6.utils.DictionaryLoader;


public class KakasiTransformTest {
    private KakasiTransform transform;

    @Before
    public void setUp() {
        try {
            Path propernoun = DictionaryLoader.load("propernoun");
            Path fullname = DictionaryLoader.load("fullname");
            Path jinmei = DictionaryLoader.load("jinmei");
            Path law = DictionaryLoader.load("law");
            Path hukugougo = DictionaryLoader.load("hukugougo");

            KakasiConfig config = new KakasiConfig(KakasiConstants.ASCII_CONFIG);
            config.setSeparator(" ");
            config.setDictionaries(new ArrayList<>() {
                {
                    add(propernoun.toString());
                    add(fullname.toString());
                    add(jinmei.toString());
                    add(law.toString());
                    add(hukugougo.toString());
                }
            });

            this.transform = new KakasiTransform(config);
        } catch (Exception e) {
            fail();
        }
    }


    /**
     * A test comprising of hand-picked values from historically processed osm
     * files for documentation purposes.
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
        assertEquals("tenma byouin", transform.action("天満病院"));

        assertEquals("EY4180 (kabu)", transform.action("EY4180 (株)"));
        assertEquals("EY4180 ( kabu )", transform.action("EY4180 【株】"));
        assertEquals("EY4180 ( kabu )", transform.action("EY4180 「株」"));
        assertEquals("EY4180 )((kabu ())", transform.action("EY4180 )((株())"));
        assertEquals("EY>4180 )((kabu ())", transform.action("EY>4180 )((株())"));
        assertEquals("ka a . ga^den", transform.action("珈亜・ガーデン"));
        assertEquals("ide yu (ide machi kyoudouyokujou)", transform.action("いで湯(井出町共同浴場)"));
    }
}
