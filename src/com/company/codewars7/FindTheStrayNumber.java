package com.example.codewars7;

//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//
//        Complete the method which accepts such an array, and returns that single different number.
//
//        The input array will always be valid! (odd-length >= 3)
//
//        Examples
//        [1, 1, 2] ==> 2
//        [17, 17, 3, 17, 17, 17, 17] ==> 3

import java.util.Arrays;

public class FindTheStrayNumber {
    static int stray(int[] numbers) {
        if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) return numbers[0];
        for (int i : numbers) if (i != numbers[0]) return i;
        return 0;
    }
}

    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
    }


    static int stray(int[] numbers) {
        int x = numbers[0];
        int y = numbers[1];
        for(int z:numbers){
            if(z!=x || z!=y){
                return z;
            }
        }
        return 0;
    }
