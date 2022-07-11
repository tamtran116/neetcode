package com.to.learn.neetcode.ArraynHashing;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * 
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 * 
 * Follow up: What if the inputs contain Unicode characters? How would you adapt
 * your solution to such a case?
 * 
 * Answer:
 * The char data type is a single 16-bit Unicode character. A char is
 * represented by its code point value:
 * 
 * min '\u0000' (or 0)
 * max: '\uffff' (or 65,535)
 * 
 * So as long as the application can count the number of each individual
 * character, solution is same like below
 */
public class Anagram {

    public static boolean isAnagram(String s, String t) {

        if (null != s && s.length() == t.length()) {
            // create fix array to count number of character matched, note English Alphabet
            // consisted of 26 letters/characters.
            int[] characterCount = new int[26];
            for (int i = 0; i < s.length(); i++) {
                // increment if found a charater in original string
                characterCount[s.charAt(i) - 'a']++;
                // decrement the count if found a character in other string
                characterCount[t.charAt(i) - 'a']--;
            }
            // loop thru count to verify, if there is any single character which still have
            // count > 0 then these string are not anagram to each other
            for (int c : characterCount) {
                if (c != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
