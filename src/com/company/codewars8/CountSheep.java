package com.company.codewars8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//If you can't sleep, just count sheep!!
//
//        Task:
//        Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
public class CountSheep {
    public static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }
}


import java.util.stream.Collectors;
        import java.util.stream.IntStream;

public class Kata {
    public static String countingSheep(int num) {
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }
}


    public static String countingSheep(int num) {
        String text = " sheep...";
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + text;
        }

        return result;
    }
