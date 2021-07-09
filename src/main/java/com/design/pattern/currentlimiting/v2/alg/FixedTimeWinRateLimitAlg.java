package com.design.pattern.currentlimiting.v2.alg;

import com.design.pattern.currentlimiting.exception.InternalErrorException;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 固定时间窗口限流算法
 *
 * @author yangsanity
 */
public class FixedTimeWinRateLimitAlg implements RateLimitAlg {

    /**
     * timeout for {@code Lock.tryLock() }.
     * 200ms
     */
    private static final long TRY_LOCK_TIMEOUT = 200L;

    private final Stopwatch stopwatch;

    private final AtomicInteger currentCount;

    private final int limit;

    private final Lock lock = new ReentrantLock();

    public FixedTimeWinRateLimitAlg(int limit) {
        this(limit, Stopwatch.createStarted());
    }

    @VisibleForTesting
    protected FixedTimeWinRateLimitAlg(int limit, Stopwatch stopwatch) {
        currentCount = new AtomicInteger(0);
        this.limit = limit;
        this.stopwatch = stopwatch;
    }

    @Override
    public boolean tryAcquire() throws InternalErrorException {
        int updatedCount = currentCount.incrementAndGet();
        if (updatedCount <= limit) {
            return true;
        }

        try {
            if (lock.tryLock(TRY_LOCK_TIMEOUT, TimeUnit.MILLISECONDS)) {
                try {
                    if (stopwatch.elapsed(TimeUnit.MILLISECONDS) > TimeUnit.SECONDS.toMillis(1)) {
                        currentCount.set(0);
                        stopwatch.reset();
                    }
                    updatedCount = currentCount.incrementAndGet();
                    return updatedCount <= limit;
                } finally {
                    lock.unlock();
                }
            } else {
                throw new InternalErrorException("tryAcquire() wait lock too long:" + TRY_LOCK_TIMEOUT + "ms");
            }
        } catch (InterruptedException e) {
            throw new InternalErrorException("tryAcquire() is interrupted by lock-time-out.", e);
        }
    }
}
