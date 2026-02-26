package org.muzychuk.boris.ratelimmiter.impl;

import org.muzychuk.boris.ratelimmiter.config.RateLimitConfig;
import org.muzychuk.boris.ratelimmiter.domain.RateLimitResult;
import org.muzychuk.boris.ratelimmiter.RateLimiter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class FixedWindowRateLimiter implements RateLimiter {

    private final RateLimitConfig config;
    private volatile long startTimestamp;
    private final AtomicInteger counter;

    public FixedWindowRateLimiter(RateLimitConfig config) {
        this.config = config;
        startTimestamp = System.currentTimeMillis();
        counter = new AtomicInteger(0);
    }

    @Override
    public RateLimitResult tryAcquire(String clientId) {
        long now = System.currentTimeMillis();
        if (now - startTimestamp > config.windowMs()) {
            counter.set(0);
            startTimestamp = now;
        }
        if (counter.get() < config.maxRequests()) {
            return new RateLimitResult(true, config.maxRequests() - counter.get(), 0);
        }
        return new RateLimitResult(false, 0, config.windowMs());
    }
}
