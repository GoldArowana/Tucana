package com.aries.id.tucana.core.properties;

import org.junit.Test;

import java.util.Properties;

public class TucanaPropertyFactoryTest {
    @Test
    public void loadTest() {
        Properties tucanaProp = TucanaPropertyFactory.getProperties();
        String name = tucanaProp.getProperty("name");
        System.out.println(name);
    }

    @Test
    public void printAllProp() {
        Properties tucanaProp = TucanaPropertyFactory.getProperties();
        tucanaProp.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
