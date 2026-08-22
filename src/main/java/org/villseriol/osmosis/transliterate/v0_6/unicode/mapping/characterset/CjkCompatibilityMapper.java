// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.utils.StringUtils;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/cjk-compatibility/
public class CjkCompatibilityMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the CJK Compatibility block
        rules.add(StringUtils.toIcuFilterRule(UnicodeRange.CJK_COMPATIBILITY));

        rules.add("㌀ > 'アパート';"); // 3300 SQUARE APAATO
        rules.add("㌁ > 'アルファ';"); // 3301 SQUARE ARUHUA
        rules.add("㌂ > 'アンペア';"); // 3302 SQUARE ANPEA
        rules.add("㌃ > 'アール';"); // 3303 SQUARE AARU
        rules.add("㌄ > 'イニング';"); // 3304 SQUARE ININGU
        rules.add("㌅ > 'インチ';"); // 3305 SQUARE INTI
        rules.add("㌆ > 'ウォン';"); // 3306 SQUARE UON
        rules.add("㌇ > 'エスクード';"); // 3307 SQUARE ESUKUUDO
        rules.add("㌈ > 'エーカー';"); // 3308 SQUARE EEKAA
        rules.add("㌉ > 'オンス';"); // 3309 SQUARE ONSU
        rules.add("㌊ > 'オーム';"); // 330A SQUARE OOMU
        rules.add("㌋ > 'カイリ';"); // 330B SQUARE KAIRI
        rules.add("㌌ > 'カラット';"); // 330C SQUARE KARATTO
        rules.add("㌍ > 'カロリー';"); // 330D SQUARE KARORII
        rules.add("㌎ > 'ガロン';"); // 330E SQUARE GARON
        rules.add("㌏ > 'ガンマ';"); // 330F SQUARE GANMA
        rules.add("㌐ > 'ギガ';"); // 3310 SQUARE GIGA
        rules.add("㌑ > 'ギニー';"); // 3311 SQUARE GINII
        rules.add("㌒ > 'キュリー';"); // 3312 SQUARE KYURII
        rules.add("㌓ > 'ギルダー';"); // 3313 SQUARE GIRUDAA
        rules.add("㌔ > 'キロ';"); // 3314 SQUARE KIRO
        rules.add("㌕ > 'キログラム';"); // 3315 SQUARE KIROGURAMU
        rules.add("㌖ > 'キロメートル';"); // 3316 SQUARE KIROMEETORU
        rules.add("㌗ > 'キロワット';"); // 3317 SQUARE KIROWATTO
        rules.add("㌘ > 'グラム';"); // 3318 SQUARE GURAMU
        rules.add("㌙ > 'グラムトン';"); // 3319 SQUARE GURAMUTON
        rules.add("㌚ > 'クルゼイロ';"); // 331A SQUARE KURUZEIRO
        rules.add("㌛ > 'クローネ';"); // 331B SQUARE KUROONE
        rules.add("㌜ > 'ケース';"); // 331C SQUARE KEESU
        rules.add("㌝ > 'コルナ';"); // 331D SQUARE KORUNA
        rules.add("㌞ > 'コーポ';"); // 331E SQUARE KOOPO
        rules.add("㌟ > 'サイクル';"); // 331F SQUARE SAIKURU
        rules.add("㌠ > 'サンチーム';"); // 3320 SQUARE SANTIIMU
        rules.add("㌡ > 'シリング';"); // 3321 SQUARE SIRINGU
        rules.add("㌢ > 'センチ';"); // 3322 SQUARE SENTI
        rules.add("㌣ > 'セント';"); // 3323 SQUARE SENTO
        rules.add("㌤ > 'ダース';"); // 3324 SQUARE DAASU
        rules.add("㌥ > 'デシ';"); // 3325 SQUARE DESI
        rules.add("㌦ > 'ドル';"); // 3326 SQUARE DORU
        rules.add("㌧ > 'トン';"); // 3327 SQUARE TON
        rules.add("㌨ > 'ナノ';"); // 3328 SQUARE NANO
        rules.add("㌩ > 'ノット';"); // 3329 SQUARE NOTTO
        rules.add("㌪ > 'ハイツ';"); // 332A SQUARE HAITU
        rules.add("㌫ > 'パーセント';"); // 332B SQUARE PAASENTO
        rules.add("㌬ > ' ';"); // 332C SQUARE PAATU
        rules.add("㌭ > 'バーレル';"); // 332D SQUARE BAARERU
        rules.add("㌮ > 'ピアストル';"); // 332E SQUARE PIASUTORU
        rules.add("㌯ > 'ピクル';"); // 332F SQUARE PIKURU
        rules.add("㌰ > 'ピコ';"); // 3330 SQUARE PIKO
        rules.add("㌱ > 'ビル';"); // 3331 SQUARE BIRU
        rules.add("㌲ > 'ファラッド';"); // 3332 SQUARE HUARADDO
        rules.add("㌳ > 'フィート';"); // 3333 SQUARE HUIITO
        rules.add("㌴ > 'ブッシェル';"); // 3334 SQUARE BUSSYERU
        rules.add("㌵ > 'フラン';"); // 3335 SQUARE HURAN
        rules.add("㌶ > 'ヘクタール';"); // 3336 SQUARE HEKUTAARU
        rules.add("㌷ > 'ペソ';"); // 3337 SQUARE PESO
        rules.add("㌸ > 'ペニヒ';"); // 3338 SQUARE PENIHI
        rules.add("㌹ > 'ヘルツ';"); // 3339 SQUARE HERUTU
        rules.add("㌺ > 'ペンス';"); // 333A SQUARE PENSU
        rules.add("㌻ > 'ページ';"); // 333B SQUARE PEEZI
        rules.add("㌼ > 'ベータ';"); // 333C SQUARE BEETA
        rules.add("㌽ > 'ポイント';"); // 333D SQUARE POINTO
        rules.add("㌾ > 'ボルト';"); // 333E SQUARE BORUTO
        rules.add("㌿ > 'ホン';"); // 333F SQUARE HON
        rules.add("㍀ > 'ポンド';"); // 3340 SQUARE PONDO
        rules.add("㍁ > 'ホール';"); // 3341 SQUARE HOORU
        rules.add("㍂ > 'ホーン';"); // 3342 SQUARE HOON
        rules.add("㍃ > 'マイクロ';"); // 3343 SQUARE MAIKURO
        rules.add("㍄ > 'マイル';"); // 3344 SQUARE MAIRU
        rules.add("㍅ > 'マッハ';"); // 3345 SQUARE MAHHA
        rules.add("㍆ > 'マルク';"); // 3346 SQUARE MARUKU
        rules.add("㍇ > 'マンション';"); // 3347 SQUARE MANSYON
        rules.add("㍈ > 'ミクロン';"); // 3348 SQUARE MIKURON
        rules.add("㍉ > 'ミリ';"); // 3349 SQUARE MIRI
        rules.add("㍊ > 'ミリバール';"); // 334A SQUARE MIRIBAARU
        rules.add("㍋ > 'メガ';"); // 334B SQUARE MEGA
        rules.add("㍌ > 'メガトン';"); // 334C SQUARE MEGATON
        rules.add("㍍ > 'メートル';"); // 334D SQUARE MEETORU
        rules.add("㍎ > 'ヤード';"); // 334E SQUARE YAADO
        rules.add("㍏ > 'ヤール';"); // 334F SQUARE YAARU
        rules.add("㍐ > 'ユアン';"); // 3350 SQUARE YUAN
        rules.add("㍑ > 'リットル';"); // 3351 SQUARE RITTORU
        rules.add("㍒ > 'リラ';"); // 3352 SQUARE RIRA
        rules.add("㍓ > 'ルピー';"); // 3353 SQUARE RUPII
        rules.add("㍔ > 'ルーブル';"); // 3354 SQUARE RUUBURU
        rules.add("㍕ > 'レム';"); // 3355 SQUARE REMU
        rules.add("㍖ > 'レントゲン';"); // 3356 SQUARE RENTOGEN
        rules.add("㍗ > 'ワット';"); // 3357 SQUARE WATTO
        rules.add("㍘ > '0点';"); // 3358 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // ZERO
        rules.add("㍙ > '1点';"); // 3359 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // ONE
        rules.add("㍚ > '2点';"); // 335A IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // TWO
        rules.add("㍛ > '3点';"); // 335B IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // THREE
        rules.add("㍜ > '4点';"); // 335C IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // FOUR
        rules.add("㍝ > '5点';"); // 335D IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // FIVE
        rules.add("㍞ > '6点';"); // 335E IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // SIX
        rules.add("㍟ > '7点';"); // 335F IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // SEVEN
        rules.add("㍠ > '8点';"); // 3360 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // EIGHT
        rules.add("㍡ > '9点';"); // 3361 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                // NINE
        rules.add("㍢ > '10点';"); // 3362 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // TEN
        rules.add("㍣ > '11点';"); // 3363 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // ELEVEN
        rules.add("㍤ > '12点';"); // 3364 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // TWELVE
        rules.add("㍥ > '13点';"); // 3365 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // THIRTEEN
        rules.add("㍦ > '14点';"); // 3366 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // FOURTEEN
        rules.add("㍧ > '15点';"); // 3367 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // FIFTEEN
        rules.add("㍨ > '16点';"); // 3368 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // SIXTEEN
        rules.add("㍩ > '17点';"); // 3369 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // SEVENTEEN
        rules.add("㍪ > '18点';"); // 336A IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // EIGHTEEN
        rules.add("㍫ > '19点';"); // 336B IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // NINETEEN
        rules.add("㍬ > '20点';"); // 336C IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // TWENTY
        rules.add("㍭ > '21点';"); // 336D IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // TWENTY-ONE
        rules.add("㍮ > '22点';"); // 336E IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // TWENTY-TWO
        rules.add("㍯ > '23点';"); // 336F IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // TWENTY-THREE
        rules.add("㍰ > '24点';"); // 3370 IDEOGRAPHIC TELEGRAPH SYMBOL FOR HOUR
                                 // TWENTY-FOUR
        rules.add("㍱ > 'hPa';"); // 3371 SQUARE HPA
        rules.add("㍲ > 'da';"); // 3372 SQUARE DA
        rules.add("㍳ > 'AU';"); // 3373 SQUARE AU
        rules.add("㍴ > 'bar';"); // 3374 SQUARE BAR
        rules.add("㍵ > 'oV';"); // 3375 SQUARE OV
        rules.add("㍶ > 'pc';"); // 3376 SQUARE PC
        rules.add("㍷ > 'dm';"); // 3377 SQUARE DM
        rules.add("㍸ > 'dm2';"); // 3378 SQUARE DM SQUARED
        rules.add("㍹ > 'dm3';"); // 3379 SQUARE DM CUBED
        rules.add("㍺ > 'IU';"); // 337A SQUARE IU
        rules.add("㍻ > '平成';"); // 337B SQUARE ERA NAME HEISEI
        rules.add("㍼ > '昭和';"); // 337C SQUARE ERA NAME SYOUWA
        rules.add("㍽ > '大正';"); // 337D SQUARE ERA NAME TAISYOU
        rules.add("㍾ > '明治';"); // 337E SQUARE ERA NAME MEIZI
        rules.add("㍿ > '株式会社';"); // 337F SQUARE CORPORATION
        rules.add("㎀ > 'pA';"); // 3380 SQUARE PA AMPS
        rules.add("㎁ > 'nA';"); // 3381 SQUARE NA
        rules.add("㎂ > 'uA';"); // 3382 SQUARE MU A
        rules.add("㎃ > 'mA';"); // 3383 SQUARE MA
        rules.add("㎄ > 'kA';"); // 3384 SQUARE KA
        rules.add("㎅ > 'KB';"); // 3385 SQUARE KB
        rules.add("㎆ > 'MB';"); // 3386 SQUARE MB
        rules.add("㎇ > 'GB';"); // 3387 SQUARE GB
        rules.add("㎈ > 'cal';"); // 3388 SQUARE CAL
        rules.add("㎉ > 'kcal';"); // 3389 SQUARE KCAL
        rules.add("㎊ > 'pF';"); // 338A SQUARE PF
        rules.add("㎋ > 'nF';"); // 338B SQUARE NF
        rules.add("㎌ > 'uF';"); // 338C SQUARE MU F
        rules.add("㎍ > 'ug';"); // 338D SQUARE MU G
        rules.add("㎎ > 'mg';"); // 338E SQUARE MG
        rules.add("㎏ > 'kg';"); // 338F SQUARE KG
        rules.add("㎐ > 'Hz';"); // 3390 SQUARE HZ
        rules.add("㎑ > 'kHz';"); // 3391 SQUARE KHZ
        rules.add("㎒ > 'MHz';"); // 3392 SQUARE MHZ
        rules.add("㎓ > 'GHz';"); // 3393 SQUARE GHZ
        rules.add("㎔ > 'THz';"); // 3394 SQUARE THZ
        rules.add("㎕ > 'ul';"); // 3395 SQUARE MU L
        rules.add("㎖ > 'ml';"); // 3396 SQUARE ML
        rules.add("㎗ > 'dl';"); // 3397 SQUARE DL
        rules.add("㎘ > 'kl';"); // 3398 SQUARE KL
        rules.add("㎙ > 'fm';"); // 3399 SQUARE FM
        rules.add("㎚ > 'nm';"); // 339A SQUARE NM
        rules.add("㎛ > 'um';"); // 339B SQUARE MU M
        rules.add("㎜ > 'mm';"); // 339C SQUARE MM
        rules.add("㎝ > 'cm';"); // 339D SQUARE CM
        rules.add("㎞ > 'km';"); // 339E SQUARE KM
        rules.add("㎟ > 'mm2';"); // 339F SQUARE MM SQUARED
        rules.add("㎠ > 'cm2';"); // 33A0 SQUARE CM SQUARED
        rules.add("㎡ > 'm2';"); // 33A1 SQUARE M SQUARED
        rules.add("㎢ > 'km2';"); // 33A2 SQUARE KM SQUARED
        rules.add("㎣ > 'mm3';"); // 33A3 SQUARE MM CUBED
        rules.add("㎤ > 'cm3';"); // 33A4 SQUARE CM CUBED
        rules.add("㎥ > 'm3';"); // 33A5 SQUARE M CUBED
        rules.add("㎦ > 'km3';"); // 33A6 SQUARE KM CUBED
        rules.add("㎧ > 'm/s';"); // 33A7 SQUARE M OVER S
        rules.add("㎨ > 'm/s2';"); // 33A8 SQUARE M OVER S SQUARED
        rules.add("㎩ > 'Pa';"); // 33A9 SQUARE PA
        rules.add("㎪ > 'kPa';"); // 33AA SQUARE KPA
        rules.add("㎫ > 'MPa';"); // 33AB SQUARE MPA
        rules.add("㎬ > 'GPa';"); // 33AC SQUARE GPA
        rules.add("㎭ > 'rad';"); // 33AD SQUARE RAD
        rules.add("㎮ > 'rad/s';"); // 33AE SQUARE RAD OVER S
        rules.add("㎯ > 'rad/s2';"); // 33AF SQUARE RAD OVER S SQUARED
        rules.add("㎰ > 'ps';"); // 33B0 SQUARE PS
        rules.add("㎱ > 'ns';"); // 33B1 SQUARE NS
        rules.add("㎲ > 'us';"); // 33B2 SQUARE MU S
        rules.add("㎳ > 'ms';"); // 33B3 SQUARE MS
        rules.add("㎴ > 'pV';"); // 33B4 SQUARE PV
        rules.add("㎵ > 'nV';"); // 33B5 SQUARE NV
        rules.add("㎶ > 'uV';"); // 33B6 SQUARE MU V
        rules.add("㎷ > 'mV';"); // 33B7 SQUARE MV
        rules.add("㎸ > 'kV';"); // 33B8 SQUARE KV
        rules.add("㎹ > 'MV';"); // 33B9 SQUARE MV MEGA
        rules.add("㎺ > 'pW';"); // 33BA SQUARE PW
        rules.add("㎻ > 'nW';"); // 33BB SQUARE NW
        rules.add("㎼ > 'uW';"); // 33BC SQUARE MU W
        rules.add("㎽ > 'mW';"); // 33BD SQUARE MW
        rules.add("㎾ > 'kW';"); // 33BE SQUARE KW
        rules.add("㎿ > 'MW';"); // 33BF SQUARE MW MEGA
        rules.add("㏀ > 'kohm';"); // 33C0 SQUARE K OHM
        rules.add("㏁ > 'Mohm';"); // 33C1 SQUARE M OHM
        rules.add("㏂ > 'a.m.';"); // 33C2 SQUARE AM
        rules.add("㏃ > 'Bq';"); // 33C3 SQUARE BQ
        rules.add("㏄ > 'cc';"); // 33C4 SQUARE CC
        rules.add("㏅ > 'cd';"); // 33C5 SQUARE CD
        rules.add("㏆ > 'C/kg';"); // 33C6 SQUARE C OVER KG
        rules.add("㏇ > 'Co.';"); // 33C7 SQUARE CO
        rules.add("㏈ > 'dB';"); // 33C8 SQUARE DB
        rules.add("㏉ > 'Gy';"); // 33C9 SQUARE GY
        rules.add("㏊ > 'ha';"); // 33CA SQUARE HA
        rules.add("㏋ > 'HP';"); // 33CB SQUARE HP
        rules.add("㏌ > 'in';"); // 33CC SQUARE IN
        rules.add("㏍ > 'KK';"); // 33CD SQUARE KK
        rules.add("㏎ > 'KM';"); // 33CE SQUARE KM CAPITAL
        rules.add("㏏ > 'kt';"); // 33CF SQUARE KT
        rules.add("㏐ > 'lm';"); // 33D0 SQUARE LM
        rules.add("㏑ > 'ln';"); // 33D1 SQUARE LN
        rules.add("㏒ > 'log';"); // 33D2 SQUARE LOG
        rules.add("㏓ > 'lx';"); // 33D3 SQUARE LX
        rules.add("㏔ > 'mb';"); // 33D4 SQUARE MB SMALL
        rules.add("㏕ > 'mil';"); // 33D5 SQUARE MIL
        rules.add("㏖ > 'mol';"); // 33D6 SQUARE MOL
        rules.add("㏗ > 'PH';"); // 33D7 SQUARE PH
        rules.add("㏘ > 'p.m.';"); // 33D8 SQUARE PM
        rules.add("㏙ > 'PPM';"); // 33D9 SQUARE PPM
        rules.add("㏚ > 'PR';"); // 33DA SQUARE PR
        rules.add("㏛ > 'sr';"); // 33DB SQUARE SR
        rules.add("㏜ > 'Sv';"); // 33DC SQUARE SV
        rules.add("㏝ > 'Wb';"); // 33DD SQUARE WB
        rules.add("㏞ > 'V/m';"); // 33DE SQUARE V OVER M
        rules.add("㏟ > 'A/m';"); // 33DF SQUARE A OVER M
        rules.add("㏠ > '1日';"); // 33E0 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY ONE
        rules.add("㏡ > '2日';"); // 33E1 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY TWO
        rules.add("㏢ > '3日';"); // 33E2 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                // THREE
        rules.add("㏣ > '4日';"); // 33E3 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                // FOUR
        rules.add("㏤ > '5日';"); // 33E4 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                // FIVE
        rules.add("㏥ > '6日';"); // 33E5 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY SIX
        rules.add("㏦ > '7日';"); // 33E6 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                // SEVEN
        rules.add("㏧ > '8日';"); // 33E7 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                // EIGHT
        rules.add("㏨ > '9日';"); // 33E8 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                // NINE
        rules.add("㏩ > '10日';"); // 33E9 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TEN
        rules.add("㏪ > '11日';"); // 33EA IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // ELEVEN
        rules.add("㏫ > '12日';"); // 33EB IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWELVE
        rules.add("㏬ > '13日';"); // 33EC IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // THIRTEEN
        rules.add("㏭ > '14日';"); // 33ED IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // FOURTEEN
        rules.add("㏮ > '15日';"); // 33EE IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // FIFTEEN
        rules.add("㏯ > '16日';"); // 33EF IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // SIXTEEN
        rules.add("㏰ > '17日';"); // 33F0 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // SEVENTEEN
        rules.add("㏱ > '18日';"); // 33F1 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // EIGHTEEN
        rules.add("㏲ > '19日';"); // 33F2 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // NINETEEN
        rules.add("㏳ > '20日';"); // 33F3 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY
        rules.add("㏴ > '21日';"); // 33F4 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY-ONE
        rules.add("㏵ > '22日';"); // 33F5 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY-TWO
        rules.add("㏶ > '23日';"); // 33F6 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY-THREE
        rules.add("㏷ > '24日';"); // 33F7 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY-FOUR
        rules.add("㏸ > '25日';"); // 33F8 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY-FIVE
        rules.add("㏹ > '26日';"); // 33F9 IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY-SIX
        rules.add("㏺ > '27日';"); // 33FA IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY-SEVEN
        rules.add("㏻ > '28日';"); // 33FB IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY-EIGHT
        rules.add("㏼ > '29日';"); // 33FC IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // TWENTY-NINE
        rules.add("㏽ > '30日';"); // 33FD IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // THIRTY
        rules.add("㏾ > '31日';"); // 33FE IDEOGRAPHIC TELEGRAPH SYMBOL FOR DAY
                                 // THIRTY-ONE
        rules.add("㏿ > 'gal';"); // 33FF SQUARE GAL

        TRANSLITERATOR = Transliterator.createFromRules("CjkCompatibility-Normalized", String.join("\n", rules),
                Transliterator.FORWARD);
    }

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
