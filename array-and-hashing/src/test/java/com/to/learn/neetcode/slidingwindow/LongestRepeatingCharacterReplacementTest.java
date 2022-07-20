package com.to.learn.neetcode.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestRepeatingCharacterReplacementTest {
    @Test
    public void testCharacterReplacement() {
        assertEquals(4,LongestRepeatingCharacterReplacement.characterReplacement("ABAB", 2));
        assertEquals(4,LongestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1));
    }
}
