package com.example.codewars7;

import java.util.stream.IntStream;

//Task
//        Given a Divisor and a Bound , Find the largest integer N , Such That ,
//
//        Conditions :
//        N is divisible by divisor
//
//        N is less than or equal to bound
//
//        N is greater than 0.
//
//        Notes
//        The parameters (divisor, bound) passed to the function are only positive values .
//        It's guaranteed that a divisor is Found .
public class MaximumMultiple {
    public static int maxMultiple(int divisor, int bound) {
        return bound - (bound % divisor);
    }
}

    public static int maxMultiple(int divisor, int bound) {

        for(int i=bound; i>0; i--){
            if(i%divisor==0)return i;
        }
        return 0;
    }

    public static int maxMultiple(int divisor, int bound) {
        return IntStream.rangeClosed(1,bound).filter(x->x%divisor==0).reduce((x, y)->y).getAsInt();
    }