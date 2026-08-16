// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.transform.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.utils.StringUtils;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/enclosed-cjk-letters-and-months/
public class EnclosedCjkLettersAndMonthsTransform implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Enclosed CJK Letters and Months
        // block
        rules.add(StringUtils.toIcuFilterRule(UnicodeRange.ENCLOSED_CJK_LETTERS_AND_MONTHS));

        // Enclosed CJK Letters and Months block mappings
        // U+3200-U+321F mapped to whitespace until mappings are provided
        rules.add("[\\u3200-\\u321F] > ' ';");

        // U+3220-U+3247 decomposed into parentheses and their kanji equivalent
        rules.add("㈠ > '(一)';"); // 3220 PARENTHESIZED IDEOGRAPH ONE
        rules.add("㈡ > '(二)';"); // 3221 PARENTHESIZED IDEOGRAPH TWO
        rules.add("㈢ > '(三)';"); // 3222 PARENTHESIZED IDEOGRAPH THREE
        rules.add("㈣ > '(四)';"); // 3223 PARENTHESIZED IDEOGRAPH FOUR
        rules.add("㈤ > '(五)';"); // 3224 PARENTHESIZED IDEOGRAPH FIVE
        rules.add("㈥ > '(六)';"); // 3225 PARENTHESIZED IDEOGRAPH SIX
        rules.add("㈦ > '(七)';"); // 3226 PARENTHESIZED IDEOGRAPH SEVEN
        rules.add("㈧ > '(八)';"); // 3227 PARENTHESIZED IDEOGRAPH EIGHT
        rules.add("㈨ > '(九)';"); // 3228 PARENTHESIZED IDEOGRAPH NINE
        rules.add("㈩ > '(十)';"); // 3229 PARENTHESIZED IDEOGRAPH TEN
        rules.add("㈪ > '(月)';"); // 322A PARENTHESIZED IDEOGRAPH MOON
        rules.add("㈫ > '(火)';"); // 322B PARENTHESIZED IDEOGRAPH FIRE
        rules.add("㈬ > '(水)';"); // 322C PARENTHESIZED IDEOGRAPH WATER
        rules.add("㈭ > '(木)';"); // 322D PARENTHESIZED IDEOGRAPH WOOD
        rules.add("㈮ > '(金)';"); // 322E PARENTHESIZED IDEOGRAPH METAL
        rules.add("㈯ > '(土)';"); // 322F PARENTHESIZED IDEOGRAPH EARTH
        rules.add("㈰ > '(日)';"); // 3230 PARENTHESIZED IDEOGRAPH SUN
        rules.add("㈱ > '(株)';"); // 3231 PARENTHESIZED IDEOGRAPH STOCK
        rules.add("㈲ > '(有)';"); // 3232 PARENTHESIZED IDEOGRAPH HAVE
        rules.add("㈳ > '(社)';"); // 3233 PARENTHESIZED IDEOGRAPH SOCIETY
        rules.add("㈴ > '(名)';"); // 3234 PARENTHESIZED IDEOGRAPH NAME
        rules.add("㈵ > '(特)';"); // 3235 PARENTHESIZED IDEOGRAPH SPECIAL
        rules.add("㈶ > '(財)';"); // 3236 PARENTHESIZED IDEOGRAPH FINANCIAL
        rules.add("㈷ > '(祝)';"); // 3237 PARENTHESIZED IDEOGRAPH CONGRATULATION
        rules.add("㈸ > '(労)';"); // 3238 PARENTHESIZED IDEOGRAPH LABOR
        rules.add("㈹ > '(代)';"); // 3239 PARENTHESIZED IDEOGRAPH REPRESENT
        rules.add("㈺ > '(呼)';"); // 323A PARENTHESIZED IDEOGRAPH CALL
        rules.add("㈻ > '(学)';"); // 323B PARENTHESIZED IDEOGRAPH STUDY
        rules.add("㈼ > '(監)';"); // 323C PARENTHESIZED IDEOGRAPH SUPERVISE
        rules.add("㈽ > '(企)';"); // 323D PARENTHESIZED IDEOGRAPH ENTERPRISE
        rules.add("㈾ > '(資)';"); // 323E PARENTHESIZED IDEOGRAPH RESOURCE
        rules.add("㈿ > '(協)';"); // 323F PARENTHESIZED IDEOGRAPH ALLIANCE
        rules.add("㉀ > '(祭)';"); // 3240 PARENTHESIZED IDEOGRAPH FESTIVAL
        rules.add("㉁ > '(休)';"); // 3241 PARENTHESIZED IDEOGRAPH REST
        rules.add("㉂ > '(自)';"); // 3242 PARENTHESIZED IDEOGRAPH SELF
        rules.add("㉃ > '(至)';"); // 3243 PARENTHESIZED IDEOGRAPH REACH
        rules.add("㉄ > '(問)';"); // 3244 CIRCLED IDEOGRAPH QUESTION
        rules.add("㉅ > '(幼)';"); // 3245 CIRCLED IDEOGRAPH KINDERGARTEN
        rules.add("㉆ > '(文)';"); // 3246 CIRCLED IDEOGRAPH SCHOOL
        rules.add("㉇ > '(箏)';"); // 3247 CIRCLED IDEOGRAPH KOTO

        // U+3248-U+325F mapped to parentheses and their ASCII equivalent
        rules.add("㉈ > '(10)';"); // 3248 CIRCLED NUMBER TEN ON BLACK SQUARE
        rules.add("㉉ > '(20)';"); // 3249 CIRCLED NUMBER TWENTY ON BLACK SQUARE
        rules.add("㉊ > '(30)';"); // 324A CIRCLED NUMBER THIRTY ON BLACK SQUARE
        rules.add("㉋ > '(40)';"); // 324B CIRCLED NUMBER FORTY ON BLACK SQUARE
        rules.add("㉌ > '(50)';"); // 324C CIRCLED NUMBER FIFTY ON BLACK SQUARE
        rules.add("㉍ > '(60)';"); // 324D CIRCLED NUMBER SIXTY ON BLACK SQUARE
        rules.add("㉎ > '(70)';"); // 324E CIRCLED NUMBER SEVENTY ON BLACK SQUARE
        rules.add("㉏ > '(80)';"); // 324F CIRCLED NUMBER EIGHTY ON BLACK SQUARE
        rules.add("㉐ > '(PTE)';"); // 3250 PARTNERSHIP SIGN
        rules.add("㉑ > '(21)';"); // 3251 CIRCLED NUMBER TWENTY ONE
        rules.add("㉒ > '(22)';"); // 3252 CIRCLED NUMBER TWENTY TWO
        rules.add("㉓ > '(23)';"); // 3253 CIRCLED NUMBER TWENTY THREE
        rules.add("㉔ > '(24)';"); // 3254 CIRCLED NUMBER TWENTY FOUR
        rules.add("㉕ > '(25)';"); // 3255 CIRCLED NUMBER TWENTY FIVE
        rules.add("㉖ > '(26)';"); // 3256 CIRCLED NUMBER TWENTY SIX
        rules.add("㉗ > '(27)';"); // 3257 CIRCLED NUMBER TWENTY SEVEN
        rules.add("㉘ > '(28)';"); // 3258 CIRCLED NUMBER TWENTY EIGHT
        rules.add("㉙ > '(29)';"); // 3259 CIRCLED NUMBER TWENTY NINE
        rules.add("㉚ > '(30)';"); // 325A CIRCLED NUMBER THIRTY
        rules.add("㉛ > '(31)';"); // 325B CIRCLED NUMBER THIRTY ONE
        rules.add("㉜ > '(32)';"); // 325C CIRCLED NUMBER THIRTY TWO
        rules.add("㉝ > '(33)';"); // 325D CIRCLED NUMBER THIRTY THREE
        rules.add("㉞ > '(34)';"); // 325E CIRCLED NUMBER THIRTY FOUR
        rules.add("㉟ > '(35)';"); // 325F CIRCLED NUMBER THIRTY FIVE

        // U+3260-U+327F mapped to whitespace until mappings are provided
        rules.add("[\\u3260-\\u327F] > ' ';");

        // U+3280-U+32BF mapped to parentheses and their kanji or number
        // equivalent
        rules.add("㊀ > '(一)';"); // 3280 CIRCLED IDEOGRAPH ONE
        rules.add("㊁ > '(二)';"); // 3281 CIRCLED IDEOGRAPH TWO
        rules.add("㊂ > '(三)';"); // 3282 CIRCLED IDEOGRAPH THREE
        rules.add("㊃ > '(四)';"); // 3283 CIRCLED IDEOGRAPH FOUR
        rules.add("㊄ > '(五)';"); // 3284 CIRCLED IDEOGRAPH FIVE
        rules.add("㊅ > '(六)';"); // 3285 CIRCLED IDEOGRAPH SIX
        rules.add("㊆ > '(七)';"); // 3286 CIRCLED IDEOGRAPH SEVEN
        rules.add("㊇ > '(八)';"); // 3287 CIRCLED IDEOGRAPH EIGHT
        rules.add("㊈ > '(九)';"); // 3288 CIRCLED IDEOGRAPH NINE
        rules.add("㊉ > '(十)';"); // 3289 CIRCLED IDEOGRAPH TEN
        rules.add("㊊ > '(月)';"); // 328A CIRCLED IDEOGRAPH MOON
        rules.add("㊋ > '(火)';"); // 328B CIRCLED IDEOGRAPH FIRE
        rules.add("㊌ > '(水)';"); // 328C CIRCLED IDEOGRAPH WATER
        rules.add("㊍ > '(木)';"); // 328D CIRCLED IDEOGRAPH WOOD
        rules.add("㊎ > '(金)';"); // 328E CIRCLED IDEOGRAPH METAL
        rules.add("㊏ > '(土)';"); // 328F CIRCLED IDEOGRAPH EARTH
        rules.add("㊐ > '(日)';"); // 3290 CIRCLED IDEOGRAPH SUN
        rules.add("㊑ > '(株)';"); // 3291 CIRCLED IDEOGRAPH STOCK
        rules.add("㊒ > '(有)';"); // 3292 CIRCLED IDEOGRAPH HAVE
        rules.add("㊓ > '(社)';"); // 3293 CIRCLED IDEOGRAPH SOCIETY
        rules.add("㊔ > '(名)';"); // 3294 CIRCLED IDEOGRAPH NAME
        rules.add("㊕ > '(特)';"); // 3295 CIRCLED IDEOGRAPH SPECIAL
        rules.add("㊖ > '(財)';"); // 3296 CIRCLED IDEOGRAPH FINANCIAL
        rules.add("㊗ > '(祝)';"); // 3297 CIRCLED IDEOGRAPH CONGRATULATION
        rules.add("㊘ > '(労)';"); // 3298 CIRCLED IDEOGRAPH LABOR
        rules.add("㊙ > '(秘)';"); // 3299 CIRCLED IDEOGRAPH SECRET
        rules.add("㊚ > '(男)';"); // 329A CIRCLED IDEOGRAPH MALE
        rules.add("㊛ > '(女)';"); // 329B CIRCLED IDEOGRAPH FEMALE
        rules.add("㊜ > '(適)';"); // 329C CIRCLED IDEOGRAPH SUITABLE
        rules.add("㊝ > '(優)';"); // 329D CIRCLED IDEOGRAPH EXCELLENT
        rules.add("㊞ > '(印)';"); // 329E CIRCLED IDEOGRAPH PRINT
        rules.add("㊟ > '(注)';"); // 329F CIRCLED IDEOGRAPH ATTENTION
        rules.add("㊠ > '(項)';"); // 32A0 CIRCLED IDEOGRAPH ITEM
        rules.add("㊡ > '(休)';"); // 32A1 CIRCLED IDEOGRAPH REST
        rules.add("㊢ > '(写)';"); // 32A2 CIRCLED IDEOGRAPH COPY
        rules.add("㊣ > '(正)';"); // 32A3 CIRCLED IDEOGRAPH CORRECT
        rules.add("㊤ > '(上)';"); // 32A4 CIRCLED IDEOGRAPH HIGH
        rules.add("㊥ > '(中)';"); // 32A5 CIRCLED IDEOGRAPH CENTRE
        rules.add("㊦ > '(下)';"); // 32A6 CIRCLED IDEOGRAPH LOW
        rules.add("㊧ > '(左)';"); // 32A7 CIRCLED IDEOGRAPH LEFT
        rules.add("㊨ > '(右)';"); // 32A8 CIRCLED IDEOGRAPH RIGHT
        rules.add("㊩ > '(医)';"); // 32A9 CIRCLED IDEOGRAPH MEDICINE
        rules.add("㊪ > '(宗)';"); // 32AA CIRCLED IDEOGRAPH RELIGION
        rules.add("㊫ > '(学)';"); // 32AB CIRCLED IDEOGRAPH STUDY
        rules.add("㊬ > '(監)';"); // 32AC CIRCLED IDEOGRAPH SUPERVISE
        rules.add("㊭ > '(企)';"); // 32AD CIRCLED IDEOGRAPH ENTERPRISE
        rules.add("㊮ > '(資)';"); // 32AE CIRCLED IDEOGRAPH RESOURCE
        rules.add("㊯ > '(協)';"); // 32AF CIRCLED IDEOGRAPH ALLIANCE
        rules.add("㊰ > '(夜)';"); // 32B0 CIRCLED IDEOGRAPH NIGHT
        rules.add("㊱ > '(36)';"); // 32B1 CIRCLED NUMBER THIRTY SIX
        rules.add("㊲ > '(37)';"); // 32B2 CIRCLED NUMBER THIRTY SEVEN
        rules.add("㊳ > '(38)';"); // 32B3 CIRCLED NUMBER THIRTY EIGHT
        rules.add("㊴ > '(39)';"); // 32B4 CIRCLED NUMBER THIRTY NINE
        rules.add("㊵ > '(40)';"); // 32B5 CIRCLED NUMBER FORTY
        rules.add("㊶ > '(41)';"); // 32B6 CIRCLED NUMBER FORTY ONE
        rules.add("㊷ > '(42)';"); // 32B7 CIRCLED NUMBER FORTY TWO
        rules.add("㊸ > '(43)';"); // 32B8 CIRCLED NUMBER FORTY THREE
        rules.add("㊹ > '(44)';"); // 32B9 CIRCLED NUMBER FORTY FOUR
        rules.add("㊺ > '(45)';"); // 32BA CIRCLED NUMBER FORTY FIVE
        rules.add("㊻ > '(46)';"); // 32BB CIRCLED NUMBER FORTY SIX
        rules.add("㊼ > '(47)';"); // 32BC CIRCLED NUMBER FORTY SEVEN
        rules.add("㊽ > '(48)';"); // 32BD CIRCLED NUMBER FORTY EIGHT
        rules.add("㊾ > '(49)';"); // 32BE CIRCLED NUMBER FORTY NINE
        rules.add("㊿ > '(50)';"); // 32BF CIRCLED NUMBER FIFTY

        // U+32C0-U+32CB decomposed into number and kanji equivalent
        rules.add("㋀ > '1月';"); // 32C0 IDEOGRAPHIC TELEGRAPH SYMBOL FOR JANUARY
        rules.add("㋁ > '2月';"); // 32C1 IDEOGRAPHIC TELEGRAPH SYMBOL FOR
                                // FEBRUARY
        rules.add("㋂ > '3月';"); // 32C2 IDEOGRAPHIC TELEGRAPH SYMBOL FOR MARCH
        rules.add("㋃ > '4月';"); // 32C3 IDEOGRAPHIC TELEGRAPH SYMBOL FOR APRIL
        rules.add("㋄ > '5月';"); // 32C4 IDEOGRAPHIC TELEGRAPH SYMBOL FOR MAY
        rules.add("㋅ > '6月';"); // 32C5 IDEOGRAPHIC TELEGRAPH SYMBOL FOR JUNE
        rules.add("㋆ > '7月';"); // 32C6 IDEOGRAPHIC TELEGRAPH SYMBOL FOR JULY
        rules.add("㋇ > '8月';"); // 32C7 IDEOGRAPHIC TELEGRAPH SYMBOL FOR AUGUST
        rules.add("㋈ > '9月';"); // 32C8 IDEOGRAPHIC TELEGRAPH SYMBOL FOR
                                // SEPTEMBER
        rules.add("㋉ > '10月';"); // 32C9 IDEOGRAPHIC TELEGRAPH SYMBOL FOR
                                 // OCTOBER
        rules.add("㋊ > '11月';"); // 32CA IDEOGRAPHIC TELEGRAPH SYMBOL FOR
                                 // NOVEMBER
        rules.add("㋋ > '12月';"); // 32CB IDEOGRAPHIC TELEGRAPH SYMBOL FOR
                                 // DECEMBER

        // U+32CC-U+32CF decomposed into Latin characters
        rules.add("㋌ > 'Hg';"); // 32CC SQUARE HG
        rules.add("㋍ > 'erg';"); // 32CD SQUARE ERG
        rules.add("㋎ > 'eV';"); // 32CE SQUARE EV
        rules.add("㋏ > 'LTD';"); // 32CF LIMITED LIABILITY SIGN

        // U+32D0-U+32FE mapped to parentheses and their katakana equivalent
        rules.add("㋐ > '(ア)';"); // 32D0 CIRCLED KATAKANA A
        rules.add("㋑ > '(イ)';"); // 32D1 CIRCLED KATAKANA I
        rules.add("㋒ > '(ウ)';"); // 32D2 CIRCLED KATAKANA U
        rules.add("㋓ > '(エ)';"); // 32D3 CIRCLED KATAKANA E
        rules.add("㋔ > '(オ)';"); // 32D4 CIRCLED KATAKANA O
        rules.add("㋕ > '(カ)';"); // 32D5 CIRCLED KATAKANA KA
        rules.add("㋖ > '(キ)';"); // 32D6 CIRCLED KATAKANA KI
        rules.add("㋗ > '(ク)';"); // 32D7 CIRCLED KATAKANA KU
        rules.add("㋘ > '(ケ)';"); // 32D8 CIRCLED KATAKANA KE
        rules.add("㋙ > '(コ)';"); // 32D9 CIRCLED KATAKANA KO
        rules.add("㋚ > '(サ)';"); // 32DA CIRCLED KATAKANA SA
        rules.add("㋛ > '(シ)';"); // 32DB CIRCLED KATAKANA SI
        rules.add("㋜ > '(ス)';"); // 32DC CIRCLED KATAKANA SU
        rules.add("㋝ > '(セ)';"); // 32DD CIRCLED KATAKANA SE
        rules.add("㋞ > '(ソ)';"); // 32DE CIRCLED KATAKANA SO
        rules.add("㋟ > '(タ)';"); // 32DF CIRCLED KATAKANA TA
        rules.add("㋠ > '(チ)';"); // 32E0 CIRCLED KATAKANA TI
        rules.add("㋡ > '(ツ)';"); // 32E1 CIRCLED KATAKANA TU
        rules.add("㋢ > '(テ)';"); // 32E2 CIRCLED KATAKANA TE
        rules.add("㋣ > '(ト)';"); // 32E3 CIRCLED KATAKANA TO
        rules.add("㋤ > '(ナ)';"); // 32E4 CIRCLED KATAKANA NA
        rules.add("㋥ > '(ニ)';"); // 32E5 CIRCLED KATAKANA NI
        rules.add("㋦ > '(ヌ)';"); // 32E6 CIRCLED KATAKANA NU
        rules.add("㋧ > '(ネ)';"); // 32E7 CIRCLED KATAKANA NE
        rules.add("㋨ > '(ノ)';"); // 32E8 CIRCLED KATAKANA NO
        rules.add("㋩ > '(ハ)';"); // 32E9 CIRCLED KATAKANA HA
        rules.add("㋪ > '(ヒ)';"); // 32EA CIRCLED KATAKANA HI
        rules.add("㋫ > '(フ)';"); // 32EB CIRCLED KATAKANA HU
        rules.add("㋬ > '(ヘ)';"); // 32EC CIRCLED KATAKANA HE
        rules.add("㋭ > '(ホ)';"); // 32ED CIRCLED KATAKANA HO
        rules.add("㋮ > '(マ)';"); // 32EE CIRCLED KATAKANA MA
        rules.add("㋯ > '(ミ)';"); // 32EF CIRCLED KATAKANA MI
        rules.add("㋰ > '(ム)';"); // 32F0 CIRCLED KATAKANA MU
        rules.add("㋱ > '(メ)';"); // 32F1 CIRCLED KATAKANA ME
        rules.add("㋲ > '(モ)';"); // 32F2 CIRCLED KATAKANA MO
        rules.add("㋳ > '(ヤ)';"); // 32F3 CIRCLED KATAKANA YA
        rules.add("㋴ > '(ユ)';"); // 32F4 CIRCLED KATAKANA YU
        rules.add("㋵ > '(ヨ)';"); // 32F5 CIRCLED KATAKANA YO
        rules.add("㋶ > '(ラ)';"); // 32F6 CIRCLED KATAKANA RA
        rules.add("㋷ > '(リ)';"); // 32F7 CIRCLED KATAKANA RI
        rules.add("㋸ > '(ル)';"); // 32F8 CIRCLED KATAKANA RU
        rules.add("㋹ > '(レ)';"); // 32F9 CIRCLED KATAKANA RE
        rules.add("㋺ > '(ロ)';"); // 32FA CIRCLED KATAKANA RO
        rules.add("㋻ > '(ワ)';"); // 32FB CIRCLED KATAKANA WA
        rules.add("㋼ > '(ヰ)';"); // 32FC CIRCLED KATAKANA WI
        rules.add("㋽ > '(ヱ)';"); // 32FD CIRCLED KATAKANA WE
        rules.add("㋾ > '(ヲ)';"); // 32FE CIRCLED KATAKANA WO

        // Fallback: anything not yet explicitly mapped becomes ' '
        rules.add(StringUtils.toIcuFallbackRule(" ", UnicodeRange.ENCLOSED_CJK_LETTERS_AND_MONTHS));

        TRANSLITERATOR = Transliterator.createFromRules("EnclosedCjkLettersAndMonths-Normalized",
                String.join("\n", rules), Transliterator.FORWARD);
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
