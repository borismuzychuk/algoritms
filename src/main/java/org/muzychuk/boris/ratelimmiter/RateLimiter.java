package org.muzychuk.boris.ratelimmiter;

import org.muzychuk.boris.ratelimmiter.domain.RateLimitResult;

public interface RateLimiter {

    /**
     * Проверить, разрешён ли запрос для данного клиента.
     *
     * @param clientId идентификатор клиента
     * @return результат проверки
     */
    RateLimitResult tryAcquire(String clientId);

}
