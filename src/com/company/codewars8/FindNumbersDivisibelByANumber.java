package com.company.codewars8;

import java.util.ArrayList;
import java.util.Arrays;

//Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.
//
//        Example
//        divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]


public class FindNumbersDivisibelByANumber {
    public static int[] divisibleBy(int[] numbers, int divider) {

        return Arrays.stream(numbers)
                .filter(i -> (i % divider) == 0)
                .toArray();
    }
}


import java.util.ArrayList;
public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i: numbers){
            if(i%divider == 0){
                list.add(i);
            }
        }
        int[] array = list.stream().mapToInt(i->i).toArray();
        return array;
    }
}


    public static int[] divisibleBy(int[] numbers, int divider) {
        int[]newArray = new int[numbers.length];
        int k = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % divider == 0){
                newArray[k] = numbers[i];
                k++;
            }
        }

        return Arrays.copyOf(newArray, k);
    }


    public static int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            if (i % divider == 0) list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
