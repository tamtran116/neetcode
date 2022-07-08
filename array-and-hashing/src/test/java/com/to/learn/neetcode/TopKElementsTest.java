package com.to.learn.neetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TopKElementsTest {
    @Test
    public void testTopKFrequent() {
        assertTrue(TopKElements.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2)[0] == 1);
        assertTrue(TopKElements.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2)[1] == 2);
    }
}
