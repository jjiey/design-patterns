package com.design.pattern.currentlimiting.v2.alg;

import com.design.pattern.currentlimiting.exception.InternalErrorException;

/**
 * 限流算法抽象接口
 *
 * @author yangsanity
 */
public interface RateLimitAlg {

    boolean tryAcquire() throws InternalErrorException;
}
