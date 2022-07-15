package com.to.learn.neetcode.TwoPointers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeSumTest {
    @Test
    public void testThreeSum() {
        assertEquals("[[-1, 0, 1], [-1, -1, 2]]", ThreeSum.getThreeSum(new int[] { -1, 0, 1, 2, -1, -4 }).toString());
        assertEquals("[[0, 0, 0]]", ThreeSum.getThreeSum(new int[] { 0, 0, 0 }).toString());
    }
}
