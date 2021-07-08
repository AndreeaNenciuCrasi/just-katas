package com.company.codewars6;

//In this Kata, you will be given an array of strings and your task is to remove all consecutive duplicate letters from each string in the array.
//
//        For example:
//
//        dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].
//        dup(["kelless","keenness"]) = ["keles","kenes"].
//        Strings will be lowercase only, no spaces. See test cases for more examples.

public class StringArrayDuplicates {
    public static String[] dup(String[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = arr[i].replaceAll("(.)\\1+", "$1");
        return arr;
    }
}

    public static String[] dup(String[] arr){
        String regex = "(.)\\1+";

        for(int i=0; i< arr.length; i++){
            Matcher matcher = Pattern.compile(regex).matcher(arr[i]);
            arr[i]=matcher.replaceAll("$1");
        }
        return arr;
    }
