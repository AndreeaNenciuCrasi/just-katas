package com.company.codewars6;
//The drawing below gives an idea of how to cut a given "true" rectangle into squares ("true" rectangle meaning that the two dimensions are different).
//
//        alternative text
//
//        Can you translate this drawing into an algorithm?
//
//        You will be given two dimensions
//
//        a positive integer length (parameter named lng)
//        a positive integer width (parameter named wdth)
//        You will return a collection or a string (depending on the language; Shell bash, PowerShell, Pascal and Fortran return a string) with the size of each of the squares.
//
//        sqInRect(5, 3) should return [3, 2, 1, 1]
//        sqInRect(3, 5) should return [3, 2, 1, 1]
//        or (Haskell)
//        squaresInRect  5  3 `shouldBe` Just [3,2,1,1]
//        squaresInRect  3  5 `shouldBe` Just [3,2,1,1]
//        or (Fsharp)
//        squaresInRect  5  3 should return Some [3,2,1,1]
//        squaresInRect  3  5 should return Some [3,2,1,1]
//        or (Swift)
//        squaresInRect  5  3 should return [3,2,1,1] as optional
//        squaresInRect  3  5 should return [3,2,1,1] as optional
//        or (Cpp)
//        sqInRect(5, 3) should return {3, 2, 1, 1}
//        sqInRect(3, 5) should return {3, 2, 1, 1}
//        (C)
//        C returns a structure, see the "Solution" and "Examples" tabs.
//        Your result and the reference test solution are compared by strings.
//
//        (others)
//        sqInRect(5, 3) should return "3 2 1 1"
//        sqInRect(3, 5) should return "3 2 1 1"
//
//        You can see more examples in **"SAMPLE TESTS".**

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectangleIntoSquares {
    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        List<Integer> squares = new ArrayList<Integer>();
        int area = lng * wdth;
        while (area > 0) {
            squares.add(Math.min(lng,wdth));
            if (wdth > lng)wdth = wdth - lng;
            else lng = lng - wdth;
            area = lng * wdth;
        }
        return squares;
    }
}

    public static List<Integer> sqInRect(int lng, int wdth) {
        if(lng==wdth) return null;
        List<Integer> result = new ArrayList<>();
        while(lng*wdth>0){
            if(lng>wdth){
                result.add(wdth);
                lng=lng-wdth;
            }else{
                result.add(lng);
                wdth=wdth-lng;
            }
        }
        return result;
    }

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;

        int[] arr = new int[] {lng, wdth};
        Arrays.sort(arr);

        List<Integer> ans = new ArrayList<Integer>();
        while (arr[0] > 0) {
            ans.add(arr[0]);
            arr[1] = arr[1]-arr[0];
            Arrays.sort(arr);
        }
        return ans;
    }

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) {
            return null;
        }
        int min = Math.min(lng, wdth);
        int max = Math.max(lng, wdth);

        List<Integer> list = new ArrayList<>();
        while (min < max) {
            list.add(min);

            int temp = max - min;

            max = Math.max(temp, min);
            min = Math.min(min, temp);
        }
        if (min > 0) {
            list.add(min);
        }

        return list;
    }
