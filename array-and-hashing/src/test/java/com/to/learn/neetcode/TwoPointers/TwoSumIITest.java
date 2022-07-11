package com.to.learn.neetcode.TwoPointers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoSumIITest {
    @Test
    public void testTwoSum() {
        assertEquals(1,TwoSumII.twoSum(new int[] {2,7,11,15}, 9)[0]);
        assertEquals(2,TwoSumII.twoSum(new int[] {2,7,11,15}, 9)[1]);
        assertEquals(1, TwoSumII.twoSum(new int[] { 2, 3, 4 }, 6)[0]);
        assertEquals(3, TwoSumII.twoSum(new int[] { 2, 3, 4 }, 6)[1]);
        assertEquals(1, TwoSumII.twoSum(new int[] {-1, 0}, -1)[0]);
        assertEquals(2, TwoSumII.twoSum(new int[] {-1, 0}, -1)[1]);
    }
}
