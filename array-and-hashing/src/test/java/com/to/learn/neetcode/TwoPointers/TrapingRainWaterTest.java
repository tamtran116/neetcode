package com.to.learn.neetcode.TwoPointers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrapingRainWaterTest {
    @Test
    public void testTrap() {
        assertEquals(6, TrapingRainWater.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
        assertEquals(9, TrapingRainWater.trap(new int[] { 4,2,0,3,2,5 }));
    }
}
