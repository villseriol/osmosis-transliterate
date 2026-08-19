// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.model;

import java.util.Comparator;


public class PreProcessingCharacterMapRecord implements Comparator<PreProcessingCharacterMapRecord> {
    private Character from;
    private Character to;

    public PreProcessingCharacterMapRecord(Character from, Character to) {
        this.from = from;
        this.to = to;
    }


    public String getFromName() {
        return Character.getName(from);
    }


    public String getToName() {
        return Character.getName(to);
    }


    public String getFromCodePoints() {
        return String.format("U+%04X", (int) from);
    }


    public String getToCodePoints() {
        return String.format("U+%04X", (int) to);
    }


    public boolean isFromReserved() {
        return !Character.isDefined(from);
    }


    public boolean isToReserved() {
        return !Character.isDefined(to);
    }


    public void setFrom(Character from) {
        this.from = from;
    }


    public Character getFrom() {
        return from;
    }


    public void setTo(Character to) {
        this.to = to;
    }


    public Character getTo() {
        return to;
    }


    @Override
    public int compare(PreProcessingCharacterMapRecord a, PreProcessingCharacterMapRecord b) {
        return a.getFrom().compareTo(b.getFrom());
    }
}
