package com.company.codewars8;


//Grade book
//        Complete the function so that it finds the mean of the three scores passed to it and returns the letter value associated with that grade.
//
//        Numerical Score	Letter Grade
//        90 <= score <= 100	'A'
//        80 <= score < 90	'B'
//        70 <= score < 80	'C'
//        60 <= score < 70	'D'
//        0 <= score < 60	'F'
//        Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.

public class GradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        s1=(s1+s2+s3)/3;
        return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
    }
}

    public static char getGrade(int s1, int s2, int s3) {
        int mean = (s1 + s2 + s3) / 3;
        if (mean >= 90) return 'A';
        if (mean >= 80) return 'B';
        if (mean >= 70) return 'C';
        if (mean >= 60) return 'D';
        return 'F';
    }

    public static char getGrade(int s1, int s2, int s3) {
        switch ((s1 + s2 + s3) / 30) {
            case 10:
            case 9: return 'A';
            case 8: return 'B';
            case 7: return 'C';
            case 6: return 'D';
            default: return 'F';
        }
    }

    public static char getGrade(int s1, int s2, int s3) {
        return "FFFFFFDCBAA".charAt((s1+s2+s3)/30);
    }
