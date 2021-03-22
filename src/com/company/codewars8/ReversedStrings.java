package com.company.codewars8;

//Complete the solution so that it reverses the string passed into it.
//
//        'world'  =>  'dlrow'

public class ReversedStrings {
    public static String solution(String str) {
        // Your code here...
        String newcad="";

        for(int i = str.length()-1; i >= 0; i--){
            newcad += str.charAt(i);
        }

        return newcad;
    }
}
