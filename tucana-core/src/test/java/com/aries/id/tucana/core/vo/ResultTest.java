package com.aries.id.tucana.core.vo;

import com.aries.id.tucana.core.IDGenerator;
import org.junit.Test;

public class ResultTest {
    @Test
    public void zeroIdGeneratorTest() {
        IDGenerator idGenerator = new ZeroIDGenerator();
        Result result = idGenerator.get(null);
        System.out.println(result);
    }

}
