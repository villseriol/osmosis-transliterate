// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.model;

import java.util.stream.Collectors;


public class TransliteratePreProcessingCharacterMapRecord {
    private CharSequence from;
    private CharSequence to;

    public TransliteratePreProcessingCharacterMapRecord(CharSequence from, CharSequence to) {
        this.from = from;
        this.to = to;
    }


    public String getFromName() {
        return from.toString().codePoints().mapToObj(Character::getName).collect(Collectors.joining(" + "));
    }


    public String getToName() {
        return to.toString().codePoints().mapToObj(Character::getName).collect(Collectors.joining(" + "));
    }


    public String getFromCodePoints() {
        return from.toString().codePoints().mapToObj(Integer::toString).collect(Collectors.joining(" + "));
    }


    public String getToCodePoints() {
        return to.toString().codePoints().mapToObj(Integer::toString).collect(Collectors.joining(" + "));
    }


    public void setFrom(CharSequence from) {
        this.from = from;
    }


    public CharSequence getFrom() {
        return from;
    }


    public void setTo(CharSequence to) {
        this.to = to;
    }


    public CharSequence getTo() {
        return to;
    }

}
