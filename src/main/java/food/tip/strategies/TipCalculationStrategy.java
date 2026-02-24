package food.tip.strategies;

import food.domain.Delivery;
import food.domain.Partner;

import java.math.BigDecimal;
import java.util.Map;

public interface TipCalculationStrategy {

    void calculateTip(long tipAmount, Delivery delivery, Map<Partner, BigDecimal> result);

}
