package com.design.pattern.currentlimiting.v2.rule;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author yangsanity
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiLimit {

    // 1 second
    private static final int DEFAULT_TIME_UNIT = 1;

    private String api;

    private int limit;

    private int unit = DEFAULT_TIME_UNIT;

    public ApiLimit(String api, int limit) {
        this(api, limit, DEFAULT_TIME_UNIT);
    }
}
