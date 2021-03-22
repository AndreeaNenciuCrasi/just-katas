package com.example.codewars7;

import java.util.Arrays;
import java.util.stream.Collectors;

//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
//        Examples
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"
public class ReverseWords {
    public static String reverseWords(final String original)
    {
        String[] array = original.split(" ");

        if(array.length == 0)
            return original;


        int i = 0;
        for(String string : array){
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        return String.join(" ",array);
    }
}

    public static String reverseWords(final String str)
    {

        String words[]=str.split("\\s");
        if(words.length ==0)return str;
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }

        return reverseWord.trim();
    }

    public static String reverseWords(final String original){
        return original.trim().isEmpty()?original: Arrays.stream(original.split(" ")).map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
    }
