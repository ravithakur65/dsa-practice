package dsa.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class CalendarDates {
    public static void main(String[] args) {
        int day = 25;
        int month = 3;
        int year = 2025;
        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayName = date.getDayOfWeek();
        return dayName.name();
    }
}



