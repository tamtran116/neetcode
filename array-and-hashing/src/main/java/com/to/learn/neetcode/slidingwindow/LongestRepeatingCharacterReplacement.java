package com.to.learn.neetcode.slidingwindow;

/**
 * You are given a string s and an integer k. You can choose any character of
 * the string and change it to any other uppercase English character. You can
 * perform this operation at most k times.
 * 
 * Return the length of the longest substring containing the same letter you can
 * get after performing the above operations.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 * Example 2:
 * 
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105
 * s consists of only uppercase English letters.
 * 0 <= k <= s.length
 */
public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        // sliding window with j and i
        // need to store max, substring repeating letters
        int maxRepeatCharSubstring = 0 , maxCount = 0, l = 0;
        int[] mapCount = new int[26];
        // first looping thru array and try to satisfy the requirement (longest repeating letters)
        for (int i = 0; i < s.length(); i++) {
            // current char in ascii 
            int currentChar = s.charAt(i) - 'A';
            
            // increase count
            mapCount[currentChar]++;

            // compare and find max between current max and count
            maxCount = Math.max(maxCount, mapCount[currentChar]);

            // i-l + 1 is the substring size, if the substring size minus maxcount is more than the max times of replacement 
            // so we have to slide the window and deduce the count from char at "l" location
            if (i - l + 1 - maxCount > k) {
                mapCount[s.charAt(l) - 'A']--;
                l++;
            }
            // record the max repeat character, also same as substring size
            maxRepeatCharSubstring = Math.max(maxRepeatCharSubstring, i - l + 1);
        }
        return maxRepeatCharSubstring;
    }
}
