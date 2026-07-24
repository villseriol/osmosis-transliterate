// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import java.util.HashMap;
import java.util.Map;


public class KakasiPipelineContext {
    private String currentTag;
    private String currentValue;
    private String entityType;
    private final Map<String, String> tags = new HashMap<>();

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


    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }


    public String getEntityType() {
        return entityType;
    }


    public void setTags(Map<String, String> tags) {
        this.tags.clear();
        this.tags.putAll(tags);
    }


    public Map<String, String> getTags() {
        return tags;
    }


    public void clear() {
        this.currentTag = null;
        this.currentValue = null;
        this.entityType = null;
        this.tags.clear();
    }
}
