# Osmosis Transliterate

This plugin is used for pre-processing OSM data before ingestion into `mkgmap`. Its primary goal is
to ensure tag-value pairs are latin1 compliant.

To do this, the plugin provides custom transliteration methods that you may use in addition to
user-defined maps. See the example configuration for more.

## Installation

### Docker

The recommended approach for using this in docker is to create a `plugins` directory at the current
working directory. You may instead use the `~/.openstreetmap/osmosis/plugins` directory but this
integration is more complex as the home directory may change depending on the `USER` configuration.

```dockerfile
FROM eclipse-temurin:21-jdk

RUN apt-get update -y
RUN apt-get install -y osmosis

RUN mkdir -p /plugins
RUN wget -O /plugins/osmosis-kakasi-2.0.0-plugin.zip https://github.com/villseriol/osmosis-kakasi/releases/download/2.0.0/osmosis-kakasi-2.0.0-plugin.zip

# dry-run of osmosis to confirm JPF loading works
RUN osmosis --read-empty --write-null
```

### Ubuntu

The recommended way of installing this plugin locally is to download the plugin `.zip` and copy it
to your user osmosis home directory.

```sh
sudo apt get install osmosis
mkdir -p ~/.openstreetmap/osmosis/plugins
wget -O ~/.openstreetmap/osmosis/plugins/osmosis-kakasi-2.0.0-plugin.zip https://github.com/villseriol/osmosis-kakasi/releases/download/2.0.0/osmosis-kakasi-2.0.0-plugin.zip

# dry-run of osmosis to confirm JPF loading works
osmosis --read-empty --oss-tl-version-0.6
```

### Windows

TBD

## Usage

## Licensing

This project is in compliance with the the following licensing restrictions,

| Entity                                 | Reviewed On | Use       | Notes      |
| -------------------------------------- | ----------- | --------- | ---------- |
| org.apache.commons:commons-text:1.15.0 | 29/04/2026  | Embedded  | Apache-2.0 |
| com.ibm.icu:icu4j:78.3                 | 29/04/2026  | Embedded  | Unicode V3 |
| io.github.villseriol:kakasi2:2.0.2     | 29/04/2026  | Embedded  | GPL 3.0    |
| skk-dev/dict                           | 29/04/2026  | Resources | GPL 2.0    |

## Disclaimer

This program is free software: you can redistribute it and/or modify it under the terms of the GNU
General Public License as published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not,
see <https://www.gnu.org/licenses/>.
