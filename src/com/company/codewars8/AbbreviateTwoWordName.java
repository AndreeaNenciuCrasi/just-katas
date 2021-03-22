package com.company.codewars8;

//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
//        The output should be two capital letters with a dot separating them.
//
//        It should look like this:
//
//        Sam Harris => S.H
//
//        Patrick Feeney => P.F

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}

//    public static String abbrevName(String name) {
//
//        String[] init = name.split(" ");
//        return init[0].substring(0, 1).toUpperCase().concat("."+ init[1].substring(0, 1).toUpperCase());
//    }


//    public static String abbrevName(String name) {
//        name = name.toUpperCase();
//        return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
//    }
