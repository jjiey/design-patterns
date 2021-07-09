package com.design.pattern.currentlimiting.v2.alg;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 限流算法枚举
 *
 * @author yangsanity
 */
@Getter
@AllArgsConstructor
public enum RateLimitAlgEnum {

    /**/
    FIXED_TIME_WIN("fixedTimeWin");

    private final String name;
}
