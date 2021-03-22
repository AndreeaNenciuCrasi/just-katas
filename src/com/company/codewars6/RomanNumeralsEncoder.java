package com.company.codewars6;

//Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.
//
//        Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
//
//        Example:
//
//        conversion.solution(1000); //should return "M"
//        Help:
//
//        Symbol    Value
//        I          1
//        V          5
//        X          10
//        L          50
//        C          100
//        D          500
//        M          1,000
//        Remember that there can't be more than 3 identical symbols in a row.

import java.util.Collections;
import java.util.TreeMap;

public class RomanNumeralsEncoder {
    private static final int[] arabs = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1, };
    private static final String[] romans = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public String solution(int n) {
        final StringBuilder roman = new StringBuilder();
        int i = 0;
        while (n > 0) {
            if (n >= arabs[i++]) {
                roman.append(romans[--i]);
                n = n - arabs[i];
            }
        }
        return roman.toString();
    }
}


    public String solution(int n) {
        final String[] digit = {"", "I", "II", "III", "IV", "V", "VI", "VII",
                "VIII", "IX"};
        final String[] ten = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX",
                "LXXX", "XC"};
        final String[] hundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC",
                "DCCC", "CM"};
        final String[] thousand = {"", "M", "MM", "MMM"};

        String result="";
        result = thousand[n/1000] + hundred[n%1000/100] + ten[n%100/10] +
                digit[n%10];
        return result;
    }


    public String solution(int n) {
        return String.join("", Collections.nCopies(n, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }


    private final static TreeMap<Integer, String> ROMAN_NUMBERS_MAP = new TreeMap<Integer, String>(); // Must use TreeMap -> floorKey Method

static {
        ROMAN_NUMBERS_MAP.put(1000, "M");
        ROMAN_NUMBERS_MAP.put(900, "CM");
        ROMAN_NUMBERS_MAP.put(500, "D");
        ROMAN_NUMBERS_MAP.put(400, "CD");
        ROMAN_NUMBERS_MAP.put(100, "C");
        ROMAN_NUMBERS_MAP.put(90, "XC");
        ROMAN_NUMBERS_MAP.put(50, "L");
        ROMAN_NUMBERS_MAP.put(40, "XL");
        ROMAN_NUMBERS_MAP.put(10, "X");
        ROMAN_NUMBERS_MAP.put(9, "IX");
        ROMAN_NUMBERS_MAP.put(5, "V");
        ROMAN_NUMBERS_MAP.put(4, "IV");
        ROMAN_NUMBERS_MAP.put(1, "I");
        }

public static String solution(int number) {
        Integer key = ROMAN_NUMBERS_MAP.floorKey(number);
        if (key == null)
        return "No roman equivalent";

        if (number == key.intValue()) // Fits perfectly
        return ROMAN_NUMBERS_MAP.get(number);

        return ROMAN_NUMBERS_MAP.get(key) + solution(number - key); // Add rest recursively
        }



static String solution(int n) {
        return "I".repeat(n)
        .replace("IIIII", "V").replace("IIII", "IV")
        .replace("VV", "X").replace("VIV", "IX")
        .replace("XXXXX", "L").replace("XXXX", "XL")
        .replace("LL", "C").replace("LXL", "XC")
        .replace("CCCCC", "D").replace("CCCC", "CD")
        .replace("DD", "M").replace("DCD", "CM");
        }
