package com.example.codewars7;

//Given two integers a and b, which can be positive or negative, find the sum of all the integers between including them too and return it. If the two numbers are equal return a or b.
//
//        Note: a and b are not ordered!
//
//        Examples
//        GetSum(1, 0) == 1   // 1 + 0 = 1
//        GetSum(1, 2) == 3   // 1 + 2 = 3
//        GetSum(0, 1) == 1   // 0 + 1 = 1
//        GetSum(1, 1) == 1   // 1 Since both are same
//        GetSum(-1, 0) == -1 // -1 + 0 = -1
//        GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2


import java.util.stream.IntStream;

public class SumOfNumbers {
    public int GetSum(int a, int b) {
        int res = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            res += i;
        }
        return a == b ? a : res;
    }
}

    public int GetSum(int a, int b) {
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }

    public int GetSum(int a, int b)
    {
        if (a == b) return a;
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
