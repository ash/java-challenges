// Solution of Task 1 of The Weekly Challenge 17
// https://theweeklychallenge.org/blog/perl-weekly-challenge-017/

// Test run:
// % java ch-1.java
// A(0, 0) = 1
// A(1, 0) = 2
// A(2, 0) = 3
// A(3, 0) = 5
// A(0, 1) = 2
// A(1, 1) = 3
// A(2, 1) = 5
// A(3, 1) = 13
// A(0, 2) = 3
// A(1, 2) = 4
// A(2, 2) = 7
// A(3, 2) = 29
// A(0, 3) = 4
// A(1, 3) = 5
// A(2, 3) = 9
// A(3, 3) = 61
// A(0, 4) = 5
// A(1, 4) = 6
// A(2, 4) = 11
// A(3, 4) = 125

public class Main {
    public static void main(String[] args) {
        for (int n = 0; n <= 4; n++) {
            for (int m = 0; m <= 3; m++) {
                System.out.printf("A(%d, %d) = %d\n", m, n, a(m, n));
            }
        }
    }

    static int a(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        else if (n == 0) {
            return a(m - 1, 1);
        }
        else {
            return a(m - 1, a(m, n - 1));
        }
    }
}