// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.nfkc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.NfkcTransform;


public class HalfwidthAndFullwidthFormsNfkcTest {
    /** The transform under test. */
    private final NfkcTransform transform = new NfkcTransform(UnicodeRange.HALFWIDTH_AND_FULLWIDTH_FORMS);

    @Test
    public void testMappedCharacters() {
        assertEquals("!", transform.action("！")); // FF01 FULLWIDTH EXCLAMATION MARK
        assertEquals("\"", transform.action("＂")); // FF02 FULLWIDTH QUOTATION MARK
        assertEquals("#", transform.action("＃")); // FF03 FULLWIDTH NUMBER SIGN
        assertEquals("$", transform.action("＄")); // FF04 FULLWIDTH DOLLAR SIGN
        assertEquals("%", transform.action("％")); // FF05 FULLWIDTH PERCENT SIGN
        assertEquals("&", transform.action("＆")); // FF06 FULLWIDTH AMPERSAND
        assertEquals("'", transform.action("＇")); // FF07 FULLWIDTH APOSTROPHE
        assertEquals("(", transform.action("（")); // FF08 FULLWIDTH LEFT PARENTHESIS
        assertEquals(")", transform.action("）")); // FF09 FULLWIDTH RIGHT PARENTHESIS
        assertEquals("*", transform.action("＊")); // FF0A FULLWIDTH ASTERISK
        assertEquals("+", transform.action("＋")); // FF0B FULLWIDTH PLUS SIGN
        assertEquals(",", transform.action("，")); // FF0C FULLWIDTH COMMA
        assertEquals("-", transform.action("－")); // FF0D FULLWIDTH HYPHEN-MINUS
        assertEquals(".", transform.action("．")); // FF0E FULLWIDTH FULL STOP
        assertEquals("/", transform.action("／")); // FF0F FULLWIDTH SOLIDUS
        assertEquals("0", transform.action("０")); // FF10 FULLWIDTH DIGIT ZERO
        assertEquals("1", transform.action("１")); // FF11 FULLWIDTH DIGIT ONE
        assertEquals("2", transform.action("２")); // FF12 FULLWIDTH DIGIT TWO
        assertEquals("3", transform.action("３")); // FF13 FULLWIDTH DIGIT THREE
        assertEquals("4", transform.action("４")); // FF14 FULLWIDTH DIGIT FOUR
        assertEquals("5", transform.action("５")); // FF15 FULLWIDTH DIGIT FIVE
        assertEquals("6", transform.action("６")); // FF16 FULLWIDTH DIGIT SIX
        assertEquals("7", transform.action("７")); // FF17 FULLWIDTH DIGIT SEVEN
        assertEquals("8", transform.action("８")); // FF18 FULLWIDTH DIGIT EIGHT
        assertEquals("9", transform.action("９")); // FF19 FULLWIDTH DIGIT NINE
        assertEquals(":", transform.action("：")); // FF1A FULLWIDTH COLON
        assertEquals(";", transform.action("；")); // FF1B FULLWIDTH SEMICOLON
        assertEquals("<", transform.action("＜")); // FF1C FULLWIDTH LESS-THAN SIGN
        assertEquals("=", transform.action("＝")); // FF1D FULLWIDTH EQUALS SIGN
        assertEquals(">", transform.action("＞")); // FF1E FULLWIDTH GREATER-THAN SIGN
        assertEquals("?", transform.action("？")); // FF1F FULLWIDTH QUESTION MARK
        assertEquals("@", transform.action("＠")); // FF20 FULLWIDTH COMMERCIAL AT
        assertEquals("A", transform.action("Ａ")); // FF21 FULLWIDTH LATIN CAPITAL LETTER A
        assertEquals("B", transform.action("Ｂ")); // FF22 FULLWIDTH LATIN CAPITAL LETTER B
        assertEquals("C", transform.action("Ｃ")); // FF23 FULLWIDTH LATIN CAPITAL LETTER C
        assertEquals("D", transform.action("Ｄ")); // FF24 FULLWIDTH LATIN CAPITAL LETTER D
        assertEquals("E", transform.action("Ｅ")); // FF25 FULLWIDTH LATIN CAPITAL LETTER E
        assertEquals("F", transform.action("Ｆ")); // FF26 FULLWIDTH LATIN CAPITAL LETTER F
        assertEquals("G", transform.action("Ｇ")); // FF27 FULLWIDTH LATIN CAPITAL LETTER G
        assertEquals("H", transform.action("Ｈ")); // FF28 FULLWIDTH LATIN CAPITAL LETTER H
        assertEquals("I", transform.action("Ｉ")); // FF29 FULLWIDTH LATIN CAPITAL LETTER I
        assertEquals("J", transform.action("Ｊ")); // FF2A FULLWIDTH LATIN CAPITAL LETTER J
        assertEquals("K", transform.action("Ｋ")); // FF2B FULLWIDTH LATIN CAPITAL LETTER K
        assertEquals("L", transform.action("Ｌ")); // FF2C FULLWIDTH LATIN CAPITAL LETTER L
        assertEquals("M", transform.action("Ｍ")); // FF2D FULLWIDTH LATIN CAPITAL LETTER M
        assertEquals("N", transform.action("Ｎ")); // FF2E FULLWIDTH LATIN CAPITAL LETTER N
        assertEquals("O", transform.action("Ｏ")); // FF2F FULLWIDTH LATIN CAPITAL LETTER O
        assertEquals("P", transform.action("Ｐ")); // FF30 FULLWIDTH LATIN CAPITAL LETTER P
        assertEquals("Q", transform.action("Ｑ")); // FF31 FULLWIDTH LATIN CAPITAL LETTER Q
        assertEquals("R", transform.action("Ｒ")); // FF32 FULLWIDTH LATIN CAPITAL LETTER R
        assertEquals("S", transform.action("Ｓ")); // FF33 FULLWIDTH LATIN CAPITAL LETTER S
        assertEquals("T", transform.action("Ｔ")); // FF34 FULLWIDTH LATIN CAPITAL LETTER T
        assertEquals("U", transform.action("Ｕ")); // FF35 FULLWIDTH LATIN CAPITAL LETTER U
        assertEquals("V", transform.action("Ｖ")); // FF36 FULLWIDTH LATIN CAPITAL LETTER V
        assertEquals("W", transform.action("Ｗ")); // FF37 FULLWIDTH LATIN CAPITAL LETTER W
        assertEquals("X", transform.action("Ｘ")); // FF38 FULLWIDTH LATIN CAPITAL LETTER X
        assertEquals("Y", transform.action("Ｙ")); // FF39 FULLWIDTH LATIN CAPITAL LETTER Y
        assertEquals("Z", transform.action("Ｚ")); // FF3A FULLWIDTH LATIN CAPITAL LETTER Z
        assertEquals("[", transform.action("［")); // FF3B FULLWIDTH LEFT SQUARE BRACKET
        assertEquals("\\", transform.action("＼")); // FF3C FULLWIDTH REVERSE SOLIDUS
        assertEquals("]", transform.action("］")); // FF3D FULLWIDTH RIGHT SQUARE BRACKET
        assertEquals("^", transform.action("＾")); // FF3E FULLWIDTH CIRCUMFLEX ACCENT
        assertEquals("_", transform.action("＿")); // FF3F FULLWIDTH LOW LINE
        assertEquals("`", transform.action("｀")); // FF40 FULLWIDTH GRAVE ACCENT
        assertEquals("a", transform.action("ａ")); // FF41 FULLWIDTH LATIN SMALL LETTER A
        assertEquals("b", transform.action("ｂ")); // FF42 FULLWIDTH LATIN SMALL LETTER B
        assertEquals("c", transform.action("ｃ")); // FF43 FULLWIDTH LATIN SMALL LETTER C
        assertEquals("d", transform.action("ｄ")); // FF44 FULLWIDTH LATIN SMALL LETTER D
        assertEquals("e", transform.action("ｅ")); // FF45 FULLWIDTH LATIN SMALL LETTER E
        assertEquals("f", transform.action("ｆ")); // FF46 FULLWIDTH LATIN SMALL LETTER F
        assertEquals("g", transform.action("ｇ")); // FF47 FULLWIDTH LATIN SMALL LETTER G
        assertEquals("h", transform.action("ｈ")); // FF48 FULLWIDTH LATIN SMALL LETTER H
        assertEquals("i", transform.action("ｉ")); // FF49 FULLWIDTH LATIN SMALL LETTER I
        assertEquals("j", transform.action("ｊ")); // FF4A FULLWIDTH LATIN SMALL LETTER J
        assertEquals("k", transform.action("ｋ")); // FF4B FULLWIDTH LATIN SMALL LETTER K
        assertEquals("l", transform.action("ｌ")); // FF4C FULLWIDTH LATIN SMALL LETTER L
        assertEquals("m", transform.action("ｍ")); // FF4D FULLWIDTH LATIN SMALL LETTER M
        assertEquals("n", transform.action("ｎ")); // FF4E FULLWIDTH LATIN SMALL LETTER N
        assertEquals("o", transform.action("ｏ")); // FF4F FULLWIDTH LATIN SMALL LETTER O
        assertEquals("p", transform.action("ｐ")); // FF50 FULLWIDTH LATIN SMALL LETTER P
        assertEquals("q", transform.action("ｑ")); // FF51 FULLWIDTH LATIN SMALL LETTER Q
        assertEquals("r", transform.action("ｒ")); // FF52 FULLWIDTH LATIN SMALL LETTER R
        assertEquals("s", transform.action("ｓ")); // FF53 FULLWIDTH LATIN SMALL LETTER S
        assertEquals("t", transform.action("ｔ")); // FF54 FULLWIDTH LATIN SMALL LETTER T
        assertEquals("u", transform.action("ｕ")); // FF55 FULLWIDTH LATIN SMALL LETTER U
        assertEquals("v", transform.action("ｖ")); // FF56 FULLWIDTH LATIN SMALL LETTER V
        assertEquals("w", transform.action("ｗ")); // FF57 FULLWIDTH LATIN SMALL LETTER W
        assertEquals("x", transform.action("ｘ")); // FF58 FULLWIDTH LATIN SMALL LETTER X
        assertEquals("y", transform.action("ｙ")); // FF59 FULLWIDTH LATIN SMALL LETTER Y
        assertEquals("z", transform.action("ｚ")); // FF5A FULLWIDTH LATIN SMALL LETTER Z
        assertEquals("{", transform.action("｛")); // FF5B FULLWIDTH LEFT CURLY BRACKET
        assertEquals("|", transform.action("｜")); // FF5C FULLWIDTH VERTICAL LINE
        assertEquals("}", transform.action("｝")); // FF5D FULLWIDTH RIGHT CURLY BRACKET
        assertEquals("~", transform.action("～")); // FF5E FULLWIDTH TILDE
        assertEquals("⦅", transform.action("｟")); // FF5F FULLWIDTH LEFT WHITE PARENTHESIS
        assertEquals("⦆", transform.action("｠")); // FF60 FULLWIDTH RIGHT WHITE PARENTHESIS
        assertEquals("。", transform.action("｡")); // FF61 HALFWIDTH IDEOGRAPHIC FULL STOP
        assertEquals("「", transform.action("｢")); // FF62 HALFWIDTH LEFT CORNER BRACKET
        assertEquals("」", transform.action("｣")); // FF63 HALFWIDTH RIGHT CORNER BRACKET
        assertEquals("、", transform.action("､")); // FF64 HALFWIDTH IDEOGRAPHIC COMMA
        assertEquals("・", transform.action("･")); // FF65 HALFWIDTH KATAKANA MIDDLE DOT
        assertEquals("ヲ", transform.action("ｦ")); // FF66 HALFWIDTH KATAKANA LETTER WO
        assertEquals("ァ", transform.action("ｧ")); // FF67 HALFWIDTH KATAKANA LETTER SMALL A
        assertEquals("ィ", transform.action("ｨ")); // FF68 HALFWIDTH KATAKANA LETTER SMALL I
        assertEquals("ゥ", transform.action("ｩ")); // FF69 HALFWIDTH KATAKANA LETTER SMALL U
        assertEquals("ェ", transform.action("ｪ")); // FF6A HALFWIDTH KATAKANA LETTER SMALL E
        assertEquals("ォ", transform.action("ｫ")); // FF6B HALFWIDTH KATAKANA LETTER SMALL O
        assertEquals("ャ", transform.action("ｬ")); // FF6C HALFWIDTH KATAKANA LETTER SMALL YA
        assertEquals("ュ", transform.action("ｭ")); // FF6D HALFWIDTH KATAKANA LETTER SMALL YU
        assertEquals("ョ", transform.action("ｮ")); // FF6E HALFWIDTH KATAKANA LETTER SMALL YO
        assertEquals("ッ", transform.action("ｯ")); // FF6F HALFWIDTH KATAKANA LETTER SMALL TU
        assertEquals("ー", transform.action("ｰ")); // FF70 HALFWIDTH KATAKANA-HIRAGANA PROLONGED SOUND MARK
        assertEquals("ア", transform.action("ｱ")); // FF71 HALFWIDTH KATAKANA LETTER A
        assertEquals("イ", transform.action("ｲ")); // FF72 HALFWIDTH KATAKANA LETTER I
        assertEquals("ウ", transform.action("ｳ")); // FF73 HALFWIDTH KATAKANA LETTER U
        assertEquals("エ", transform.action("ｴ")); // FF74 HALFWIDTH KATAKANA LETTER E
        assertEquals("オ", transform.action("ｵ")); // FF75 HALFWIDTH KATAKANA LETTER O
        assertEquals("カ", transform.action("ｶ")); // FF76 HALFWIDTH KATAKANA LETTER KA
        assertEquals("キ", transform.action("ｷ")); // FF77 HALFWIDTH KATAKANA LETTER KI
        assertEquals("ク", transform.action("ｸ")); // FF78 HALFWIDTH KATAKANA LETTER KU
        assertEquals("ケ", transform.action("ｹ")); // FF79 HALFWIDTH KATAKANA LETTER KE
        assertEquals("コ", transform.action("ｺ")); // FF7A HALFWIDTH KATAKANA LETTER KO
        assertEquals("サ", transform.action("ｻ")); // FF7B HALFWIDTH KATAKANA LETTER SA
        assertEquals("シ", transform.action("ｼ")); // FF7C HALFWIDTH KATAKANA LETTER SI
        assertEquals("ス", transform.action("ｽ")); // FF7D HALFWIDTH KATAKANA LETTER SU
        assertEquals("セ", transform.action("ｾ")); // FF7E HALFWIDTH KATAKANA LETTER SE
        assertEquals("ソ", transform.action("ｿ")); // FF7F HALFWIDTH KATAKANA LETTER SO
        assertEquals("タ", transform.action("ﾀ")); // FF80 HALFWIDTH KATAKANA LETTER TA
        assertEquals("チ", transform.action("ﾁ")); // FF81 HALFWIDTH KATAKANA LETTER TI
        assertEquals("ツ", transform.action("ﾂ")); // FF82 HALFWIDTH KATAKANA LETTER TU
        assertEquals("テ", transform.action("ﾃ")); // FF83 HALFWIDTH KATAKANA LETTER TE
        assertEquals("ト", transform.action("ﾄ")); // FF84 HALFWIDTH KATAKANA LETTER TO
        assertEquals("ナ", transform.action("ﾅ")); // FF85 HALFWIDTH KATAKANA LETTER NA
        assertEquals("ニ", transform.action("ﾆ")); // FF86 HALFWIDTH KATAKANA LETTER NI
        assertEquals("ヌ", transform.action("ﾇ")); // FF87 HALFWIDTH KATAKANA LETTER NU
        assertEquals("ネ", transform.action("ﾈ")); // FF88 HALFWIDTH KATAKANA LETTER NE
        assertEquals("ノ", transform.action("ﾉ")); // FF89 HALFWIDTH KATAKANA LETTER NO
        assertEquals("ハ", transform.action("ﾊ")); // FF8A HALFWIDTH KATAKANA LETTER HA
        assertEquals("ヒ", transform.action("ﾋ")); // FF8B HALFWIDTH KATAKANA LETTER HI
        assertEquals("フ", transform.action("ﾌ")); // FF8C HALFWIDTH KATAKANA LETTER HU
        assertEquals("ヘ", transform.action("ﾍ")); // FF8D HALFWIDTH KATAKANA LETTER HE
        assertEquals("ホ", transform.action("ﾎ")); // FF8E HALFWIDTH KATAKANA LETTER HO
        assertEquals("マ", transform.action("ﾏ")); // FF8F HALFWIDTH KATAKANA LETTER MA
        assertEquals("ミ", transform.action("ﾐ")); // FF90 HALFWIDTH KATAKANA LETTER MI
        assertEquals("ム", transform.action("ﾑ")); // FF91 HALFWIDTH KATAKANA LETTER MU
        assertEquals("メ", transform.action("ﾒ")); // FF92 HALFWIDTH KATAKANA LETTER ME
        assertEquals("モ", transform.action("ﾓ")); // FF93 HALFWIDTH KATAKANA LETTER MO
        assertEquals("ヤ", transform.action("ﾔ")); // FF94 HALFWIDTH KATAKANA LETTER YA
        assertEquals("ユ", transform.action("ﾕ")); // FF95 HALFWIDTH KATAKANA LETTER YU
        assertEquals("ヨ", transform.action("ﾖ")); // FF96 HALFWIDTH KATAKANA LETTER YO
        assertEquals("ラ", transform.action("ﾗ")); // FF97 HALFWIDTH KATAKANA LETTER RA
        assertEquals("リ", transform.action("ﾘ")); // FF98 HALFWIDTH KATAKANA LETTER RI
        assertEquals("ル", transform.action("ﾙ")); // FF99 HALFWIDTH KATAKANA LETTER RU
        assertEquals("レ", transform.action("ﾚ")); // FF9A HALFWIDTH KATAKANA LETTER RE
        assertEquals("ロ", transform.action("ﾛ")); // FF9B HALFWIDTH KATAKANA LETTER RO
        assertEquals("ワ", transform.action("ﾜ")); // FF9C HALFWIDTH KATAKANA LETTER WA
        assertEquals("ン", transform.action("ﾝ")); // FF9D HALFWIDTH KATAKANA LETTER N
        assertEquals("\u3099", transform.action("ﾞ")); // FF9E HALFWIDTH KATAKANA VOICED SOUND MARK
        assertEquals("\u309A", transform.action("ﾟ")); // FF9F HALFWIDTH KATAKANA SEMI-VOICED SOUND MARK
        assertEquals("ᅠ", transform.action("ﾠ")); // FFA0 HALFWIDTH HANGUL FILLER
        assertEquals("ᄀ", transform.action("ﾡ")); // FFA1 HALFWIDTH HANGUL LETTER KIYEOK
        assertEquals("ᄁ", transform.action("ﾢ")); // FFA2 HALFWIDTH HANGUL LETTER SSANGKIYEOK
        assertEquals("ᆪ", transform.action("ﾣ")); // FFA3 HALFWIDTH HANGUL LETTER KIYEOK-SIOS
        assertEquals("ᄂ", transform.action("ﾤ")); // FFA4 HALFWIDTH HANGUL LETTER NIEUN
        assertEquals("ᆬ", transform.action("ﾥ")); // FFA5 HALFWIDTH HANGUL LETTER NIEUN-CIEUC
        assertEquals("ᆭ", transform.action("ﾦ")); // FFA6 HALFWIDTH HANGUL LETTER NIEUN-HIEUH
        assertEquals("ᄃ", transform.action("ﾧ")); // FFA7 HALFWIDTH HANGUL LETTER TIKEUT
        assertEquals("ᄄ", transform.action("ﾨ")); // FFA8 HALFWIDTH HANGUL LETTER SSANGTIKEUT
        assertEquals("ᄅ", transform.action("ﾩ")); // FFA9 HALFWIDTH HANGUL LETTER RIEUL
        assertEquals("ᆰ", transform.action("ﾪ")); // FFAA HALFWIDTH HANGUL LETTER RIEUL-KIYEOK
        assertEquals("ᆱ", transform.action("ﾫ")); // FFAB HALFWIDTH HANGUL LETTER RIEUL-MIEUM
        assertEquals("ᆲ", transform.action("ﾬ")); // FFAC HALFWIDTH HANGUL LETTER RIEUL-PIEUP
        assertEquals("ᆳ", transform.action("ﾭ")); // FFAD HALFWIDTH HANGUL LETTER RIEUL-SIOS
        assertEquals("ᆴ", transform.action("ﾮ")); // FFAE HALFWIDTH HANGUL LETTER RIEUL-THIEUTH
        assertEquals("ᆵ", transform.action("ﾯ")); // FFAF HALFWIDTH HANGUL LETTER RIEUL-PHIEUPH
        assertEquals("ᄚ", transform.action("ﾰ")); // FFB0 HALFWIDTH HANGUL LETTER RIEUL-HIEUH
        assertEquals("ᄆ", transform.action("ﾱ")); // FFB1 HALFWIDTH HANGUL LETTER MIEUM
        assertEquals("ᄇ", transform.action("ﾲ")); // FFB2 HALFWIDTH HANGUL LETTER PIEUP
        assertEquals("ᄈ", transform.action("ﾳ")); // FFB3 HALFWIDTH HANGUL LETTER SSANGPIEUP
        assertEquals("ᄡ", transform.action("ﾴ")); // FFB4 HALFWIDTH HANGUL LETTER PIEUP-SIOS
        assertEquals("ᄉ", transform.action("ﾵ")); // FFB5 HALFWIDTH HANGUL LETTER SIOS
        assertEquals("ᄊ", transform.action("ﾶ")); // FFB6 HALFWIDTH HANGUL LETTER SSANGSIOS
        assertEquals("ᄋ", transform.action("ﾷ")); // FFB7 HALFWIDTH HANGUL LETTER IEUNG
        assertEquals("ᄌ", transform.action("ﾸ")); // FFB8 HALFWIDTH HANGUL LETTER CIEUC
        assertEquals("ᄍ", transform.action("ﾹ")); // FFB9 HALFWIDTH HANGUL LETTER SSANGCIEUC
        assertEquals("ᄎ", transform.action("ﾺ")); // FFBA HALFWIDTH HANGUL LETTER CHIEUCH
        assertEquals("ᄏ", transform.action("ﾻ")); // FFBB HALFWIDTH HANGUL LETTER KHIEUKH
        assertEquals("ᄐ", transform.action("ﾼ")); // FFBC HALFWIDTH HANGUL LETTER THIEUTH
        assertEquals("ᄑ", transform.action("ﾽ")); // FFBD HALFWIDTH HANGUL LETTER PHIEUPH
        assertEquals("ᄒ", transform.action("ﾾ")); // FFBE HALFWIDTH HANGUL LETTER HIEUH
        assertEquals("ᅡ", transform.action("ￂ")); // FFC2 HALFWIDTH HANGUL LETTER A
        assertEquals("ᅢ", transform.action("ￃ")); // FFC3 HALFWIDTH HANGUL LETTER AE
        assertEquals("ᅣ", transform.action("ￄ")); // FFC4 HALFWIDTH HANGUL LETTER YA
        assertEquals("ᅤ", transform.action("ￅ")); // FFC5 HALFWIDTH HANGUL LETTER YAE
        assertEquals("ᅥ", transform.action("ￆ")); // FFC6 HALFWIDTH HANGUL LETTER EO
        assertEquals("ᅦ", transform.action("ￇ")); // FFC7 HALFWIDTH HANGUL LETTER E
        assertEquals("ᅧ", transform.action("ￊ")); // FFCA HALFWIDTH HANGUL LETTER YEO
        assertEquals("ᅨ", transform.action("ￋ")); // FFCB HALFWIDTH HANGUL LETTER YE
        assertEquals("ᅩ", transform.action("ￌ")); // FFCC HALFWIDTH HANGUL LETTER O
        assertEquals("ᅪ", transform.action("ￍ")); // FFCD HALFWIDTH HANGUL LETTER WA
        assertEquals("ᅫ", transform.action("ￎ")); // FFCE HALFWIDTH HANGUL LETTER WAE
        assertEquals("ᅬ", transform.action("ￏ")); // FFCF HALFWIDTH HANGUL LETTER OE
        assertEquals("ᅭ", transform.action("ￒ")); // FFD2 HALFWIDTH HANGUL LETTER YO
        assertEquals("ᅮ", transform.action("ￓ")); // FFD3 HALFWIDTH HANGUL LETTER U
        assertEquals("ᅯ", transform.action("ￔ")); // FFD4 HALFWIDTH HANGUL LETTER WEO
        assertEquals("ᅰ", transform.action("ￕ")); // FFD5 HALFWIDTH HANGUL LETTER WE
        assertEquals("ᅱ", transform.action("ￖ")); // FFD6 HALFWIDTH HANGUL LETTER WI
        assertEquals("ᅲ", transform.action("ￗ")); // FFD7 HALFWIDTH HANGUL LETTER YU
        assertEquals("ᅳ", transform.action("ￚ")); // FFDA HALFWIDTH HANGUL LETTER EU
        assertEquals("ᅴ", transform.action("ￛ")); // FFDB HALFWIDTH HANGUL LETTER YI
        assertEquals("ᅵ", transform.action("ￜ")); // FFDC HALFWIDTH HANGUL LETTER I
        assertEquals("¢", transform.action("￠")); // FFE0 FULLWIDTH CENT SIGN
        assertEquals("£", transform.action("￡")); // FFE1 FULLWIDTH POUND SIGN
        assertEquals("¬", transform.action("￢")); // FFE2 FULLWIDTH NOT SIGN
        assertEquals(" \u0304", transform.action("￣")); // FFE3 FULLWIDTH MACRON
        assertEquals("¦", transform.action("￤")); // FFE4 FULLWIDTH BROKEN BAR
        assertEquals("¥", transform.action("￥")); // FFE5 FULLWIDTH YEN SIGN
        assertEquals("₩", transform.action("￦")); // FFE6 FULLWIDTH WON SIGN
        assertEquals("│", transform.action("￨")); // FFE8 HALFWIDTH FORMS LIGHT VERTICAL
        assertEquals("←", transform.action("￩")); // FFE9 HALFWIDTH LEFTWARDS ARROW
        assertEquals("↑", transform.action("￪")); // FFEA HALFWIDTH UPWARDS ARROW
        assertEquals("→", transform.action("￫")); // FFEB HALFWIDTH RIGHTWARDS ARROW
        assertEquals("↓", transform.action("￬")); // FFEC HALFWIDTH DOWNWARDS ARROW
        assertEquals("■", transform.action("￭")); // FFED HALFWIDTH BLACK SQUARE
        assertEquals("○", transform.action("￮")); // FFEE HALFWIDTH WHITE CIRCLE
    }


    @Test
    public void testUnmappedCharacters() {
        // Every assigned code point in this block has an NFKC compatibility mapping
    }
}
