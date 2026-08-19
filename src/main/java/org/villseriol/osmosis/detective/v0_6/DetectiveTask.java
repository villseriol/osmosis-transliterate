// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6;

import java.util.Map;
import java.util.logging.Logger;

import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.task.v0_6.Sink;
import org.openstreetmap.osmosis.core.task.v0_6.SinkSource;


public class DetectiveTask implements SinkSource {
    private static final Logger LOG = Logger.getLogger(DetectiveTask.class.getName());
    private Sink sink;

    @Override
    public void process(EntityContainer entityContainer) {
        sink.process(entityContainer);
    }


    @Override
    public void initialize(Map<String, Object> metaData) {
        sink.initialize(metaData);
    }


    @Override
    public void complete() {
        sink.complete();
    }


    @Override
    public void close() {
        sink.close();
    }


    @Override
    public void setSink(Sink sink) {
        this.sink = sink;
    }

}
