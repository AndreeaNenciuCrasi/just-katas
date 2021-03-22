package com.company.codewars7;

Two red beads are placed between every two blue beads. There are N blue beads. After looking at the arrangement below work out the number of red beads.

@ @@ @ @@ @ @@ @ @@ @ @@ @

        If there are less than 2 blue beads return 0.


public class SimpleBeadsCount {
    public static int countRedBeads(final int n) {
        return n < 2 ? 0 : 2*n - 2;
    }
}

    public static int countRedBeads(final int nBlue) {
        if(nBlue<2)return 0;
        int sum=0;
        for(int i=1; i<=nBlue-1; i++){
            sum+=2;
        }
        return sum;
