package com.design.pattern.currentlimiting.v2.alg;

import com.design.pattern.currentlimiting.v2.rule.ApiLimit;

import static com.design.pattern.currentlimiting.v2.alg.RateLimitAlgEnum.FIXED_TIME_WIN;

/**
 * 限流算法策略工厂
 *
 * @author yangsanity
 */
public class RateLimitAlgFactory {

    public static RateLimitAlg getStrategy(String algType, ApiLimit apiLimit) {
        if (algType == null || algType.isEmpty()) {
            throw new IllegalArgumentException("algType should not be empty.");
        }
        if (FIXED_TIME_WIN.getName().equals(algType)) {
            return new FixedTimeWinRateLimitAlg(apiLimit.getLimit());
        }
        return null;
    }
}
