package com.company.codewars7;

//Complete the function circleArea so that it will return the area of a circle with the given radius. Round the returned number to two decimal places (except for Haskell). If the radius is not positive or not a number, return false.
//
//        Example:
//
//        Circle.area(-1485.86);    //returns false
//        Circle.area(0);           //returns false
//        Circle.area(43.2673);     //returns 5881.25
//        Circle.area(68);          //returns 14526.72


public class AreaOfACircle {
    public static double area(double radius) {
        if (radius <= 0.0 || radius == Double.NaN) {
            throw new IllegalArgumentException();
        }
        return Math.round(Math.PI*(radius*radius) * 100.0) / 100.0;
    }
}

    public static double area(double radius) {
        if(radius<=0)throw new IllegalArgumentException();
        double a=3.141592653589793238*radius*radius;
        double area = Math.round(a * 100.0)/100.0;
        return area;
    }

    public static double area(double radius)
    {
        if (radius <= 0)
            throw new IllegalArgumentException();
        else
            return Math.PI*radius*radius;
    }