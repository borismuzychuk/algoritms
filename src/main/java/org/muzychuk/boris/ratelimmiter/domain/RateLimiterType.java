package org.muzychuk.boris.ratelimmiter.domain;

import lombok.Getter;

@Getter
public enum RateLimiterType {

    TOKEN_BUCKET("Token bucket"),
    FIXED_WINDOW("Fixed window"),
    SLIDING_WINDOW("Sliding window");

    final String name;

    RateLimiterType(String name) {
        this.name = name;
    }
}
