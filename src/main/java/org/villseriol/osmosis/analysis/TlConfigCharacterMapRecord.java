// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.analysis;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;


public class TlConfigCharacterMapRecord implements Comparator<TlConfigCharacterMapRecord> {
    private Integer from;
    private CharSequence to;

    public TlConfigCharacterMapRecord(Integer from, CharSequence to) {
        this.from = from;
        this.to = to;
    }


    public String getFromName() {
        return Character.getName(from);
    }


    public String getToName() {
        return Objects.requireNonNullElse(to.toString().codePoints().mapToObj(Character::getName)
                .filter(Objects::nonNull).collect(Collectors.joining(" + ")), "");
    }


    public String getFromCodePoints() {
        return String.format("U+%04X", from);
    }


    public String getToCodePoints() {
        return to.toString().codePoints().mapToObj(codePoint -> String.format("U+%04X", codePoint))
                .collect(Collectors.joining(" + "));
    }


    public boolean isFromReserved() {
        return !Character.isDefined(from);
    }


    public boolean isToReserved() {
        return !to.toString().codePoints().allMatch(Character::isDefined);
    }


    public boolean isToLatin1Compliant() {
        return to.toString().codePoints().allMatch(codePoint -> UnicodeRange.BASIC_LATIN.contains(codePoint)
                || UnicodeRange.LATIN_1_SUPPLEMENT.contains(codePoint));
    }


    public void setFrom(Integer from) {
        this.from = from;
    }


    public Integer getFrom() {
        return from;
    }


    public void setTo(CharSequence to) {
        this.to = to;
    }


    public CharSequence getTo() {
        return to;
    }


    @Override
    public int compare(TlConfigCharacterMapRecord a, TlConfigCharacterMapRecord b) {
        return a.getFrom().compareTo(b.getFrom());
    }
}
