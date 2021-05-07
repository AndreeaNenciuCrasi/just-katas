package com.company.codewars6;

//You get an array of arrays.
//        If you sort the arrays by their length, you will see, that their length-values are consecutive.
//        But one array is missing!
//
//
//        You have to write a method, that return the length of the missing array.
//
//        Example:
//        [[1, 2], [4, 5, 1, 1], [1], [5, 6, 7, 8, 9]] --> 3
//
//        If the array of arrays is null/nil or empty, the method should return 0.
//
//        When an array in the array is null or empty, the method should return 0 too!
//        There will always be a missing element and its length will be always between the given arrays.


public class LengthOfMissingArray {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays)
    {
        if (arrayOfArrays == null || arrayOfArrays.length < 2) return 0;
        List<Integer> lst = new ArrayList<>();
        for (Object[] a : arrayOfArrays){
            if (a == null || a.length == 0) return 0;
            else lst.add(a.length);
        }
        Collections.sort(lst);
        for (int i = 0; i < lst.size(); i++){
            if (lst.get(i+1) - lst.get(i) != 1) return lst.get(i)+1;
        }
        return 0;
    }
}
