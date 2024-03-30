// Solution of Task 1 of The Weekly Challenge 13
// https://theweeklychallenge.org/blog/perl-weekly-challenge-013/

// Test run:
// $ java ch-1.java 2024
// 26.01.2024
// 23.02.2024
// 29.03.2024
// 26.04.2024
// 31.05.2024
// 28.06.2024
// 26.07.2024
// 30.08.2024
// 27.09.2024
// 25.10.2024
// 29.11.2024
// 27.12.2024

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java ch-01.java <YEAR>");
            return;
        }

        final int year = Integer.valueOf(args[0]);
        final Calendar cal = Calendar.getInstance();

        for (int month = 0; month < 12; month++) {
            cal.set(year, month, 1);
            final int lastDate = cal.getActualMaximum(Calendar.DATE);

            cal.set(year, month, lastDate);
            final int lastDay = cal.get(Calendar.DAY_OF_WEEK);

            int lastFriday;
            if (lastDay == 6) { // Friday            
                lastFriday = lastDate;
            }
            else if (lastDay == 7) { // Saturday            
                lastFriday = lastDate - 1;
            }
            else if (lastDay == 1) { // Sunday
                lastFriday = lastDate - 2;                
            }
            else { // 2-5 Monday - Thursday
                lastFriday = lastDate - lastDay - 1;
            }

            System.out.printf("%02d.%02d.%d\n", lastFriday, month + 1, year);
        }
    }
}
