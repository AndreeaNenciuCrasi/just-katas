package com.example.codewars7;

//You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
//
//        Find max(abs(length(x) − length(y)))
//
//        If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
//
//        Example:
//        a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
//        a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
//        mxdiflg(a1, a2) --> 13


public class MaximumLengthDifference {
    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1.length==0||a2.length==0)
            return -1;

        int b1=0, b2=0;
        int l1=Integer.MAX_VALUE, l2=Integer.MAX_VALUE;

        for (String s : a1) {
            b1 = Math.max(b1, s.length());
            l1 = Math.min(l1, s.length());
        }
        for (String s : a2) {
            b2 = Math.max(b2, s.length());
            l2 = Math.min(l2, s.length());
        }

        return Math.max(Math.abs(b2-l1), Math.abs(b1-l2));
    }
}

    public static int mxdiflg(String[] a1, String[] a2) {
        int res = -1;
        for (String x : a1)
            for (String y : a2)
                res = Math.max(res, Math.abs(x.length() - y.length()));
        return res;
    }
