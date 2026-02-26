package org.muzychuk.boris.food.tip.strategies.impl;

import org.muzychuk.boris.food.domain.Delivery;
import org.muzychuk.boris.food.domain.Partner;
import org.muzychuk.boris.food.tip.strategies.TipCalculationStrategy;

import java.math.BigDecimal;
import java.util.Map;

public class RestaurantTipCalculationStrategy implements TipCalculationStrategy {

    private static final String RESTAURANT_PERCENT = "0.1";

    @Override
    public void calculateTip(long tipAmount, Delivery delivery, Map<Partner, BigDecimal> result) {
        if (delivery.restaurantId() != null) {
            result.put(Partner.RESTAURANT, new BigDecimal(tipAmount).multiply(new BigDecimal(RESTAURANT_PERCENT)));
        } else {
            result.put(Partner.RESTAURANT, new BigDecimal("0"));
        }
    }
}
