package org.muzychuk.boris;

import org.muzychuk.boris.ratelimmiter.RateLimiter;
import org.muzychuk.boris.ratelimmiter.domain.RateLimiterType;
import org.muzychuk.boris.ratelimmiter.impl.PriorityFixedWindowRateLimiter;
import org.muzychuk.boris.ratelimmiter.impl.PrioritySlidingWindowRateLimiter;
import org.muzychuk.boris.ratelimmiter.impl.PriorityTokenBucketRateLimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiterFactory {

    private final Map<String, RateLimiter> rateLimitersMap;

    public RateLimiterFactory() {
        rateLimitersMap = new ConcurrentHashMap<>();
        rateLimitersMap.put(RateLimiterType.TOKEN_BUCKET.getName(), new PriorityTokenBucketRateLimiter());
        rateLimitersMap.put(RateLimiterType.FIXED_WINDOW.getName(), new PriorityFixedWindowRateLimiter());
        rateLimitersMap.put(RateLimiterType.SLIDING_WINDOW.getName(), new PrioritySlidingWindowRateLimiter());
    }

    public RateLimiter getRateLimiter(String name) {
        return rateLimitersMap.getOrDefault(name, new PriorityTokenBucketRateLimiter());
    }
}
