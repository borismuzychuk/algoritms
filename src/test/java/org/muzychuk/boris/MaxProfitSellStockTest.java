package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitSellStockTest {

    @Test
    void maxProfit() {
        MaxProfitSellStock maxProfitSellStock = new MaxProfitSellStock();
        int result = maxProfitSellStock.maxProfit(new int[]{10, 1, 5, 6, 7, 1});
        assertEquals(6, result);

        result = maxProfitSellStock.maxProfit(new int[]{10, 8, 7, 5, 2});
        assertEquals(0, result);
    }
}