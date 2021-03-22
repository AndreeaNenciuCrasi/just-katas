package com.company.codewars8;

import java.util.Arrays;
import java.util.Objects;

//You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
//
//        Array can contain numbers or strings. X can be either.
//
//        Return true if the array contains the value, false if not.
public class OnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}


    public static boolean check(Object[] a, Object x) {
        for (Object o : a) {
            if (Objects.equals(o, x)) {
                return true;
            }
        }
        return false;
    }

    public static boolean check(Object[] a, Object x) {
        for(Object b: a)
            if(b.equals(x))
                return true;
        return false;
    }

    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a)
                .anyMatch(i -> x.equals(i));
    }