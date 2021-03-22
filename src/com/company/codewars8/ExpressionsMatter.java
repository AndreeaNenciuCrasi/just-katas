package com.company.codewars8;

//Task
//        Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
//        In other words , *_try every combination of a,b,c with [+()] , and return the Maximum Obtained_**
//        Consider an Example :
//        With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
//
//        1 * (2 + 3) = 5
//        1 * 2 * 3 = 6
//        1 + 2 * 3 = 7
//        (1 + 2) * 3 = 9
//        So the maximum value that you can obtain is 9.


import java.util.stream.IntStream;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
        return  Math.max(Math.max(a + b + c, a * b * c),Math.max ((a + b) * c, a * (b + c)));
    }
}

    public static int expressionsMatter(int a, int b, int c)
    {

        int[] myArray = {a+b+c, a*b*c, a+b*c, a*b+c, (a+b)*c, a*(b+c)};
        int max = 0;
        for(int i = 0; i<myArray.length; i++ ){
            if(myArray[i] > max ){
                max = myArray[i];
            }
        }
        return max;
    }


    public static int expressionsMatter(int a, int b, int c)
    {
        return IntStream.of(a + b + c, a * b * c, a + b * c, a * b + c, (a + b) * c, a * (b + c)).max().getAsInt();
    }
