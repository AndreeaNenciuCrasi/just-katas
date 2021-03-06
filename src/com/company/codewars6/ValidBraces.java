package com.company.codewars6;

//Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.
//
//        This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!
//
//        All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
//
//        What is considered Valid?
//        A string of braces is considered valid if all braces are matched with the correct brace.
//
//        Examples
//        "(){}[]"   =>  True
//        "([{}])"   =>  True
//        "(}"       =>  False
//        "[(])"     =>  False
//        "[({})](]" =>  False

public class ValidBraces {
    public boolean isValid(String braces) {
        String b = braces;
        System.out.println(braces);
        for(int i=0;i<braces.length()/2;i++)
        {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            if(b.length() == 0)
                return true;
        }
        return false;
    }
}

    public boolean isValid(String braces) {
        int lengthOfBraces = braces.length();
        for(int i = 0; i < lengthOfBraces; i++){
            braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
        }
        return braces.isEmpty();
    }

    public boolean isValid(String s) {
        int x = s.length();
        s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}","");
        return s.length() == x ? false : s.length() == 0 || isValid(s);
    }