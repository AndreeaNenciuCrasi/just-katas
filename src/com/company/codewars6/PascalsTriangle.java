package com.company.codewars6;

//In mathematics, Pascal's triangle is a triangular array of the binomial coefficients expressed with formula
//
//        (nk)=n!k!(n−k)!\lparen {n \atop k} \rparen = \frac {n!} {k!(n-k)!}(
//        k
//        n
//        ​
//        )=
//        k!(n−k)!
//        n!
//        ​
//
//        where n denotes a row of the triangle, and k is a position of a term in the row.
//
//        You can read Wikipedia article on Pascal's Triangle for more information.
//
//        Task
//        Write a function that, given a depth n, returns n top rows of Pascal's Triangle flattened into a one-dimensional list/array.
//
//        Example:
//        n = 1: [1]
//        n = 2: [1,  1, 1]
//        n = 4: [1,  1, 1,  1, 2, 1,  1, 3, 3, 1]
//        Note
//        Beware of overflow. Requested terms of a triangle are guaranteed to fit into the returned type, but depending on seleced method of calculations, intermediate values can be larger.


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PascalsTriangle {
    public static long[] generate(int n) {
        List<Long> list = new ArrayList<>();
        for(int line = 1; line <= n; line++)
        {
            long C=1;
            for(int i = 1; i <= line; i++)
            {
                list.add(C);
                System.out.println(C);
                C = C * (line - i) / i;
            }

        }
        long[] result = new long[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}

public class PascalsTriangle {
    public static long[] generate(int level) {
        List<Long> result = new ArrayList<>();
        for(long i = 0; i < level; i++) {
            long number = 1;
            for(long j = 0; j <= i; j++) {
                result.add(number);
                number = number * (i - j) / (j + 1);
            }
        }

        return result.stream().filter(Objects::nonNull).mapToLong(Long::longValue).toArray();
    }
