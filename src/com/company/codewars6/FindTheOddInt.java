package com.company.codewars6;

//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.


import java.util.*;

public class FindTheOddInt {
    public static int findIt(int[] A) {
        int odd=0;
        for (int item: A)
        {
            odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
        }

        return odd;
    }
}

    public static int findIt(int[] a) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i< a.length; i++){
            int count = 0;
            for(int j=0; j< a.length; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            hm.put(a[i],count);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
            if(entry.getValue()%2!=0){
                return entry.getKey();
            }
        return 0;
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> counts = new HashMap<>(a.length);
        for(int i : a) {
            if(!counts.containsKey(i)) counts.put(i, 1);
            else counts.put(i, counts.get(i) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()) if(entry.getValue() % 2 == 1) return entry.getKey();
        return 0;
    }


    public static int findIt(int[] A) {

        //get a list rather so we can use Collections.frequency
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : A) {
            intList.add(i);
        }

        for (int i : A) {
            //find the first number with an odd number frequency i.e. mod 2
            if(Collections.frequency(intList, i) % 2 != 0)
                return i;
        }
        return -1;
    }
