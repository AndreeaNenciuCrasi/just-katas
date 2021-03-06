package com.company.codewars8;


//After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
//
//        You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.
//
//        Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
//
//        Write a code that gives out the total amount for different days(d).

public class TransportationOnVacation {
    private static final int COST_PER_DAY = 40;

    public static int rentalCarCost(int d) {
        if (d < 3)       return d * COST_PER_DAY;
        else if (d >= 7) return d * COST_PER_DAY - 50;
        else             return d * COST_PER_DAY - 20;
    }
}

    public static int rentalCarCost(int d) {
        return d < 7 ? d < 3 ? 40 * d : 40 * d - 20 : 40 * d - 50;
    }

    public static int rentalCarCost(int d) {
        final int COST_PER_DAY = 40;
        return d * COST_PER_DAY - (d >= 7 ? 50 : d >= 3 ? 20 : 0);
    }
