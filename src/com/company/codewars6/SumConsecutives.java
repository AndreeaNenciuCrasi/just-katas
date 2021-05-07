package com.company.codewars6;

//You are given a list/array which contains only integers (positive and negative). Your job is to sum only the numbers that are the same and consecutive. The result should be one list.
//
//        Extra credit if you solve it in one line. You can assume there is never an empty list/array and there will always be an integer.
//
//        Same meaning: 1 == 1
//
//        1 != -1
//
//        #Examples:
//
//        [1,4,4,4,0,4,3,3,1] # should return [1,12,0,4,6,1]
//
//        """So as you can see sum of consecutives 1 is 1
//          sum of 3 consecutives 4 is 12
//          sum of 0... and sum of 2
//          consecutives 3 is 6 ..."""
//
//        [1,1,7,7,3] # should return [2,14,3]
//        [-5,-5,7,7,12,0] # should return [-10,14,12,0]


public class SumConsecutives {
    public static List<Integer> sumConsecutives(List<Integer> s) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = s.size();

        int current, i = 0, sum = 0;
        while (i < length) {
            current = s.get(i);
            sum += current;
            while (i < length - 1 && s.get(i + 1) == current) {
                sum += current;
                i++;
            }

            result.add(sum);
            sum = 0;

            i++;
        }

        return result;
    }
}

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> accumulator = new ArrayList<>();
        for (int i = 0, sum = 0; i < s.size(); i++) {
            sum += s.get(i);
            if (i == s.size() - 1 || s.get(i) != s.get(i + 1)) {
                accumulator.add(sum);
                sum = 0;
            }
        }
        return accumulator;
    }

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            if (i == 0 || s.get(i) != s.get(i - 1))
                sums.add(s.get(i));
            else
                sums.set(sums.size() - 1, sums.get(sums.size() - 1) + s.get(i));
        }
        return sums;
    }

