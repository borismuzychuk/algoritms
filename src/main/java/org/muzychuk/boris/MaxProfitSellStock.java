package org.muzychuk.boris;

/*
 * Best Time to Buy and Sell Stock
 * */
public class MaxProfitSellStock {

    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxPrice = 0;
        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];
                if (profit > maxPrice) {
                    maxPrice = profit;
                }
            } else {
                left = right;
            }
            right++;
        }
        return maxPrice;
    }

}
