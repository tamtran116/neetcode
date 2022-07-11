package com.to.learn.neetcode.ArraynHashing;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Map.Entry;

/**
 * Given an integer array nums and an integer k, return the k most frequent
 * elements. You may return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * 
 * Input: nums = [1], k = 1
 * Output: [1]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 * 
 * 
 * Follow up: Your algorithm's time complexity must be better than O(n log n),
 * where n is the array's size.
 */
public class TopKElements {
    public static int[] topKFrequent(int[] nums, int k) {
        // we need a map to store degree of the array. 
        Map<String, Integer> degreeMap = new HashMap<>();
        String key;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            key = String.valueOf(nums[i]);
            if (degreeMap.containsKey(key)) {
                count++;
            } else {
                count = 1;
            }
            degreeMap.put(key, count);
        }
        // now we utilize list so that we can sort (asc by default) by value of degreeMap
        List<Map.Entry<String, Integer>> list = new ArrayList<>(degreeMap.entrySet());
        list.sort(Entry.comparingByValue());

        // finally knowing that we have only k most frequent, hence create array with size of k and start putting value from largest to smallest.  
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = Integer.parseInt(list.get(list.size() - 1 - i).getKey());
        }
        return result;
    }
}
