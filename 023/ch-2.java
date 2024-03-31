// Solution of Task 1 of The Weekly Challenge 23
// https://theweeklychallenge.org/blog/perl-weekly-challenge-023/

// Test run:
// $ java ch-1.java 228
// 2
// 2
// 3
// 19

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java ch-1.java <N>");
            return;
        }

        int n = Integer.valueOf(args[0]);

        Prime prime = new Prime();
        int p = prime.next();
        while (n >= p) {
            if (n % p == 0) {
                n /= p;
                System.out.println(p);
            }
            else {
                p = prime.next();
            }
        }
    }
}

public class Prime {
    int current = 1;

    int next() {
        while(!isPrime(++current));

        return current;
    }

    private static boolean isPrime(int n) {
        int min = (int) Math.sqrt(n);
        if (min == 1) return true;

        for (int m = min; m != n; m++) {
            if (n % m == 0) return false;
        }
        return true;
    }
}
