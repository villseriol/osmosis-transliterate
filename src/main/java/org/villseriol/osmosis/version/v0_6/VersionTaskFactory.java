// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.version.v0_6;

import org.openstreetmap.osmosis.core.pipeline.common.TaskConfiguration;
import org.openstreetmap.osmosis.core.pipeline.common.TaskManager;
import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.pipeline.v0_6.SinkManager;


public class VersionTaskFactory extends TaskManagerFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    protected TaskManager createTaskManagerImpl(TaskConfiguration taskConfig) {
        return new SinkManager(taskConfig.getId(), new VersionTask(), taskConfig.getPipeArgs());
    }

}
