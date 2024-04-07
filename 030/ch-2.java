// Solution of Task 2 of The Weekly Challenge 30
// https://theweeklychallenge.org/blog/perl-weekly-challenge-030/

/*
    $ java ch-2.java
    5, 4, 3
    6, 4, 2
    6, 5, 1
    7, 3, 2
    7, 4, 1
    8, 3, 1
    9, 2, 1
*/

public class Task2 {
    public static void main(String[] args) {
        for (int a = 1; a < 11; a++) {
            for (int b = 1; b < a; b++) {
                for (int c = 1; c < b; c++) {
                    if (c == a) continue;

                    if (a + b + c == 12) System.out.printf("%d, %d, %d\n", a, b, c);
                }
            }
        }
    }
}