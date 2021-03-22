package com.company.codewars6;

//The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
//
//        Examples
//        "din"      =>  "((("
//        "recede"   =>  "()()()"
//        "Success"  =>  ")())())"
//        "(( @"     =>  "))(("
//        Notes
//
//        Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!

import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
}

    static String encode(String word){
        return word.toLowerCase()
                .chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }

    static String encode(String word){
        String lowerWord = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for(char ch: lowerWord.toCharArray()) {
            boolean single = lowerWord.indexOf(ch) == lowerWord.lastIndexOf(ch);
            result.append(single ? '(' : ')');
        }
        return result.toString();
    }


    static String encode(String word){
        String res = "";
        String work = word.toLowerCase();
        for (String s : work.split("")) {
            if (work.indexOf(s) != work.lastIndexOf(s) ) {
                res += ")";
            } else {
                res += "(";
            }
        }
        return res;
    }
