// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import org.openstreetmap.osmosis.core.domain.v0_6.Entity;
import org.openstreetmap.osmosis.core.domain.v0_6.Tag;
import org.openstreetmap.osmosis.core.lifecycle.Completable;
import org.villseriol.osmosis.kakasi.v0_6.config.NormalizeConfiguration;
import org.villseriol.osmosis.kakasi.v0_6.unicode.transform.NoTransform;
import org.villseriol.osmosis.kakasi.v0_6.unicode.types.Unimap;


public class KakasiPipelineRunner implements Completable {
    private final KakasiPipelineContext context = new KakasiPipelineContext();

    private Unimap pipeline = new NoTransform();

    public void init() {
    }


    public void init(NormalizeConfiguration configuration) {
        KakasiPipelineBuilder builder = new KakasiPipelineBuilder(configuration);

        pipeline = builder.build(context);
    }


    public void initContext(Entity entity) {
        context.setEntityType(entity.getType());
    }


    public Tag run(Tag tag) {
        return new Tag(tag.getKey(), run(tag.getKey(), tag.getValue()));
    }


    public String run(String tag, String value) {
        context.setCurrentTag(tag);
        context.setCurrentValue(value);

        return pipeline.action(value);
    }


    @Override
    public void close() {
    }


    @Override
    public void complete() {
        context.clear();
    }
}
