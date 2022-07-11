package com.to.learn.neetcode.ArraynHashing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestConsecutiveTest {
    @Test
    public void testLongestConsecutive() {
        assertEquals(4, LongestConsecutive.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
        assertEquals(9, LongestConsecutive.longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }));
    }
}
