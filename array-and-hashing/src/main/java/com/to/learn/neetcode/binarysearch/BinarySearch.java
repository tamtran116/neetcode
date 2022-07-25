package com.to.learn.neetcode.binarysearch;

import java.util.Arrays;

/**
 * Given an array of integers nums which is sorted in ascending order, and an
 * integer target, write a function to search target in nums. If target exists,
 * then return its index. Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 104
 * -104 < nums[i], target < 104
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 */
public class BinarySearch {

    // note: this can be solved by linear search however the time complexity would
    // be O(n), while the binary search it will be O(logn).
    // below solution is iterating with 2 pointers, which will compute until
    // leftmost and rightmost equal median.
    public static int search(int[] nums, int target) {
        int i = 0; // left
        int j = nums.length - 1; // right

        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    // There is another solution which is recursive.
    public static int searchRecursive(int[] nums, int target) {
        return searchRecursive(nums, target, 0, nums.length - 1);
    }

    private static int searchRecursive(int[] nums, int target, int low, int high) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            // search upper
            return searchRecursive(nums, target, mid + 1, high);
        } else {
            // search lower
            return searchRecursive(nums, target, low, mid - 1);
        }

    }

}
