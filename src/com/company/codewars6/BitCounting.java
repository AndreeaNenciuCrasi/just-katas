package com.company.codewars6;

//Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
//
//        Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case


public class BitCounting {
    public static int countBits(int n){

        return Integer.bitCount(n);
    }
}

    public static int countBits(int n){
        int ret = n % 2;
        while ((n /= 2) > 0) ret += n % 2;
        return ret;
    }

    public static int countBits(int n){
        String s = Integer.toBinaryString(n);
        return s.replace("0", "").length();
    }


    public static int countBits(int n){
        // Show me the code!
        int num = Integer.bitCount(n);
        return num;
    }
