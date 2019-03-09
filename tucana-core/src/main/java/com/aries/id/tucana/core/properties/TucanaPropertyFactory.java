package com.aries.id.tucana.core.properties;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Properties;

@Slf4j
public class TucanaPropertyFactory {
    private static final Properties prop = new Properties() {{
        try {
            load(TucanaPropertyFactory.class.getClassLoader().getResourceAsStream("tucana.properties"));
        } catch (IOException e) {
            log.warn("Load tucana.properties Ex", e);
        }
    }};

    public static Properties getProperties() {
        return prop;
    }
}
