package com.to.learn.neetcode.ArraynHashing;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given an array (list) of interval pairs as input where each interval
 * has a start and end timestamp. The input array is sorted by starting
 * timestamps. You are required to merge overlapping intervals and return a new
 * output array.
 * 
 * Consider the input array below. Intervals (1, 5), (3, 7), (4, 6), (6, 8) are
 * overlapping so they should be merged to one big interval (1, 8). Similarly,
 * intervals (10, 12) and (12, 15) are also overlapping and should be merged to
 * (10, 15).
 * 
 * Extra: what if the interval array is not sorted? Note: I got this when
 * inteviewing for apple :)
 */
public class MergeInterval {

    // linear scan
    public static List<int[]> mergeIntervals(List<int[]> intervals) {
        // sort to natural order
        intervals.sort((a1, a2) -> {
            if (a2[0] < a1[0])
                return 1;
            return -1;
        });

        // add first element
        List<int[]> mergedList = new ArrayList<>();
        mergedList.add(intervals.get(0)); // get the minimum

        // start looping from the second item
        for (int i = 1; i < intervals.size(); i++) {
            int x1 = intervals.get(i)[0];
            int y1 = intervals.get(i)[1];
            // get the last item from merge list and compare the "y" value
            int y2 = mergedList.get(mergedList.size() - 1)[1];
            if (y2 > x1) {
                mergedList.get(mergedList.size() - 1)[1] = Math.max(y2, y1);
            } else {
                mergedList.add(new int[] { x1, y1 });
            }

        }

        return mergedList;
    }

}
