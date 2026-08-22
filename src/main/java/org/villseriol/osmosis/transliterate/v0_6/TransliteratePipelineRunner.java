// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6;

import org.openstreetmap.osmosis.core.domain.v0_6.Tag;
import org.villseriol.osmosis.transliterate.v0_6.config.model.NormalizeConfiguration;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.NoTransform;


public class TransliteratePipelineRunner {
    private final TransliteratePipelineContext context = new TransliteratePipelineContext();

    private Unimap pipeline = new NoTransform();

    public void init(NormalizeConfiguration configuration) {
        TransliteratePipelineBuilder builder = new TransliteratePipelineBuilder(configuration);

        pipeline = builder.build(context);
    }


    public Tag run(Tag tag) {
        return new Tag(tag.getKey(), run(tag.getKey(), tag.getValue()));
    }


    public String run(String tag, String value) {
        context.setCurrentTag(tag);
        context.setCurrentValue(value);

        return pipeline.action(value);
    }
}
