package com.to.learn.neetcode.ArraynHashing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramTest {
    
    @Test
    public void testIsAnagram() {
        assertTrue(Anagram.isAnagram("anagram", "nagaram"));
        assertFalse(Anagram.isAnagram("rat", "car"));
    }
}
