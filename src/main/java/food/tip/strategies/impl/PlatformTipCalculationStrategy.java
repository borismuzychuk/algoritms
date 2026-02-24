package food.tip.strategies.impl;

import food.domain.Delivery;
import food.domain.Partner;
import food.tip.strategies.TipCalculationStrategy;

import java.math.BigDecimal;
import java.util.Map;

public class PlatformTipCalculationStrategy implements TipCalculationStrategy {

    private static final String PLATFORM_PERCENT = "0.05";

    @Override
    public void calculateTip(long tipAmount, Delivery delivery, Map<Partner, BigDecimal> result) {
        if (delivery.isHardDelivery()) {
            result.put(Partner.PLATFORM, new BigDecimal(0));
        } else {
            result.put(Partner.PLATFORM, new BigDecimal(tipAmount).multiply(new BigDecimal(PLATFORM_PERCENT)));
        }
    }
}
