// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.utils.StringUtils;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/enclosed-alphanumerics/
public class EnclosedAlphanumericsTransform implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Enclosed Alphanumerics block
        rules.add(StringUtils.toIcuFilterRule(UnicodeRange.ENCLOSED_ALPHANUMERICS));

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

        // Fallback: anything not yet explicitly mapped becomes ' '
        rules.add(StringUtils.toIcuFallbackRule(" ", UnicodeRange.ENCLOSED_ALPHANUMERICS));

        TRANSLITERATOR = Transliterator.createFromRules("EnclosedAlphanumerics-Normalized", String.join("\n", rules),
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
