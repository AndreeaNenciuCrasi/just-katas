package com.company.codewars6;

//Background:
//        You're working in a number zoo, and it seems that one of the numbers has gone missing!
//
//        Zoo workers have no idea what number is missing, and are too incompetent to figure it out, so they're hiring you to do it for them.
//
//        In case the zoo loses another number, they want your program to work regardless of how many numbers there are in total.
//
//        Task:
//        Write a function that takes a shuffled list of unique numbers from 1 to n with one element missing (which can be any number including n). Return this missing number.
//
//        Note: huge lists will be tested.
//
//        Examples:
//        [1, 3, 4]  =>  2
//        [1, 2, 3]  =>  4
//        [4, 2, 3]  =>  1


public class NumberZooPatrol {
    public static int findMissingNumber(int[] numbers) {
        var sum = 0;
        var expectedSum = numbers.length + 1;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            expectedSum += i + 1;
        }
        return expectedSum - sum;
    }
}

    public static int findMissingNumber(int[] numbers) {
        return IntStream.rangeClosed(1,numbers.length+1).sum() - Arrays.stream(numbers).sum();
    }
