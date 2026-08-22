// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.unicode.reflection.UnicodeRanges;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


@UnicodeRanges(UnicodeRange.ENCLOSED_ALPHANUMERICS)
public class EnclosedAlphanumericsMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("① > '(1)';");
        rules.add("② > '(2)';");
        rules.add("③ > '(3)';");
        rules.add("④ > '(4)';");
        rules.add("⑤ > '(5)';");
        rules.add("⑥ > '(6)';");
        rules.add("⑦ > '(7)';");
        rules.add("⑧ > '(8)';");
        rules.add("⑨ > '(9)';");
        rules.add("⑩ > '(10)';");
        rules.add("⑪ > '(11)';");
        rules.add("⑫ > '(12)';");
        rules.add("⑬ > '(13)';");
        rules.add("⑭ > '(14)';");
        rules.add("⑮ > '(15)';");
        rules.add("⑯ > '(16)';");
        rules.add("⑰ > '(17)';");
        rules.add("⑱ > '(18)';");
        rules.add("⑲ > '(19)';");
        rules.add("⑳ > '(20)';");
        rules.add("⑴ > '(1)';");
        rules.add("⑵ > '(2)';");
        rules.add("⑶ > '(3)';");
        rules.add("⑷ > '(4)';");
        rules.add("⑸ > '(5)';");
        rules.add("⑹ > '(6)';");
        rules.add("⑺ > '(7)';");
        rules.add("⑻ > '(8)';");
        rules.add("⑼ > '(9)';");
        rules.add("⑽ > '(10)';");
        rules.add("⑾ > '(11)';");
        rules.add("⑿ > '(12)';");
        rules.add("⒀ > '(13)';");
        rules.add("⒁ > '(14)';");
        rules.add("⒂ > '(15)';");
        rules.add("⒃ > '(16)';");
        rules.add("⒄ > '(17)';");
        rules.add("⒅ > '(18)';");
        rules.add("⒆ > '(19)';");
        rules.add("⒇ > '(20)';");
        rules.add("⒈ > '1.';");
        rules.add("⒉ > '2.';");
        rules.add("⒊ > '3.';");
        rules.add("⒋ > '4.';");
        rules.add("⒌ > '5.';");
        rules.add("⒍ > '6.';");
        rules.add("⒎ > '7.';");
        rules.add("⒏ > '8.';");
        rules.add("⒐ > '9.';");
        rules.add("⒑ > '10.';");
        rules.add("⒒ > '11.';");
        rules.add("⒓ > '12.';");
        rules.add("⒔ > '13.';");
        rules.add("⒕ > '14.';");
        rules.add("⒖ > '15.';");
        rules.add("⒗ > '16.';");
        rules.add("⒘ > '17.';");
        rules.add("⒙ > '18.';");
        rules.add("⒚ > '19.';");
        rules.add("⒛ > '20.';");
        rules.add("⒜ > '(a)';");
        rules.add("⒝ > '(b)';");
        rules.add("⒞ > '(c)';");
        rules.add("⒟ > '(d)';");
        rules.add("⒠ > '(e)';");
        rules.add("⒡ > '(f)';");
        rules.add("⒢ > '(g)';");
        rules.add("⒣ > '(h)';");
        rules.add("⒤ > '(i)';");
        rules.add("⒥ > '(j)';");
        rules.add("⒦ > '(k)';");
        rules.add("⒧ > '(l)';");
        rules.add("⒨ > '(m)';");
        rules.add("⒩ > '(n)';");
        rules.add("⒪ > '(o)';");
        rules.add("⒫ > '(p)';");
        rules.add("⒬ > '(q)';");
        rules.add("⒭ > '(r)';");
        rules.add("⒮ > '(s)';");
        rules.add("⒯ > '(t)';");
        rules.add("⒰ > '(u)';");
        rules.add("⒱ > '(v)';");
        rules.add("⒲ > '(w)';");
        rules.add("⒳ > '(x)';");
        rules.add("⒴ > '(y)';");
        rules.add("⒵ > '(z)';");
        rules.add("Ⓐ > '(A)';");
        rules.add("Ⓑ > '(B)';");
        rules.add("Ⓒ > '(C)';");
        rules.add("Ⓓ > '(D)';");
        rules.add("Ⓔ > '(E)';");
        rules.add("Ⓕ > '(F)';");
        rules.add("Ⓖ > '(G)';");
        rules.add("Ⓗ > '(H)';");
        rules.add("Ⓘ > '(I)';");
        rules.add("Ⓙ > '(J)';");
        rules.add("Ⓚ > '(K)';");
        rules.add("Ⓛ > '(L)';");
        rules.add("Ⓜ > '(M)';");
        rules.add("Ⓝ > '(N)';");
        rules.add("Ⓞ > '(O)';");
        rules.add("Ⓟ > '(P)';");
        rules.add("Ⓠ > '(Q)';");
        rules.add("Ⓡ > '(R)';");
        rules.add("Ⓢ > '(S)';");
        rules.add("Ⓣ > '(T)';");
        rules.add("Ⓤ > '(U)';");
        rules.add("Ⓥ > '(V)';");
        rules.add("Ⓦ > '(W)';");
        rules.add("Ⓧ > '(X)';");
        rules.add("Ⓨ > '(Y)';");
        rules.add("Ⓩ > '(Z)';");
        rules.add("ⓐ > 'a';");
        rules.add("ⓑ > 'b';");
        rules.add("ⓒ > 'c';");
        rules.add("ⓓ > 'd';");
        rules.add("ⓔ > 'e';");
        rules.add("ⓕ > 'f';");
        rules.add("ⓖ > 'g';");
        rules.add("ⓗ > 'h';");
        rules.add("ⓘ > 'i';");
        rules.add("ⓙ > 'j';");
        rules.add("ⓚ > 'k';");
        rules.add("ⓛ > 'l';");
        rules.add("ⓜ > 'm';");
        rules.add("ⓝ > 'n';");
        rules.add("ⓞ > 'o';");
        rules.add("ⓟ > 'p';");
        rules.add("ⓠ > 'q';");
        rules.add("ⓡ > 'r';");
        rules.add("ⓢ > 's';");
        rules.add("ⓣ > 't';");
        rules.add("ⓤ > 'u';");
        rules.add("ⓥ > 'v';");
        rules.add("ⓦ > 'w';");
        rules.add("ⓧ > 'x';");
        rules.add("ⓨ > 'y';");
        rules.add("ⓩ > 'z';");
        rules.add("⓪ > '(0)';");
        rules.add("⓫ > '(11)';");
        rules.add("⓬ > '(12)';");
        rules.add("⓭ > '(13)';");
        rules.add("⓮ > '(14)';");
        rules.add("⓯ > '(15)';");
        rules.add("⓰ > '(16)';");
        rules.add("⓱ > '(17)';");
        rules.add("⓲ > '(18)';");
        rules.add("⓳ > '(19)';");
        rules.add("⓴ > '(20)';");
        rules.add("⓵ > '(1)';");
        rules.add("⓶ > '(2)';");
        rules.add("⓷ > '(3)';");
        rules.add("⓸ > '(4)';");
        rules.add("⓹ > '(5)';");
        rules.add("⓺ > '(6)';");
        rules.add("⓻ > '(7)';");
        rules.add("⓼ > '(8)';");
        rules.add("⓽ > '(9)';");
        rules.add("⓾ > '(10)';");
        rules.add("⓿ > '(0)';");

        String rule = Icu4jUtils.createIcu4jRule(EnclosedAlphanumericsMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("EnclosedAlphanumerics-Normalized", rule,
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
