package com.company.codewars6;

//The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.
//
//        In effect: 89 = 8^1 + 9^2
//
//        The next number in having this property is 135.
//
//        See this property again: 135 = 1^1 + 3^2 + 5^3
//
//        We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.
//
//        Let's see some cases:
//
//        sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
//
//        sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
//        If there are no numbers of this kind in the range [a, b] the function should output an empty list.
//
//        sum_dig_pow(90, 100) == []


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDigitsOfNumberRaisedToConsecutivePowers {
    public static List<Long> sumDigPow(final long a, final long b) {
        final List<Long> ret = new ArrayList<>();
        for (long k = a; k <= b; k++) {
            long v = 0;
            int exp = 1;
            for (char c : (""+k).toCharArray()) {
                v += Math.pow(c - '0', exp++);
                if (v > k) break;
            }
            if (v == k) ret.add(k);
        }
        return ret;
    }
}

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> res = new ArrayList<>();

        List<Long> single = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 89L, 135L, 175L, 518L, 598L, 1306L, 1676L, 2427L, 2646798L);
        for (long d : single) {
            if (d >= a && d <= b) {
                res.add(d);
            }
        }

        return res;
    }

    public static List<Long> sumDigPow(long a, long b) {
        ArrayList<Long> conformers = new ArrayList<>();
        for (;a <= b; a++){
            int sum = 0, power = 1;
            for (String digit: String.valueOf(a).split(""))
                sum += Math.pow(Integer.parseInt(digit), power++);

            if (sum == a)
                conformers.add(a);
        }
        return conformers;
    }
