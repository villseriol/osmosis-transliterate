// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.config;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

@JsonRootName(value = "configuration")
public class NormalizeConfiguration {
    @JacksonXmlElementWrapper(localName = "pipeline")
    private List<RunNode> runs = new ArrayList<>();

    @JacksonXmlElementWrapper(localName = "filter")
    private List<TagNode> tags = new ArrayList<>();

    public List<RunNode> getRuns() {
        return runs;
    }

    public void setRuns(List<RunNode> runs) {
        this.runs = runs;
    }

    public List<TagNode> getTags() {
        return tags;
    }

    public void setTags(List<TagNode> tags) {
        this.tags = tags;
    }
}
