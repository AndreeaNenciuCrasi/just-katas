package com.company.codewars7;


//Find the greatest common divisor of two positive integers. The integers can be large, so you need to find a clever solution.
//
//        The inputs x and y are always greater or equal to 1, so the greatest common divisor will always be an integer that is also greater or equal to 1.

public class GreatestCommonDivisor {
    public static int compute(int x, int y) {
        int gcd = 1;
        for(int i=1; i<=x && i<=y; i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}

    public static int compute(int x, int y) {
        return (x % y != 0) ? compute(y, x % y) : y;
    }//Euclidean Algorithm
