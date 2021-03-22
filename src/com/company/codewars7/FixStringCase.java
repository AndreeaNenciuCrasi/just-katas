package com.company.codewars7;

//In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:
//
//        make as few changes as possible.
//        if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
//        For example:
//
//        solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
//        solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
//        solve("coDE") = "code". Upper == lowercase. Change all to lowercase.


public class FixStringCase {
    public static String solve(final String str) {
        int lower = 0;
        for (Character c:str.toCharArray()) {
            if (Character.isLowerCase(c))
                lower++;
        }
        return str.length() - lower > lower ? str.toUpperCase() : str.toLowerCase();
    }
}

    public static String solve(final String str) {
        int upperCase=0;
        for (int k = 0; k < str.length(); k++) {
            if (Character.isUpperCase(str.charAt(k))) upperCase++;}
        if(upperCase <= str.length()/2){
            return str.toLowerCase();
        }
        return str.toUpperCase();
    }


    public static String solve(final String s) {
        return s.length() < 2 * s.replaceAll("[a-z]","").length() ? s.toUpperCase() :s.toLowerCase();
    }
