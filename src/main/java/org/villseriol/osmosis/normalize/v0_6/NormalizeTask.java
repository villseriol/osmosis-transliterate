// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.task.v0_6.Sink;
import org.openstreetmap.osmosis.core.task.v0_6.SinkSource;


public class NormalizeTask implements SinkSource {
    private static final Logger LOG = Logger.getLogger(NormalizeTask.class.getName());

    public NormalizeTask(final String configFile) {
        LOG.log(Level.FINE, "Normalize configured with " + configFile);
    }


    @Override
    public void process(EntityContainer entityContainer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'process'");
    }


    @Override
    public void initialize(Map<String, Object> metaData) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }


    @Override
    public void complete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'complete'");
    }


    @Override
    public void close() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }


    @Override
    public void setSink(Sink sink) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSink'");
    }

}
