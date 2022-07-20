package com.to.learn.neetcode.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithoutRepeatCharacterTest {
    @Test
    public void testLengthOfLongestSubstring() {
        assertEquals(3,LongestSubstringWithoutRepeatCharacter.lengthOfLongestSubstringUsingSlidingWindow("abcabcbb"));
        assertEquals(1,LongestSubstringWithoutRepeatCharacter.lengthOfLongestSubstringUsingSlidingWindow("bbbbb"));
        assertEquals(3,LongestSubstringWithoutRepeatCharacter.lengthOfLongestSubstringUsingSlidingWindow("pwwkew"));
    }
}
