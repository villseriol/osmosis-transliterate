// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.configuration.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.villseriol.osmosis.kakasi.v0_6.configuration.Replacement;
import org.villseriol.osmosis.kakasi.v0_6.configuration.StringReplacement;
import org.villseriol.osmosis.kakasi.v0_6.configuration.TagKeyMatch;
import org.villseriol.osmosis.kakasi.v0_6.configuration.TagMatch;

import com.fasterxml.jackson.annotation.JsonRootName;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonRootName(value = "configuration")
public final class UserConfiguration {
    @JacksonXmlElementWrapper(localName = "replacement-list")
    private List<ReplaceWithEntry> replaceWithEntries = new ArrayList<>();

    @JacksonXmlElementWrapper(localName = "dictionary-list")
    private List<DictionaryEntry> dictionaryEntries = new ArrayList<>();

    @JacksonXmlElementWrapper(localName = "tag-list")
    private List<TagEntry> tagEntries = new ArrayList<>();

    @JacksonXmlProperty(isAttribute = true, localName = "exclude-relations")
    private boolean excludeRelations;

    @JacksonXmlProperty(isAttribute = true, localName = "exclude-ways")
    private boolean excludeWays;

    @JacksonXmlProperty(isAttribute = true, localName = "exclude-nodes")
    private boolean excludeNodes;

    public UserConfiguration() {
        super();
    }


    public void setExcludeNodes(boolean excludeNodes) {
        this.excludeNodes = excludeNodes;
    }


    public boolean isExcludeNodes() {
        return excludeNodes;
    }


    public void setExcludeRelations(boolean excludeRelations) {
        this.excludeRelations = excludeRelations;
    }


    public boolean isExcludeRelations() {
        return excludeRelations;
    }


    public void setExcludeWays(boolean excludeWays) {
        this.excludeWays = excludeWays;
    }


    public boolean isExcludeWays() {
        return excludeWays;
    }


    public List<ReplaceWithEntry> getReplaceWithEntries() {
        return replaceWithEntries;
    }


    public void setReplaceWithEntries(List<ReplaceWithEntry> replaceWithEntries) {
        this.replaceWithEntries = replaceWithEntries;
    }


    public List<DictionaryEntry> getDictionaryEntries() {
        return dictionaryEntries;
    }


    public void setDictionaryEntries(List<DictionaryEntry> dictionaryEntries) {
        this.dictionaryEntries = dictionaryEntries;
    }


    public List<TagEntry> getTagEntries() {
        return tagEntries;
    }


    public void setTagEntries(List<TagEntry> tagEntries) {
        this.tagEntries = tagEntries;
    }


    public List<Replacement> getReplacements() {
        return replaceWithEntries.stream()
                .flatMap(r -> r.getWhenValues().stream()
                        .map(w -> (Replacement) new StringReplacement(w.getValue(), r.getValue())))
                .collect(Collectors.toList());
    }


    public List<TagMatch> getTagMatches() {
        return tagEntries.stream().map(t -> (TagMatch) new TagKeyMatch(t.getKey())).collect(Collectors.toList());
    }
}
