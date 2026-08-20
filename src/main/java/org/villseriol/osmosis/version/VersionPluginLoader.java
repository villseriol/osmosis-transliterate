// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.version;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.plugin.PluginLoader;


public class VersionPluginLoader implements PluginLoader {
    @Override
    public Map<String, TaskManagerFactory> loadTaskFactories() {
        TaskManagerFactory transformFactory = new org.villseriol.osmosis.version.v0_6.VersionTaskFactory();

        Map<String, TaskManagerFactory> tasks = new HashMap<String, TaskManagerFactory>();

        tasks.put("oss-tl-version", transformFactory);
        tasks.put("oss-tl-version-0.6", transformFactory);

        return tasks;
    }
}
