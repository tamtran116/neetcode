package com.to.learn.neetcode.TwoPointers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidPalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(ValidPalindrome.isPalindrome("race a car"));
        assertTrue(ValidPalindrome.isPalindrome(" "));
    }
}
