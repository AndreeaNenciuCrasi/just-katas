package com.example.codewars7;

//Return the number (count) of vowels in the given string.
//
//        We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
//        The input string will only consist of lower case letters and/or spaces.

public class VowelCount {
    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}

    public static int getCount(String str) {
        int vowelsCount = 0;

        for(char c : str.toCharArray())
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        return vowelsCount;
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for(int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' ||  c == 'e' || c =='i' || c == 'o' || c == 'u')
                vowelsCount++;
        }
        return vowelsCount;
    }
