package com.company.codewars8;

//Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
//
//        For example:
//
//        summation(2) -> 3
//        1 + 2
//
//        summation(8) -> 36
//        1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
public class GrasshopperSummation {
    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        return sum;
    }
}

//    public static int summation(int n) {
//        if (n == 1)
//            return 1;
//        return summation(n-1) + n;
//    }