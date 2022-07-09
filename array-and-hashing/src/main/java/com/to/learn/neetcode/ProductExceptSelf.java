package com.to.learn.neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the
 * division operation.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 * 
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * 
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 * 
 * 
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The
 * output array does not count as extra space for space complexity analysis.)
 */
public class ProductExceptSelf {
    

    public int[] productExceptSelf(int[] nums) {
        /**
         * big hint here is prefix and suffix
         * prefix refers to all elements in the array prior to the current element
         * suffix refers to all elements in the array after the current element
         * result is prefixs * suffixs
         * Technique:
         * to find prefix, loop from beginning of array
         * Assign prefix/suffix value first to array first, then calculate.
         * This way, the value of current index will be out the equation.
         * suffix should loop from ending of array 
         * 
         */

        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
        }
        return result;

        /*
         * Brute Force: 
         * // convert to array list
         * List<Integer> list = new ArrayList<>();
         * for (int integer : nums) {
         * list.add(integer);
         * }
         * 
         * // put to map , key is the index of the input array, this to find out the number to exclude later
         * Map<Integer, List<Integer>> map = new HashMap<>();
         * for (int i = 0; i < nums.length; i++) {
         * map.put(i, map.computeIfAbsent(i, n->new ArrayList<>()));
         * List<Integer> subList = new ArrayList<>(list);
         * subList.remove(i);
         * map.get(i).addAll(subList);
         * }
         * 
         * // add all to big list
         * List<Integer> intList = new ArrayList<>();
         * for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
         * intList.addAll(entry.getValue());
         * }
         * 
         * // loop thru big list and remove the index num
         * List<Integer> result = new ArrayList<>();
         * int product = 1;
         * for (int i = 0; i < intList.size(); i++) {
         * product = product*intList.get(i);
         * if((i+1)%(nums.length-1)==0) {
         * result.add(product);
         * product=1;
         * }
         * }
         * 
         * // convert to int array
         * int[] resultArray = new int[nums.length];
         * for (int i = 0; i < resultArray.length; i++) {
         * resultArray[i] = result.get(i);
         * }
         * return resultArray;
         */

    }
}
