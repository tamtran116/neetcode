package com.to.learn.neetcode.slidingwindow;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PermutationInStringTest {
    @Test
    public void testCheckInclusion() {
        assertTrue(PermutationInString.checkInclusion("ab", "eidbaooo"));
        assertFalse(PermutationInString.checkInclusion("ab", "eidboaoo"));
    }
}
