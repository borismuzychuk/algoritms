package food.tip.strategies.impl;

import food.domain.Delivery;
import food.domain.Partner;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PlatformTipCalculationStrategyTest {

    private PlatformTipCalculationStrategy platformTipCalculationStrategy = new PlatformTipCalculationStrategy();

    @Test
    void whenDeliveryIsNotHard_ThenReturnTip() {
        Map<Partner, BigDecimal> result = new HashMap<>();
        platformTipCalculationStrategy.calculateTip(100,
                new Delivery(1L, 2L, 3L, false), result);
        assertEquals(new BigDecimal("5.00"), result.get(Partner.PLATFORM));
    }

    @Test
    void whenDeliveryIsNotHard_ThenReturnZeroTip() {
        Map<Partner, BigDecimal> result = new HashMap<>();
        platformTipCalculationStrategy.calculateTip(100,
                new Delivery(1L, 2L, 3L, true), result);
        assertEquals(new BigDecimal("0"), result.get(Partner.PLATFORM));
    }
}