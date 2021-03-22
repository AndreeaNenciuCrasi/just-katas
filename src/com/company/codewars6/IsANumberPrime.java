package com.company.codewars6;

//Define a function that takes one integer argument and returns logical value true or false depending on if the integer is a prime.
//
//        Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
//
//        Requirements
//        You can assume you will be given an integer input.
//        You can not assume that the integer will be only positive. You may be given negative numbers as well (or 0).
//        NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out. Numbers go up to 2^31 (or similar, depends on language version). Looping all the way up to n, or n/2, will be too slow.
//        Example
//        is_prime(1)  /* false */
//        is_prime(2)  /* true  */
//        is_prime(-1) /* false */


import java.math.BigInteger;

public class IsANumberPrime {
    public static boolean isPrime(int num) {
        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
    }
}

    public static boolean isPrime(int number) {
        if(number < 2)
            return false;
        for (int i=2; i<=Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }


    public static boolean isPrime(int n) {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static boolean isPrime(int num) {

        if (num < 2) { return false; }

        BigInteger result = BigInteger.valueOf(num);
        return result.isProbablePrime((int)Math.log(num));
    }
