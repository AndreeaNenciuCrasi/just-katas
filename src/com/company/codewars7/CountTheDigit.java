package com.example.codewars7;

import java.util.stream.IntStream;

//Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer. Square all numbers k (0 <= k <= n) between 0 and n. Count the numbers of digits d used in the writing of all the k**2. Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count.
//
//        Examples:
//        n = 10, d = 1, the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
//        We are using the digit 1 in 1, 16, 81, 100. The total count is then 4.
//
//        nb_dig(25, 1):
//        the numbers of interest are
//        1, 4, 9, 10, 11, 12, 13, 14, 19, 21 which squared are 1, 16, 81, 100, 121, 144, 169, 196, 361, 441
//        so there are 11 digits `1` for the squares of numbers between 0 and 25.
//        Note that 121 has twice the digit 1.
public class CountTheDigit {
    public static int nbDig(int n, int d) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += countOfDigit((int) Math.pow(i, 2), d);
        }
        return sum;
    }

    public static int countOfDigit(int n, int d) {
        int count = 0;
        do {
            if (n % 10 == d)
                count ++;
            n /= 10;
        } while (n > 0);
        return count;
    }
}

    public static int nbDig(int n, int d) {

        return (int) IntStream
                .rangeClosed(0, n)
                .map(i -> i * i)
                .flatMap(i -> String.valueOf(i).chars())
                .mapToObj(i -> (char)i)
                .mapToInt(Character::getNumericValue)
                .filter(i -> i == d)
                .count();
    }


    public static int nbDig(int n, int d) {
        int needle = String.valueOf(d).charAt(0);
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String haystack = String.valueOf(i * i);
            count += (int) haystack.chars().filter(ch -> ch == needle).count();
        }
        return count;
    }

    public static int nbDig(int n, int d) {
        int c = 0;
        for (int i = 0; i < n + 1; i++) {
            int temp = i * i;
            while (true) {
                if (temp % 10 == d) c++;
                if ((temp /= 10) == 0) break;
            }
        }

        return c;
    }


    public static int nbDig(int n, int d) {
        char c = Integer.toString(d).charAt(0);
        int counter = 0;
        for(int i=0;i<=n;i++){
            String square = ""+i*i;
            for(int j=0;j<square.length();j++){
                if(square.charAt(j)==c){
                    counter++;
                }
            }
        }

        return counter;

    }
