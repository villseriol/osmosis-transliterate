// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.domain.v0_6.Entity;
import org.openstreetmap.osmosis.core.domain.v0_6.EntityType;
import org.openstreetmap.osmosis.core.domain.v0_6.Tag;
import org.openstreetmap.osmosis.core.task.v0_6.Sink;
import org.openstreetmap.osmosis.core.task.v0_6.SinkSource;
import org.villseriol.osmosis.kakasi.v0_6.config.NormalizeConfiguration;
import org.villseriol.osmosis.kakasi.v0_6.utils.XmlLoader;


public class KakasiTask implements SinkSource {
    private static final Logger LOG = Logger.getLogger(KakasiTask.class.getName());

    private Sink sink;

    private final NormalizeConfiguration configuration;
    private final KakasiPipeline pipeline;

    public KakasiTask(final String configFile) {
        LOG.log(Level.FINE, "Normalize configured with " + configFile);

        XmlLoader<NormalizeConfiguration> loader = XmlLoader.getInstance(NormalizeConfiguration.class);
        this.configuration = loader.load(configFile);

        this.pipeline = new KakasiPipeline();
    }


    @Override
    public void process(EntityContainer entityContainer) {
        EntityContainer writeableEntityContainer = entityContainer.getWriteableInstance();
        Entity entity = entityContainer.getEntity();
        Collection<Tag> entityTags = entity.getTags();
        EntityType entityType = entity.getType();

        String startMessage = String.format("Started transliteration of (https://www.openstreetmap.org/%s/%s)",
                entityType.name().toLowerCase(Locale.ROOT), entity.getId());
        LOG.log(Level.FINER, startMessage);

        Collection<Tag> removed = new HashSet<>();
        Collection<Tag> updated = new HashSet<>();

        pipeline.initContext(entity);

        for (Tag tag : entityTags) {
            Tag next = pipeline.run(tag);

            removed.add(tag);
            updated.add(next);
        }

        LOG.log(Level.FINER, "Completed transliteration");

        entityTags.removeAll(removed);
        entityTags.addAll(updated);

        sink.process(writeableEntityContainer);
    }


    @Override
    public void initialize(Map<String, Object> metaData) {
        sink.initialize(metaData);

        pipeline.init(configuration);
    }


    @Override
    public void complete() {
        sink.complete();
        pipeline.complete();
    }


    @Override
    public void close() {
        sink.close();
        pipeline.close();
    }


    @Override
    public void setSink(Sink sink) {
        this.sink = sink;
    }

}
