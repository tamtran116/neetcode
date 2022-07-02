package com.to.learn.neetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */
public class Duplicate {
    public static void main(String[] args) throws Exception {
        testExample1();
        testExample2();
        testExample3();
        System.out.println("PASSED");
    }

    private static boolean isDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        // loop thru array classical way
        for(int num:nums) {
            // the special trick here is that you can leverage the "add" method of set to check for duplicate to return result right away. very neet
            if(!unique.add(num)) {
                return true;        
            }
        }
        return false;
    }

    private static void testExample1() throws Exception {
        int[] nums = new int[]{1,2,3,1};
        customAssert(isDuplicate(nums));
    }

    private static void testExample2() throws Exception {
        int[] nums = new int[]{1,2,3,4};
        customAssert(!isDuplicate(nums));
    }

    private static void testExample3() throws Exception {
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        customAssert(isDuplicate(nums));
    }

    public static void customAssert(boolean expected) throws Exception{
        if(!expected) {
            throw new Exception("unexpected result");
        }
    }
}