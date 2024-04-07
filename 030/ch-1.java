// Solution of Task 1 of The Weekly Challenge 30
// https://theweeklychallenge.org/blog/perl-weekly-challenge-030/

/*
$ java ch-1.java
25-12-2022
25-12-2033
25-12-2039
25-12-2044
25-12-2050
25-12-2061
25-12-2067
25-12-2072
25-12-2078
25-12-2089
25-12-2095
*/

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Task1 {
    public static void main(String[] args) {
        var cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DATE, 25);

        var format = new SimpleDateFormat("dd-MM-yyyy");

        for (int year = 2019; year <= 2100; year++) {
            cal.set(Calendar.YEAR, year);

            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println(format.format(cal.getTime()));
            }
        }
    }
}