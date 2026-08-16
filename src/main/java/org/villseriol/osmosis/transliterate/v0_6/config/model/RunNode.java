// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.config.model;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.UnicodeRange;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "run")
public class RunNode {
    @JacksonXmlProperty(isAttribute = true, localName = "alias")
    private NormalizeAlias alias;

    @JacksonXmlProperty(isAttribute = true, localName = "unicode-group")
    private UnicodeRange unicodeGroup;

    @JacksonXmlElementWrapper(localName = "mapping")
    private List<ReplaceWithNode> replaceWiths = new ArrayList<>();

    @JacksonXmlElementWrapper(localName = "dictionaries")
    private List<DictionaryNode> dictionaries = new ArrayList<>();

    public NormalizeAlias getAlias() {
        return alias;
    }


    public void setAlias(NormalizeAlias alias) {
        this.alias = alias;
    }


    public UnicodeRange getUnicodeGroup() {
        return unicodeGroup;
    }


    public void setUnicodeGroup(UnicodeRange unicodeGroup) {
        this.unicodeGroup = unicodeGroup;
    }


    public List<ReplaceWithNode> getReplaceWiths() {
        return replaceWiths;
    }


    public void setReplaceWiths(List<ReplaceWithNode> replaceWiths) {
        this.replaceWiths = replaceWiths;
    }


    public List<DictionaryNode> getDictionaries() {
        return dictionaries;
    }


    public void setDictionaries(List<DictionaryNode> dictionaries) {
        this.dictionaries = dictionaries;
    }
}
