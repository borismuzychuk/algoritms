package org.muzychuk.boris.ratelimmiter.domain;

public record RateLimitResult(
        boolean allowed,
        int remainingRequests,
        long retryAfterMs  // через сколько мс можно повторить, если отклонён
) {

}
