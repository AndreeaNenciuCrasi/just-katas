package com.example.codewars7;

import java.util.Arrays;
import java.util.stream.Collectors;

//Your task is to remove all duplicate words from a string, leaving only single (first) words entries.
//
//        Example:
//
//        Input:
//
//        'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'
//
//        Output:
//
//        'alpha beta gamma delta'
public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String s){
        StringBuilder sb = new StringBuilder();
        for(String str : s.split(" ")){
            if (!sb.toString().contains(str)) {
                sb.append(str).append(" ");
            }
        }
        return sb.toString().trim();
    }
}


import java.util.*;
        import java.util.stream.*;
        import java.util.stream.Collectors.*;

class Solution{
    public static String removeDuplicateWords(String s){
        return Arrays.stream( s.split("\\s+")).distinct().collect(Collectors.joining(" ") );
    }
}
