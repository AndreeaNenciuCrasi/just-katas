package com.company.codewars7;

//Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.
//
//        Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
//        Each part will be in a string
//        Elements of a pair must be in the same order as in the original array.
//        Examples of returns in different languages:
//        a = ["az", "toto", "picaro", "zone", "kiwi"] -->
//        [["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
//        or
//        a = {"az", "toto", "picaro", "zone", "kiwi"} -->
//        {{"az", "toto picaro zone kiwi"}, {"az toto", "picaro zone kiwi"}, {"az toto picaro", "zone kiwi"}, {"az toto picaro zone", "kiwi"}}
//        or
//        a = ["az", "toto", "picaro", "zone", "kiwi"] -->
//        [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
//        or
//        a = [|"az", "toto", "picaro", "zone", "kiwi"|] -->
//        [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
//        or
//        a = ["az", "toto", "picaro", "zone", "kiwi"] -->
//        "(az, toto picaro zone kiwi)(az toto, picaro zone kiwi)(az toto picaro, zone kiwi)(az toto picaro zone, kiwi)"


import java.util.Arrays;

public class PartsOfAList {
    public static String[][] partlist(String[] arr) {
        String[][] returnArray = new String[arr.length-1][2];
        for(int i = 0; i < arr.length-1; ++i) {
            returnArray[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i+1));
            returnArray[i][1] = String.join(" ", Arrays.copyOfRange(arr, i+1, arr.length));
        }

        return returnArray;
    }
}


//    Following is the declaration for java.util.Arrays.copyOfRange() method
//
//      public static short[] copyOfRange(short[] original, int from, int to)
//        Parameters
//        original − This is the array from which a range is to to be copied.
//
//        from − This is the initial index of the range to be copied, inclusive.
//
//        to − This is the final index of the range to be copied, exclusive.

    public static String[][] partlist(String[] arr) {
        String[][] a = new String[arr.length - 1][1];
        for(int i= 0; i < arr.length - 1; i++){
            a[i][0] = "";
            for(int j = 0; j < arr.length; j++){
                if(i == j)
                    a[i][0] += arr[j] + ",";
                else
                    a[i][0] += arr[j];
                if(j != arr.length - 1)
                    a[i][0] += " ";
            }
        }
        return a;
    }
