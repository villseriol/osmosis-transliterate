// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.config;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "replace-with")
public class ReplaceWithNode {
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private String value;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "when-value-is")
    private List<WhenValueIsNode> whenValues = new ArrayList<>();

    public ReplaceWithNode() {
        super();
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public List<WhenValueIsNode> getWhenValues() {
        return whenValues;
    }


    public void setWhenValues(List<WhenValueIsNode> whenValues) {
        this.whenValues = whenValues;
    }
}
