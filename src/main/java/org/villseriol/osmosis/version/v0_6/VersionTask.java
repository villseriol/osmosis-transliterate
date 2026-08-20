// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.version.v0_6;

import java.util.Map;
import java.util.logging.Logger;

import org.openstreetmap.osmosis.core.container.v0_6.EntityContainer;
import org.openstreetmap.osmosis.core.task.v0_6.Sink;


public class VersionTask implements Sink {
    private static final Logger LOG = Logger.getLogger(VersionTask.class.getName());

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(Map<String, Object> metaData) {
        LOG.info("Villseriol (c) 2026");
        LOG.info("Licensed under GPL-3.0");
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void complete() {
        // Nothing to do.
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        // Nothing to do.
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void process(EntityContainer entityContainer) {
        // Discard the data.
    }

}
