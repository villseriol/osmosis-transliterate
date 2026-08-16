// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.config;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "when-value-is")
public class WhenValueIsNode {
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private String value;

    public WhenValueIsNode() {
        super();
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }
}
