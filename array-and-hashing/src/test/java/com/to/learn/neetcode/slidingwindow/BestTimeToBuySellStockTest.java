package com.to.learn.neetcode.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuySellStockTest {
    @Test
    public void testMaxProfit() {
        assertEquals(5, BestTimeToBuySellStock.maxProfit(new int[] {7,1,5,3,6,4}));
        assertEquals(0, BestTimeToBuySellStock.maxProfit(new int[] {7,6,4,3,1}));
    }
}
