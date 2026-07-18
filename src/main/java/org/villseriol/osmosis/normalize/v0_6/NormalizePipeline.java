// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6;

import org.villseriol.osmosis.normalize.v0_6.config.NormalizeConfiguration;


public class NormalizePipeline {
    private final ThreadLocal<String> context = new ThreadLocal<>();

    public void init(NormalizeConfiguration configuration) {
        // build up the pipeline here

        // add filtering logic here as well via a transform decorator
    }


    public String run(String tag, String value) {
        context.set(tag);

        return null;
    }
}
