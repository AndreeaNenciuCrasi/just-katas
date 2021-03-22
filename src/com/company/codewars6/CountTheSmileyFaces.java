package com.company.codewars6;


//Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
//
//        Rules for a smiling face:
//
//        Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
//        A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
//        Every smiling face must have a smiling mouth that should be marked with either ) or D
//        No additional characters are allowed except for those mentioned.
//
//        Valid smiley face examples: :) :D ;-D :~)
//        Invalid smiley faces: ;( :> :} :]
//
//        Example
//        countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
//        countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
//        countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {
    public static int countSmileys(List<String> arr) {
        return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }
}

    static String validSmilyFaces =  ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";


    public static int countSmileys(List<String> arr) {
        int counter = 0;

        for (int i =0; i < arr.size(); i++){

            if (validSmilyFaces.contains(arr.get(i))){
                counter++;
            }
        }
        return counter;
    }

    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String emoji : arr) {
            if (emoji.matches("([:|;][-|~]?[)|D])")) {
                count++;
            }
        }
        return count;
    }


    public static int countSmileys(List<String> arr) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(":)");
        list.add(";)");
        list.add(":-)");
        list.add(":~)");
        list.add(";-)");
        list.add(";~)");
        list.add(":D");
        list.add(";D");
        list.add(":-D");
        list.add(":~D");
        list.add(";-D");
        list.add(";~D");
        int count = 0;
        for (String str : arr){
            if (list.contains(str)){
                count++;
            }
        }
        return count;
    }
