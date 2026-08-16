// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.config;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "dictionary")
public class DictionaryNode {
    @JacksonXmlProperty(isAttribute = true, localName = "path")
    private String path;

    @JacksonXmlProperty(isAttribute = true, localName = "alias")
    private String alias;

    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }


    public String getAlias() {
        return alias;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }
}
