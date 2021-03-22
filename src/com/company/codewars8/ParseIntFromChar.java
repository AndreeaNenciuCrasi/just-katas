package com.company.codewars8;


//Ask a small girl - "How old are you?". She always says strange things... Lets help her!
//
//        For correct answer program should return int from 0 to 9.
//
//        Assume test input string always valid and may look like "1 year old" or "5 years old", etc.. The first char is number only.

public class ParseIntFromChar {
    public static int howOld(final String herOld) {

        return Character.getNumericValue(herOld.charAt(0));
    }
}

    public static int howOld(final String herOld) {

        String s = herOld.substring(0,1);
        return Integer.parseInt(s);

    }

    public static int howOld(final String herOld) {

        String[] s = herOld.split(" ");
        return Integer.valueOf(s[0]);

    }
