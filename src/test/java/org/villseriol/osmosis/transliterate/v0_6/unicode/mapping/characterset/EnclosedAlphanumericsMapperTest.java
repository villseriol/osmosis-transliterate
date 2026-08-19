// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.villseriol.osmosis.common.UnicodeRange;


public class EnclosedAlphanumericsMapperTest {

    private final EnclosedAlphanumericsMapper transform = new EnclosedAlphanumericsMapper();

    @Test
    public void testUntouched() {
        for (UnicodeRange range : UnicodeRange.values()) {
            if (range == UnicodeRange.ENCLOSED_ALPHANUMERICS) {
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
        assertEquals("(1)", transform.action("①")); // 2460 CIRCLED DIGIT ONE
        assertEquals("(2)", transform.action("②")); // 2461 CIRCLED DIGIT TWO
        assertEquals("(3)", transform.action("③")); // 2462 CIRCLED DIGIT THREE
        assertEquals("(4)", transform.action("④")); // 2463 CIRCLED DIGIT FOUR
        assertEquals("(5)", transform.action("⑤")); // 2464 CIRCLED DIGIT FIVE
        assertEquals("(6)", transform.action("⑥")); // 2465 CIRCLED DIGIT SIX
        assertEquals("(7)", transform.action("⑦")); // 2466 CIRCLED DIGIT SEVEN
        assertEquals("(8)", transform.action("⑧")); // 2467 CIRCLED DIGIT EIGHT
        assertEquals("(9)", transform.action("⑨")); // 2468 CIRCLED DIGIT NINE
        assertEquals("(10)", transform.action("⑩")); // 2469 CIRCLED NUMBER TEN
        assertEquals("(11)", transform.action("⑪")); // 246A CIRCLED NUMBER
                                                     // ELEVEN
        assertEquals("(12)", transform.action("⑫")); // 246B CIRCLED NUMBER
                                                     // TWELVE
        assertEquals("(13)", transform.action("⑬")); // 246C CIRCLED NUMBER
                                                     // THIRTEEN
        assertEquals("(14)", transform.action("⑭")); // 246D CIRCLED NUMBER
                                                     // FOURTEEN
        assertEquals("(15)", transform.action("⑮")); // 246E CIRCLED NUMBER
                                                     // FIFTEEN
        assertEquals("(16)", transform.action("⑯")); // 246F CIRCLED NUMBER
                                                     // SIXTEEN
        assertEquals("(17)", transform.action("⑰")); // 2470 CIRCLED NUMBER
                                                     // SEVENTEEN
        assertEquals("(18)", transform.action("⑱")); // 2471 CIRCLED NUMBER
                                                     // EIGHTEEN
        assertEquals("(19)", transform.action("⑲")); // 2472 CIRCLED NUMBER
                                                     // NINETEEN
        assertEquals("(20)", transform.action("⑳")); // 2473 CIRCLED NUMBER
                                                     // TWENTY
        assertEquals("(1)", transform.action("⑴")); // 2474 PARENTHESIZED DIGIT
                                                    // ONE
        assertEquals("(2)", transform.action("⑵")); // 2475 PARENTHESIZED DIGIT
                                                    // TWO
        assertEquals("(3)", transform.action("⑶")); // 2476 PARENTHESIZED DIGIT
                                                    // THREE
        assertEquals("(4)", transform.action("⑷")); // 2477 PARENTHESIZED DIGIT
                                                    // FOUR
        assertEquals("(5)", transform.action("⑸")); // 2478 PARENTHESIZED DIGIT
                                                    // FIVE
        assertEquals("(6)", transform.action("⑹")); // 2479 PARENTHESIZED DIGIT
                                                    // SIX
        assertEquals("(7)", transform.action("⑺")); // 247A PARENTHESIZED DIGIT
                                                    // SEVEN
        assertEquals("(8)", transform.action("⑻")); // 247B PARENTHESIZED DIGIT
                                                    // EIGHT
        assertEquals("(9)", transform.action("⑼")); // 247C PARENTHESIZED DIGIT
                                                    // NINE
        assertEquals("(10)", transform.action("⑽")); // 247D PARENTHESIZED
                                                     // NUMBER TEN
        assertEquals("(11)", transform.action("⑾")); // 247E PARENTHESIZED
                                                     // NUMBER ELEVEN
        assertEquals("(12)", transform.action("⑿")); // 247F PARENTHESIZED
                                                     // NUMBER TWELVE
        assertEquals("(13)", transform.action("⒀")); // 2480 PARENTHESIZED
                                                     // NUMBER THIRTEEN
        assertEquals("(14)", transform.action("⒁")); // 2481 PARENTHESIZED
                                                     // NUMBER FOURTEEN
        assertEquals("(15)", transform.action("⒂")); // 2482 PARENTHESIZED
                                                     // NUMBER FIFTEEN
        assertEquals("(16)", transform.action("⒃")); // 2483 PARENTHESIZED
                                                     // NUMBER SIXTEEN
        assertEquals("(17)", transform.action("⒄")); // 2484 PARENTHESIZED
                                                     // NUMBER SEVENTEEN
        assertEquals("(18)", transform.action("⒅")); // 2485 PARENTHESIZED
                                                     // NUMBER EIGHTEEN
        assertEquals("(19)", transform.action("⒆")); // 2486 PARENTHESIZED
                                                     // NUMBER NINETEEN
        assertEquals("(20)", transform.action("⒇")); // 2487 PARENTHESIZED
                                                     // NUMBER TWENTY
        assertEquals("1.", transform.action("⒈")); // 2488 DIGIT ONE FULL STOP
        assertEquals("2.", transform.action("⒉")); // 2489 DIGIT TWO FULL STOP
        assertEquals("3.", transform.action("⒊")); // 248A DIGIT THREE FULL STOP
        assertEquals("4.", transform.action("⒋")); // 248B DIGIT FOUR FULL STOP
        assertEquals("5.", transform.action("⒌")); // 248C DIGIT FIVE FULL STOP
        assertEquals("6.", transform.action("⒍")); // 248D DIGIT SIX FULL STOP
        assertEquals("7.", transform.action("⒎")); // 248E DIGIT SEVEN FULL STOP
        assertEquals("8.", transform.action("⒏")); // 248F DIGIT EIGHT FULL STOP
        assertEquals("9.", transform.action("⒐")); // 2490 DIGIT NINE FULL STOP
        assertEquals("10.", transform.action("⒑")); // 2491 NUMBER TEN FULL STOP
        assertEquals("11.", transform.action("⒒")); // 2492 NUMBER ELEVEN FULL
                                                    // STOP
        assertEquals("12.", transform.action("⒓")); // 2493 NUMBER TWELVE FULL
                                                    // STOP
        assertEquals("13.", transform.action("⒔")); // 2494 NUMBER THIRTEEN FULL
                                                    // STOP
        assertEquals("14.", transform.action("⒕")); // 2495 NUMBER FOURTEEN FULL
                                                    // STOP
        assertEquals("15.", transform.action("⒖")); // 2496 NUMBER FIFTEEN FULL
                                                    // STOP
        assertEquals("16.", transform.action("⒗")); // 2497 NUMBER SIXTEEN FULL
                                                    // STOP
        assertEquals("17.", transform.action("⒘")); // 2498 NUMBER SEVENTEEN
                                                    // FULL STOP
        assertEquals("18.", transform.action("⒙")); // 2499 NUMBER EIGHTEEN FULL
                                                    // STOP
        assertEquals("19.", transform.action("⒚")); // 249A NUMBER NINETEEN FULL
                                                    // STOP
        assertEquals("20.", transform.action("⒛")); // 249B NUMBER TWENTY FULL
                                                    // STOP
        assertEquals("(a)", transform.action("⒜")); // 249C PARENTHESIZED LATIN
                                                    // SMALL LETTER A
        assertEquals("(b)", transform.action("⒝")); // 249D PARENTHESIZED LATIN
                                                    // SMALL LETTER B
        assertEquals("(c)", transform.action("⒞")); // 249E PARENTHESIZED LATIN
                                                    // SMALL LETTER C
        assertEquals("(d)", transform.action("⒟")); // 249F PARENTHESIZED LATIN
                                                    // SMALL LETTER D
        assertEquals("(e)", transform.action("⒠")); // 24A0 PARENTHESIZED LATIN
                                                    // SMALL LETTER E
        assertEquals("(f)", transform.action("⒡")); // 24A1 PARENTHESIZED LATIN
                                                    // SMALL LETTER F
        assertEquals("(g)", transform.action("⒢")); // 24A2 PARENTHESIZED LATIN
                                                    // SMALL LETTER G
        assertEquals("(h)", transform.action("⒣")); // 24A3 PARENTHESIZED LATIN
                                                    // SMALL LETTER H
        assertEquals("(i)", transform.action("⒤")); // 24A4 PARENTHESIZED LATIN
                                                    // SMALL LETTER I
        assertEquals("(j)", transform.action("⒥")); // 24A5 PARENTHESIZED LATIN
                                                    // SMALL LETTER J
        assertEquals("(k)", transform.action("⒦")); // 24A6 PARENTHESIZED LATIN
                                                    // SMALL LETTER K
        assertEquals("(l)", transform.action("⒧")); // 24A7 PARENTHESIZED LATIN
                                                    // SMALL LETTER L
        assertEquals("(m)", transform.action("⒨")); // 24A8 PARENTHESIZED LATIN
                                                    // SMALL LETTER M
        assertEquals("(n)", transform.action("⒩")); // 24A9 PARENTHESIZED LATIN
                                                    // SMALL LETTER N
        assertEquals("(o)", transform.action("⒪")); // 24AA PARENTHESIZED LATIN
                                                    // SMALL LETTER O
        assertEquals("(p)", transform.action("⒫")); // 24AB PARENTHESIZED LATIN
                                                    // SMALL LETTER P
        assertEquals("(q)", transform.action("⒬")); // 24AC PARENTHESIZED LATIN
                                                    // SMALL LETTER Q
        assertEquals("(r)", transform.action("⒭")); // 24AD PARENTHESIZED LATIN
                                                    // SMALL LETTER R
        assertEquals("(s)", transform.action("⒮")); // 24AE PARENTHESIZED LATIN
                                                    // SMALL LETTER S
        assertEquals("(t)", transform.action("⒯")); // 24AF PARENTHESIZED LATIN
                                                    // SMALL LETTER T
        assertEquals("(u)", transform.action("⒰")); // 24B0 PARENTHESIZED LATIN
                                                    // SMALL LETTER U
        assertEquals("(v)", transform.action("⒱")); // 24B1 PARENTHESIZED LATIN
                                                    // SMALL LETTER V
        assertEquals("(w)", transform.action("⒲")); // 24B2 PARENTHESIZED LATIN
                                                    // SMALL LETTER W
        assertEquals("(x)", transform.action("⒳")); // 24B3 PARENTHESIZED LATIN
                                                    // SMALL LETTER X
        assertEquals("(y)", transform.action("⒴")); // 24B4 PARENTHESIZED LATIN
                                                    // SMALL LETTER Y
        assertEquals("(z)", transform.action("⒵")); // 24B5 PARENTHESIZED LATIN
                                                    // SMALL LETTER Z
        assertEquals("(A)", transform.action("Ⓐ")); // 24B6 CIRCLED LATIN
                                                    // CAPITAL LETTER A
        assertEquals("(B)", transform.action("Ⓑ")); // 24B7 CIRCLED LATIN
                                                    // CAPITAL LETTER B
        assertEquals("(C)", transform.action("Ⓒ")); // 24B8 CIRCLED LATIN
                                                    // CAPITAL LETTER C
        assertEquals("(D)", transform.action("Ⓓ")); // 24B9 CIRCLED LATIN
                                                    // CAPITAL LETTER D
        assertEquals("(E)", transform.action("Ⓔ")); // 24BA CIRCLED LATIN
                                                    // CAPITAL LETTER E
        assertEquals("(F)", transform.action("Ⓕ")); // 24BB CIRCLED LATIN
                                                    // CAPITAL LETTER F
        assertEquals("(G)", transform.action("Ⓖ")); // 24BC CIRCLED LATIN
                                                    // CAPITAL LETTER G
        assertEquals("(H)", transform.action("Ⓗ")); // 24BD CIRCLED LATIN
                                                    // CAPITAL LETTER H
        assertEquals("(I)", transform.action("Ⓘ")); // 24BE CIRCLED LATIN
                                                    // CAPITAL LETTER I
        assertEquals("(J)", transform.action("Ⓙ")); // 24BF CIRCLED LATIN
                                                    // CAPITAL LETTER J
        assertEquals("(K)", transform.action("Ⓚ")); // 24C0 CIRCLED LATIN
                                                    // CAPITAL LETTER K
        assertEquals("(L)", transform.action("Ⓛ")); // 24C1 CIRCLED LATIN
                                                    // CAPITAL LETTER L
        assertEquals("(M)", transform.action("Ⓜ")); // 24C2 CIRCLED LATIN
                                                    // CAPITAL LETTER M
        assertEquals("(N)", transform.action("Ⓝ")); // 24C3 CIRCLED LATIN
                                                    // CAPITAL LETTER N
        assertEquals("(O)", transform.action("Ⓞ")); // 24C4 CIRCLED LATIN
                                                    // CAPITAL LETTER O
        assertEquals("(P)", transform.action("Ⓟ")); // 24C5 CIRCLED LATIN
                                                    // CAPITAL LETTER P
        assertEquals("(Q)", transform.action("Ⓠ")); // 24C6 CIRCLED LATIN
                                                    // CAPITAL LETTER Q
        assertEquals("(R)", transform.action("Ⓡ")); // 24C7 CIRCLED LATIN
                                                    // CAPITAL LETTER R
        assertEquals("(S)", transform.action("Ⓢ")); // 24C8 CIRCLED LATIN
                                                    // CAPITAL LETTER S
        assertEquals("(T)", transform.action("Ⓣ")); // 24C9 CIRCLED LATIN
                                                    // CAPITAL LETTER T
        assertEquals("(U)", transform.action("Ⓤ")); // 24CA CIRCLED LATIN
                                                    // CAPITAL LETTER U
        assertEquals("(V)", transform.action("Ⓥ")); // 24CB CIRCLED LATIN
                                                    // CAPITAL LETTER V
        assertEquals("(W)", transform.action("Ⓦ")); // 24CC CIRCLED LATIN
                                                    // CAPITAL LETTER W
        assertEquals("(X)", transform.action("Ⓧ")); // 24CD CIRCLED LATIN
                                                    // CAPITAL LETTER X
        assertEquals("(Y)", transform.action("Ⓨ")); // 24CE CIRCLED LATIN
                                                    // CAPITAL LETTER Y
        assertEquals("(Z)", transform.action("Ⓩ")); // 24CF CIRCLED LATIN
                                                    // CAPITAL LETTER Z
        assertEquals("a", transform.action("ⓐ")); // 24D0 CIRCLED LATIN SMALL
                                                  // LETTER A
        assertEquals("b", transform.action("ⓑ")); // 24D1 CIRCLED LATIN SMALL
                                                  // LETTER B
        assertEquals("c", transform.action("ⓒ")); // 24D2 CIRCLED LATIN SMALL
                                                  // LETTER C
        assertEquals("d", transform.action("ⓓ")); // 24D3 CIRCLED LATIN SMALL
                                                  // LETTER D
        assertEquals("e", transform.action("ⓔ")); // 24D4 CIRCLED LATIN SMALL
                                                  // LETTER E
        assertEquals("f", transform.action("ⓕ")); // 24D5 CIRCLED LATIN SMALL
                                                  // LETTER F
        assertEquals("g", transform.action("ⓖ")); // 24D6 CIRCLED LATIN SMALL
                                                  // LETTER G
        assertEquals("h", transform.action("ⓗ")); // 24D7 CIRCLED LATIN SMALL
                                                  // LETTER H
        assertEquals("i", transform.action("ⓘ")); // 24D8 CIRCLED LATIN SMALL
                                                  // LETTER I
        assertEquals("j", transform.action("ⓙ")); // 24D9 CIRCLED LATIN SMALL
                                                  // LETTER J
        assertEquals("k", transform.action("ⓚ")); // 24DA CIRCLED LATIN SMALL
                                                  // LETTER K
        assertEquals("l", transform.action("ⓛ")); // 24DB CIRCLED LATIN SMALL
                                                  // LETTER L
        assertEquals("m", transform.action("ⓜ")); // 24DC CIRCLED LATIN SMALL
                                                  // LETTER M
        assertEquals("n", transform.action("ⓝ")); // 24DD CIRCLED LATIN SMALL
                                                  // LETTER N
        assertEquals("o", transform.action("ⓞ")); // 24DE CIRCLED LATIN SMALL
                                                  // LETTER O
        assertEquals("p", transform.action("ⓟ")); // 24DF CIRCLED LATIN SMALL
                                                  // LETTER P
        assertEquals("q", transform.action("ⓠ")); // 24E0 CIRCLED LATIN SMALL
                                                  // LETTER Q
        assertEquals("r", transform.action("ⓡ")); // 24E1 CIRCLED LATIN SMALL
                                                  // LETTER R
        assertEquals("s", transform.action("ⓢ")); // 24E2 CIRCLED LATIN SMALL
                                                  // LETTER S
        assertEquals("t", transform.action("ⓣ")); // 24E3 CIRCLED LATIN SMALL
                                                  // LETTER T
        assertEquals("u", transform.action("ⓤ")); // 24E4 CIRCLED LATIN SMALL
                                                  // LETTER U
        assertEquals("v", transform.action("ⓥ")); // 24E5 CIRCLED LATIN SMALL
                                                  // LETTER V
        assertEquals("w", transform.action("ⓦ")); // 24E6 CIRCLED LATIN SMALL
                                                  // LETTER W
        assertEquals("x", transform.action("ⓧ")); // 24E7 CIRCLED LATIN SMALL
                                                  // LETTER X
        assertEquals("y", transform.action("ⓨ")); // 24E8 CIRCLED LATIN SMALL
                                                  // LETTER Y
        assertEquals("z", transform.action("ⓩ")); // 24E9 CIRCLED LATIN SMALL
                                                  // LETTER Z
        assertEquals("(0)", transform.action("⓪")); // 24EA CIRCLED DIGIT ZERO
        assertEquals("(11)", transform.action("⓫")); // 24EB NEGATIVE CIRCLED
                                                     // NUMBER ELEVEN
        assertEquals("(12)", transform.action("⓬")); // 24EC NEGATIVE CIRCLED
                                                     // NUMBER TWELVE
        assertEquals("(13)", transform.action("⓭")); // 24ED NEGATIVE CIRCLED
                                                     // NUMBER THIRTEEN
        assertEquals("(14)", transform.action("⓮")); // 24EE NEGATIVE CIRCLED
                                                     // NUMBER FOURTEEN
        assertEquals("(15)", transform.action("⓯")); // 24EF NEGATIVE CIRCLED
                                                     // NUMBER FIFTEEN
        assertEquals("(16)", transform.action("⓰")); // 24F0 NEGATIVE CIRCLED
                                                     // NUMBER SIXTEEN
        assertEquals("(17)", transform.action("⓱")); // 24F1 NEGATIVE CIRCLED
                                                     // NUMBER SEVENTEEN
        assertEquals("(18)", transform.action("⓲")); // 24F2 NEGATIVE CIRCLED
                                                     // NUMBER EIGHTEEN
        assertEquals("(19)", transform.action("⓳")); // 24F3 NEGATIVE CIRCLED
                                                     // NUMBER NINETEEN
        assertEquals("(20)", transform.action("⓴")); // 24F4 NEGATIVE CIRCLED
                                                     // NUMBER TWENTY
        assertEquals("(1)", transform.action("⓵")); // 24F5 DOUBLE CIRCLED DIGIT
                                                    // ONE
        assertEquals("(2)", transform.action("⓶")); // 24F6 DOUBLE CIRCLED DIGIT
                                                    // TWO
        assertEquals("(3)", transform.action("⓷")); // 24F7 DOUBLE CIRCLED DIGIT
                                                    // THREE
        assertEquals("(4)", transform.action("⓸")); // 24F8 DOUBLE CIRCLED DIGIT
                                                    // FOUR
        assertEquals("(5)", transform.action("⓹")); // 24F9 DOUBLE CIRCLED DIGIT
                                                    // FIVE
        assertEquals("(6)", transform.action("⓺")); // 24FA DOUBLE CIRCLED DIGIT
                                                    // SIX
        assertEquals("(7)", transform.action("⓻")); // 24FB DOUBLE CIRCLED DIGIT
                                                    // SEVEN
        assertEquals("(8)", transform.action("⓼")); // 24FC DOUBLE CIRCLED DIGIT
                                                    // EIGHT
        assertEquals("(9)", transform.action("⓽")); // 24FD DOUBLE CIRCLED DIGIT
                                                    // NINE
        assertEquals("(10)", transform.action("⓾")); // 24FE DOUBLE CIRCLED
                                                     // NUMBER TEN
        assertEquals("(0)", transform.action("⓿")); // 24FF NEGATIVE CIRCLED
                                                    // DIGIT ZERO
    }
}
