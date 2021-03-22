package com.example.codewars7;

import java.util.stream.Stream;

//Simple, given a string of words, return the length of the shortest word(s).
//
//        String will never be empty and you do not need to account for different data types.
public class ShortestWord {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}

    public static int findShort(String s) {
        int min = Integer.MAX_VALUE;
        for(String each : s.split(" "))
        {
            if(each.length() < min)
                min = each.length();
        }
        return min;
    }
