package com.aries.id.tucana.jdk8.uuid;

import com.aries.id.tucana.core.IDGenerator;
import com.aries.id.tucana.core.vo.Result;
import org.junit.Test;

public class JDK8UUIDGeneratorTest {
    @Test
    public void getIdTest() {
        IDGenerator<String> idGenerator = new JDK8UUIDGenerator();
        Result<String> result = idGenerator.get(null);
        System.out.println(result);
    }
}
