// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6.config;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;


@JsonRootName(value = "configuration")
public class NormalizeConfiguration {
    @JacksonXmlElementWrapper(localName = "pipeline")
    private List<Run> runs = new ArrayList<>();

    @JacksonXmlElementWrapper(localName = "filter")
    private List<Tag> tags = new ArrayList<>();

    public List<Run> getRuns() {
        return runs;
    }


    public void setRuns(List<Run> runs) {
        this.runs = runs;
    }


    public List<Tag> getTags() {
        return tags;
    }


    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
