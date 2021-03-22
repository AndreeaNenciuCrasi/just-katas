package com.company.codewars8;

//Implement a function which convert the given boolean value into its string representation.

public class ConvertBooleanToString {
    public static String convert(boolean b){
        return b ? "true" : "false";
    }
}

    public static String convert(boolean b){
        return Boolean.toString(b);
    }

    public static String convert(boolean b){
        return b+"";
    }

    public static String convert(boolean b){
        return String.valueOf(b);
    }


