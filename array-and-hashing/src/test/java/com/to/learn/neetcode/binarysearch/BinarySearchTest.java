package com.to.learn.neetcode.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testSearch() {
        assertEquals(4, BinarySearch.search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
        assertEquals(-1, BinarySearch.search(new int[] { -1, 0, 3, 5, 9, 12 }, 2));
    }

    @Test
    public void testSearchRecursive() {
        assertEquals(4, BinarySearch.searchRecursive(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
        assertEquals(-1, BinarySearch.searchRecursive(new int[] { -1, 0, 3, 5, 9, 12 }, 2));
    }
}
