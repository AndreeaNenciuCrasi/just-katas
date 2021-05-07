package com.company.codewars6;

//Longest Palindrome
//        Find the length of the longest substring in the given string s that is the same in reverse.
//
//        As an example, if the input was “I like racecars that go fast”, the substring (racecar) length would be 7.
//
//        If the length of the input string is 0, the return value must be 0.
//
//        Example:
//        "a" -> 1
//        "aab" -> 2
//        "abcde" -> 1
//        "zzbaabcd" -> 4
//        "" -> 0

public class LongestPalindrome {
    public static int longestPalindrome(final String str) {
        if(str.length()==0) return 0;
        int maxLength = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;

                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;

                // Palindrome
                if (flag!=0 && (j - i + 1) > maxLength) {
                    maxLength = j - i + 1;
                }
            }
        }
        return maxLength;
    }
}

    public static int longestPalindrome(final String s) {
        int max = 0;
        for (int len = s.length(); len > max; len--) {
            for (int i = 0; i + len <= s.length(); i++) {
                String sub = s.substring(i,i+len);
                if (new StringBuilder(sub).reverse().toString().equals(sub)) { max = len; break; }
            }
        }
        return max;
    }
