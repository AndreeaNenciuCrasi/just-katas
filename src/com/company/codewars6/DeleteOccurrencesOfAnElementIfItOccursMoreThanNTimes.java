package com.company.codewars6;

//Enough is enough!
//        Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like these sessions, since the motive usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will only sit during the session if they show the same motive at most N times. Luckily, Alice and Bob are able to encode the motive as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?
//
//        Task
//        Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
//
//        Example
//        EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
//        EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {
    public static int[] deleteNth(int[] elements, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        for(int i : elements) {
            for(Integer in : result) {
                if(in == i) {
                    count++;
                }
            }
            if(count < n) {
                result.add(i);
            }
            count = 0;
        }
        int[] res = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<elements.length;i++){
            list.add(elements[i]);
        }

        int count;
        for(int i=0;i<elements.length;i++){
            if(hmap.get(elements[i])==null){
                hmap.put(elements[i],1);
            }else{
                count=hmap.get(elements[i]);
                count++;
                hmap.put(elements[i],count);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            int i = entry.getValue();
            while(i > maxOccurrences){
                int last = list.lastIndexOf(entry.getKey());
                list.remove(last);
                i--;
            }
        }
        int[] result = new int[list.size()];
        for(int i=0; i< list.size(); i++){
            result[i]=list.get(i);
        }
        return result;
    }

    public static int[] deleteNth(int[] elements, int maxOcurrences) {
        HashMap<Integer, Integer> elementMap = new HashMap<>(elements.length);
        ArrayList<Integer> elementsList = new ArrayList<>();

        for (int element : elements) {
            if (elementMap.containsKey(element)) {
                elementMap.put(element, elementMap.get(element) + 1);
            } else {
                elementMap.put(element, 1);
            }
            if (elementMap.get(element) <= maxOcurrences) {
                elementsList.add(element);
            }
        }
        return elementsList.stream().mapToInt(i -> i).toArray();
    }
