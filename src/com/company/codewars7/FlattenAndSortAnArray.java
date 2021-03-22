package com.company.codewars7;

//Challenge:
//
//        Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.
//
//        Example:
//
//        Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].

import java.util.Arrays;

public class FlattenAndSortAnArray {
    public static int[] flattenAndSort(int[][] array) {
        // Find the no. of elements in the array.
        int len = array.length, num = 0;

        for (int[] arr : array) {
            num += arr.length;
        }

        int out[] = new int[num], n = 0;
        for (int[] arr : array) {
            for (int i : arr) {
                out[n++] = i;
            }
        }
        Arrays.sort(out);
        return out;
    }
}

    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }
