package com.company.codewars7;


//Your task is to return the sum of Triangular Numbers up-to-and-including the nth Triangular Number.
//
//        Triangular Number: "any of the series of numbers (1, 3, 6, 10, 15, etc.) obtained by continued summation of the natural numbers 1, 2, 3, 4, 5, etc."
//
//        [01]
//        02 [03]
//        04 05 [06]
//        07 08 09 [10]
//        11 12 13 14 [15]
//        16 17 18 19 20 [21]
//        e.g. If 4 is given: 1 + 3 + 6 + 10 = 20.
//
//        Triangular Numbers cannot be negative so return 0 if a negative number is given.

public class SumOfTriangularNumbers {
    public static int sumTriangularNumbers(int n)
    {
        if (n <= 0) return 0;
        return n*(n+1)*(n+2)/6;
    }
}


    public static int sumTriangularNumbers(int n)
    {
        int sum = 0, triangular = 0;
        for(int i = 1; i <= n; i++){
            sum = sum+i;
            triangular+=sum;
        }
        return triangular;
    }
