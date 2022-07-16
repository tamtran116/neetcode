package com.to.learn.neetcode.TwoPointers;

/**
 * You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, 0) and (i,
 * height[i]).
 * 
 * Find two lines that together with the x-axis form a container, such that the
 * container contains the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Notice that you may not slant the container.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array
 * [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the
 * container can contain is 49.
 * Example 2:
 * 
 * Input: height = [1,1]
 * Output: 1
 * 
 * 
 * Constraints:
 * 
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */
public class WaterContainer {

    public static int maxArea(int[] heights) {
        // if the provided arrays is invalid
        if (heights.length > 1) {
            // need to store max area , which is also the answer :)
            int maxArea = 0;
            // storing max height
            int maxHeight = 0;
            // storing index of max height (in order to calculate the width)
            int maxHeightIndex = 0;

            // loop thru the array to get the max height, then use it to calculate the true
            // height (the closest number to max height)
            // then the width will simply equal the index i minus the index of the max
            // height
            for (int i = 0; i < heights.length; i++) {
                int trueHeight = Math.min(maxHeight, heights[i]);
                maxArea = trueHeight * (i - maxHeightIndex);
                if (maxHeight < heights[i]) {
                    maxHeight = heights[i];
                    maxHeightIndex = i;
                }
            }
            return maxArea;
        }
        return 0;
    }
}
