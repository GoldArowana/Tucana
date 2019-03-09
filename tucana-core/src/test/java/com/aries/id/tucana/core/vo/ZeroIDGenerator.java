package com.aries.id.tucana.core.vo;

import com.aries.id.tucana.core.IDGenerator;
import com.aries.id.tucana.core.constants.Status;

public class ZeroIDGenerator implements IDGenerator<Integer> {
    @Override
    public Result<Integer> get(String key) {
        return new Result<>(0, Status.SUCCESS);
    }

    @Override
    public boolean init() {
        return true;
    }
}