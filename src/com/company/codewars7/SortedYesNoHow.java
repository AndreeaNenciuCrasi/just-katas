package com.company.codewars7;

//Complete the method which accepts an array of integers, and returns one of the following:
//
//        "yes, ascending" - if the numbers in the array are sorted in an ascending order
//        "yes, descending" - if the numbers in the array are sorted in a descending order
//        "no" - otherwise
//        You can assume the array will always be valid, and there will always be one correct answer.


public class SortedYesNoHow {
    public static String isSortedAndHow(int[] array) {
        boolean desc = false;
        boolean asc = false;
        for(int i = 1; i < array.length; i++) {
            if(array[i] > array[i-1]) asc = true;
            if(array[i] < array[i-1]) desc = true;
        }
        if(asc && !desc) return "yes, ascending";
        if(desc && !asc) return "yes, descending";
        return "no";
    }
}

    public static String isSortedAndHow(final int[] array) {
        final boolean ascending = array[0] < array[1];

        for (int i = 2; i < array.length; i++) {
            if (ascending ? (array[i - 1] > array[i]) : (array[i - 1] < array[i])) {
                return "no";
            }
        }

        return String.format("yes, %s", ascending ? "ascending" : "descending");
    }


    static String isSortedAndHow(int[] array) {
        return range(1, array.length).noneMatch(i -> array[i - 1] > array[i]) ? "yes, ascending" :
                range(1, array.length).noneMatch(i -> array[i - 1] < array[i]) ? "yes, descending" : "no";
    }


    public static String isSortedAndHow(int[] array) {
        boolean increasing=false;
        boolean decreasing =false;
        for(int i = 0; i < array.length-1; i++) {
            if(array[i] < array[i+1]) {
                increasing = true;
            }
        }


        for(int i=0; i<array.length-1; i++){
            if(array[i]>array[i+1]){

                decreasing=true;}
        }
        if(increasing && !decreasing)return "yes, ascending";
        else if(!increasing && decreasing)return "yes, descending";
        return "no";

    }
