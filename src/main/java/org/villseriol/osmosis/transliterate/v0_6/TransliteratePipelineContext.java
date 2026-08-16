// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6;

import org.openstreetmap.osmosis.core.domain.v0_6.EntityType;


public class TransliteratePipelineContext {
    private String currentTag;
    private String currentValue;
    private EntityType entityType;

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


    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }


    public EntityType getEntityType() {
        return entityType;
    }


    public boolean isWay() {
        return EntityType.Way.equals(entityType);
    }


    public boolean isNode() {
        return EntityType.Node.equals(entityType);
    }


    public boolean isRelation() {
        return EntityType.Relation.equals(entityType);
    }


    public boolean isBound() {
        return EntityType.Bound.equals(entityType);
    }


    public void clear() {
        this.currentTag = null;
        this.currentValue = null;
        this.entityType = null;
    }
}
