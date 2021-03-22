package com.example.codewars7;

import java.util.Arrays;

//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//
//        Example:
//
//        highAndLow("1 2 3 4 5")  // return "5 1"
//        highAndLow("1 2 -3 4 5") // return "5 -3"
//        highAndLow("1 9 3 4 -5") // return "9 -5"
//        Notes:
//
//        All numbers are valid Int32, no need to validate them.
//        There will always be at least one number in the input string.
//        Output string must be two numbers separated by a single space, and highest number is first.
public class HighestLowest {
    public static String HighAndLow(String numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String nums[] = numbers.split(" ");

        for(String s: nums) {
            int num = Integer.parseInt(s);

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return "" + max + " " + min;
    }
}

    public static String HighAndLow(String numbers) {
        String[] s = numbers.split(" ");
        int h = Integer.parseInt(s[0]);
        int l = Integer.parseInt(s[0]);
        for (String subS : s) {
            int curI = Integer.parseInt(subS);
            h = curI > h ? curI : h;
            l = curI < l ? curI : l;
        }

        return h+" "+l;
    }


    public static String HighAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }