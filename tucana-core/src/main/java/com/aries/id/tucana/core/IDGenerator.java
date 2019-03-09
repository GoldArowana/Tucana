package com.aries.id.tucana.core;

import com.aries.id.tucana.core.vo.Result;

public interface IDGenerator<T> {
    Result<T> get(String key);

    boolean init();
}
