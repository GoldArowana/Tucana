package com.aries.id.tucana.leaf.snowflake.constants;

import com.aries.id.tucana.core.properties.TucanaPropertyFactory;

public class SnowFlakeConst {
    public static final String PREFIX_ZK_PATH = "/snowflake/" + TucanaPropertyFactory.getProperties().getProperty("leaf.name");
    public static final String PROP_PATH = System.getProperty("java.io.tmpdir") + TucanaPropertyFactory.getProperties().getProperty("leaf.name") + "/leafconf/{port}/workerID.properties";
    public static final String PATH_FOREVER = PREFIX_ZK_PATH + "/forever"; //保存所有数据持久的节点
}
