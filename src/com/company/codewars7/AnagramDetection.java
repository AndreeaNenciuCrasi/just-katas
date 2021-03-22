package com.example.codewars7;

import java.util.Arrays;

//An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//
//        Note: anagrams are case insensitive
//
//        Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
//
//        Examples
//        "foefet" is an anagram of "toffee"
//
//        "Buckethead" is an anagram of "DeathCubeK"
public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        if( test == null || original == null || test.length() != original.length())
            return false;

        char[] ch1 = test.toLowerCase().toCharArray();
        char[] ch2 = original.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }
}

    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) return false;
        if (a == b) return true;

        return Arrays.equals(a.toLowerCase().chars().sorted().toArray(),
                b.toLowerCase().chars().sorted().toArray());
    }
