package org.muzychuk.boris.food.domain;

public record Delivery(
        Long orderId,
        Long courierId,
        Long restaurantId,
        Boolean isHardDelivery
) {
}
