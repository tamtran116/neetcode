package com.to.learn.neetcode.ArraynHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence.
 * 
 * You must write an algorithm that runs in O(n) time.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
 * Therefore its length is 4.
 * Example 2:
 * 
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * 
 * 
 * Constraints:
 * 
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        // create int to store the count
        int countLongest = 1;
        // list to store count history
        List<Integer> countList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                countLongest++;
            } else {
                countList.add(countLongest);
                countLongest = 1;
            }
        }
        // Utilize collections
        return Collections.max(countList);
    }
}
