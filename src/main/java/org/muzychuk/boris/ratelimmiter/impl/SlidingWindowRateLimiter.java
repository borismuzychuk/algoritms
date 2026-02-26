package org.muzychuk.boris.ratelimmiter.impl;

import org.muzychuk.boris.ratelimmiter.config.RateLimitConfig;
import org.muzychuk.boris.ratelimmiter.domain.RateLimitResult;
import org.muzychuk.boris.ratelimmiter.RateLimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SlidingWindowRateLimiter implements RateLimiter {

    private final RateLimitConfig config;
    private final Queue<Long> logTimestamps;

    public SlidingWindowRateLimiter(RateLimitConfig config) {
        this.config = config;
        this.logTimestamps = new ConcurrentLinkedQueue<>();
    }

    @Override
    public RateLimitResult tryAcquire(String clientId) {
        long now = System.currentTimeMillis();
        long start = now - config.windowMs();
        while (!logTimestamps.isEmpty() && logTimestamps.peek() < start) {
            logTimestamps.poll();
        }
        if (logTimestamps.size() < config.maxRequests()) {
            logTimestamps.add(now);
            return new RateLimitResult(true, config.maxRequests() - logTimestamps.size(), 0);
        }
        return new RateLimitResult(false, 0, config.windowMs());
    }
}
