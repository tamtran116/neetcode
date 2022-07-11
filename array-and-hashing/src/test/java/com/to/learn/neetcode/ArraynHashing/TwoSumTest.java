package com.to.learn.neetcode.ArraynHashing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        assertTrue(target == nums[result[0]] + nums[result[1]]);

        nums = new int[] {3,2,4};
        target = 6;
        result = TwoSum.twoSum(nums, target);
        assertTrue(target == nums[result[0]] + nums[result[1]]);

        nums = new int[] {3,3};
        target = 6;
        result = TwoSum.twoSum(nums, target);
        assertTrue(target == nums[result[0]] + nums[result[1]]);
    }
}
