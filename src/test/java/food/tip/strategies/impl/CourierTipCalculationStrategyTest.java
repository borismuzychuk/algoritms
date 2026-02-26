package food.tip.strategies.impl;

import org.muzychuk.boris.food.domain.Delivery;
import org.muzychuk.boris.food.domain.Partner;
import org.junit.jupiter.api.Test;
import org.muzychuk.boris.food.tip.strategies.impl.CourierTipCalculationStrategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CourierTipCalculationStrategyTest {

    private final CourierTipCalculationStrategy courierTipCalculationStrategy = new CourierTipCalculationStrategy();

    @Test
    void whenDeliveryIsNotHard_ThenReturnStandardTip() {
        Map<Partner, BigDecimal> result = new HashMap<>();
        courierTipCalculationStrategy.calculateTip(100,
                new Delivery(1L, 2L, 3L, false), result);
        assertEquals(new BigDecimal("85.00"), result.get(Partner.COURIER));
    }

    @Test
    void whenDeliveryIsHard_ThenReturnHigherTip() {
        Map<Partner, BigDecimal> result = new HashMap<>();
        courierTipCalculationStrategy.calculateTip(
                100,
                new Delivery(1L, 2L, 3L, true), result);
        assertEquals(new BigDecimal("90.0"), result.get(Partner.COURIER));
    }
}