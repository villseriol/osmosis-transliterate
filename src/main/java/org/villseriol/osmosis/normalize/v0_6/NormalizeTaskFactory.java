// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6;

import org.openstreetmap.osmosis.core.pipeline.common.TaskConfiguration;
import org.openstreetmap.osmosis.core.pipeline.common.TaskManager;
import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.pipeline.v0_6.SinkSourceManager;


public class NormalizeTaskFactory extends TaskManagerFactory {
    @Override
    protected TaskManager createTaskManagerImpl(TaskConfiguration taskConfig) {
        String configFile = getStringArgument(taskConfig, "file",
                getDefaultStringArgument(taskConfig, "normalize.xml"));

        return new SinkSourceManager(taskConfig.getId(), new NormalizeTask(configFile), taskConfig.getPipeArgs());
    }
}
