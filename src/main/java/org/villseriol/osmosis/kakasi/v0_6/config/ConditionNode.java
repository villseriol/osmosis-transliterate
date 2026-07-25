// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.config;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "condition")
public class ConditionNode {
    @JacksonXmlProperty(isAttribute = true, localName = "expr")
    private String expr;

    @JacksonXmlProperty(isAttribute = true, localName = "path")
    private String path;

    public ConditionNode() {
        super();
    }


    public String getExpr() {
        return expr;
    }


    public void setExpr(String expr) {
        this.expr = expr;
    }


    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }
}
