package com.company.codewars6;

//You work in Operations at Great Projects Ltd. Helen, from Sales, is about to bid for a contract. The contract specifies the month when the project starts and the month when the project ends. She wants you to calculate how many working days there are in the duration of this project.
//
//        Working days in a week are Monday to Friday.
//        Non working days are Saturday and Sunday. There are no holidays.
//        You will get a start date and an end date. Disregard the day in these dates. Only note the month and the year.
//        The project will start on the first Monday of the month in the start date.
//        It will be completed on the last Friday of the month in the end date.
//        If the end date is the same as the start date then this is a 1 month project.
//        In the tests, both start and end will be valid non-null dates and the end date will be the same as or later than the start date.
//        Create a method to calculate the number of working days in this project


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class WorkingDays {
    public static long count(final LocalDate start, final LocalDate end) {

        LocalDate firstMonday = start.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        LocalDate lastFriday = end.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));

        long days = firstMonday.until(lastFriday, ChronoUnit.DAYS) + 1;

        return (days + 2) * 5 / 7;
    }
}
