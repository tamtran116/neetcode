package com.to.learn.neetcode.TwoPointers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaterContainerTest {
    @Test
    public void testMaxArea() {
        assertEquals(49, WaterContainer.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
        assertEquals(1, WaterContainer.maxArea(new int[] { 1, 1 }));
    }
}
