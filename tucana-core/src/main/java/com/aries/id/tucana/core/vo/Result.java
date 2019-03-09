package com.aries.id.tucana.core.vo;

import com.aries.id.tucana.core.constants.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private T id;
    private Status status = Status.UNDEFINED;
}
