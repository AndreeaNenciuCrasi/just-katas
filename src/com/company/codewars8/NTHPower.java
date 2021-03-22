package com.company.codewars8;

//This kata is from check py.checkio.org
//
//        You are given an array with positive numbers and a non-negative number N. You should find the N-th power of the element in the array with the index N. If N is outside of the array, then return -1. Don't forget that the first element has the index 0.
//
//        Let's look at a few examples:
//
//        array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
//        array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.

public class NTHPower {
    public static int nthPower(int[] array, int n) {
        return n >= array.length ? -1 : (int) Math.pow(array[n], n);
    }
}

    public static int nthPower(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (i == n) {
                return (int) Math.pow(array[i], n);
            }
        }

        return -1;
    }
