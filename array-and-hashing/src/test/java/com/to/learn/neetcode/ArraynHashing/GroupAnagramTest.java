package com.to.learn.neetcode.ArraynHashing;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class GroupAnagramTest {
    @Test
    public void testGroupAnagrams() {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = GroupAnagram.groupAnagrams(strs);
        for (List<String> list : result) {
            if (list.contains("bat")) {
                assertTrue(list.size()==1);
            }
            if (list.contains("nat")) {
                assertTrue(list.size()==2);
            }
            if (list.contains("eat")) {
                assertTrue(list.size()==3);
            }
        }

        strs = new String[] {""};
        result = GroupAnagram.groupAnagrams(strs);
        for (List<String> list : result) {
            if (list.contains("")) {
                assertTrue(result.size()==1);
            }
        }

        strs = new String[] {"a"};
        result = GroupAnagram.groupAnagrams(strs);
        for (List<String> list : result) {
            if (list.contains("a")) {
                assertTrue(result.size()==1);
            }
        }
    }
}
