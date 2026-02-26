package org.muzychuk.boris.ratelimmiter.impl;

import org.muzychuk.boris.ratelimmiter.ClientTypeResolver;
import org.muzychuk.boris.ratelimmiter.RateLimiter;
import org.muzychuk.boris.ratelimmiter.config.RateLimitConfig;
import org.muzychuk.boris.ratelimmiter.domain.ClientTier;
import org.muzychuk.boris.ratelimmiter.domain.RateLimitResult;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PriorityTokenBucketRateLimiter implements RateLimiter {

    private final ClientTypeResolver clientTypeResolver;
    private final Map<ClientTier, RateLimiter> rateLimiterMap;

    //For Test
    public PriorityTokenBucketRateLimiter() {
        clientTypeResolver = new ClientTypeResolver();
        rateLimiterMap = new ConcurrentHashMap<>();
        rateLimiterMap.put(ClientTier.FREE, new TokenBucketRateLimiter(
                new RateLimitConfig(ClientTier.FREE.getMaxRequests(), ClientTier.FREE.getWindowMs())));
        rateLimiterMap.put(ClientTier.STANDARD, new TokenBucketRateLimiter(
                new RateLimitConfig(ClientTier.STANDARD.getMaxRequests(), ClientTier.STANDARD.getWindowMs())));
        rateLimiterMap.put(ClientTier.PREMIUM, new TokenBucketRateLimiter(
                new RateLimitConfig(ClientTier.PREMIUM.getMaxRequests(), ClientTier.PREMIUM.getWindowMs())));
    }

    @Override
    public RateLimitResult tryAcquire(String clientId) {
        ClientTier clientTier = clientTypeResolver.resolveClientTypeByClientId(clientId);
        return rateLimiterMap.get(clientTier).tryAcquire(clientId);
    }
}
