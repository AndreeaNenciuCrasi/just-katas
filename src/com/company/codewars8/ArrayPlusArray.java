package com.company.codewars8;

import java.util.stream.IntStream;

//I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.
//
//        P.S. Each array includes only integer numbers. Output is a number too.
public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}

//    public static int arrayPlusArray(int[] arr1, int[] arr2) {
//        int arrSum = 0;
//        for(int num : arr1) {arrSum += num;}
//        for(int num : arr2) {arrSum += num;}
//        return arrSum;
//    }
//
//    public static int arrayPlusArray(int[] arr1, int[] arr2) {
//        return concat(stream(arr1),stream(arr2)).sum();
//    }
