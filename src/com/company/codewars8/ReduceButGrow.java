package com.company.codewars8;

//Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//
//        [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

import java.util.stream.IntStream;

public class ReduceButGrow {
    public static int grow(int[] x){
        int result = 1;
        for (int a : x) {
            result *= a;
        }
        return result;
    }
}

    public static int grow(int[] x){

        return IntStream.of(x).reduce(1, (a, b) -> a * b);

    }
