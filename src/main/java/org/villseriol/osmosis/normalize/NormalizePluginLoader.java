// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.plugin.PluginLoader;
import org.villseriol.osmosis.kakasi.v0_6.KakasiTaskFactory;


public class NormalizePluginLoader implements PluginLoader {
    @Override
    public Map<String, TaskManagerFactory> loadTaskFactories() {
        KakasiTaskFactory transformFactory = new org.villseriol.osmosis.kakasi.v0_6.KakasiTaskFactory();

        Map<String, TaskManagerFactory> tasks = new HashMap<String, TaskManagerFactory>();
        tasks.put("normalize", transformFactory);
        tasks.put("normalize-0.6", transformFactory);

        return tasks;
    }
}
