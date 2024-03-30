// Solution of Task 1 of The Weekly Challenge 7
// https://theweeklychallenge.org/blog/perl-weekly-challenge-007/

// Test run:
// $ java ch-1.java                        
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 12
// 18
// 20
// 21
// 24
// 27
// 30
// 36
// 40
// 42
// 45
// 48
// 50

public class Main {
    public static void main(String[] args) {
        for (int n = 1; n <= 50; n++) {
            int n0 = n % 10;
            int n1 = n / 10;

            if (n % (n0 + n1) == 0) {
                System.out.println(n);
            }
        }
    }
}