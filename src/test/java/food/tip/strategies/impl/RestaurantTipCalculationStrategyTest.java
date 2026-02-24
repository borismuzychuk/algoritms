package food.tip.strategies.impl;

import food.domain.Delivery;
import food.domain.Partner;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTipCalculationStrategyTest {

    private RestaurantTipCalculationStrategy restaurantTipCalculationStrategy
            = new RestaurantTipCalculationStrategy();

    @Test
    void whenRestaurantIsPartner_ThenReturnTip() {
        Map<Partner, BigDecimal> result = new HashMap<>();
        restaurantTipCalculationStrategy.calculateTip(100,
                new Delivery(1L, 2L, 3L, false), result);
        assertEquals(new BigDecimal("10.0"), result.get(Partner.RESTAURANT));
    }

    @Test
    void whenRestaurantIsNotPartner_ThenReturnZeroTip() {
        Map<Partner, BigDecimal> result = new HashMap<>();
        restaurantTipCalculationStrategy.calculateTip(100,
                new Delivery(1L, 2L, null, false), result);
        assertEquals(new BigDecimal("0"), result.get(Partner.RESTAURANT));
    }
}