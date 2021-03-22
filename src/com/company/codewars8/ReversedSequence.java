package com.company.codewars8;

import java.util.stream.IntStream;

//Build a function that returns an array of integers from n to 1 where n>0.
//
//        Example : n=5 >> [5,4,3,2,1]
public class ReversedSequence {
    public static int[] reverse(int n){
        //your code
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
        {
            result[i] = n - i;
        }
        return result;
    }
}

    public static int[] reverse(int n){
        return IntStream.iterate(n, i -> i - 1).limit(n).toArray();
    }
