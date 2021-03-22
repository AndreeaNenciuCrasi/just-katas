package com.example.codewars7;

//An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
//
//        isIsogram "Dermatoglyphics" == true
//        isIsogram "aba" == false
//        isIsogram "moOse" == false -- ignore letter case

import java.util.HashSet;
import java.util.Set;

public class Isograms {
    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}

    public static boolean isIsogram(String str) {
        Set<Character> letters = new HashSet<Character>();

        for (int i = 0; i < str.length(); ++i) {
            if (letters.contains(str.toLowerCase().charAt(i))) {
                return false;
            }

            letters.add(str.charAt(i));
        }

        return true;
    }

    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length() - 1; i++){
            for(int j = i+1; j < str.length(); j++){
                if(str.toCharArray()[i] == str.toCharArray()[j]){
                    return false;
                }
            }
        }

        return true;
    }