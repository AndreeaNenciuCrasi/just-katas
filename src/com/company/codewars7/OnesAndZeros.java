package com.example.codewars7;

import java.util.List;

//Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//
//        Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
//
//        Examples:
//
//        Testing: [0, 0, 0, 1] ==> 1
//        Testing: [0, 0, 1, 0] ==> 2
//        Testing: [0, 1, 0, 1] ==> 5
//        Testing: [1, 0, 0, 1] ==> 9
//        Testing: [0, 0, 1, 0] ==> 2
//        Testing: [0, 1, 1, 0] ==> 6
//        Testing: [1, 1, 1, 1] ==> 15
//        Testing: [1, 0, 1, 1] ==> 11
//        However, the arrays can have varying lengths, not just limited to 4.
public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        String res = "";

        for (int i : binary)
            res += i;

        return Integer.parseInt(res, 2);
    }
}

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder numS = new StringBuilder();

        for(int num : binary)
            numS.append(num);

        return Integer.parseInt((numS.toString()),2);
    }
