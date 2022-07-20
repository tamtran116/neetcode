package com.to.learn.neetcode.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * 
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * 
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a
 * substring.
 * 
 * 
 * Constraints:
 * 
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringWithoutRepeatCharacter {

    public static int lengthOfLongestSubstringUsingSlidingWindow(String s) {
        int j = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                set.clear();
                j++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        // use list to store count attempts
        List<Integer> countList = new ArrayList<>();
        // use set for unique check
        Set<Character> charSet = new HashSet<>();

        // loop thru array
        for (char c : s.toCharArray()) {
            // increment if not found
            if(charSet.add(c)) {
                count++;
            } else {
                // if found, clear set, capture count and recount the current character
                charSet.clear();
                countList.add(count);
                count=1;
                charSet.add(c);
            }
        }
        // return max
        return Collections.max(countList);
    }
}
