package com.example.codewars7;

//You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
//
//        #Examples:
//
//        Kata.getMiddle("test") should return "es"
//
//        Kata.getMiddle("testing") should return "t"
//
//        Kata.getMiddle("middle") should return "dd"
//
//        Kata.getMiddle("A") should return "A"
public class GetMiddleCharacter {
    public static String getMiddle(String word) {
        String s = "";
        int length = word.length();
        int half = length/2;

        if (length % 2 == 0) {

            s = word.substring(half - 1, half + 1);

        } else {

            s = word.substring(half, half + 1);

        }

        return s;
    }
}

    public static String getMiddle(String word) {
        int length = word.length();
        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
    }

    public static String getMiddle(String word) {
        return word.substring((int) Math.ceil(word.length() / 2.0) - 1, (int) Math.floor(word.length() / 2.0) + 1);
    }