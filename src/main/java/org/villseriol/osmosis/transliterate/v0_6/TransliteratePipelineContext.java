// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6;

public class TransliteratePipelineContext {
    private String currentTag;
    private String currentValue;

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }


    public String getCurrentValue() {
        return currentValue;
    }


    public void setCurrentTag(String currentTag) {
        this.currentTag = currentTag;
    }


    public String getCurrentTag() {
        return currentTag;
    }


    public void clear() {
        this.currentTag = null;
        this.currentValue = null;
    }
}
