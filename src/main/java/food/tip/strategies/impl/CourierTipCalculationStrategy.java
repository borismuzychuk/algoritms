package food.tip.strategies.impl;

import food.domain.Delivery;
import food.domain.Partner;
import food.tip.strategies.TipCalculationStrategy;

import java.math.BigDecimal;
import java.util.Map;

public class CourierTipCalculationStrategy implements TipCalculationStrategy {

    @Override
    public void calculateTip(long tipAmount, Delivery delivery, Map<Partner, BigDecimal> result) {
        // можно упростить
        if (delivery.isHardDelivery()) {
            if (delivery.restaurantId() != null) {
                result.put(Partner.COURIER, new BigDecimal("0.9").multiply(new BigDecimal(tipAmount)));
            } else {
                result.put(Partner.COURIER, new BigDecimal(tipAmount));
            }
        } else {
            if (delivery.restaurantId() != null) {
                result.put(Partner.COURIER, new BigDecimal("0.85").multiply(new BigDecimal(tipAmount)));
            } else {
                result.put(Partner.COURIER, new BigDecimal("0.95").multiply(new BigDecimal(tipAmount)));
            }
        }
    }
}
