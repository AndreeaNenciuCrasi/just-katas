package com.company.codewars6;

import java.util.*;

//Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
//
//        #Example 1: a1 = ["arp", "live", "strong"]
//
//        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//        returns ["arp", "live", "strong"]
//
//        #Example 2: a1 = ["tarp", "mice", "bull"]
//
//        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//        returns []
public class WhichAreIn {
    public class WhichAreIn {

        public static String[] inArray(String[] array1, String[] array2) {
            Set<String> result = new HashSet<>();

            for(String a1 : array1) {
                for(String a2 : array2) {
                    if(a2.contains(a1)) {
                        result.add(a1);
                        break;
                    }
                }
            }

            String[] resultArray = result.toArray(new String[result.size()]);

            Arrays.sort(resultArray);

            return resultArray;
        }
}

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> result = new TreeSet<>();
        String arr[];

        for (String s : array1)
            for (String i : array2)
                if (i.contains(s))
                    result.add(s);


        arr = new String[result.size()];
        return result.toArray(arr);
    }


    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<String>();
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++ ){
                if(array2[j].indexOf(array1[i]) >= 0){
                    result.add(array1[i]);
                    j =array2.length;
                }
            }
        }
        Collections.sort(result);
        return result.toArray(new String[result.size()]);
    }