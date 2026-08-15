// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.unicode.transform;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/halfwidth-and-fullwidth-forms/
public class HalfWidthFullWidthTransform implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("::[\\uFF01-\\uFF9F\\uFFE0-\\uFFEE];");

        // Fullwidth ASCII punctuation
        rules.add("！ > '!';"); // FF01 FULLWIDTH EXCLAMATION MARK
        rules.add("＂ > '\"';"); // FF02 FULLWIDTH QUOTATION MARK
        rules.add("＃ > '#';"); // FF03 FULLWIDTH NUMBER SIGN
        rules.add("＄ > '$';"); // FF04 FULLWIDTH DOLLAR SIGN
        rules.add("％ > '%';"); // FF05 FULLWIDTH PERCENT SIGN
        rules.add("＆ > '&';"); // FF06 FULLWIDTH AMPERSAND
        rules.add("＇ > '';"); // FF07 FULLWIDTH APOSTROPHE (doubled '' = literal
                              // ')
        rules.add("（ > '(';"); // FF08 FULLWIDTH LEFT PARENTHESIS
        rules.add("） > ')';"); // FF09 FULLWIDTH RIGHT PARENTHESIS
        rules.add("＊ > '*';"); // FF0A FULLWIDTH ASTERISK
        rules.add("＋ > '+';"); // FF0B FULLWIDTH PLUS SIGN
        rules.add("， > ',';"); // FF0C FULLWIDTH COMMA
        rules.add("－ > 'ー';"); // FF0D FULLWIDTH HYPHEN-MINUS
        rules.add("． > '.';"); // FF0E FULLWIDTH FULL STOP
        rules.add("／ > '/';"); // FF0F FULLWIDTH SOLIDUS

        // Fullwidth digits
        rules.add("０ > '0';"); // FF10
        rules.add("１ > '1';"); // FF11
        rules.add("２ > '2';"); // FF12
        rules.add("３ > '3';"); // FF13
        rules.add("４ > '4';"); // FF14
        rules.add("５ > '5';"); // FF15
        rules.add("６ > '6';"); // FF16
        rules.add("７ > '7';"); // FF17
        rules.add("８ > '8';"); // FF18
        rules.add("９ > '9';"); // FF19

        // Fullwidth punctuation continued
        rules.add("： > ':';"); // FF1A FULLWIDTH COLON
        rules.add("； > ';';"); // FF1B FULLWIDTH SEMICOLON
        rules.add("＜ > '<';"); // FF1C FULLWIDTH LESS-THAN SIGN
        rules.add("＝ > '=';"); // FF1D FULLWIDTH EQUALS SIGN
        rules.add("＞ > '>';"); // FF1E FULLWIDTH GREATER-THAN SIGN
        rules.add("？ > '?';"); // FF1F FULLWIDTH QUESTION MARK
        rules.add("＠ > '@';"); // FF20 FULLWIDTH COMMERCIAL AT

        // Fullwidth uppercase Latin letters
        rules.add("Ａ > 'A';"); // FF21
        rules.add("Ｂ > 'B';"); // FF22
        rules.add("Ｃ > 'C';"); // FF23
        rules.add("Ｄ > 'D';"); // FF24
        rules.add("Ｅ > 'E';"); // FF25
        rules.add("Ｆ > 'F';"); // FF26
        rules.add("Ｇ > 'G';"); // FF27
        rules.add("Ｈ > 'H';"); // FF28
        rules.add("Ｉ > 'I';"); // FF29
        rules.add("Ｊ > 'J';"); // FF2A
        rules.add("Ｋ > 'K';"); // FF2B
        rules.add("Ｌ > 'L';"); // FF2C
        rules.add("Ｍ > 'M';"); // FF2D
        rules.add("Ｎ > 'N';"); // FF2E
        rules.add("Ｏ > 'O';"); // FF2F
        rules.add("Ｐ > 'P';"); // FF30
        rules.add("Ｑ > 'Q';"); // FF31
        rules.add("Ｒ > 'R';"); // FF32
        rules.add("Ｓ > 'S';"); // FF33
        rules.add("Ｔ > 'T';"); // FF34
        rules.add("Ｕ > 'U';"); // FF35
        rules.add("Ｖ > 'V';"); // FF36
        rules.add("Ｗ > 'W';"); // FF37
        rules.add("Ｘ > 'X';"); // FF38
        rules.add("Ｙ > 'Y';"); // FF39
        rules.add("Ｚ > 'Z';"); // FF3A

        // Fullwidth punctuation continued
        rules.add("［ > '[';"); // FF3B FULLWIDTH LEFT SQUARE BRACKET
        rules.add("＼ > '\\';"); // FF3C FULLWIDTH REVERSE SOLIDUS
        rules.add("］ > ']';"); // FF3D FULLWIDTH RIGHT SQUARE BRACKET
        rules.add("＾ > '^';"); // FF3E FULLWIDTH CIRCUMFLEX ACCENT
        rules.add("＿ > '_';"); // FF3F FULLWIDTH LOW LINE
        rules.add("｀ > '`';"); // FF40 FULLWIDTH GRAVE ACCENT

        // Fullwidth lowercase Latin letters
        rules.add("ａ > 'a';"); // FF41
        rules.add("ｂ > 'b';"); // FF42
        rules.add("ｃ > 'c';"); // FF43
        rules.add("ｄ > 'd';"); // FF44
        rules.add("ｅ > 'e';"); // FF45
        rules.add("ｆ > 'f';"); // FF46
        rules.add("ｇ > 'g';"); // FF47
        rules.add("ｈ > 'h';"); // FF48
        rules.add("ｉ > 'i';"); // FF49
        rules.add("ｊ > 'j';"); // FF4A
        rules.add("ｋ > 'k';"); // FF4B
        rules.add("ｌ > 'l';"); // FF4C
        rules.add("ｍ > 'm';"); // FF4D
        rules.add("ｎ > 'n';"); // FF4E
        rules.add("ｏ > 'o';"); // FF4F
        rules.add("ｐ > 'p';"); // FF50
        rules.add("ｑ > 'q';"); // FF51
        rules.add("ｒ > 'r';"); // FF52
        rules.add("ｓ > 's';"); // FF53
        rules.add("ｔ > 't';"); // FF54
        rules.add("ｕ > 'u';"); // FF55
        rules.add("ｖ > 'v';"); // FF56
        rules.add("ｗ > 'w';"); // FF57
        rules.add("ｘ > 'x';"); // FF58
        rules.add("ｙ > 'y';"); // FF59
        rules.add("ｚ > 'z';"); // FF5A

        // Fullwidth punctuation continued
        rules.add("｛ > '{';"); // FF5B FULLWIDTH LEFT CURLY BRACKET
        rules.add("｜ > '|';"); // FF5C FULLWIDTH VERTICAL LINE
        rules.add("｝ > '}';"); // FF5D FULLWIDTH RIGHT CURLY BRACKET
        rules.add("～ > '~';"); // FF5E FULLWIDTH TILDE

        // Fullwidth white parentheses
        rules.add("｟ > '((';"); // FF5F FULLWIDTH LEFT WHITE PARENTHESIS
        rules.add("｠ > '))';"); // FF60 FULLWIDTH RIGHT WHITE PARENTHESIS

        // Halfwidth CJK punctuation
        rules.add("｡ > '。';"); // FF61 HALFWIDTH IDEOGRAPHIC FULL STOP
        rules.add("｢ > '[';"); // FF62 HALFWIDTH LEFT CORNER BRACKET
        rules.add("｣ > ']';"); // FF63 HALFWIDTH RIGHT CORNER BRACKET
        rules.add("､ > ',';"); // FF64 HALFWIDTH IDEOGRAPHIC COMMA

        rules.add("･ > '・';"); // FF65 HALFWIDTH KATAKANA MIDDLE DOT -> ・

        // FF66–FF9D + FF9E/FF9F combined: halfwidth katakana +
        // dakuten/handakuten
        // -> single fullwidth voiced katakana equivalent.
        // ICU longest-match semantics mean these 2-char rules win over the
        // single-char base rules above automatically, regardless of list order.

        // Dakuten (voiced sound mark, ﾞ)
        rules.add("ｶﾞ > 'ガ';"); // KA + dakuten -> GA
        rules.add("ｷﾞ > 'ギ';"); // KI + dakuten -> GI
        rules.add("ｸﾞ > 'グ';"); // KU + dakuten -> GU
        rules.add("ｹﾞ > 'ゲ';"); // KE + dakuten -> GE
        rules.add("ｺﾞ > 'ゴ';"); // KO + dakuten -> GO
        rules.add("ｻﾞ > 'ザ';"); // SA + dakuten -> ZA
        rules.add("ｼﾞ > 'ジ';"); // SHI + dakuten -> JI
        rules.add("ｽﾞ > 'ズ';"); // SU + dakuten -> ZU
        rules.add("ｾﾞ > 'ゼ';"); // SE + dakuten -> ZE
        rules.add("ｿﾞ > 'ゾ';"); // SO + dakuten -> ZO
        rules.add("ﾀﾞ > 'ダ';"); // TA + dakuten -> DA
        rules.add("ﾁﾞ > 'ヂ';"); // CHI + dakuten -> DI
        rules.add("ﾂﾞ > 'ヅ';"); // TSU + dakuten -> DU
        rules.add("ﾃﾞ > 'デ';"); // TE + dakuten -> DE
        rules.add("ﾄﾞ > 'ド';"); // TO + dakuten -> DO
        rules.add("ﾊﾞ > 'バ';"); // HA + dakuten -> BA
        rules.add("ﾋﾞ > 'ビ';"); // HI + dakuten -> BI
        rules.add("ﾌﾞ > 'ブ';"); // FU + dakuten -> BU
        rules.add("ﾍﾞ > 'ベ';"); // HE + dakuten -> BE
        rules.add("ﾎﾞ > 'ボ';"); // HO + dakuten -> BO
        rules.add("ｳﾞ > 'ヴ';"); // U + dakuten -> VU

        // Handakuten (semi-voiced sound mark, ﾟ) — only applies to the H-row
        rules.add("ﾊﾟ > 'パ';"); // HA + handakuten -> PA
        rules.add("ﾋﾟ > 'ピ';"); // HI + handakuten -> PI
        rules.add("ﾌﾟ > 'プ';"); // FU + handakuten -> PU
        rules.add("ﾍﾟ > 'ペ';"); // HE + handakuten -> PE
        rules.add("ﾎﾟ > 'ポ';"); // HO + handakuten -> PO

        // FF66–FF9D (halfwidth katakana): map to fullwidth (standard) katakana
        // equivalent
        rules.add("ｦ > 'ヲ';"); // FF66 -> 30F2 KATAKANA LETTER WO
        rules.add("ｧ > 'ァ';"); // FF67 -> 30A1 KATAKANA LETTER SMALL A
        rules.add("ｨ > 'ィ';"); // FF68 -> 30A3 KATAKANA LETTER SMALL I
        rules.add("ｩ > 'ゥ';"); // FF69 -> 30A5 KATAKANA LETTER SMALL U
        rules.add("ｪ > 'ェ';"); // FF6A -> 30A7 KATAKANA LETTER SMALL E
        rules.add("ｫ > 'ォ';"); // FF6B -> 30A9 KATAKANA LETTER SMALL O
        rules.add("ｬ > 'ャ';"); // FF6C -> 30E3 KATAKANA LETTER SMALL YA
        rules.add("ｭ > 'ュ';"); // FF6D -> 30E5 KATAKANA LETTER SMALL YU
        rules.add("ｮ > 'ョ';"); // FF6E -> 30E7 KATAKANA LETTER SMALL YO
        rules.add("ｯ > 'ッ';"); // FF6F -> 30C3 KATAKANA LETTER SMALL TU
        rules.add("ｰ > 'ー';"); // FF70 -> 30FC KATAKANA-HIRAGANA PROLONGED SOUND
                               // MARK
        rules.add("ｱ > 'ア';"); // FF71 -> 30A2 KATAKANA LETTER A
        rules.add("ｲ > 'イ';"); // FF72 -> 30A4 KATAKANA LETTER I
        rules.add("ｳ > 'ウ';"); // FF73 -> 30A6 KATAKANA LETTER U
        rules.add("ｴ > 'エ';"); // FF74 -> 30A8 KATAKANA LETTER E
        rules.add("ｵ > 'オ';"); // FF75 -> 30AA KATAKANA LETTER O
        rules.add("ｶ > 'カ';"); // FF76 -> 30AB KATAKANA LETTER KA
        rules.add("ｷ > 'キ';"); // FF77 -> 30AD KATAKANA LETTER KI
        rules.add("ｸ > 'ク';"); // FF78 -> 30AF KATAKANA LETTER KU
        rules.add("ｹ > 'ケ';"); // FF79 -> 30B1 KATAKANA LETTER KE
        rules.add("ｺ > 'コ';"); // FF7A -> 30B3 KATAKANA LETTER KO
        rules.add("ｻ > 'サ';"); // FF7B -> 30B5 KATAKANA LETTER SA
        rules.add("ｼ > 'シ';"); // FF7C -> 30B7 KATAKANA LETTER SI
        rules.add("ｽ > 'ス';"); // FF7D -> 30B9 KATAKANA LETTER SU
        rules.add("ｾ > 'セ';"); // FF7E -> 30BB KATAKANA LETTER SE
        rules.add("ｿ > 'ソ';"); // FF7F -> 30BD KATAKANA LETTER SO
        rules.add("ﾀ > 'タ';"); // FF80 -> 30BF KATAKANA LETTER TA
        rules.add("ﾁ > 'チ';"); // FF81 -> 30C1 KATAKANA LETTER TI
        rules.add("ﾂ > 'ツ';"); // FF82 -> 30C4 KATAKANA LETTER TU
        rules.add("ﾃ > 'テ';"); // FF83 -> 30C6 KATAKANA LETTER TE
        rules.add("ﾄ > 'ト';"); // FF84 -> 30C8 KATAKANA LETTER TO
        rules.add("ﾅ > 'ナ';"); // FF85 -> 30CA KATAKANA LETTER NA
        rules.add("ﾆ > 'ニ';"); // FF86 -> 30CB KATAKANA LETTER NI
        rules.add("ﾇ > 'ヌ';"); // FF87 -> 30CC KATAKANA LETTER NU
        rules.add("ﾈ > 'ネ';"); // FF88 -> 30CD KATAKANA LETTER NE
        rules.add("ﾉ > 'ノ';"); // FF89 -> 30CE KATAKANA LETTER NO
        rules.add("ﾊ > 'ハ';"); // FF8A -> 30CF KATAKANA LETTER HA
        rules.add("ﾋ > 'ヒ';"); // FF8B -> 30D2 KATAKANA LETTER HI
        rules.add("ﾌ > 'フ';"); // FF8C -> 30D5 KATAKANA LETTER HU
        rules.add("ﾍ > 'ヘ';"); // FF8D -> 30D8 KATAKANA LETTER HE
        rules.add("ﾎ > 'ホ';"); // FF8E -> 30DB KATAKANA LETTER HO
        rules.add("ﾏ > 'マ';"); // FF8F -> 30DE KATAKANA LETTER MA
        rules.add("ﾐ > 'ミ';"); // FF90 -> 30DF KATAKANA LETTER MI
        rules.add("ﾑ > 'ム';"); // FF91 -> 30E0 KATAKANA LETTER MU
        rules.add("ﾒ > 'メ';"); // FF92 -> 30E1 KATAKANA LETTER ME
        rules.add("ﾓ > 'モ';"); // FF93 -> 30E2 KATAKANA LETTER MO
        rules.add("ﾔ > 'ヤ';"); // FF94 -> 30E4 KATAKANA LETTER YA
        rules.add("ﾕ > 'ユ';"); // FF95 -> 30E6 KATAKANA LETTER YU
        rules.add("ﾖ > 'ヨ';"); // FF96 -> 30E8 KATAKANA LETTER YO
        rules.add("ﾗ > 'ラ';"); // FF97 -> 30E9 KATAKANA LETTER RA
        rules.add("ﾘ > 'リ';"); // FF98 -> 30EA KATAKANA LETTER RI
        rules.add("ﾙ > 'ル';"); // FF99 -> 30EB KATAKANA LETTER RU
        rules.add("ﾚ > 'レ';"); // FF9A -> 30EC KATAKANA LETTER RE
        rules.add("ﾛ > 'ロ';"); // FF9B -> 30ED KATAKANA LETTER RO
        rules.add("ﾜ > 'ワ';"); // FF9C -> 30EF KATAKANA LETTER WA
        rules.add("ﾝ > 'ン';"); // FF9D -> 30F3 KATAKANA LETTER N

        // Standalone dakuten/handakuten (not preceded by a combinable base
        // katakana)
        // are malformed input — strip them rather than emitting the '?'
        // fallback.
        // Placed before the catch-all so these explicit single-char rules take
        // precedence over the broader [\uFF01-\uFF9F] fallback pattern.
        rules.add("ﾞ > ;"); // FF9E HALFWIDTH KATAKANA VOICED SOUND MARK,
                            // standalone -> drop
        rules.add("ﾟ > ;"); // FF9F HALFWIDTH KATAKANA SEMI-VOICED SOUND MARK,
                            // standalone -> drop

        // FFE0–FFEE: fullwidth currency/math signs + halfwidth forms (arrows,
        // block, circle)
        rules.add("￠ > '\u00A2';"); // FFE0 FULLWIDTH CENT SIGN -> ¢ (Latin-1)
        rules.add("￡ > '\u00A3';"); // FFE1 FULLWIDTH POUND SIGN -> £ (Latin-1)
        rules.add("￢ > '\u00AC';"); // FFE2 FULLWIDTH NOT SIGN -> ¬ (Latin-1)
        rules.add("￣ > '\u00AF';"); // FFE3 FULLWIDTH MACRON -> ¯ (Latin-1)
        rules.add("￤ > '\u00A6';"); // FFE4 FULLWIDTH BROKEN BAR -> ¦ (Latin-1)
        rules.add("￥ > '\u00A5';"); // FFE5 FULLWIDTH YEN SIGN -> ¥ (Latin-1)
        rules.add("￦ > 'W';"); // FFE6 FULLWIDTH WON SIGN -> no Latin-1
                               // equivalent; ASCII fallback

        rules.add("￨ > '|';"); // FFE8 HALFWIDTH FORMS LIGHT VERTICAL
        rules.add("￩ > '<-';"); // FFE9 HALFWIDTH LEFTWARDS ARROW
        rules.add("￪ > '^';"); // FFEA HALFWIDTH UPWARDS ARROW
        rules.add("￫ > '->';"); // FFEB HALFWIDTH RIGHTWARDS ARROW
        rules.add("￬ > 'v';"); // FFEC HALFWIDTH DOWNWARDS ARROW
        rules.add("￭ > '#';"); // FFED HALFWIDTH BLACK SQUARE
        rules.add("￮ > 'o';"); // FFEE HALFWIDTH WHITE CIRCLE

        TRANSLITERATOR = Transliterator.createFromRules("HalfWidthFullWidth-Normalized", String.join("\n", rules),
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
