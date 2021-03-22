package com.company.codewars8;

//Complete the solution so that it reverses all of the words within the string passed in.
//
//        Example:
//
//        ReverseWords.reverseWords("The greatest victory is that which requires no battle");
//// should return "battle no requires which that is victory greatest The"


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedWords {
    public static String reverseWords(String str){
        //write your code here...
        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
    }
}


//import org.apache.commons.lang3.StringUtils;
//
//public class ReverseWords{
//
//    public static String reverseWords(String str){
//        return StringUtils.reverseDelimited(str, ' '); // Use StringUtils to revers based on space character
//    }
//}


//    public static String reverseWords(String str){
//        String[] Words = str.split(" ");
//        String ris = "";
//        for(int i=Words.length-1;i>=0;i--){
//            ris = ris+Words[i];
//            if(i>0)ris+=" ";
//        }
//        return ris;
//    }
