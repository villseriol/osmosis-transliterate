// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.model;

import java.util.Comparator;
import java.util.stream.Collectors;


public class TlConfigCharacterMapRecord implements Comparator<TlConfigCharacterMapRecord> {
    private Character from;
    private CharSequence to;

    public TlConfigCharacterMapRecord(Character from, CharSequence to) {
        this.from = from;
        this.to = to;
    }


    public String getFromName() {
        return Character.getName(from);
    }


    public String getToName() {
        return to.toString().codePoints().mapToObj(Character::getName).collect(Collectors.joining(" + "));
    }


    public String getFromCodePoints() {
        return String.format("U+%04X", (int) from);
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


    public void setFrom(Character from) {
        this.from = from;
    }


    public Character getFrom() {
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
