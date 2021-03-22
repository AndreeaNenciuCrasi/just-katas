package com.company.codewars6;

//A stream of data is received and needs to be reversed.
//
//        Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:
//
//        11111111  00000000  00001111  10101010
//        (byte1)   (byte2)   (byte3)   (byte4)
//        should become:
//
//        10101010  00001111  00000000  11111111
//        (byte4)   (byte3)   (byte2)   (byte1)
//        The total number of bits will always be a multiple of 8.
//
//        The data is given in an array as such:
//
//        [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DataReverse {
    int bytes[] = new int[data.length];
    for (int i = data.length-8, j=0; i>=0; i-=8, j+=8) {
        System.arraycopy(data, i, bytes, j, 8);
    }
    return bytes;
}

    public static int[] DataReverse(int[] data) {
        int[] reversed = new int[data.length];
        for (int i = 0; i < data.length; i += 8) {
            System.arraycopy(data, i, reversed, data.length - 8 - i, 8);
        }
        return reversed;
    }

    public static int[] DataReverse(int[] data) {
        ArrayList<int[]> myList = new ArrayList<>();

        for(int i=0; i<data.length; i=i+8){
            myList.add(Arrays.copyOfRange(data, i, i+8));
        }

        Collections.reverse(myList);

        return myList.stream().flatMapToInt(i -> Arrays.stream(i)).toArray();
    }

    public static int[] DataReverse(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length / 8; i++) {
            System.arraycopy(data, data.length - 8 * i - 8, result, 8 * i, 8);
        }
        return result;
    }
