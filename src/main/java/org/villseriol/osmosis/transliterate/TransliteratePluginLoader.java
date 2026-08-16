// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate;

import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.osmosis.core.pipeline.common.TaskManagerFactory;
import org.openstreetmap.osmosis.core.plugin.PluginLoader;


public class TransliteratePluginLoader implements PluginLoader {
    @Override
    public Map<String, TaskManagerFactory> loadTaskFactories() {
        TaskManagerFactory transformFactory = new org.villseriol.osmosis.transliterate.v0_6.TransliterateTaskFactory();

        Map<String, TaskManagerFactory> tasks = new HashMap<String, TaskManagerFactory>();
        tasks.put("transliterate", transformFactory);
        tasks.put("transliterate-0.6", transformFactory);

        tasks.put("oss-tl", transformFactory);
        tasks.put("oss-tl-0.6", transformFactory);

        return tasks;
    }
}
