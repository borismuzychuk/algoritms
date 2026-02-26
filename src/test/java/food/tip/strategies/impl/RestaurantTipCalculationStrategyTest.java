package food.tip.strategies.impl;

import org.muzychuk.boris.food.domain.Delivery;
import org.muzychuk.boris.food.domain.Partner;
import org.junit.jupiter.api.Test;
import org.muzychuk.boris.food.tip.strategies.impl.RestaurantTipCalculationStrategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTipCalculationStrategyTest {

    private final RestaurantTipCalculationStrategy restaurantTipCalculationStrategy
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