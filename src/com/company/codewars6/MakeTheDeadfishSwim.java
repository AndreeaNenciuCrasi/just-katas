package com.company.codewars6;

//Write a simple parser that will parse and run Deadfish.
//
//        Deadfish has 4 commands, each 1 character long:
//
//        i increments the value (initially 0)
//        d decrements the value
//        s squares the value
//        o outputs the value into the return array
//        Invalid characters should be ignored.
//
//        Deadfish.parse("iiisdoso") =- new int[] {8, 64};


import java.util.ArrayList;
import java.util.List;

public class MakeTheDeadfishSwim {
    public static int[] parse(String data) {
        int value = 0;
        List<Integer> result = new ArrayList<>();
        for(char letter : data.toCharArray()) {
            switch(letter) {
                case 'i': value++; break;
                case 'd': value--; break;
                case 's': value *= value; break;
                case 'o': result.add(value); break;
                default: throw new IllegalArgumentException("Not valid code letter");
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

    public static int[] parse(String data) {
        List<Integer> list = new ArrayList<>();
        int value =0;
        for(char c: data.toCharArray()){
            if(c=='i'){
                value++;
            }else if(c=='d'){
                value--;
            }else if(c=='s'){
                value=value*value;
            }else if(c=='o'){
                list.add(value);
            }
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }


    public static int[] parse(String data) {
        int v = 0, i = 0, ret[] = new int[data.replaceAll("[^o]","").length()];
        for (char c : data.toCharArray()) {
            switch (c) {
                case 'i' : v++;        break;
                case 'd' : v--;        break;
                case 's' : v=v*v;      break;
                case 'o' : ret[i++]=v; break;
            }
        }
        return ret;
    }
