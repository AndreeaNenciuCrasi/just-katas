package com.example.codewars7;

import java.util.stream.Collectors;

//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//        For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//        Note: The function accepts an integer and returns an integer
public class SquareDigit {
    public int squareDigits(int n) {
        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }
}

    public int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }

    public int squareDigits(int n) {

        String strDigits = String.valueOf(n);
        String result = "";

        for (char c : strDigits.toCharArray()) {
            int digit = Character.digit(c, 10);
            result += digit * digit;
        }

        return Integer.parseInt(result);
    }

    public int squareDigits(int n) {
        char[] c = Integer.toString(n).toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < c.length; i++){
            int p = Character.digit(c[i], 10);
            sb.append(p*p);
        }

        return Integer.parseInt(sb.toString());
    }
