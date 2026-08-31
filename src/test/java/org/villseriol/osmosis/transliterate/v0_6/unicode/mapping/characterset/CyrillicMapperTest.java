// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CyrillicMapperTest {

    private final CyrillicMapper transform = new CyrillicMapper();

    @Test
    public void testCyrillicSupplementUppercase() {
        assertEquals("E", transform.action("Ѐ"));
        assertEquals("E", transform.action("Ё"));
        assertEquals("D", transform.action("Ђ"));
        assertEquals("G", transform.action("Ѓ"));
        assertEquals("E", transform.action("Є"));
        assertEquals("Z", transform.action("Ѕ"));
        assertEquals("I", transform.action("І"));
        assertEquals("I", transform.action("Ї"));
        assertEquals("J", transform.action("Ј"));
        assertEquals("L", transform.action("Љ"));
        assertEquals("N", transform.action("Њ"));
        assertEquals("C", transform.action("Ћ"));
        assertEquals("K", transform.action("Ќ"));
        assertEquals("I", transform.action("Ѝ"));
        assertEquals("U", transform.action("Ў"));
        assertEquals("D", transform.action("Џ"));
    }


    @Test
    public void testBasicCyrillicUppercase() {
        assertEquals("A", transform.action("А"));
        assertEquals("B", transform.action("Б"));
        assertEquals("V", transform.action("В"));
        assertEquals("G", transform.action("Г"));
        assertEquals("D", transform.action("Д"));
        assertEquals("E", transform.action("Е"));
        assertEquals("Z", transform.action("Ж"));
        assertEquals("Z", transform.action("З"));
        assertEquals("I", transform.action("И"));
        assertEquals("J", transform.action("Й"));
        assertEquals("K", transform.action("К"));
        assertEquals("L", transform.action("Л"));
        assertEquals("M", transform.action("М"));
        assertEquals("N", transform.action("Н"));
        assertEquals("O", transform.action("О"));
        assertEquals("P", transform.action("П"));
        assertEquals("R", transform.action("Р"));
        assertEquals("S", transform.action("С"));
        assertEquals("T", transform.action("Т"));
        assertEquals("U", transform.action("У"));
        assertEquals("F", transform.action("Ф"));
        assertEquals("H", transform.action("Х"));
        assertEquals("C", transform.action("Ц"));
        assertEquals("C", transform.action("Ч"));
        assertEquals("S", transform.action("Ш"));
        assertEquals("S", transform.action("Щ"));
        assertEquals("\"̱", transform.action("Ъ"));
        assertEquals("Y", transform.action("Ы"));
        assertEquals("'̱", transform.action("Ь"));
        assertEquals("E", transform.action("Э"));
        assertEquals("U", transform.action("Ю"));
        assertEquals("A", transform.action("Я"));
    }


    @Test
    public void testBasicCyrillicLowercase() {
        assertEquals("a", transform.action("а"));
        assertEquals("b", transform.action("б"));
        assertEquals("v", transform.action("в"));
        assertEquals("g", transform.action("г"));
        assertEquals("d", transform.action("д"));
        assertEquals("e", transform.action("е"));
        assertEquals("z", transform.action("ж"));
        assertEquals("z", transform.action("з"));
        assertEquals("i", transform.action("и"));
        assertEquals("j", transform.action("й"));
        assertEquals("k", transform.action("к"));
        assertEquals("l", transform.action("л"));
        assertEquals("m", transform.action("м"));
        assertEquals("n", transform.action("н"));
        assertEquals("o", transform.action("о"));
        assertEquals("p", transform.action("п"));
        assertEquals("r", transform.action("р"));
        assertEquals("s", transform.action("с"));
        assertEquals("t", transform.action("т"));
        assertEquals("u", transform.action("у"));
        assertEquals("f", transform.action("ф"));
        assertEquals("h", transform.action("х"));
        assertEquals("c", transform.action("ц"));
        assertEquals("c", transform.action("ч"));
        assertEquals("s", transform.action("ш"));
        assertEquals("s", transform.action("щ"));
        assertEquals("\"", transform.action("ъ"));
        assertEquals("y", transform.action("ы"));
        assertEquals("'", transform.action("ь"));
        assertEquals("e", transform.action("э"));
        assertEquals("u", transform.action("ю"));
        assertEquals("a", transform.action("я"));
    }


    @Test
    public void testCyrillicSupplementLowercase() {
        assertEquals("e", transform.action("ѐ"));
        assertEquals("e", transform.action("ё"));
        assertEquals("d", transform.action("ђ"));
        assertEquals("g", transform.action("ѓ"));
        assertEquals("e", transform.action("є"));
        assertEquals("z", transform.action("ѕ"));
        assertEquals("i", transform.action("і"));
        assertEquals("i", transform.action("ї"));
        assertEquals("j", transform.action("ј"));
        assertEquals("l", transform.action("љ"));
        assertEquals("n", transform.action("њ"));
        assertEquals("c", transform.action("ћ"));
        assertEquals("k", transform.action("ќ"));
        assertEquals("i", transform.action("ѝ"));
        assertEquals("u", transform.action("ў"));
        assertEquals("d", transform.action("џ"));
    }


    @Test
    public void testExtendedCyrillicOldLetters() {
        assertEquals("Ѡ", transform.action("Ѡ"));
        assertEquals("ѡ", transform.action("ѡ"));
        assertEquals("Ѣ", transform.action("Ѣ"));
        assertEquals("ѣ", transform.action("ѣ"));
        assertEquals("Ѥ", transform.action("Ѥ"));
        assertEquals("ѥ", transform.action("ѥ"));
        assertEquals("Ѧ", transform.action("Ѧ"));
        assertEquals("ѧ", transform.action("ѧ"));
        assertEquals("Ѩ", transform.action("Ѩ"));
        assertEquals("ѩ", transform.action("ѩ"));
        assertEquals("Ѫ", transform.action("Ѫ"));
        assertEquals("ѫ", transform.action("ѫ"));
        assertEquals("Ѭ", transform.action("Ѭ"));
        assertEquals("ѭ", transform.action("ѭ"));
        assertEquals("Ѯ", transform.action("Ѯ"));
        assertEquals("ѯ", transform.action("ѯ"));
        assertEquals("Ѱ", transform.action("Ѱ"));
        assertEquals("ѱ", transform.action("ѱ"));
        assertEquals("Ѳ", transform.action("Ѳ"));
        assertEquals("ѳ", transform.action("ѳ"));
        assertEquals("Ѵ", transform.action("Ѵ"));
        assertEquals("ѵ", transform.action("ѵ"));
        assertEquals("Ѷ", transform.action("Ѷ"));
        assertEquals("ѷ", transform.action("ѷ"));
        assertEquals("Ѹ", transform.action("Ѹ"));
        assertEquals("ѹ", transform.action("ѹ"));
        assertEquals("Ѻ", transform.action("Ѻ"));
        assertEquals("ѻ", transform.action("ѻ"));
        assertEquals("Ѽ", transform.action("Ѽ"));
        assertEquals("ѽ", transform.action("ѽ"));
        assertEquals("Ѿ", transform.action("Ѿ"));
        assertEquals("ѿ", transform.action("ѿ"));
        assertEquals("Ҁ", transform.action("Ҁ"));
        assertEquals("ҁ", transform.action("ҁ"));
    }


    @Test
    public void testExtendedCyrillicCombiningMarks() {
        assertEquals("҂", transform.action("҂"));
        assertEquals("҃", transform.action("҃"));
        assertEquals("҄", transform.action("҄"));
        assertEquals("҅", transform.action("҅"));
        assertEquals("҆", transform.action("҆"));
        assertEquals("҇", transform.action("҇"));
        assertEquals("҈", transform.action("҈"));
        assertEquals("҉", transform.action("҉"));
    }


    @Test
    public void testExtendedCyrillicHistoricLettersOne() {
        assertEquals("Ҋ", transform.action("Ҋ"));
        assertEquals("ҋ", transform.action("ҋ"));
        assertEquals("Ҍ", transform.action("Ҍ"));
        assertEquals("ҍ", transform.action("ҍ"));
        assertEquals("Ҏ", transform.action("Ҏ"));
        assertEquals("ҏ", transform.action("ҏ"));
        assertEquals("G", transform.action("Ґ"));
        assertEquals("g", transform.action("ґ"));
        assertEquals("G", transform.action("Ғ"));
        assertEquals("g", transform.action("ғ"));
        assertEquals("G", transform.action("Ҕ"));
        assertEquals("g", transform.action("ҕ"));
        assertEquals("Җ", transform.action("Җ"));
        assertEquals("җ", transform.action("җ"));
        assertEquals("Z", transform.action("Ҙ"));
        assertEquals("z", transform.action("ҙ"));
        assertEquals("Kˌ", transform.action("Қ"));
        assertEquals("kˌ", transform.action("қ"));
        assertEquals("Ҝ", transform.action("Ҝ"));
        assertEquals("ҝ", transform.action("ҝ"));
        assertEquals("Ҟ", transform.action("Ҟ"));
        assertEquals("ҟ", transform.action("ҟ"));
        assertEquals("Ҡ", transform.action("Ҡ"));
        assertEquals("ҡ", transform.action("ҡ"));
        assertEquals("N", transform.action("Ң"));
        assertEquals("n", transform.action("ң"));
        assertEquals("Ҥ", transform.action("Ҥ"));
        assertEquals("ҥ", transform.action("ҥ"));
        assertEquals("Ҧ", transform.action("Ҧ"));
        assertEquals("ҧ", transform.action("ҧ"));
        assertEquals("Ҩ", transform.action("Ҩ"));
        assertEquals("ҩ", transform.action("ҩ"));
        assertEquals("Ҫ", transform.action("Ҫ"));
        assertEquals("ҫ", transform.action("ҫ"));
        assertEquals("Ҭ", transform.action("Ҭ"));
        assertEquals("ҭ", transform.action("ҭ"));
        assertEquals("U", transform.action("Ү"));
        assertEquals("u", transform.action("ү"));
    }


    @Test
    public void testExtendedCyrillicHistoricLettersTwo() {
        assertEquals("U", transform.action("Ұ"));
        assertEquals("u", transform.action("ұ"));
        assertEquals("Ҳ", transform.action("Ҳ"));
        assertEquals("ҳ", transform.action("ҳ"));
        assertEquals("Ҵ", transform.action("Ҵ"));
        assertEquals("ҵ", transform.action("ҵ"));
        assertEquals("Ҷ", transform.action("Ҷ"));
        assertEquals("ҷ", transform.action("ҷ"));
        assertEquals("Ҹ", transform.action("Ҹ"));
        assertEquals("ҹ", transform.action("ҹ"));
        assertEquals("H", transform.action("Һ"));
        assertEquals("h", transform.action("һ"));
        assertEquals("Ҽ", transform.action("Ҽ"));
        assertEquals("ҽ", transform.action("ҽ"));
        assertEquals("Ҿ", transform.action("Ҿ"));
        assertEquals("ҿ", transform.action("ҿ"));
        assertEquals("Ӏ", transform.action("Ӏ"));
        assertEquals("Z", transform.action("Ӂ"));
        assertEquals("z", transform.action("ӂ"));
        assertEquals("Ӄ", transform.action("Ӄ"));
        assertEquals("ӄ", transform.action("ӄ"));
        assertEquals("Ӆ", transform.action("Ӆ"));
        assertEquals("ӆ", transform.action("ӆ"));
        assertEquals("Ӈ", transform.action("Ӈ"));
        assertEquals("ӈ", transform.action("ӈ"));
        assertEquals("Ӊ", transform.action("Ӊ"));
        assertEquals("ӊ", transform.action("ӊ"));
        assertEquals("Ӌ", transform.action("Ӌ"));
        assertEquals("ӌ", transform.action("ӌ"));
        assertEquals("Ӎ", transform.action("Ӎ"));
        assertEquals("ӎ", transform.action("ӎ"));
        assertEquals("ӏ", transform.action("ӏ"));
    }


    @Test
    public void testExtendedCyrillicHistoricLettersThree() {
        assertEquals("A", transform.action("Ӑ"));
        assertEquals("a", transform.action("ӑ"));
        assertEquals("A", transform.action("Ӓ"));
        assertEquals("a", transform.action("ӓ"));
        assertEquals("AE", transform.action("Ӕ"));
        assertEquals("ae", transform.action("ӕ"));
        assertEquals("E", transform.action("Ӗ"));
        assertEquals("e", transform.action("ӗ"));
        assertEquals("Ə", transform.action("Ә"));
        assertEquals("ə", transform.action("ә"));
        assertEquals("Ə", transform.action("Ӛ"));
        assertEquals("ə", transform.action("ӛ"));
        assertEquals("Z", transform.action("Ӝ"));
        assertEquals("z", transform.action("ӝ"));
        assertEquals("Z", transform.action("Ӟ"));
        assertEquals("z", transform.action("ӟ"));
        assertEquals("Ӡ", transform.action("Ӡ"));
        assertEquals("ӡ", transform.action("ӡ"));
        assertEquals("I", transform.action("Ӣ"));
        assertEquals("i", transform.action("ӣ"));
        assertEquals("I", transform.action("Ӥ"));
        assertEquals("i", transform.action("ӥ"));
        assertEquals("O", transform.action("Ӧ"));
        assertEquals("o", transform.action("ӧ"));
        assertEquals("O", transform.action("Ө"));
        assertEquals("o", transform.action("ө"));
        assertEquals("O", transform.action("Ӫ"));
        assertEquals("o", transform.action("ӫ"));
        assertEquals("E", transform.action("Ӭ"));
        assertEquals("e", transform.action("ӭ"));
        assertEquals("U", transform.action("Ӯ"));
        assertEquals("u", transform.action("ӯ"));
        assertEquals("U", transform.action("Ӱ"));
        assertEquals("u", transform.action("ӱ"));
        assertEquals("U", transform.action("Ӳ"));
        assertEquals("u", transform.action("ӳ"));
        assertEquals("C", transform.action("Ӵ"));
        assertEquals("c", transform.action("ӵ"));
        assertEquals("Ӷ", transform.action("Ӷ"));
        assertEquals("ӷ", transform.action("ӷ"));
        assertEquals("Y", transform.action("Ӹ"));
        assertEquals("y", transform.action("ӹ"));
        assertEquals("Ӻ", transform.action("Ӻ"));
        assertEquals("ӻ", transform.action("ӻ"));
        assertEquals("Ӽ", transform.action("Ӽ"));
        assertEquals("ӽ", transform.action("ӽ"));
        assertEquals("Ӿ", transform.action("Ӿ"));
        assertEquals("ӿ", transform.action("ӿ"));
    }


    @Test
    public void testMixedInput() {
        assertEquals("Privet mir! Hello world", transform.action("Привет мир! Hello world"));
        assertEquals("Moskva 2026", transform.action("Москва 2026"));
    }
}
