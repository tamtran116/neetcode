package com.to.learn.neetcode.stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void testIsValid() {
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("()[]{}"));
        assertFalse(ValidParentheses.isValid("(]"));
    }
}
