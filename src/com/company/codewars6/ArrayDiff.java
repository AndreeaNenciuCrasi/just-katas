package com.company.codewars6;

//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//
//        It should remove all values from list a, which are present in list b keeping their order.
//
//        array_diff({1, 2}, 2, {1}, 1, *z) == {2} (z == 1)
//        If a value is present in b, all of its occurrences must be removed from the other:
//
//        array_diff({1, 2, 2, 2, 3}, 5, {2}, 1, *z) == {1, 3} (z == 2)


public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        int count =0;
        for(int i=0; i<a.length;i++){
            for(int j=0; j<b.length; j++){

                if(a[i]==b[j]){
                    a[i]=Integer.MIN_VALUE;
                    count++;
                }
            }
        }
        int j=0;
        int[]result = new int[a.length-count];
        for(int i=0; i<a.length; i++){
            if(a[i]!=Integer.MIN_VALUE){
                result[j]=a[i];
                j++;
            }
        }
        return result;

    }
}
