package org.muzychuk.boris.food.tip.strategies;

import org.muzychuk.boris.food.domain.Delivery;
import org.muzychuk.boris.food.domain.Partner;

import java.math.BigDecimal;
import java.util.Map;

public interface TipCalculationStrategy {

    void calculateTip(long tipAmount, Delivery delivery, Map<Partner, BigDecimal> result);

}
