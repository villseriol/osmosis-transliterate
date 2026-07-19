// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;
import org.villseriol.osmosis.kakasi.v0_6.config.NormalizeConfiguration;
import org.villseriol.osmosis.kakasi.v0_6.utils.XmlLoader;


public class KakasiPipelineTest extends AbstractDataTest {
    private final KakasiPipeline pipeline = new KakasiPipeline();
    private final XmlLoader<NormalizeConfiguration> loader = XmlLoader.getInstance(NormalizeConfiguration.class);

    @Before
    public void setUp() {
        File configFile = dataUtils.createDataFile("v0_6/standard-user-config.xml");
        NormalizeConfiguration config = loader.load(configFile);

        pipeline.init(config);
    }


    /**
     * A list of all nodes containing any characters in the unicode arrow group.
     */
    @Test
    public void testArrows() {
        // 1770382887
        assertEquals("Mt. Misen · Komaga-bayashi<-->Ohmoto-Park",
                pipeline.run("name:en", "Mt. Misen・Komaga-bayashi←→Ohmoto-Park"));

        // NB: not correct translation. Consider an skk dictionary for mountains
        assertEquals("ya yama · koma hayashi<-->oomoto kouen", pipeline.run("name", "弥山・駒ヶ林←→大元公園"));

        // 12755242465
        // NB: guideposts to use the address dictionary
        assertEquals("5-cho old path^<", pipeline.run("name:en", "5-chō old path↖"));
        assertEquals("go chou ko michi^<", pipeline.run("name", "五丁古道↖"));
        assertEquals("v<itchou", pipeline.run("name", "↙一丁"));

        // 5649766468
        // NB: maybe all nodes related to transportation should use the address
        assertEquals("shikoku kisen feri^ uno<=>miya ura(choku shima)", pipeline.run("name", "四国汽船 フェリー　宇野⇔宮浦(直島)"));

        // 9196762039
        // NB: once again, applying the address-based dictionary shows better
        // translation results
        assertEquals("ehara eigyousho[han 01 · han 02<magomeeki mae basu tei=>2 ban noriba basu tei he>]",
                pipeline.run("name", "荏原営業所【反０１・反０２＜馬込駅前バス停⇒２番乗り場バス停へ＞】"));
    }
}
