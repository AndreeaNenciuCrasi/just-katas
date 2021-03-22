package com.company.codewars8;

//Write a function to split a string and convert it into an array of words. For example:
//
//        "Robin Singh" ==> ["Robin", "Singh"]
//
//        "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

public class ConvertStringArray {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
