package com.aries.id.tucana.leaf.snowflake;

import org.junit.Test;

public class SnowflakeZookeeperHolderTest {
    @Test
    public void initTest() {
        SnowflakeZookeeperHolder snowflakeZookeeperHolder = new SnowflakeZookeeperHolder("localhost",
                String.valueOf(8080), "localhost:2181");

        snowflakeZookeeperHolder.init();
    }
}
