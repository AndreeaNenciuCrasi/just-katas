package com.company.codewars8;

//Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.
//
//        Examples
//        Input: [1, 5.2, 4, 0, -1]
//        Output: 9.2
//
//        Input: []
//        Output: 0
//
//        Input: [-2.398]
//        Output: -2.398


import java.util.Arrays;

public class SumArrays {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}


//    public static double sum(double[] numbers) {
//        return Arrays.stream(numbers)
//                .reduce(0, Double::sum);
//    }


//    public static double sum(double[] numbers) {
//        double sum = 0;
//        for(Double number : numbers){
//            sum += number;
//        }
//        return sum;
//    }