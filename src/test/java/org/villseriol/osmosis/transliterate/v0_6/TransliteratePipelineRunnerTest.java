// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;
import org.villseriol.osmosis.transliterate.v0_6.mock.MockTransliterateNamePipelineRunner;


public class TransliteratePipelineRunnerTest extends AbstractDataTest {
    private MockTransliterateNamePipelineRunner runner;

    @Before
    public void setUp() {
        runner = new MockTransliterateNamePipelineRunner(dataUtils);
    }


    /**
     * A list of all nodes containing any characters in the unicode arrow group.
     */
    @Test
    public void testArrows() {
        // 1770382887
        assertEquals("Mt. Misen·Komaga-bayashi<-->Ohmoto-Park", runner.run("Mt. Misen・Komaga-bayashi←→Ohmoto-Park"));

        // NB: not correct translation. Consider an skk dictionary for mountains
        assertEquals("ya yama·koma hayashi<-->oomoto kouen", runner.run("弥山・駒ヶ林←→大元公園"));

        // 12755242465
        // NB: guideposts to use the address dictionary
        // NB: arrow transform now only supports left/right arrows; diagonal
        // arrows are dropped to whitespace and trimmed away
        assertEquals("5-cho old path", runner.run("5-chō old path↖"));
        assertEquals("go chou ko michi", runner.run("五丁古道↖"));
        assertEquals("itchou", runner.run("↙一丁"));

        // 5649766468
        // NB: maybe all nodes related to transportation should use the address
        assertEquals("shikoku kisen feri^ uno<=>miya ura (choku shima)", runner.run("四国汽船 フェリー　宇野⇔宮浦(直島)"));

        // 9196762039
        // NB: once again, applying the address-based dictionary shows better
        // translation results
        assertEquals("ehara eigyousho [han 01·han 02<magomeeki mae basu tei=>2 ban noriba basu tei he>]",
                runner.run("荏原営業所【反０１・反０２＜馬込駅前バス停⇒２番乗り場バス停へ＞】"));

        assertEquals("furenzu (FRIENDS)|sayamashi no mouhatsu soudan dekiru biyou shitsu",
                runner.run("フレンズ（FRIENDS）│狭山市の毛髪相談できる美容室"));
        assertEquals("kyouto yodo izakaya meibutsu karaage", runner.run("京都🏮淀🍶居酒屋🍗名物からあげ"));
        assertEquals("oka kuchi 1,260m / kaneoka kouen 530m / shimin no ki yanagi",
                runner.run("岡口 1,260m / 金岡公園530m▶ / 市民の木 ヤナギ"));
        assertEquals("moto otafuku->tsunku no mise->", runner.run("元 おたふく→つんく♂の店→"));
        assertEquals(
                "sendaizaka [toukyuu] no [1 ban noriba basu tei] (2) sendaizaka [keikyuu] no [B ban noriba basu tei]",
                runner.run("仙台坂【★東急】の【１番乗り場バス停】 ②仙台坂【☆京急】の【Ｂ番乗り場バス停】"));

        // docs/exports/arrows.csv
        assertEquals("<- kumaishi houmen kokudou 229", runner.run("← 熊石方面 国道229"));
        assertEquals("rurudo no doukutsu <- 1.5km toho 30 fun", runner.run("ルルドの洞窟 ← 1.5km 徒歩30分"));
        assertEquals("rurudo no doukutsu", runner.run("ルルドの洞窟 ↑"));
        assertEquals("ita tei shin tera 0.2km->", runner.run("至 闐信寺 0.2km→"));
        assertEquals("oogata nado ->", runner.run("大型等↑→"));
        assertEquals("oogata nado <-", runner.run("大型等↑←"));
        assertEquals("oogata nado<-->", runner.run("大型等←→"));
        assertEquals("->chuushakinshi", runner.run("→駐車禁止"));
        assertEquals("->", runner.run("→"));
        assertEquals("<-", runner.run("←"));
        assertEquals("<=>", runner.run("⇔"));
        assertEquals("kendou choushi kouen sen<=>choushi do^ba^rain", runner.run("県道銚子公園線⇔銚子ドーバーライン"));
        assertEquals("panorama dai karano choubou (genchi yori<-toho yaku 5 fun)", runner.run("パノラマ台からの眺望（現地より←徒歩約5分）"));
        assertEquals("komachi->(kyuu) kamakura", runner.run("小町→（旧）鎌倉"));
        assertEquals("kaisou=>unkou he", runner.run("回送⇒運行へ"));
        assertEquals("kaisou=>unyou", runner.run("回送⇒運用"));
        assertEquals("toukyuusen nakanobe eki houmen kaisatsuguchi kai<=>ho^mu kai", runner.run("東急線中延駅方面改札口階⇔ホーム階"));
        assertEquals("ehara eigyousho [han 01·han 02<magomeeki mae basu tei=>2 ban noriba basu tei he>]", runner.run("荏原営業所【反０１・反０２＜馬込駅前バス停⇒２番乗り場バス停へ＞】"));
        assertEquals("ehara eigyousho [han 01·han 02<shako=>shihatsu (2 ban noriba basu tei) he>]", runner.run("荏原営業所【反０１・反０２＜車庫⇒始発（２番乗り場バス停）へ＞】"));
        assertEquals("ehara eigyousho [i 01<fukuro shuuten=>ouro kiten (1 ban noriba basu tei) he>]", runner.run("荏原営業所【井０１＜復路終点⇒往路起点（１番乗り場バス停）へ＞】"));
        assertEquals("i 01[fukuro shuuten=>ouro kiten]", runner.run("井０１【復路終点⇒往路起点】"));
        assertEquals("ehara eigyousho [i 01<shako=>shihatsu (1 ban noriba basu tei) he>]", runner.run("荏原営業所【井０１＜車庫⇒始発（１番乗り場バス停）へ＞】"));
        assertEquals("i 01[shako=>shihatsu he]", runner.run("井０１【車庫⇒始発へ】"));
        assertEquals("ehara eigyousho [han 01·han 02/mori 02<shako=>shihatsu (3 ban noriba basu tei) he>]", runner.run("荏原営業所【反０１・反０２／森０２＜車庫⇒始発（３番乗り場バス停）へ＞】"));
        assertEquals("ehara eigyousho [han 01·han 02<nakanobe ekimae basu tei=>3 ban noriba basu tei he>]", runner.run("荏原営業所【反０１・反０２＜中延駅前バス停⇒３番乗り場バス停へ＞】"));
        assertEquals("suginamiku ritsu kyoudo hakubutsukan 560m->", runner.run("杉並区立郷土博物館560m→"));
        assertEquals("", runner.run("↓"));
        assertEquals("moto otafuku->tsunku no mise->", runner.run("元 おたふく→つんく♂の店→"));
        assertEquals("MILK LAND HOKKAIDO -> TOKYO", runner.run("MILK LAND HOKKAIDO → TOKYO"));
        assertEquals("fudou taira->", runner.run("不動平→"));
        assertEquals("sakai kawa genryuu iriguchi->", runner.run("境川源流入口→"));
        assertEquals("sakai kawa genryuu iriguchi<-", runner.run("境川源流入口←"));
        assertEquals("tsukuiko shiroyama kouen ogura tozan ko^su tozandou no iriguchi ha kochira->", runner.run("津久井湖城山公園 小倉登山コース 登山道の入り口は こちら→"));
        assertEquals("<-karou yashiki", runner.run("←家老屋敷"));
        assertEquals("mori no sute^ji->", runner.run("森のステージ→"));
        assertEquals("<-kashino kiyama shizenkouen 600m", runner.run("←かしの木山自然公園600m"));
        assertEquals("takara shiro bou hyuuga kusurishi <- iriguchi", runner.run("宝城坊 日向薬師 ← 入口"));
        assertEquals("ishi rou yama iriguchi->", runner.run("石老山入口→"));
        assertEquals("ita <- 1 jikan kei shin yama", runner.run("至 ← 1時間 景信山"));
        assertEquals("sanbonmatsu->", runner.run("三本松→"));
        assertEquals("kokudou 292 gou->soba ya houmen", runner.run("国道292号→そば屋方面"));
        assertEquals("->shigakougen houmen", runner.run("→志賀高原方面"));
        assertEquals("dappi kou chi->sora", runner.run("脱皮考　地→空"));
        assertEquals("oomizo shiroato", runner.run("↑大溝城跡"));
        assertEquals("tenshukaku iriguchi->", runner.run("天守閣入口→"));
        assertEquals("<-chi ran shiro", runner.run("←知覧城"));
        assertEquals("ya yama·koma hayashi<-->oomoto kouen·sanbashi", runner.run("弥山・駒ヶ林←→大元公園・桟橋"));
        assertEquals("ya yama 2.6km·koma hayashi<-->oomoto kouen 0.8km", runner.run("弥山 2.6km・駒ヶ林←→大元公園 0.8km"));
        assertEquals("ya yama·koma hayashi<-->oomoto kouen", runner.run("弥山・駒ヶ林←→大元公園"));
        assertEquals("ya yama·koma hayashi<-->oomoto kouen/->iwaya taishi", runner.run("弥山・駒ヶ林←→大元公園/→岩屋大師"));
        assertEquals("ro^puuei 0.7km<-->ya yama sanchou 0.3km", runner.run("ロープウェイ 0.7km←→弥山山頂 0.3km"));
        assertEquals("ya yama tozan<-->oomoto kouen·iwaya taishi/->koma hayashi", runner.run("弥山登山←→大元公園・岩屋大師/→駒ヶ林"));
        assertEquals("ya yama tozan<-->dai hijiri in", runner.run("弥山登山←→大聖院"));
        assertEquals("ya yama sanchou 0.6km<-->oomoto sono chi 2.0/miyajima suizokukan 2.0km", runner.run("弥山山頂 0.6km←→大元園地 2.0/宮島水族館 2.0km"));
        assertEquals("ya yama tenboudai 0.6km<-->koma hayashi/oomoto kouen 2.8km", runner.run("弥山展望台 0.6km←→駒ヶ林/大元公園 2.8km"));
        assertEquals("ro^puuei 0.3km<-->ya yama sanchou 0.7km", runner.run("ロープウェイ 0.3km←→弥山山頂 0.7km"));
        assertEquals("kouyou tani sono chi 1.7km<-->ya yama sanchou 0.8km", runner.run("紅葉谷園地 1.7km←→弥山山頂 0.8km"));
        assertEquals("kouyou tani sono chi 1.5km<-->ya yama sanchou 1.0km", runner.run("紅葉谷園地 1.5km←→弥山山頂 1.0km"));
        assertEquals("kouyou tani sono chi 1.6km<-->ya yama sanchou 0.9km", runner.run("紅葉谷園地 1.6km←→弥山山頂 0.9km"));
        assertEquals("kouyou tani sono chi 1.4km<-->ya yama sanchou 1.1km", runner.run("紅葉谷園地 1.4km←→弥山山頂 1.1km"));
        assertEquals("kouyou tani sono chi 1.3km<-->ya yama sanchou 1.2km", runner.run("紅葉谷園地 1.3km←→弥山山頂 1.2km"));
        assertEquals("kouyou tani sono chi 1.2km<-->ya yama sanchou 1.3km", runner.run("紅葉谷園地 1.2km←→弥山山頂 1.3km"));
        assertEquals("kouyou tani sono chi 1.1km<-->ya yama sanchou 1.4km", runner.run("紅葉谷園地 1.1km←→弥山山頂 1.4km"));
        assertEquals("ya yama sanchou 1.5km<-->kouyou tani 1.0km", runner.run("弥山山頂 1.5km←→紅葉谷 1.0km"));
        assertEquals("ya yama tozan 1.8km<-->dai hijiri in 0.7km", runner.run("弥山登山 1.8km←→大聖院 0.7km"));
        assertEquals("ya yama tozandou (dai hijiri in ko^su)<-->dai hijiri in/shiroito no taki", runner.run("弥山登山道(大聖院コース)←→大聖院/白糸の滝"));
        assertEquals("kouyou tani 0.9km<-->ya yama sanchou 1.6km", runner.run("紅葉谷 0.9km←→弥山山頂 1.6km"));
        assertEquals("ya yama sanchou 1.7km<-->kouyou tani 0.8km", runner.run("弥山山頂 1.7km←→紅葉谷 0.8km"));
        assertEquals("kouyou tani 0.6km<-->ya yama sanchou 1.9km", runner.run("紅葉谷 0.6km←→弥山山頂 1.9km"));
        assertEquals("kouyou tani sono chi<-->ya yama sanchou 2.3km", runner.run("紅葉谷園地←→弥山山頂 2.3km"));
        assertEquals("shikoku kisen feri^ uno<=>miya ura (choku shima)", runner.run("四国汽船 フェリー　宇野⇔宮浦(直島)"));
        assertEquals("->shisou shi", runner.run("→宍粟市"));
        assertEquals("go chou ko michi", runner.run("五丁古道↖"));
        assertEquals("go chou ko michi", runner.run("五丁古道↙"));
        assertEquals("itchou", runner.run("↙一丁"));
        assertEquals("<-kannon yama no zekkei", runner.run("←観音山の絶景"));
        assertEquals("kouza no taki rokkuga^den->", runner.run("高座の滝 ロックガーデン→"));
        assertEquals("<-kai gezan iseki; shiroyama·kouza no taki->", runner.run("←会下山遺跡;城山・高座の滝→"));
        assertEquals("<-higashi ge^to hiroba annaijo", runner.run("←東ゲート広場案内所"));
        assertEquals("->kyuukeijo", runner.run("→休憩所"));
        assertEquals("soma tani", runner.run("↑杣谷"));
        assertEquals("myou gou iwa<-", runner.run("妙号岩←"));
        assertEquals("<-se yama ni mine (heitan michi ko^su)", runner.run("←背山二峯（平坦道コース）"));
        assertEquals("<-ryuu yuki watari i", runner.run("←龍之渡井"));
        assertEquals("<-haru hayashi ken ->ryuu yuki watari i", runner.run("←春林軒 →龍之渡井"));
        assertEquals("->buna hayashi", runner.run("→ブナ林"));
        assertEquals("go shuu kan baba->", runner.run("五拾間馬場→"));
        assertEquals("suiko tennou ryou sandou iriguchi 30m saki hidari->", runner.run("推古天皇陵参道入口 30m先左→"));
        assertEquals("shirami jizou", runner.run("↑しらみ地蔵"));
        assertEquals("->hama yashiki <-miya no mae toori", runner.run("→浜屋敷 ←宮の前通り"));
        assertEquals("hoshi no buranko", runner.run("↑星のブランコ"));
        assertEquals("->iwa fune jinja", runner.run("→磐船神社"));
        assertEquals("ryokka shokubutsu no mihon sono=>", runner.run("緑化植物の見本園⇒"));
        assertEquals("oosakafu nose machi<-->hyougoken kawanishi shi", runner.run("大阪府能勢町←→兵庫県川西市"));
        assertEquals("ko michi nagasaka michi <-sen soku ->sugi saka", runner.run("古道 長坂道 ←千束 →杉坂"));
        assertEquals("biwakohakubutsukan->", runner.run("琵琶湖博物館→"));
        assertEquals("<-kun omofu michi", runner.run("←君想ふ道"));
        assertEquals("tanigawa samurai kiyoshi kyuu taku tsugino shingou ->", runner.run("谷川士清 旧宅 次の信号 →"));
        assertEquals("tanigawa samurai kiyoshi kyuu taku 700m <- temae shingou", runner.run("谷川士清 旧宅 700m ← 手前信号"));
        assertEquals("->kaerimichi", runner.run("→帰り道"));
        assertEquals("miyaguchi isshoku (meitetsu basu) toyoda->nagoya", runner.run("宮口一色（名鉄バス）豊田→名古屋"));
        assertEquals("miyaguchi isshoku (meitetsu) nagoya->toyoda", runner.run("宮口一色（名鉄）名古屋→豊田"));
    }
}
