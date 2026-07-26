// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;
import org.villseriol.osmosis.kakasi.v0_6.config.NormalizeConfiguration;
import org.villseriol.osmosis.kakasi.v0_6.utils.XmlLoader;


public class KakasiPipelineRunnerTest extends AbstractDataTest {
    private final KakasiPipelineRunner runner = new KakasiPipelineRunner();
    private final XmlLoader<NormalizeConfiguration> loader = XmlLoader.getInstance(NormalizeConfiguration.class);

    @Before
    public void setUp() {
        File configFile = dataUtils.createDataFile("v0_6/standard-user-config.xml");
        NormalizeConfiguration config = loader.load(configFile);

        runner.init(config);
    }


    /**
     * A list of all nodes containing any characters in the unicode arrow group.
     */
    @Test
    public void testArrows() {
        // 1770382887
        assertEquals("Mt. Misen · Komaga-bayashi<-->Ohmoto-Park",
                runner.run("name:en", "Mt. Misen・Komaga-bayashi←→Ohmoto-Park"));

        // NB: not correct translation. Consider an skk dictionary for mountains
        assertEquals("ya yama · koma hayashi<-->oomoto kouen", runner.run("name", "弥山・駒ヶ林←→大元公園"));

        // 12755242465
        // NB: guideposts to use the address dictionary
        assertEquals("5-cho old path(NW)", runner.run("name:en", "5-chō old path↖"));
        assertEquals("go chou ko michi (NW)", runner.run("name", "五丁古道↖"));
        assertEquals("(SW) itchou", runner.run("name", "↙一丁"));

        // 5649766468
        // NB: maybe all nodes related to transportation should use the address
        assertEquals("shikoku kisen feri^ uno<=>miya ura (choku shima)", runner.run("name", "四国汽船 フェリー　宇野⇔宮浦(直島)"));

        // 9196762039
        // NB: once again, applying the address-based dictionary shows better
        // translation results
        assertEquals("ehara eigyousho [han 01 · han 02<magomeeki mae basu tei=>2 ban noriba basu tei he>]",
                runner.run("name", "荏原営業所【反０１・反０２＜馬込駅前バス停⇒２番乗り場バス停へ＞】"));

        assertEquals("furenzu (FRIENDS)|sayamashi no mouhatsu soudan dekiru biyou shitsu",
                runner.run("name", "フレンズ（FRIENDS）│狭山市の毛髪相談できる美容室"));
        assertEquals("kyouto yodo izakaya meibutsu karaage", runner.run("name", "京都🏮淀🍶居酒屋🍗名物からあげ"));
        assertEquals("oka kuchi 1,260m / kaneoka kouen 530m / shimin no ki yanagi",
                runner.run("name", "岡口 1,260m / 金岡公園530m▶ / 市民の木 ヤナギ"));
        assertEquals("moto otafuku->tsunku no mise->", runner.run("name", "元 おたふく→つんく♂の店→"));
        assertEquals(
                "sendaizaka [toukyuu] no [1 ban noriba basu tei] (2) sendaizaka [keikyuu] no [B ban noriba basu tei]",
                runner.run("name", "仙台坂【★東急】の【１番乗り場バス停】 ②仙台坂【☆京急】の【Ｂ番乗り場バス停】"));
    }
}
