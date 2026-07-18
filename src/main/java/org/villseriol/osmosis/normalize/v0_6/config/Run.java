// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6.config;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "run")
public class Run {
    @JacksonXmlProperty(isAttribute = true, localName = "alias")
    private NormalizeAlias alias;

    @JacksonXmlElementWrapper(localName = "mapping")
    private List<ReplaceWith> replaceWiths = new ArrayList<>();

    @JacksonXmlElementWrapper(localName = "filter")
    private List<Tag> tags = new ArrayList<>();

    public NormalizeAlias getAlias() {
        return alias;
    }


    public void setAlias(NormalizeAlias alias) {
        this.alias = alias;
    }


    public List<Tag> getTags() {
        return tags;
    }


    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    public List<ReplaceWith> getReplaceWiths() {
        return replaceWiths;
    }


    public void setReplaceWiths(List<ReplaceWith> replaceWiths) {
        this.replaceWiths = replaceWiths;
    }
}
