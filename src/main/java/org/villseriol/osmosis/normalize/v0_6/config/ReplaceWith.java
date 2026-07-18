// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6.config;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "replace-with")
public class ReplaceWith {
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private String value;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<WhenValueIs> whenValues = new ArrayList<>();

    public ReplaceWith() {
        super();
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public List<WhenValueIs> getWhenValues() {
        return whenValues;
    }


    public void setWhenValues(List<WhenValueIs> whenValues) {
        this.whenValues = whenValues;
    }
}
