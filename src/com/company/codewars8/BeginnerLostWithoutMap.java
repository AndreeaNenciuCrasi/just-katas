package com.company.codewars8;

//Given an array of integers, return a new array with each value doubled.
//
//        For example:
//
//        [1, 2, 3] --> [2, 4, 6]
//
//        For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.
public class BeginnerLostWithoutMap {

    public static int[] map(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i]*2;
        }
        return inputArray;
    }
}

//    public static int[] map(int[] arr) {
//        return Arrays.stream(arr).map(x -> x*2).toArray();
//    }
