package org.muzychuk.boris.ratelimmiter.config;

public record RateLimitConfig(
        int maxRequests,
        long windowMs
) {
}
