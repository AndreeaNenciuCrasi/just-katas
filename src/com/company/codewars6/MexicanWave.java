package com.company.codewars6;

//        Task
//        In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
//        Rules
//        1.  The input string will always be lower case but maybe empty.
//
//        2.  If the character in the string is whitespace then pass over it as if it was an empty seat
//        Example
//        wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
        }
        return list.toArray(new String[0]);
    }
}

    public static String[] wave(String str) {
        LinkedList<String> list = new LinkedList<String>();
        for(int i = 0; i < str.length(); i++)
        {
            char[] charArray = str.toCharArray();

            if(charArray[i] == ' ') continue;

            charArray[i] = Character.toUpperCase(charArray[i]);
            list.add(String.valueOf(charArray));
        }
        return list.toArray(new String[list.size()]);
    }
