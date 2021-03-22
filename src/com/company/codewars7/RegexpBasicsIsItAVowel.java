package com.company.codewars7;

//Implement the function which should return true if given object is a vowel (meaning a, e, i, o, u), and false otherwise.
public class RegexpBasicsIsItAVowel {
    public static boolean isVowel(String s) {
        return s.matches("[aeiouAEIOU]");
    }
}
