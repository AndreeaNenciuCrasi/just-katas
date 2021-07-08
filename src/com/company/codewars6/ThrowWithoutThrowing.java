package com.company.codewars6;

//Description:
//        In this kata, you'll have to throw some Exceptions, but throwing an exception is so easy, so your code shouldn't contain the following substrings:
//
//        Class
//        Exception
//        Error
//        Throwable
//        throw
//        \u
//        Which means, you cannot use the reflection API or use new to create Exception instances.
//
//        You have to implement some static methods, and the name of each method tells you which Exception you're expected to throw in that method.

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ThrowWithoutThrowing {
    public static void arrayIndexOutOfBound() {
        int a = (new int[1])[2];
    }

    public static void negativeArraySize() {
        int[] a = new int[-1];
    }

    public static void noSuchElement() {
        new ArrayList().iterator().next();
    }

    public static void arithmetic() {
        float x = 1/0;
    }

    public static void classCast() {
        int x = (int)new Object();
    }

    public static void stackOverflow() {
        stackOverflow();
    }

    public static void nullPointer() {
        ((Object)null).toString();
    }

    public static void numberFormat() {
        Integer.parseInt("x");
    }

    public static void illegalArgument() {
        Character.toChars(-1);
    }

    public static void emptyStack() {
        new Stack().pop();
    }

    public static void bufferOverflow() {
        ByteBuffer.allocate(0).put(new byte[1]);
    }

    public static void arrayStore() {
        ((Object[])new Integer[1])[0] = 'x';
    }

    public static void unsupportedOperation() {
        Arrays.asList(new int[3]).remove(0);
    }

    public static void illegalState() {
        new ArrayList().iterator().remove();
    }
}
