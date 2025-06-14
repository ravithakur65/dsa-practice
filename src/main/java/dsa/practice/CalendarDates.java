package dsa.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;


public class CalendarDates {
    public static void main(String[] args) {
        int day = 25;
        int month = 3;
        int year = 2025;
        System.out.println(findDay(month, day, year));
        timeFunction();
    }

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayName = date.getDayOfWeek();
        return dayName.name();
    }

    private static void timeFunction() {
        LocalTime lt = LocalTime.now();
        LocalTime mlt2 = LocalTime.of(10,35,46);
        System.out.println(lt);
        System.out.println(mlt2);
    }
}



