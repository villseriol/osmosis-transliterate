// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.UnicodeRange;


public class ThaiMapperTest {

    private final ThaiMapper transform = new ThaiMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.THAI) {
                continue;
            }

            for (int codePoint = range.getLower(); codePoint <= range.getUpper(); codePoint++) {
                String input = new String(Character.toChars(codePoint));

                assertEquals(input, transform.action(input));
            }
        }
    }


    @Test
    public void testMappedCharacters() {
        assertEquals("k", transform.action("ก")); // THAI CHARACTER KO KAI
        assertEquals("kh", transform.action("ข")); // THAI CHARACTER KHO KHAI
        assertEquals("kh", transform.action("ฃ")); // THAI CHARACTER KHO KHUAT
        assertEquals("kh", transform.action("ค")); // THAI CHARACTER KHO KHWAI
        assertEquals("k'h", transform.action("ฅ")); // THAI CHARACTER KHO KHON
        assertEquals("kh", transform.action("ฆ")); // THAI CHARACTER KHO RAKHANG
        assertEquals("ng", transform.action("ง")); // THAI CHARACTER NGO NGU
        assertEquals("c", transform.action("จ")); // THAI CHARACTER CHO CHAN
        assertEquals("ch", transform.action("ฉ")); // THAI CHARACTER CHO CHING
        assertEquals("ch", transform.action("ช")); // THAI CHARACTER CHO CHANG
        assertEquals("s", transform.action("ซ")); // THAI CHARACTER SO SO
        assertEquals("ch", transform.action("ฌ")); // THAI CHARACTER CHO CHOE
        assertEquals("y", transform.action("ญ")); // THAI CHARACTER YO YING
        assertEquals("d", transform.action("ฎ")); // THAI CHARACTER DO CHADA
        assertEquals("t", transform.action("ฏ")); // THAI CHARACTER TO PATAK
        assertEquals("th", transform.action("ฐ")); // THAI CHARACTER THO THAN
        assertEquals("th", transform.action("ฑ")); // THAI CHARACTER THO
                                                   // NANGMONTHO
        assertEquals("t'h", transform.action("ฒ")); // THAI CHARACTER THO
                                                    // PHUTHAO
        assertEquals("n", transform.action("ณ")); // THAI CHARACTER NO NEN
        assertEquals("d", transform.action("ด")); // THAI CHARACTER DO DEK
        assertEquals("t", transform.action("ต")); // THAI CHARACTER TO TAO
        assertEquals("th", transform.action("ถ")); // THAI CHARACTER THO THUNG
        assertEquals("th", transform.action("ท")); // THAI CHARACTER THO THAHAN
        assertEquals("th", transform.action("ธ")); // THAI CHARACTER THO THONG
        assertEquals("n", transform.action("น")); // THAI CHARACTER NO NU
        assertEquals("b", transform.action("บ")); // THAI CHARACTER BO BAIMAI
        assertEquals("p", transform.action("ป")); // THAI CHARACTER PO PLA
        assertEquals("ph", transform.action("ผ")); // THAI CHARACTER PHO PHUNG
        assertEquals("f", transform.action("ฝ")); // THAI CHARACTER FO FA
        assertEquals("ph", transform.action("พ")); // THAI CHARACTER PHO PHAN
        assertEquals("f", transform.action("ฟ")); // THAI CHARACTER FO FAN
        assertEquals("ph", transform.action("ภ")); // THAI CHARACTER PHO SAMPHAO
        assertEquals("m", transform.action("ม")); // THAI CHARACTER MO MA
        assertEquals("y", transform.action("ย")); // THAI CHARACTER YO YAK
        assertEquals("r", transform.action("ร")); // THAI CHARACTER RO RUA
        assertEquals("v", transform.action("ฤ")); // THAI CHARACTER RU
        assertEquals("l", transform.action("ล")); // THAI CHARACTER LO LING
        assertEquals("l", transform.action("ฦ")); // THAI CHARACTER LU
        assertEquals("w", transform.action("ว")); // THAI CHARACTER WO WAEN
        assertEquals("s", transform.action("ศ")); // THAI CHARACTER SO SALA
        assertEquals("s'", transform.action("ษ")); // THAI CHARACTER SO RUSI
        assertEquals("s", transform.action("ส")); // THAI CHARACTER SO SUA
        assertEquals("h", transform.action("ห")); // THAI CHARACTER HO HIP
        assertEquals("l", transform.action("ฬ")); // THAI CHARACTER LO CHULA
        assertEquals("x", transform.action("อ")); // THAI CHARACTER O ANG
        assertEquals("h", transform.action("ฮ")); // THAI CHARACTER HO NOKHUK
        assertEquals("‡", transform.action("ฯ")); // THAI CHARACTER PAIYANNOI
        assertEquals("a", transform.action("ะ")); // THAI CHARACTER SARA A
        assertEquals("a", transform.action("ั")); // THAI CHARACTER MAI HAN-AKAT
        assertEquals("a", transform.action("า")); // THAI CHARACTER SARA AA
        assertEquals("a", transform.action("ำ")); // THAI CHARACTER SARA AM
        assertEquals("i", transform.action("ิ")); // THAI CHARACTER SARA I
        assertEquals("i", transform.action("ี")); // THAI CHARACTER SARA II
        assertEquals("u", transform.action("ึ")); // THAI CHARACTER SARA UE
        assertEquals("u", transform.action("ื")); // THAI CHARACTER SARA UEE
        assertEquals("u", transform.action("ุ")); // THAI CHARACTER SARA U
        assertEquals("u", transform.action("ู")); // THAI CHARACTER SARA UU
        assertEquals("ˌ", transform.action("ฺ")); // THAI CHARACTER PHINTHU
        assertEquals("e", transform.action("เ")); // THAI CHARACTER SARA E
        assertEquals("ae", transform.action("แ")); // THAI CHARACTER SARA AE
        assertEquals("o", transform.action("โ")); // THAI CHARACTER SARA O
        assertEquals("i", transform.action("ใ")); // THAI CHARACTER SARA AI
                                                  // MAIMUAN
        assertEquals("i", transform.action("ไ")); // THAI CHARACTER SARA AI
                                                  // MAIMALAI
        assertEquals("i", transform.action("ๅ")); // THAI CHARACTER LAKKHANGYAO
        assertEquals("<<", transform.action("ๆ")); // THAI CHARACTER MAIYAMOK
        assertEquals("̆", transform.action("็")); // THAI CHARACTER MAITAIKHU
        assertEquals("̀", transform.action("่")); // THAI CHARACTER MAI EK
        assertEquals("̂", transform.action("้")); // THAI CHARACTER MAI THO
        assertEquals("́", transform.action("๊")); // THAI CHARACTER MAI TRI
        assertEquals("̌", transform.action("๋")); // THAI CHARACTER MAI CHATTAWA
        assertEquals("̒", transform.action("์")); // THAI CHARACTER THANTHAKHAT
        assertEquals("̊", transform.action("ํ")); // THAI CHARACTER NIKHAHIT
        assertEquals("~", transform.action("๎")); // THAI CHARACTER YAMAKKAN
        assertEquals("§", transform.action("๏")); // THAI CHARACTER FONGMAN
        assertEquals("0", transform.action("๐")); // THAI DIGIT ZERO
        assertEquals("1", transform.action("๑")); // THAI DIGIT ONE
        assertEquals("2", transform.action("๒")); // THAI DIGIT TWO
        assertEquals("3", transform.action("๓")); // THAI DIGIT THREE
        assertEquals("4", transform.action("๔")); // THAI DIGIT FOUR
        assertEquals("5", transform.action("๕")); // THAI DIGIT FIVE
        assertEquals("6", transform.action("๖")); // THAI DIGIT SIX
        assertEquals("7", transform.action("๗")); // THAI DIGIT SEVEN
        assertEquals("8", transform.action("๘")); // THAI DIGIT EIGHT
        assertEquals("9", transform.action("๙")); // THAI DIGIT NINE
        assertEquals("||", transform.action("๚")); // THAI CHARACTER ANGKHANKHU
        assertEquals(">>", transform.action("๛")); // THAI CHARACTER KHOMUT
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("฿", transform.action("฿")); // THAI CURRENCY SYMBOL BAHT
    }


    @Test
    public void testMixedInput() {
        assertEquals("swasdi Hello world 2026", transform.action("สวัสดี Hello world 2026"));
        assertEquals("krungthephmhankhr", transform.action("กรุงเทพมหานคร"));
    }
}
