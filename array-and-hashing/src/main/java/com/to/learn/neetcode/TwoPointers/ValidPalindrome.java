package com.to.learn.neetcode.TwoPointers;


/**
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * 
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * Since an empty string reads the same forward and backward, it is a
 * palindrome.
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        /**
         * using string builder
         */
        StringBuilder content = new StringBuilder();
        for(int i = 0; i < s.length(); i++) 
            if(Character.isLetterOrDigit(s.charAt(i)))
                content.append(s.charAt(i));
        content = new StringBuilder(content.toString().toLowerCase());
        String value = content.toString();
        return value.equals(content.reverse().toString());

        /**
         * brute force
        // clean up extra char and lower case
        String clean = s.toLowerCase().replaceAll("[^a-z]*", "");
        // add to list of char to reverse
        List<Character> characters = new ArrayList<>();
        for (Character c : clean.toCharArray()) {
            characters.add(c);
        }
        Collections.reverse(characters);
        // compare reversed 
        char[] reversed = new char[characters.size()];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = characters.get(i);
        }
        return clean.equals(new String(reversed));
        */
    }
}
