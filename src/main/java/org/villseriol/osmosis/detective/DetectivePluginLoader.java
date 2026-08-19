// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.plugin.PluginLoader;


public class DetectivePluginLoader implements PluginLoader {

    @Override
    public Map<String, TaskManagerFactory> loadTaskFactories() {
        TaskManagerFactory transformFactory = new org.villseriol.osmosis.transliterate.v0_6.TransliterateTaskFactory();

        Map<String, TaskManagerFactory> tasks = new HashMap<String, TaskManagerFactory>();
        tasks.put("detective", transformFactory);
        tasks.put("detective-0.6", transformFactory);

        tasks.put("oss-det", transformFactory);
        tasks.put("oss-det-0.6", transformFactory);

        return tasks;
    }

}
