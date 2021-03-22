package com.company.codewars6;

//There is an array with some numbers. All numbers are equal except for one. Try to find it!
//
//        Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
//        Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
//        It’s guaranteed that array contains at least 3 numbers.


import java.util.Arrays;

public class FindTheUniqueNumber {
    public static double findUniq(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}


    public static double findUniq(double arr[]) {
        final double x = arr[arr[0] == arr[1] ? 0 : 2];
        for (double y : arr)
            if (y != x)
                return y;
        throw new RuntimeException("no unique number found");
    }
