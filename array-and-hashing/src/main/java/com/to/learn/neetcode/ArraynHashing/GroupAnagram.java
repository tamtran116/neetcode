package com.to.learn.neetcode.ArraynHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group the anagrams together. You can return
 * the answer in any order.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 * 
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 * 
 * Input: strs = ["a"]
 * Output: [["a"]]
 * 
 * 
 * Constraints:
 * 
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 */
public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) {
            return result;
        }
        for (String word : strs) {
            // if you are familiar with anagram word count solution before, here is another
            // similar solution. For all words which are an anagram to each other, they
            // should have the same charater count. In order word, after all the charater
            // are arranged in asc or desc, these words should be equals.
            // Below solution using a technique to create a key based on the characteristic
            // of anagram word mention above.
            char[] keyCharArray = new char[26];
            for (char c : word.toCharArray()) {
                keyCharArray[c - 'a']++;
            }
            String key = new String(keyCharArray);

            // instead of creating a key, you can also define a char array of the word, then
            // using Arrays.sort() to rearrage those characters and it should have same
            // effect
            /**
             * char[] keyCharArray = word.toCharArray();
             * Arrays.sort(keyCharArray);
             * String key = new String(keyCharArray);
             * 
             */

            map.put(key, map.computeIfAbsent(key, k -> new ArrayList<>()));
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
