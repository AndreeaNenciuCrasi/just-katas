package com.company.codewars7;

//Scenario
//        Several people are standing in a row divided into two teams.
//        The first person goes into team 1, the second goes into team 2, the third goes into team 1, and so on.
//
//        Task
//        Given an array of positive integers (the weights of the people), return a new array/tuple of two integers, where the first one is the total weight of team 1, and the second one is the total weight of team 2.
//
//        Notes
//        Array size is at least 1.
//        All numbers will be positive.
//        Input >> Output Examples
//        rowWeights([13, 27, 49])  ==>  return (62, 27)
//        Explanation:
//        The first element 62 is the total weight of team 1, and the second element 27 is the total weight of team 2.
//
//        rowWeights([50, 60, 70, 80])  ==>  return (120, 140)
//        Explanation:
//        The first element 120 is the total weight of team 1, and the second element 140 is the total weight of team 2.
//
//        rowWeights([80])  ==>  return (80, 0)
//        Explanation:
//        The first element 80 is the total weight of team 1, and the second element 0 is the total weight of team 2.


public class RowWeights {
    public static int[] rowWeights (final int[] weights) {
        int totals[] = new int[2], idx = 0;
        for (int w : weights) totals[(idx++)%2] += w;
        return totals;
    }
}

    public static int[] rowWeights (final int[] weights)
    {
        if (weights.length==0)return new int[]{0,0};
        if(weights.length==1) return new int[]{weights[0],0};
        int team1=weights[0];
        int team2=0;
        for(int i=1; i<weights.length; i++){
            if(i%2!=0){
                team2+=weights[i];
            }else{
                team1+=weights[i];
            }
        }
        return new int[]{team1, team2};
    }
