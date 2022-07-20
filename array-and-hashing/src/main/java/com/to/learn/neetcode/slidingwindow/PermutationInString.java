package com.to.learn.neetcode.slidingwindow;

import java.util.Arrays;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1,
 * or false otherwise.
 * 
 * In other words, return true if one of s1's permutations is the substring of
 * s2.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * Example 2:
 * 
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s1.length, s2.length <= 104
 * s1 and s2 consist of lowercase English letters.
 */
public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "eidboaoo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        int[] charCountS1 = new int[26], charCountS2 = new int[26];
        for (char c : s1.toCharArray()) {
            charCountS1[c - 'a']++;
        }
        int j = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (Arrays.equals(charCountS1, charCountS2)) {
                return true;
            }
            if (i - j + 1 > s1.length()) {
                charCountS2[s2.charAt(j) - 'a']--;
                j++;
            }
            charCountS2[s2.charAt(i) - 'a']++;
        }
        return false;
    }

}
