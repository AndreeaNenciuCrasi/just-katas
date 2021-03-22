package com.example.codewars7;

//This time no story, no theory. The examples below show you how to write function accum:
//
//        Examples:
//
//        accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"
//        The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Accumul {
    public static String accum(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        String str = "";
        for(int i = 0; i < charArray.length; i++){
            for(int k = 0; k < i+1; k++){
                if( k == 0){
                    str += Character.toUpperCase(charArray[i]);
                }
                else{
                    str += charArray[i];
                }
            }
            if(i != charArray.length-1){
                str+= "-";
            }
        }
        return str;
    }
}

    public static String accum(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()) {
            if(i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }
