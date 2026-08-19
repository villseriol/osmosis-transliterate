// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.villseriol.osmosis.common.UnicodeRange;
import org.villseriol.osmosis.detective.v0_6.model.TlConfigCharacterMapRecord;
import org.villseriol.osmosis.detective.v0_6.report.TlConfigCharacterMapReport;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class TlConfigCharacterMapReportBuilder {
    private final Map<UnicodeRange, Collection<TlConfigCharacterMapRecord>> data = new HashMap<>();

    public void process(Unimap unimap) {
        for (UnicodeRange range : UnicodeRange.values()) {
            int lower = Math.max(range.getLower(), 0);
            int upper = Math.min(range.getUpper(), Character.MAX_VALUE);

            for (int codePoint = lower; codePoint <= upper; codePoint++) {
                char from = (char) codePoint;
                String output = unimap.action(String.valueOf(from));

                data.computeIfAbsent(range, key -> new ArrayList<>()).add(new TlConfigCharacterMapRecord(from, output));
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
