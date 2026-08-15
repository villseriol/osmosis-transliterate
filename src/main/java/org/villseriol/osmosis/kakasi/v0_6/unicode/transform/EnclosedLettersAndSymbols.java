// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.unicode.transform;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.kakasi.v0_6.unicode.types.UnicodeRange;
import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;
import org.villseriol.osmosis.kakasi.v0_6.utils.StringUtils;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/enclosed-alphanumerics/
// https://www.unicodepedia.com/groups/enclosed-alphanumeric-supplement/
// https://www.unicodepedia.com/groups/enclosed-ideographic-supplement/
// https://www.unicodepedia.com/groups/miscellaneous-symbols-and-pictographs/
// https://www.unicodepedia.com/groups/enclosed-cjk-letters-and-months/
public class EnclosedLettersAndSymbols implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Enclosed Alphanumerics, Enclosed
        // Alphanumeric Supplement, Enclosed Ideographic Supplement,
        // Miscellaneous
        // Symbols and Pictographs, and Enclosed CJK Letters and Months blocks
        rules.add(StringUtils.toIcuFilterRule(UnicodeRange.ENCLOSED_ALPHANUMERICS,
                UnicodeRange.ENCLOSED_ALPHANUMERIC_SUPPLEMENT, UnicodeRange.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT,
                UnicodeRange.ENCLOSED_CJK_LETTERS_AND_MONTHS));

        // Enclosed Alphanumerics block mappings
        rules.add("① > '(1)';"); // 2460 CIRCLED DIGIT ONE
        rules.add("② > '(2)';"); // 2461 CIRCLED DIGIT TWO
        rules.add("③ > '(3)';"); // 2462 CIRCLED DIGIT THREE
        rules.add("④ > '(4)';"); // 2463 CIRCLED DIGIT FOUR
        rules.add("⑤ > '(5)';"); // 2464 CIRCLED DIGIT FIVE
        rules.add("⑥ > '(6)';"); // 2465 CIRCLED DIGIT SIX
        rules.add("⑦ > '(7)';"); // 2466 CIRCLED DIGIT SEVEN
        rules.add("⑧ > '(8)';"); // 2467 CIRCLED DIGIT EIGHT
        rules.add("⑨ > '(9)';"); // 2468 CIRCLED DIGIT NINE
        rules.add("⑩ > '(10)';"); // 2469 CIRCLED NUMBER TEN
        rules.add("⑪ > '(11)';"); // 246A CIRCLED NUMBER ELEVEN
        rules.add("⑫ > '(12)';"); // 246B CIRCLED NUMBER TWELVE
        rules.add("⑬ > '(13)';"); // 246C CIRCLED NUMBER THIRTEEN
        rules.add("⑭ > '(14)';"); // 246D CIRCLED NUMBER FOURTEEN
        rules.add("⑮ > '(15)';"); // 246E CIRCLED NUMBER FIFTEEN
        rules.add("⑯ > '(16)';"); // 246F CIRCLED NUMBER SIXTEEN
        rules.add("⑰ > '(17)';"); // 2470 CIRCLED NUMBER SEVENTEEN
        rules.add("⑱ > '(18)';"); // 2471 CIRCLED NUMBER EIGHTEEN
        rules.add("⑲ > '(19)';"); // 2472 CIRCLED NUMBER NINETEEN
        rules.add("⑳ > '(20)';"); // 2473 CIRCLED NUMBER TWENTY
        rules.add("⑴ > '(1)';"); // 2474 PARENTHESIZED DIGIT ONE
        rules.add("⑵ > '(2)';"); // 2475 PARENTHESIZED DIGIT TWO
        rules.add("⑶ > '(3)';"); // 2476 PARENTHESIZED DIGIT THREE
        rules.add("⑷ > '(4)';"); // 2477 PARENTHESIZED DIGIT FOUR
        rules.add("⑸ > '(5)';"); // 2478 PARENTHESIZED DIGIT FIVE
        rules.add("⑹ > '(6)';"); // 2479 PARENTHESIZED DIGIT SIX
        rules.add("⑺ > '(7)';"); // 247A PARENTHESIZED DIGIT SEVEN
        rules.add("⑻ > '(8)';"); // 247B PARENTHESIZED DIGIT EIGHT
        rules.add("⑼ > '(9)';"); // 247C PARENTHESIZED DIGIT NINE
        rules.add("⑽ > '(10)';"); // 247D PARENTHESIZED NUMBER TEN
        rules.add("⑾ > '(11)';"); // 247E PARENTHESIZED NUMBER ELEVEN
        rules.add("⑿ > '(12)';"); // 247F PARENTHESIZED NUMBER TWELVE
        rules.add("⒀ > '(13)';"); // 2480 PARENTHESIZED NUMBER THIRTEEN
        rules.add("⒁ > '(14)';"); // 2481 PARENTHESIZED NUMBER FOURTEEN
        rules.add("⒂ > '(15)';"); // 2482 PARENTHESIZED NUMBER FIFTEEN
        rules.add("⒃ > '(16)';"); // 2483 PARENTHESIZED NUMBER SIXTEEN
        rules.add("⒄ > '(17)';"); // 2484 PARENTHESIZED NUMBER SEVENTEEN
        rules.add("⒅ > '(18)';"); // 2485 PARENTHESIZED NUMBER EIGHTEEN
        rules.add("⒆ > '(19)';"); // 2486 PARENTHESIZED NUMBER NINETEEN
        rules.add("⒇ > '(20)';"); // 2487 PARENTHESIZED NUMBER TWENTY
        rules.add("⒈ > '1.';"); // 2488 DIGIT ONE FULL STOP
        rules.add("⒉ > '2.';"); // 2489 DIGIT TWO FULL STOP
        rules.add("⒊ > '3.';"); // 248A DIGIT THREE FULL STOP
        rules.add("⒋ > '4.';"); // 248B DIGIT FOUR FULL STOP
        rules.add("⒌ > '5.';"); // 248C DIGIT FIVE FULL STOP
        rules.add("⒍ > '6.';"); // 248D DIGIT SIX FULL STOP
        rules.add("⒎ > '7.';"); // 248E DIGIT SEVEN FULL STOP
        rules.add("⒏ > '8.';"); // 248F DIGIT EIGHT FULL STOP
        rules.add("⒐ > '9.';"); // 2490 DIGIT NINE FULL STOP
        rules.add("⒑ > '10.';"); // 2491 NUMBER TEN FULL STOP
        rules.add("⒒ > '11.';"); // 2492 NUMBER ELEVEN FULL STOP
        rules.add("⒓ > '12.';"); // 2493 NUMBER TWELVE FULL STOP
        rules.add("⒔ > '13.';"); // 2494 NUMBER THIRTEEN FULL STOP
        rules.add("⒕ > '14.';"); // 2495 NUMBER FOURTEEN FULL STOP
        rules.add("⒖ > '15.';"); // 2496 NUMBER FIFTEEN FULL STOP
        rules.add("⒗ > '16.';"); // 2497 NUMBER SIXTEEN FULL STOP
        rules.add("⒘ > '17.';"); // 2498 NUMBER SEVENTEEN FULL STOP
        rules.add("⒙ > '18.';"); // 2499 NUMBER EIGHTEEN FULL STOP
        rules.add("⒚ > '19.';"); // 249A NUMBER NINETEEN FULL STOP
        rules.add("⒛ > '20.';"); // 249B NUMBER TWENTY FULL STOP
        rules.add("⒜ > '(a)';"); // 249C PARENTHESIZED LATIN SMALL LETTER A
        rules.add("⒝ > '(b)';"); // 249D PARENTHESIZED LATIN SMALL LETTER B
        rules.add("⒞ > '(c)';"); // 249E PARENTHESIZED LATIN SMALL LETTER C
        rules.add("⒟ > '(d)';"); // 249F PARENTHESIZED LATIN SMALL LETTER D
        rules.add("⒠ > '(e)';"); // 24A0 PARENTHESIZED LATIN SMALL LETTER E
        rules.add("⒡ > '(f)';"); // 24A1 PARENTHESIZED LATIN SMALL LETTER F
        rules.add("⒢ > '(g)';"); // 24A2 PARENTHESIZED LATIN SMALL LETTER G
        rules.add("⒣ > '(h)';"); // 24A3 PARENTHESIZED LATIN SMALL LETTER H
        rules.add("⒤ > '(i)';"); // 24A4 PARENTHESIZED LATIN SMALL LETTER I
        rules.add("⒥ > '(j)';"); // 24A5 PARENTHESIZED LATIN SMALL LETTER J
        rules.add("⒦ > '(k)';"); // 24A6 PARENTHESIZED LATIN SMALL LETTER K
        rules.add("⒧ > '(l)';"); // 24A7 PARENTHESIZED LATIN SMALL LETTER L
        rules.add("⒨ > '(m)';"); // 24A8 PARENTHESIZED LATIN SMALL LETTER M
        rules.add("⒩ > '(n)';"); // 24A9 PARENTHESIZED LATIN SMALL LETTER N
        rules.add("⒪ > '(o)';"); // 24AA PARENTHESIZED LATIN SMALL LETTER O
        rules.add("⒫ > '(p)';"); // 24AB PARENTHESIZED LATIN SMALL LETTER P
        rules.add("⒬ > '(q)';"); // 24AC PARENTHESIZED LATIN SMALL LETTER Q
        rules.add("⒭ > '(r)';"); // 24AD PARENTHESIZED LATIN SMALL LETTER R
        rules.add("⒮ > '(s)';"); // 24AE PARENTHESIZED LATIN SMALL LETTER S
        rules.add("⒯ > '(t)';"); // 24AF PARENTHESIZED LATIN SMALL LETTER T
        rules.add("⒰ > '(u)';"); // 24B0 PARENTHESIZED LATIN SMALL LETTER U
        rules.add("⒱ > '(v)';"); // 24B1 PARENTHESIZED LATIN SMALL LETTER V
        rules.add("⒲ > '(w)';"); // 24B2 PARENTHESIZED LATIN SMALL LETTER W
        rules.add("⒳ > '(x)';"); // 24B3 PARENTHESIZED LATIN SMALL LETTER X
        rules.add("⒴ > '(y)';"); // 24B4 PARENTHESIZED LATIN SMALL LETTER Y
        rules.add("⒵ > '(z)';"); // 24B5 PARENTHESIZED LATIN SMALL LETTER Z
        rules.add("Ⓐ > '(A)';"); // 24B6 CIRCLED LATIN CAPITAL LETTER A
        rules.add("Ⓑ > '(B)';"); // 24B7 CIRCLED LATIN CAPITAL LETTER B
        rules.add("Ⓒ > '(C)';"); // 24B8 CIRCLED LATIN CAPITAL LETTER C
        rules.add("Ⓓ > '(D)';"); // 24B9 CIRCLED LATIN CAPITAL LETTER D
        rules.add("Ⓔ > '(E)';"); // 24BA CIRCLED LATIN CAPITAL LETTER E
        rules.add("Ⓕ > '(F)';"); // 24BB CIRCLED LATIN CAPITAL LETTER F
        rules.add("Ⓖ > '(G)';"); // 24BC CIRCLED LATIN CAPITAL LETTER G
        rules.add("Ⓗ > '(H)';"); // 24BD CIRCLED LATIN CAPITAL LETTER H
        rules.add("Ⓘ > '(I)';"); // 24BE CIRCLED LATIN CAPITAL LETTER I
        rules.add("Ⓙ > '(J)';"); // 24BF CIRCLED LATIN CAPITAL LETTER J
        rules.add("Ⓚ > '(K)';"); // 24C0 CIRCLED LATIN CAPITAL LETTER K
        rules.add("Ⓛ > '(L)';"); // 24C1 CIRCLED LATIN CAPITAL LETTER L
        rules.add("Ⓜ > '(M)';"); // 24C2 CIRCLED LATIN CAPITAL LETTER M
        rules.add("Ⓝ > '(N)';"); // 24C3 CIRCLED LATIN CAPITAL LETTER N
        rules.add("Ⓞ > '(O)';"); // 24C4 CIRCLED LATIN CAPITAL LETTER O
        rules.add("Ⓟ > '(P)';"); // 24C5 CIRCLED LATIN CAPITAL LETTER P
        rules.add("Ⓠ > '(Q)';"); // 24C6 CIRCLED LATIN CAPITAL LETTER Q
        rules.add("Ⓡ > '(R)';"); // 24C7 CIRCLED LATIN CAPITAL LETTER R
        rules.add("Ⓢ > '(S)';"); // 24C8 CIRCLED LATIN CAPITAL LETTER S
        rules.add("Ⓣ > '(T)';"); // 24C9 CIRCLED LATIN CAPITAL LETTER T
        rules.add("Ⓤ > '(U)';"); // 24CA CIRCLED LATIN CAPITAL LETTER U
        rules.add("Ⓥ > '(V)';"); // 24CB CIRCLED LATIN CAPITAL LETTER V
        rules.add("Ⓦ > '(W)';"); // 24CC CIRCLED LATIN CAPITAL LETTER W
        rules.add("Ⓧ > '(X)';"); // 24CD CIRCLED LATIN CAPITAL LETTER X
        rules.add("Ⓨ > '(Y)';"); // 24CE CIRCLED LATIN CAPITAL LETTER Y
        rules.add("Ⓩ > '(Z)';"); // 24CF CIRCLED LATIN CAPITAL LETTER Z
        rules.add("ⓐ > 'a';"); // 24D0 CIRCLED LATIN SMALL LETTER A
        rules.add("ⓑ > 'b';"); // 24D1 CIRCLED LATIN SMALL LETTER B
        rules.add("ⓒ > 'c';"); // 24D2 CIRCLED LATIN SMALL LETTER C
        rules.add("ⓓ > 'd';"); // 24D3 CIRCLED LATIN SMALL LETTER D
        rules.add("ⓔ > 'e';"); // 24D4 CIRCLED LATIN SMALL LETTER E
        rules.add("ⓕ > 'f';"); // 24D5 CIRCLED LATIN SMALL LETTER F
        rules.add("ⓖ > 'g';"); // 24D6 CIRCLED LATIN SMALL LETTER G
        rules.add("ⓗ > 'h';"); // 24D7 CIRCLED LATIN SMALL LETTER H
        rules.add("ⓘ > 'i';"); // 24D8 CIRCLED LATIN SMALL LETTER I
        rules.add("ⓙ > 'j';"); // 24D9 CIRCLED LATIN SMALL LETTER J
        rules.add("ⓚ > 'k';"); // 24DA CIRCLED LATIN SMALL LETTER K
        rules.add("ⓛ > 'l';"); // 24DB CIRCLED LATIN SMALL LETTER L
        rules.add("ⓜ > 'm';"); // 24DC CIRCLED LATIN SMALL LETTER M
        rules.add("ⓝ > 'n';"); // 24DD CIRCLED LATIN SMALL LETTER N
        rules.add("ⓞ > 'o';"); // 24DE CIRCLED LATIN SMALL LETTER O
        rules.add("ⓟ > 'p';"); // 24DF CIRCLED LATIN SMALL LETTER P
        rules.add("ⓠ > 'q';"); // 24E0 CIRCLED LATIN SMALL LETTER Q
        rules.add("ⓡ > 'r';"); // 24E1 CIRCLED LATIN SMALL LETTER R
        rules.add("ⓢ > 's';"); // 24E2 CIRCLED LATIN SMALL LETTER S
        rules.add("ⓣ > 't';"); // 24E3 CIRCLED LATIN SMALL LETTER T
        rules.add("ⓤ > 'u';"); // 24E4 CIRCLED LATIN SMALL LETTER U
        rules.add("ⓥ > 'v';"); // 24E5 CIRCLED LATIN SMALL LETTER V
        rules.add("ⓦ > 'w';"); // 24E6 CIRCLED LATIN SMALL LETTER W
        rules.add("ⓧ > 'x';"); // 24E7 CIRCLED LATIN SMALL LETTER X
        rules.add("ⓨ > 'y';"); // 24E8 CIRCLED LATIN SMALL LETTER Y
        rules.add("ⓩ > 'z';"); // 24E9 CIRCLED LATIN SMALL LETTER Z
        rules.add("⓪ > '(0)';"); // 24EA CIRCLED DIGIT ZERO
        rules.add("⓫ > '(11)';"); // 24EB NEGATIVE CIRCLED NUMBER ELEVEN
        rules.add("⓬ > '(12)';"); // 24EC NEGATIVE CIRCLED NUMBER TWELVE
        rules.add("⓭ > '(13)';"); // 24ED NEGATIVE CIRCLED NUMBER THIRTEEN
        rules.add("⓮ > '(14)';"); // 24EE NEGATIVE CIRCLED NUMBER FOURTEEN
        rules.add("⓯ > '(15)';"); // 24EF NEGATIVE CIRCLED NUMBER FIFTEEN
        rules.add("⓰ > '(16)';"); // 24F0 NEGATIVE CIRCLED NUMBER SIXTEEN
        rules.add("⓱ > '(17)';"); // 24F1 NEGATIVE CIRCLED NUMBER SEVENTEEN
        rules.add("⓲ > '(18)';"); // 24F2 NEGATIVE CIRCLED NUMBER EIGHTEEN
        rules.add("⓳ > '(19)';"); // 24F3 NEGATIVE CIRCLED NUMBER NINETEEN
        rules.add("⓴ > '(20)';"); // 24F4 NEGATIVE CIRCLED NUMBER TWENTY
        rules.add("⓵ > '(1)';"); // 24F5 DOUBLE CIRCLED DIGIT ONE
        rules.add("⓶ > '(2)';"); // 24F6 DOUBLE CIRCLED DIGIT TWO
        rules.add("⓷ > '(3)';"); // 24F7 DOUBLE CIRCLED DIGIT THREE
        rules.add("⓸ > '(4)';"); // 24F8 DOUBLE CIRCLED DIGIT FOUR
        rules.add("⓹ > '(5)';"); // 24F9 DOUBLE CIRCLED DIGIT FIVE
        rules.add("⓺ > '(6)';"); // 24FA DOUBLE CIRCLED DIGIT SIX
        rules.add("⓻ > '(7)';"); // 24FB DOUBLE CIRCLED DIGIT SEVEN
        rules.add("⓼ > '(8)';"); // 24FC DOUBLE CIRCLED DIGIT EIGHT
        rules.add("⓽ > '(9)';"); // 24FD DOUBLE CIRCLED DIGIT NINE
        rules.add("⓾ > '(10)';"); // 24FE DOUBLE CIRCLED NUMBER TEN
        rules.add("⓿ > '(0)';"); // 24FF NEGATIVE CIRCLED DIGIT ZERO

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

        // Enclosed Alphanumeric Supplement block mappings
        rules.add("🄀 > '0.';"); // 1F100 DIGIT ZERO FULL STOP
        rules.add("🄁 > '0,';"); // 1F101 DIGIT ZERO COMMA
        rules.add("🄂 > '1,';"); // 1F102 DIGIT ONE COMMA
        rules.add("🄃 > '2,';"); // 1F103 DIGIT TWO COMMA
        rules.add("🄄 > '3,';"); // 1F104 DIGIT THREE COMMA
        rules.add("🄅 > '4,';"); // 1F105 DIGIT FOUR COMMA
        rules.add("🄆 > '5,';"); // 1F106 DIGIT FIVE COMMA
        rules.add("🄇 > '6,';"); // 1F107 DIGIT SIX COMMA
        rules.add("🄈 > '7,';"); // 1F108 DIGIT SEVEN COMMA
        rules.add("🄉 > '8,';"); // 1F109 DIGIT EIGHT COMMA
        rules.add("🄊 > '9,';"); // 1F10A DIGIT NINE COMMA
        rules.add("🄋 > '(0)';"); // 1F10B DINGBAT CIRCLED SANS-SERIF DIGIT ZERO
        rules.add("🄌 > '(0)';"); // 1F10C DINGBAT NEGATIVE CIRCLED SANS-SERIF
                                  // DIGIT ZERO
        rules.add("🄍 > ' ';"); // 1F10D CIRCLED ZERO WITH SLASH
        rules.add("🄎 > ' ';"); // 1F10E CIRCLED ANTICLOCKWISE ARROW
        rules.add("🄏 > ' ';"); // 1F10F CIRCLED DOLLAR SIGN WITH OVERLAID
                                // BACKSLASH
        rules.add("🄐 > '(A)';"); // 1F110 PARENTHESIZED LATIN CAPITAL LETTER A
        rules.add("🄑 > '(B)';"); // 1F111 PARENTHESIZED LATIN CAPITAL LETTER B
        rules.add("🄒 > '(C)';"); // 1F112 PARENTHESIZED LATIN CAPITAL LETTER C
        rules.add("🄓 > '(D)';"); // 1F113 PARENTHESIZED LATIN CAPITAL LETTER D
        rules.add("🄔 > '(E)';"); // 1F114 PARENTHESIZED LATIN CAPITAL LETTER E
        rules.add("🄕 > '(F)';"); // 1F115 PARENTHESIZED LATIN CAPITAL LETTER F
        rules.add("🄖 > '(G)';"); // 1F116 PARENTHESIZED LATIN CAPITAL LETTER G
        rules.add("🄗 > '(H)';"); // 1F117 PARENTHESIZED LATIN CAPITAL LETTER H
        rules.add("🄘 > '(I)';"); // 1F118 PARENTHESIZED LATIN CAPITAL LETTER I
        rules.add("🄙 > '(J)';"); // 1F119 PARENTHESIZED LATIN CAPITAL LETTER J
        rules.add("🄚 > '(K)';"); // 1F11A PARENTHESIZED LATIN CAPITAL LETTER K
        rules.add("🄛 > '(L)';"); // 1F11B PARENTHESIZED LATIN CAPITAL LETTER L
        rules.add("🄜 > '(M)';"); // 1F11C PARENTHESIZED LATIN CAPITAL LETTER M
        rules.add("🄝 > '(N)';"); // 1F11D PARENTHESIZED LATIN CAPITAL LETTER N
        rules.add("🄞 > '(O)';"); // 1F11E PARENTHESIZED LATIN CAPITAL LETTER O
        rules.add("🄟 > '(P)';"); // 1F11F PARENTHESIZED LATIN CAPITAL LETTER P
        rules.add("🄠 > '(Q)';"); // 1F120 PARENTHESIZED LATIN CAPITAL LETTER Q
        rules.add("🄡 > '(R)';"); // 1F121 PARENTHESIZED LATIN CAPITAL LETTER R
        rules.add("🄢 > '(S)';"); // 1F122 PARENTHESIZED LATIN CAPITAL LETTER S
        rules.add("🄣 > '(T)';"); // 1F123 PARENTHESIZED LATIN CAPITAL LETTER T
        rules.add("🄤 > '(U)';"); // 1F124 PARENTHESIZED LATIN CAPITAL LETTER U
        rules.add("🄥 > '(V)';"); // 1F125 PARENTHESIZED LATIN CAPITAL LETTER V
        rules.add("🄦 > '(W)';"); // 1F126 PARENTHESIZED LATIN CAPITAL LETTER W
        rules.add("🄧 > '(X)';"); // 1F127 PARENTHESIZED LATIN CAPITAL LETTER X
        rules.add("🄨 > '(Y)';"); // 1F128 PARENTHESIZED LATIN CAPITAL LETTER Y
        rules.add("🄩 > '(Z)';"); // 1F129 PARENTHESIZED LATIN CAPITAL LETTER Z
        rules.add("🄪 > '[S]';"); // 1F12A TORTOISE SHELL BRACKETED LATIN
                                  // CAPITAL LETTER S
        rules.add("🄫 > '(C)';"); // 1F12B CIRCLED ITALIC LATIN CAPITAL LETTER C
        rules.add("🄬 > '(R)';"); // 1F12C CIRCLED ITALIC LATIN CAPITAL LETTER R
        rules.add("🄭 > '(CD)';"); // 1F12D CIRCLED CD
        rules.add("🄮 > '(WZ)';"); // 1F12E CIRCLED WZ
        rules.add("🄯 > '(C)';"); // 1F12F COPYLEFT SYMBOL
        rules.add("🄰 > '[A]';"); // 1F130 SQUARED LATIN CAPITAL LETTER A
        rules.add("🄱 > '[B]';"); // 1F131 SQUARED LATIN CAPITAL LETTER B
        rules.add("🄲 > '[C]';"); // 1F132 SQUARED LATIN CAPITAL LETTER C
        rules.add("🄳 > '[D]';"); // 1F133 SQUARED LATIN CAPITAL LETTER D
        rules.add("🄴 > '[E]';"); // 1F134 SQUARED LATIN CAPITAL LETTER E
        rules.add("🄵 > '[F]';"); // 1F135 SQUARED LATIN CAPITAL LETTER F
        rules.add("🄶 > '[G]';"); // 1F136 SQUARED LATIN CAPITAL LETTER G
        rules.add("🄷 > '[H]';"); // 1F137 SQUARED LATIN CAPITAL LETTER H
        rules.add("🄸 > '[I]';"); // 1F138 SQUARED LATIN CAPITAL LETTER I
        rules.add("🄹 > '[J]';"); // 1F139 SQUARED LATIN CAPITAL LETTER J
        rules.add("🄺 > '[K]';"); // 1F13A SQUARED LATIN CAPITAL LETTER K
        rules.add("🄻 > '[L]';"); // 1F13B SQUARED LATIN CAPITAL LETTER L
        rules.add("🄼 > '[M]';"); // 1F13C SQUARED LATIN CAPITAL LETTER M
        rules.add("🄽 > '[N]';"); // 1F13D SQUARED LATIN CAPITAL LETTER N
        rules.add("🄾 > '[O]';"); // 1F13E SQUARED LATIN CAPITAL LETTER O
        rules.add("🄿 > '[P]';"); // 1F13F SQUARED LATIN CAPITAL LETTER P
        rules.add("🅀 > '[Q]';"); // 1F140 SQUARED LATIN CAPITAL LETTER Q
        rules.add("🅁 > '[R]';"); // 1F141 SQUARED LATIN CAPITAL LETTER R
        rules.add("🅂 > '[S]';"); // 1F142 SQUARED LATIN CAPITAL LETTER S
        rules.add("🅃 > '[T]';"); // 1F143 SQUARED LATIN CAPITAL LETTER T
        rules.add("🅄 > '[U]';"); // 1F144 SQUARED LATIN CAPITAL LETTER U
        rules.add("🅅 > '[V]';"); // 1F145 SQUARED LATIN CAPITAL LETTER V
        rules.add("🅆 > '[W]';"); // 1F146 SQUARED LATIN CAPITAL LETTER W
        rules.add("🅇 > '[X]';"); // 1F147 SQUARED LATIN CAPITAL LETTER X
        rules.add("🅈 > '[Y]';"); // 1F148 SQUARED LATIN CAPITAL LETTER Y
        rules.add("🅉 > '[Z]';"); // 1F149 SQUARED LATIN CAPITAL LETTER Z
        rules.add("🅊 > '[HV]';"); // 1F14A SQUARED HV
        rules.add("🅋 > '[MV]';"); // 1F14B SQUARED MV
        rules.add("🅌 > '[SD]';"); // 1F14C SQUARED SD
        rules.add("🅍 > '[SS]';"); // 1F14D SQUARED SS
        rules.add("🅎 > '[PPV]';"); // 1F14E SQUARED PPV
        rules.add("🅏 > '[WC]';"); // 1F14F SQUARED WC
        rules.add("🅐 > '(A)';"); // 1F150 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // A
        rules.add("🅑 > '(B)';"); // 1F151 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // B
        rules.add("🅒 > '(C)';"); // 1F152 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // C
        rules.add("🅓 > '(D)';"); // 1F153 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // D
        rules.add("🅔 > '(E)';"); // 1F154 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // E
        rules.add("🅕 > '(F)';"); // 1F155 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // F
        rules.add("🅖 > '(G)';"); // 1F156 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // G
        rules.add("🅗 > '(H)';"); // 1F157 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // H
        rules.add("🅘 > '(I)';"); // 1F158 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // I
        rules.add("🅙 > '(J)';"); // 1F159 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // J
        rules.add("🅚 > '(K)';"); // 1F15A NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // K
        rules.add("🅛 > '(L)';"); // 1F15B NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // L
        rules.add("🅜 > '(M)';"); // 1F15C NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // M
        rules.add("🅝 > '(N)';"); // 1F15D NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // N
        rules.add("🅞 > '(O)';"); // 1F15E NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // O
        rules.add("🅟 > '(P)';"); // 1F15F NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // P
        rules.add("🅠 > '(Q)';"); // 1F160 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // Q
        rules.add("🅡 > '(R)';"); // 1F161 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // R
        rules.add("🅢 > '(S)';"); // 1F162 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // S
        rules.add("🅣 > '(T)';"); // 1F163 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // T
        rules.add("🅤 > '(U)';"); // 1F164 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // U
        rules.add("🅥 > '(V)';"); // 1F165 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // V
        rules.add("🅦 > '(W)';"); // 1F166 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // W
        rules.add("🅧 > '(X)';"); // 1F167 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // X
        rules.add("🅨 > '(Y)';"); // 1F168 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // Y
        rules.add("🅩 > '(Z)';"); // 1F169 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // Z
        rules.add("🅪 > 'MC';"); // 1F16A RAISED MC SIGN
        rules.add("🅫 > 'MD';"); // 1F16B RAISED MD SIGN
        rules.add("🅬 > 'MR';"); // 1F16C RAISED MR SIGN
        rules.add("🅭 > ' ';"); // 1F16D CIRCLED CC
        rules.add("🅮 > ' ';"); // 1F16E CIRCLED C WITH OVERLAID BACKSLASH
        rules.add("🅯 > ' ';"); // 1F16F CIRCLED HUMAN FIGURE
        rules.add("🅰 > '[A]';"); // 1F170 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // A
        rules.add("🅱 > '[B]';"); // 1F171 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // B
        rules.add("🅲 > '[C]';"); // 1F172 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // C
        rules.add("🅳 > '[D]';"); // 1F173 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // D
        rules.add("🅴 > '[E]';"); // 1F174 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // E
        rules.add("🅵 > '[F]';"); // 1F175 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // F
        rules.add("🅶 > '[G]';"); // 1F176 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // G
        rules.add("🅷 > '[H]';"); // 1F177 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // H
        rules.add("🅸 > '[I]';"); // 1F178 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // I
        rules.add("🅹 > '[J]';"); // 1F179 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // J
        rules.add("🅺 > '[K]';"); // 1F17A NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // K
        rules.add("🅻 > '[L]';"); // 1F17B NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // L
        rules.add("🅼 > '[M]';"); // 1F17C NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // M
        rules.add("🅽 > '[N]';"); // 1F17D NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // N
        rules.add("🅾 > '[O]';"); // 1F17E NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // O
        rules.add("🅿 > '[P]';"); // 1F17F NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // P
        rules.add("🆀 > '[Q]';"); // 1F180 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // Q
        rules.add("🆁 > '[R]';"); // 1F181 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // R
        rules.add("🆂 > '[S]';"); // 1F182 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // S
        rules.add("🆃 > '[T]';"); // 1F183 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // T
        rules.add("🆄 > '[U]';"); // 1F184 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // U
        rules.add("🆅 > '[V]';"); // 1F185 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // V
        rules.add("🆆 > '[W]';"); // 1F186 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // W
        rules.add("🆇 > '[X]';"); // 1F187 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // X
        rules.add("🆈 > '[Y]';"); // 1F188 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // Y
        rules.add("🆉 > '[Z]';"); // 1F189 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // Z
        rules.add("🆊 > '[P]';"); // 1F18A CROSSED NEGATIVE SQUARED LATIN
                                  // CAPITAL LETTER P
        rules.add("🆋 > '[IC]';"); // 1F18B NEGATIVE SQUARED IC
        rules.add("🆌 > '[PA]';"); // 1F18C NEGATIVE SQUARED PA
        rules.add("🆍 > '[SA]';"); // 1F18D NEGATIVE SQUARED SA
        rules.add("🆎 > '[AB]';"); // 1F18E NEGATIVE SQUARED AB
        rules.add("🆏 > '[WC]';"); // 1F18F NEGATIVE SQUARED WC
        rules.add("🆐 > '[DJ]';"); // 1F190 SQUARE DJ
        rules.add("🆑 > '[CL]';"); // 1F191 SQUARED CL
        rules.add("🆒 > '[COOL]';"); // 1F192 SQUARED COOL
        rules.add("🆓 > '[FREE]';"); // 1F193 SQUARED FREE
        rules.add("🆔 > '[ID]';"); // 1F194 SQUARED ID
        rules.add("🆕 > '[NEW]';"); // 1F195 SQUARED NEW
        rules.add("🆖 > '[NG]';"); // 1F196 SQUARED NG
        rules.add("🆗 > '[OK]';"); // 1F197 SQUARED OK
        rules.add("🆘 > '[SOS]';"); // 1F198 SQUARED SOS
        rules.add("🆙 > '[UP!]';"); // 1F199 SQUARED UP WITH EXCLAMATION MARK
        rules.add("🆚 > '[VS]';"); // 1F19A SQUARED VS
        rules.add("🆛 > '[3D]';"); // 1F19B SQUARED THREE D
        rules.add("🆜 > '[2ND SCREEN]';"); // 1F19C SQUARED SECOND SCREEN
        rules.add("🆝 > '[2K]';"); // 1F19D SQUARED TWO K
        rules.add("🆞 > '[4K]';"); // 1F19E SQUARED FOUR K
        rules.add("🆟 > '[8K]';"); // 1F19F SQUARED EIGHT K
        rules.add("🆠 > '[5.1]';"); // 1F1A0 SQUARED FIVE POINT ONE
        rules.add("🆡 > '[7.1]';"); // 1F1A1 SQUARED SEVEN POINT ONE
        rules.add("🆢 > '[22.2]';"); // 1F1A2 SQUARED TWENTY-TWO POINT TWO
        rules.add("🆣 > '[60P]';"); // 1F1A3 SQUARED SIXTY P
        rules.add("🆤 > '[120P]';"); // 1F1A4 SQUARED ONE HUNDRED TWENTY P
        rules.add("🆥 > '[d]';"); // 1F1A5 SQUARED LATIN SMALL LETTER D
        rules.add("🆦 > '[HC]';"); // 1F1A6 SQUARED HC
        rules.add("🆧 > '[HDR]';"); // 1F1A7 SQUARED HDR
        rules.add("🆨 > '[HI-RES]';"); // 1F1A8 SQUARED HI-RES
        rules.add("🆩 > '[LOSSLESS]';"); // 1F1A9 SQUARED LOSSLESS
        rules.add("🆪 > '[SHV]';"); // 1F1AA SQUARED SHV
        rules.add("🆫 > '[UHD]';"); // 1F1AB SQUARED UHD
        rules.add("🆬 > '[VOD]';"); // 1F1AC SQUARED VOD
        rules.add("🆭 > '(M)';"); // 1F1AD MASK WORK SYMBOL
        rules.add("🇦 > 'A';"); // 1F1E6 REGIONAL INDICATOR SYMBOL LETTER A
        rules.add("🇧 > 'B';"); // 1F1E7 REGIONAL INDICATOR SYMBOL LETTER B
        rules.add("🇨 > 'C';"); // 1F1E8 REGIONAL INDICATOR SYMBOL LETTER C
        rules.add("🇩 > 'D';"); // 1F1E9 REGIONAL INDICATOR SYMBOL LETTER D
        rules.add("🇪 > 'E';"); // 1F1EA REGIONAL INDICATOR SYMBOL LETTER E
        rules.add("🇫 > 'F';"); // 1F1EB REGIONAL INDICATOR SYMBOL LETTER F
        rules.add("🇬 > 'G';"); // 1F1EC REGIONAL INDICATOR SYMBOL LETTER G
        rules.add("🇭 > 'H';"); // 1F1ED REGIONAL INDICATOR SYMBOL LETTER H
        rules.add("🇮 > 'I';"); // 1F1EE REGIONAL INDICATOR SYMBOL LETTER I
        rules.add("🇯 > 'J';"); // 1F1EF REGIONAL INDICATOR SYMBOL LETTER J
        rules.add("🇰 > 'K';"); // 1F1F0 REGIONAL INDICATOR SYMBOL LETTER K
        rules.add("🇱 > 'L';"); // 1F1F1 REGIONAL INDICATOR SYMBOL LETTER L
        rules.add("🇲 > 'M';"); // 1F1F2 REGIONAL INDICATOR SYMBOL LETTER M
        rules.add("🇳 > 'N';"); // 1F1F3 REGIONAL INDICATOR SYMBOL LETTER N
        rules.add("🇴 > 'O';"); // 1F1F4 REGIONAL INDICATOR SYMBOL LETTER O
        rules.add("🇵 > 'P';"); // 1F1F5 REGIONAL INDICATOR SYMBOL LETTER P
        rules.add("🇶 > 'Q';"); // 1F1F6 REGIONAL INDICATOR SYMBOL LETTER Q
        rules.add("🇷 > 'R';"); // 1F1F7 REGIONAL INDICATOR SYMBOL LETTER R
        rules.add("🇸 > 'S';"); // 1F1F8 REGIONAL INDICATOR SYMBOL LETTER S
        rules.add("🇹 > 'T';"); // 1F1F9 REGIONAL INDICATOR SYMBOL LETTER T
        rules.add("🇺 > 'U';"); // 1F1FA REGIONAL INDICATOR SYMBOL LETTER U
        rules.add("🇻 > 'V';"); // 1F1FB REGIONAL INDICATOR SYMBOL LETTER V
        rules.add("🇼 > 'W';"); // 1F1FC REGIONAL INDICATOR SYMBOL LETTER W
        rules.add("🇽 > 'X';"); // 1F1FD REGIONAL INDICATOR SYMBOL LETTER X
        rules.add("🇾 > 'Y';"); // 1F1FE REGIONAL INDICATOR SYMBOL LETTER Y
        rules.add("🇿 > 'Z';"); // 1F1FF REGIONAL INDICATOR SYMBOL LETTER Z

        // Enclosed Ideographic Supplement block mappings
        rules.add("🈀 > '[ほか]';"); // 1F200 SQUARE HIRAGANA HOKA
        rules.add("🈁 > '[ココ]';"); // 1F201 SQUARED KATAKANA KOKO
        rules.add("🈂 > '[サ]';"); // 1F202 SQUARED KATAKANA SA

        // U+1F203-U+1F20F mapped to whitespace (currently unassigned)
        rules.add("[\\U0001F203-\\U0001F20F] > ' ';");

        rules.add("🈐 > '[手]';"); // 1F210 SQUARED CJK UNIFIED IDEOGRAPH-624B
        rules.add("🈑 > '[字]';"); // 1F211 SQUARED CJK UNIFIED IDEOGRAPH-5B57
        rules.add("🈒 > '[双]';"); // 1F212 SQUARED CJK UNIFIED IDEOGRAPH-53CC
        rules.add("🈓 > '[デ]';"); // 1F213 SQUARED KATAKANA DE
        rules.add("🈔 > '[二]';"); // 1F214 SQUARED CJK UNIFIED IDEOGRAPH-4E8C
        rules.add("🈕 > '[多]';"); // 1F215 SQUARED CJK UNIFIED IDEOGRAPH-591A
        rules.add("🈖 > '[解]';"); // 1F216 SQUARED CJK UNIFIED IDEOGRAPH-89E3
        rules.add("🈗 > '[天]';"); // 1F217 SQUARED CJK UNIFIED IDEOGRAPH-5929
        rules.add("🈘 > '[交]';"); // 1F218 SQUARED CJK UNIFIED IDEOGRAPH-4EA4
        rules.add("🈙 > '[映]';"); // 1F219 SQUARED CJK UNIFIED IDEOGRAPH-6620
        rules.add("🈚 > '[無]';"); // 1F21A SQUARED CJK UNIFIED IDEOGRAPH-7121
        rules.add("🈛 > '[料]';"); // 1F21B SQUARED CJK UNIFIED IDEOGRAPH-6599
        rules.add("🈜 > '[前]';"); // 1F21C SQUARED CJK UNIFIED IDEOGRAPH-524D
        rules.add("🈝 > '[後]';"); // 1F21D SQUARED CJK UNIFIED IDEOGRAPH-5F8C
        rules.add("🈞 > '[再]';"); // 1F21E SQUARED CJK UNIFIED IDEOGRAPH-518D
        rules.add("🈟 > '[新]';"); // 1F21F SQUARED CJK UNIFIED IDEOGRAPH-65B0
        rules.add("🈠 > '[初]';"); // 1F220 SQUARED CJK UNIFIED IDEOGRAPH-521D
        rules.add("🈡 > '[終]';"); // 1F221 SQUARED CJK UNIFIED IDEOGRAPH-7D42
        rules.add("🈢 > '[生]';"); // 1F222 SQUARED CJK UNIFIED IDEOGRAPH-751F
        rules.add("🈣 > '[販]';"); // 1F223 SQUARED CJK UNIFIED IDEOGRAPH-8CA9
        rules.add("🈤 > '[声]';"); // 1F224 SQUARED CJK UNIFIED IDEOGRAPH-58F0
        rules.add("🈥 > '[吹]';"); // 1F225 SQUARED CJK UNIFIED IDEOGRAPH-5439
        rules.add("🈦 > '[演]';"); // 1F226 SQUARED CJK UNIFIED IDEOGRAPH-6F14
        rules.add("🈧 > '[投]';"); // 1F227 SQUARED CJK UNIFIED IDEOGRAPH-6295
        rules.add("🈨 > '[捕]';"); // 1F228 SQUARED CJK UNIFIED IDEOGRAPH-6355
        rules.add("🈩 > '[一]';"); // 1F229 SQUARED CJK UNIFIED IDEOGRAPH-4E00
        rules.add("🈪 > '[三]';"); // 1F22A SQUARED CJK UNIFIED IDEOGRAPH-4E09
        rules.add("🈫 > '[遊]';"); // 1F22B SQUARED CJK UNIFIED IDEOGRAPH-904A
        rules.add("🈬 > '[左]';"); // 1F22C SQUARED CJK UNIFIED IDEOGRAPH-5DE6
        rules.add("🈭 > '[中]';"); // 1F22D SQUARED CJK UNIFIED IDEOGRAPH-4E2D
        rules.add("🈮 > '[右]';"); // 1F22E SQUARED CJK UNIFIED IDEOGRAPH-53F3
        rules.add("🈯 > '[指]';"); // 1F22F SQUARED CJK UNIFIED IDEOGRAPH-6307
        rules.add("🈰 > '[走]';"); // 1F230 SQUARED CJK UNIFIED IDEOGRAPH-8D70
        rules.add("🈱 > '[打]';"); // 1F231 SQUARED CJK UNIFIED IDEOGRAPH-6253
        rules.add("🈲 > '[禁]';"); // 1F232 SQUARED CJK UNIFIED IDEOGRAPH-7981
        rules.add("🈳 > '[空]';"); // 1F233 SQUARED CJK UNIFIED IDEOGRAPH-7A7A
        rules.add("🈴 > '[合]';"); // 1F234 SQUARED CJK UNIFIED IDEOGRAPH-5408
        rules.add("🈵 > '[満]';"); // 1F235 SQUARED CJK UNIFIED IDEOGRAPH-6E80
        rules.add("🈶 > '[有]';"); // 1F236 SQUARED CJK UNIFIED IDEOGRAPH-6709
        rules.add("🈷 > '[月]';"); // 1F237 SQUARED CJK UNIFIED IDEOGRAPH-6708
        rules.add("🈸 > '[申]';"); // 1F238 SQUARED CJK UNIFIED IDEOGRAPH-7533
        rules.add("🈹 > '[割]';"); // 1F239 SQUARED CJK UNIFIED IDEOGRAPH-5272
        rules.add("🈺 > '[営]';"); // 1F23A SQUARED CJK UNIFIED IDEOGRAPH-55B6
        rules.add("🈻 > '[配]';"); // 1F23B SQUARED CJK UNIFIED IDEOGRAPH-914D

        // U+1F23C-U+1F23F mapped to whitespace (currently unassigned)
        rules.add("[\\U0001F23C-\\U0001F23F] > ' ';");

        rules.add("🉀 > '[本]';"); // 1F240 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-672C
        rules.add("🉁 > '[三]';"); // 1F241 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-4E09
        rules.add("🉂 > '[二]';"); // 1F242 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-4E8C
        rules.add("🉃 > '[安]';"); // 1F243 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-5B89
        rules.add("🉄 > '[点]';"); // 1F244 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-70B9
        rules.add("🉅 > '[打]';"); // 1F245 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-6253
        rules.add("🉆 > '[盗]';"); // 1F246 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-76D7
        rules.add("🉇 > '[勝]';"); // 1F247 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-52DD
        rules.add("🉈 > '[敗]';"); // 1F248 TORTOISE SHELL BRACKETED CJK UNIFIED
                                  // IDEOGRAPH-6557

        // U+1F249-U+1F24F mapped to whitespace (currently unassigned)
        rules.add("[\\U0001F249-\\U0001F24F] > ' ';");

        rules.add("🉐 > '(得)';"); // 1F250 CIRCLED IDEOGRAPH ADVANTAGE
        rules.add("🉑 > '(可)';"); // 1F251 CIRCLED IDEOGRAPH ACCEPT

        // Fallback: anything not yet explicitly mapped becomes ' '
        rules.add(StringUtils.toIcuFallbackRule(" ", UnicodeRange.ENCLOSED_ALPHANUMERICS,
                UnicodeRange.ENCLOSED_ALPHANUMERIC_SUPPLEMENT, UnicodeRange.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT,
                UnicodeRange.ENCLOSED_CJK_LETTERS_AND_MONTHS));

        TRANSLITERATOR = Transliterator.createFromRules("EnclosedLettersAndSymbols-Normalized",
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
