package com.example.codewars7;

//Triangular numbers are so called because of the equilateral triangular shape that they occupy when laid out as dots. i.e.
//
//        1st (1)   2nd (3)    3rd (6)
//        *          **        ***
//        *         **
//        *
//        You need to return the nth triangular number. You should return 0 for out of range values:
//
//        all [
//        triangular 0     == 0,
//        triangular 2     == 3,
//        triangular 3     == 6,
//        triangular (-10) == 0
//        ] -- True


import java.util.stream.IntStream;

public class TriangularTreasure {
    public static int triangular(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) result += i;
        return result;
    }
}

    public static int triangular(int n) {
        return IntStream.range(1, n+1).sum();
    }
