package com.to.learn.neetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProductExceptSelfTest {
    @Test
    public void testProductExceptSelf() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] result = productExceptSelf.productExceptSelf(new int[]{1,2,3,4});
        assertTrue(result[0] == 24);
        assertTrue(result[1] == 12);
        assertTrue(result[2] == 8);
        assertTrue(result[3] == 6);

        result = productExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3});
        assertTrue(result[0] == 0);
        assertTrue(result[1] == 0);
        assertTrue(result[2] == 9);
        assertTrue(result[3] == 0);
        assertTrue(result[4] == 0);

    }
}
