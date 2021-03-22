package com.company.codewars6;

//Let us begin with an example:
//
//        A man has a rather old car being worth $2000. He saw a secondhand car being worth $8000. He wants to keep his old car until he can buy the secondhand one.
//
//        He thinks he can save $1000 each month but the prices of his old car and of the new one decrease of 1.5 percent per month. Furthermore this percent of loss increases of 0.5 percent at the end of every two months. Our man finds it difficult to make all these calculations.
//
//        Can you help him?
//
//        How many months will it take him to save up enough money to buy the car he wants, and how much money will he have left over?
//
//        Parameters and return of function:
//
//        parameter (positive int or float, guaranteed) startPriceOld (Old car price)
//        parameter (positive int or float, guaranteed) startPriceNew (New car price)
//        parameter (positive int or float, guaranteed) savingperMonth
//        parameter (positive float or int, guaranteed) percentLossByMonth
//
//        nbMonths(2000, 8000, 1000, 1.5) should return [6, 766] or (6, 766)
//        Detail of the above example:
//        end month 1: percentLoss 1.5 available -4910.0
//        end month 2: percentLoss 2.0 available -3791.7999...
//        end month 3: percentLoss 2.0 available -2675.964
//        end month 4: percentLoss 2.5 available -1534.06489...
//        end month 5: percentLoss 2.5 available -395.71327...
//        end month 6: percentLoss 3.0 available 766.158120825...
//        return [6, 766] or (6, 766)
//        where 6 is the number of months at the end of which he can buy the new car and 766 is the nearest integer to 766.158... (rounding 766.158 gives 766).
//
//        Note:
//
//        Selling, buying and saving are normally done at end of month. Calculations are processed at the end of each considered month but if, by chance from the start, the value of the old car is bigger than the value of the new one or equal there is no saving to be made, no need to wait so he can at the beginning of the month buy the new car:
//
//        nbMonths(12000, 8000, 1000, 1.5) should return [0, 4000]
//        nbMonths(8000, 8000, 1000, 1.5) should return [0, 0]


public class BuyingACar {
    static int[] nbMonths(double priceOld, double priceNew, int savingsPerMonth, double lossByMonth) {
        int savings = 0, months = 0;
        while (priceNew - priceOld > savings) {
            if (++months % 2 == 0) {
                lossByMonth += .5;
            }
            priceOld -= priceOld * lossByMonth / 100;
            priceNew -= priceNew * lossByMonth / 100;
            savings += savingsPerMonth;
        }
        return new int[] {months, (int) Math.round(priceOld - priceNew + savings)};
    }


}

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        // your code
        // creates a new array
        int[] results = new int[2];

        // checks if the value of the original car is the same amount or greater
        if(startPriceOld >= startPriceNew)
        {
            // puts the expected values into the results array and breaks from the program
            results[0] = 0;
            results[1] = startPriceOld - startPriceNew;
            return results;
        }

        int count = 0, savingsPerMonthTotal = 0;
        double endPriceOldCar = startPriceOld, totalSavings = 0, endPriceNew = startPriceNew;

        // checks that the total amount of money saved is less than the amount of money that we are trying to reach
        while(totalSavings < endPriceNew)
        {
            // formula blocks that get the current price of the
            // old car as well as the new car and adds them together
            endPriceOldCar -= endPriceOldCar * (percentLossByMonth)/100.0;
            endPriceNew -= endPriceNew * (percentLossByMonth)/100.0;
            savingsPerMonthTotal += savingperMonth;
            totalSavings = endPriceOldCar + (double)savingsPerMonthTotal;

            // increases the percent lost on the cars by .5 every time that the count is even
            if(count % 2 == 0)
            {
                percentLossByMonth += .5;
            }
            count++;
        }

        // puts the results from the formula block into the first and second variable places to check with the test
        results[0] = count;
        results[1] = (int)Math.round(totalSavings - endPriceNew);

        return results;
    }

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int mth = 0;
        double priceOld = (double)startPriceOld;
        double priceNew = (double)startPriceNew;
        double available = (double)startPriceOld;
        while (available < priceNew) {
            // at the end of this month
            mth += 1;
            if (mth % 2 == 0)
                percentLossByMonth = percentLossByMonth + 0.5;
            priceOld = priceOld * (100 - percentLossByMonth)  / 100;
            priceNew = priceNew * (100 - percentLossByMonth)  / 100;
            available = mth * savingperMonth + priceOld;
        }
        int[] res = new int[] {mth, (int)(available - priceNew +.5)};
        return res;
    }