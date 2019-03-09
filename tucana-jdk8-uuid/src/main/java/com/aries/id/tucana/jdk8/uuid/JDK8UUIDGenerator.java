package com.aries.id.tucana.jdk8.uuid;


import com.aries.id.tucana.core.IDGenerator;
import com.aries.id.tucana.core.constants.Status;
import com.aries.id.tucana.core.vo.Result;

public class JDK8UUIDGenerator implements IDGenerator<String> {

    @Override
    public Result<String> get(String key) {
        String uuid = UUIDUtils.getUUID();
        return new Result<>(uuid, Status.SUCCESS);
    }

    @Override
    public boolean init() {
        return false;
    }
}
