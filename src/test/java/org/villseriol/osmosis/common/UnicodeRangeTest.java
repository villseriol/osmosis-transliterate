// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.common;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class UnicodeRangeTest {
    @Test
    public void testNoRangesOverlap() {
        UnicodeRange[] ranges = UnicodeRange.values();
        List<String> overlaps = new ArrayList<>();

        for (int i = 0; i < ranges.length; i++) {
            for (int j = 0; j < ranges.length; j++) {
                if (i == j) {
                    continue;
                }

                UnicodeRange a = ranges[i];
                UnicodeRange b = ranges[j];

                if (a.getLower() <= b.getUpper() && b.getLower() <= a.getUpper()) {
                    overlaps.add(a.name() + " overlaps " + b.name());
                }
            }
        }

        assertTrue("Found overlapping ranges: " + overlaps, overlaps.isEmpty());
    }
}
