// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.villseriol.osmosis.common.UnicodeRange;
import org.villseriol.osmosis.detective.v0_6.model.PreProcessingCharacterMapRecord;
import org.villseriol.osmosis.detective.v0_6.report.PreProcessingCharacterMapReport;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class PreProcessingCharacterMapReportBuilder {
    private final Map<UnicodeRange, Collection<PreProcessingCharacterMapRecord>> data = new HashMap<>();

    public void process(Unimap unimap) {
        for (UnicodeRange range : UnicodeRange.values()) {
            int lower = Math.max(range.getLower(), 0);
            int upper = Math.min(range.getUpper(), Character.MAX_VALUE);

            for (int codePoint = lower; codePoint <= upper; codePoint++) {
                char from = (char) codePoint;
                String output = unimap.action(String.valueOf(from));

                if (output.length() == 1 && output.charAt(0) != from) {
                    data.computeIfAbsent(range, key -> new ArrayList<>())
                            .add(new PreProcessingCharacterMapRecord(from, output.charAt(0)));
                }
            }
        }
    }


    public PreProcessingCharacterMapReport build() {
        return new PreProcessingCharacterMapReport(data);
    }
}
