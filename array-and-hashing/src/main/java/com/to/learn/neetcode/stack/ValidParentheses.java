package com.to.learn.neetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * Example 1:
 * 
 * Input: s = "()"
 * Output: true
 * Example 2:
 * 
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * 
 * Input: s = "(]"
 * Output: false
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(ValidParentheses.isValid("()"));
        System.out.println(ValidParentheses.isValid("()[]{}"));
        System.out.println(ValidParentheses.isValid("(]"));
    }

    public static boolean isValid(String s) {
        // using stack
        Deque<Character> deque = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>(); 
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                deque.addFirst(map.get(s.charAt(i)));
            }
            if(map.containsValue(s.charAt(i)) && deque.pop()!=s.charAt(i)) {
                return false;
            }  
        }
        return true;
    }
}
