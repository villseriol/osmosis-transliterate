// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.reports;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class TlConfigCharacterMapReportBuilder {
    private final Map<UnicodeRange, Collection<TlConfigCharacterMapRecord>> data = new HashMap<>();

    public void process(Unimap unimap) {
        for (UnicodeRange range : UnicodeRange.values()) {
            int lower = Math.max(range.getLower(), 0);
            int upper = Math.min(range.getUpper(), Character.MAX_CODE_POINT);

            for (int codePoint = lower; codePoint <= upper; codePoint++) {
                if (codePoint >= Character.MIN_SURROGATE && codePoint <= Character.MAX_SURROGATE) {
                    continue;
                }

                String from = new String(Character.toChars(codePoint));
                String output = unimap.action(from);

                data.computeIfAbsent(range, key -> new ArrayList<>())
                        .add(new TlConfigCharacterMapRecord(codePoint, output));
            }
        }
    }


    public Map<UnicodeRange, Collection<TlConfigCharacterMapRecord>> getData() {
        return data;
    }


    public TlConfigCharacterMapReport build() {
        return new TlConfigCharacterMapReport(data);
    }
}
