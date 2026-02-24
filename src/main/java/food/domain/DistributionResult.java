package food.domain;

import java.math.BigDecimal;
import java.util.Map;

public record DistributionResult(Map<Partner, BigDecimal> result) {
}
