package com.to.learn.neetcode.ArraynHashing;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MergeIntervalTest {
    @Test
    public void testMergeIntervals() {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[] { 3, 7 });
        intervals.add(new int[] { 6, 8 });
        intervals.add(new int[] { 4, 9 });
        intervals.add(new int[] { 10, 12 });
        intervals.add(new int[] { 11, 15 });
        intervals.add(new int[] { 1, 5 });
        List<int[]> result = (MergeInterval.mergeIntervals(intervals));
        assertEquals(1, result.get(0)[0]);
        assertEquals(9, result.get(0)[1]);
        assertEquals(10, result.get(1)[0]);
        assertEquals(15, result.get(1)[1]);
    }
}
