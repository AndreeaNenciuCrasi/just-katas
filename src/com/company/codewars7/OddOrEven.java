package com.example.codewars7;

//Task:
//        Given a list of numbers, determine whether the sum of its elements is odd or even.
//
//        Give your answer as a string matching "odd" or "even".
//
//        If the input array is empty consider it as: [0] (array with a zero).
//
//        Example:
//        odd_or_even([0])          ==  "even"
//        odd_or_even([0, 1, 4])    ==  "odd"
//        odd_or_even([0, -1, -5])  ==  "even"

import static java.util.Arrays.stream;

public class OddOrEven {
    static String oddOrEven(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}

    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int n : array){
            sum += n;
        }
        return sum%2==0 ? "even" : "odd";
    }
