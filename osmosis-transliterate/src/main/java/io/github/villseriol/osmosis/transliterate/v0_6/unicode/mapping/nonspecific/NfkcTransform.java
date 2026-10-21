// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;

import io.github.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


/**
 * Applies Unicode NFKC (compatibility composition) normalization to code points
 * within one or more {@link UnicodeRange}s, leaving everything else untouched,
 * e.g. folding {@code 𝐀} (MATHEMATICAL BOLD CAPITAL A) to {@code A}.
 */
public class NfkcTransform implements Unimap {
    private final Transliterator transliterator;

    public NfkcTransform(UnicodeRange range, UnicodeRange... ranges) {
        this.transliterator = Transliterator.getInstance(Icu4jUtils.toIcuRange(range, ranges) + " NFKC");
    }


    @Override
    public String action(String input) {
        return transliterator.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        transliterator.transliterate(new ReplaceableString(input));
    }
}
