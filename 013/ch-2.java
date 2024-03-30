// Solution of Task 2 of The Weekly Challenge 13
// https://theweeklychallenge.org/blog/perl-weekly-challenge-013/

// Test run:
// $ java ch-2.java 
// 1 1 2 2 3 3 4 5 5 6 6 7 8 8 9 9 10 11 11 12 13 13 14 14 
// 0 0 1 2 2 3 4 4 5 6 6 7 7 8 9 9 10 11 11 12 12 13 14 14 

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int v = f(0);
        while (v < 15) {
            System.out.printf("%d ", v);
            n++;
            v = f(n);
        }
        System.out.println("");

        n = 0;
        v = m(0);
        while (v < 15) {
            System.out.printf("%d ", v);
            n++;
            v = m(n);
        }
        System.out.println("");

    }

    static int f(int n) {
        if (n == 0) {
            return 1;
        }
        
        return n - m(f(n - 1));
    }

    static int m(int n) {
        if (n == 0) {
            return 0;
        }
        
        return n - f(m(n - 1));
    }
}
