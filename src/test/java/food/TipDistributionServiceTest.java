package food;

import food.domain.Delivery;
import food.domain.DistributionResult;
import food.domain.Partner;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TipDistributionServiceTest {

    private TipDistributionService tipDistributionService = new TipDistributionService();

    @Test
    void distribute() {
        DistributionResult result = tipDistributionService.distribute(100,
                new Delivery(1L, 2L, 3L, false));
        assertEquals(new BigDecimal("5.00"), result.result().get(Partner.PLATFORM));
        assertEquals(new BigDecimal("10.0"), result.result().get(Partner.RESTAURANT));
        assertEquals(new BigDecimal("85.00"), result.result().get(Partner.COURIER));
    }

    @Test
    void distribute_() {
        DistributionResult result = tipDistributionService.distribute(100,
                new Delivery(1L, 2L, 3L, true));
        assertEquals(new BigDecimal("0"), result.result().get(Partner.PLATFORM));
        assertEquals(new BigDecimal("10.0"), result.result().get(Partner.RESTAURANT));
        assertEquals(new BigDecimal("90.0"), result.result().get(Partner.COURIER));
    }

    @Test
    void distribute__() {
        DistributionResult result = tipDistributionService.distribute(100,
                new Delivery(1L, 2L, null, true));
        assertEquals(new BigDecimal("0"), result.result().get(Partner.PLATFORM));
        assertEquals(new BigDecimal("0"), result.result().get(Partner.RESTAURANT));
        assertEquals(new BigDecimal("100"), result.result().get(Partner.COURIER));
    }

    @Test
    void distribute___() {
        DistributionResult result = tipDistributionService.distribute(100,
                new Delivery(1L, 2L, null, false));
        assertEquals(new BigDecimal("5.00"), result.result().get(Partner.PLATFORM));
        assertEquals(new BigDecimal("0"), result.result().get(Partner.RESTAURANT));
        assertEquals(new BigDecimal("95.00"), result.result().get(Partner.COURIER));
    }
}