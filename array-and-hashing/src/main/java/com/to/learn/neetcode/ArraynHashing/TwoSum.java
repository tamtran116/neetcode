package com.to.learn.neetcode.ArraynHashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * 
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * 
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * 
 * 
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time
 * complexity?
 * see below
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // note: only 1 solution , 2 numbers --> array of int to store 2 elements
        int[] answer = new int[2];
        // the first thing here is that you would need a map to store the index of the
        // number in the provided int array
        Map<Integer, Integer> numberIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numberIndexMap.put(nums[i], i);
            // then to make it simple (less o(n) complexity), remember that result should only have
            // 2 numbers as long as a + b = target , so to find "b", simply find "target - a"
            if (numberIndexMap.containsKey(target - nums[i])) {
                answer[0] = numberIndexMap.get(target - nums[i]);
                answer[1] = i;
            }
        }
        return answer;
    }
}
