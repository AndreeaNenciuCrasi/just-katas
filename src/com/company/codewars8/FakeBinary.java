package com.company.codewars8;

//Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}

    public static String fakeBin(String numberString) {
        final char c[] = numberString.toCharArray();
        for (int i = 0; i < c.length; i++)
            c[i] = c[i] < '5' ? '0' : '1';
        return new String(c);
    }

    public static String fakeBin(String numberString) {
        String res = "";
        for(char a : numberString.toCharArray()) {
            res += (a < '5') ? "0" : "1";
        }
        return res;
    }
