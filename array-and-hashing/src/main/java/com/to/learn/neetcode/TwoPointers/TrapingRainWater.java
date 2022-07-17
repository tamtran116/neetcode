package com.to.learn.neetcode.TwoPointers;

import java.util.Arrays;

/**
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it can trap after raining.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array
 * [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
 * are being trapped.
 * Example 2:
 * 
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 * 
 * 
 * Constraints:
 * 
 * n == height.length
 * 1 <= n <= 2 * 104
 * 0 <= height[i] <= 105
 */
public class TrapingRainWater {

    public static int trap(int[] heights) {
        int[] reverseHeights = new int[heights.length];
        for (int i = 0; i < reverseHeights.length; i++) {
            reverseHeights[i] = heights[heights.length-i-1];
        }
        
        return trapWaterIn1Direction(heights) + trapWaterIn1Direction(reverseHeights);
    }

    // assuming the water is pouring into the trap in 1 direction from left to right
    private static int trapWaterIn1Direction(int[] heights) {
        if (heights.length > 1) {
            // a bucket should have a left wall and right wall
            int leftWallHeight = 0;
            int rightWallHeight = 0;

            // temporary bucket to store water (in case of only 1 wall identified)
            int tempBucket = 0;
            
            // the water bucket property / answer
            int waterBucket = 0;

            // loop thru the every height to calculate trapped water, note that direction is from left of array to right
            for (int i = 0; i < heights.length; i++) {

                // right wall will be height
                rightWallHeight = heights[i];

                // as the direction of loop is from left to right, if the left wall is higher than the right wall, this create a slope where the water will have a chance to be captured
                if (leftWallHeight > rightWallHeight) {
                    // temp bucket will be used here to capture the trapped water (note that at this point we dont know anything about the next right wall)
                    tempBucket += leftWallHeight - rightWallHeight;
                }

                // when left wall is less than or equal right wall, there are scenarios
                // 1 - the very first run, the left wall is 0
                // 2 - after the first run, the left wall will become first height, right wall will be come the second height, in this case, water will be truely trapped if the left is < right
                if (leftWallHeight <= rightWallHeight) {
                    // adding temp bucket to water bucket
                    waterBucket += tempBucket;
                    // reset temp bucket
                    tempBucket = 0;
                    // move the left wall to the new height
                    leftWallHeight = heights[i];
                }
            }
            return waterBucket;
        }
        return 0;
    }
}
