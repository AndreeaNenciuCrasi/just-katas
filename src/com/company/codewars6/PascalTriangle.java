package com.company.codewars6;

//Here you will create the classic Pascal's triangle. Your function will be passed the depth of the triangle and you code has to return the corresponding pascal triangle up to that depth.
//
//        The triangle should be returned as a nested array. For example:
//
//        PascalsTriangle.pascal(5); // should return [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]
//        To build the triangle, start with a single 1 at the top, for each number in the next row you just take the two numbers above it and add them together (except for the edges, which are all 1), e.g.:
//
//        [1]
//        [1   1]
//        [1   2   1]
//        [1   3   3   1]


public class PascalTriangle {
    int[][] triangle = new int[depth][];

    for (int i = 0; i < depth; i++) {
        triangle[i] = new int[i+1];
        triangle[i][0] = 1;
        triangle[i][i] = 1;
        for (int j = 1; j < i; j++) {
            triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
        }
    }
    return triangle;
}
}

public static int[][] pascal(int depth) {
        // Your code here...
        int[][] num = new int[depth][];
        for(int i = 0; i < depth; i ++) {
        num[i] = new int[i + 1];
        for(int j = 0 ; j <= i; j ++) {
        num[i][j] = (j == 0 || j == i) ? 1 : num[i - 1][j - 1] + num[i - 1][j];
        }
        }
        //return new int[][] { { 1 } };
        return num;
        }
