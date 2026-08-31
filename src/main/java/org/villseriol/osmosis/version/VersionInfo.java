// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.version;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public final class VersionInfo {
    private static final String RESOURCE = "/version.properties";
    private static final String UNKNOWN = "unknown";
    private static final String VERSION = readVersion();


    private VersionInfo() {
        // Static utility class.
    }


    /**
     * Gets the project version, as baked in at build time by Maven resource filtering.
     *
     * @return The version, or "unknown" if it could not be determined.
     */
    public static String getVersion() {
        return VERSION;
    }


    private static String readVersion() {
        try (InputStream in = VersionInfo.class.getResourceAsStream(RESOURCE)) {
            if (in == null) {
                return UNKNOWN;
            }

            Properties properties = new Properties();
            properties.load(in);

            return properties.getProperty("version", UNKNOWN);

        } catch (IOException e) {
            // Version reporting must never break the pipeline.
            return UNKNOWN;
        }
    }
}
