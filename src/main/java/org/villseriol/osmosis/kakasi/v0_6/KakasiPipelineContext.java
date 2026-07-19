package org.villseriol.osmosis.kakasi.v0_6;

public class KakasiPipelineContext {
    private String currentTag;

    public void setCurrentTag(String currentTag) {
        this.currentTag = currentTag;
    }


    public String getCurrentTag() {
        return currentTag;
    }
}
