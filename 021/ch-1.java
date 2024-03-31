// Solution of Task 1 of The Weekly Challenge 21
// https://theweeklychallenge.org/blog/perl-weekly-challenge-021/

// Test run:
// $ java ch-1.java 20
// 2.7182818284590455
// 2.718281828459045

public class Main {
    public static void main(String[] args) {
        int iterations = 100;
        if (args.length != 0) {
            iterations = Integer.valueOf(args[0]);
        }

        double e = 1;
        double factorial = 1;
        for (int n = 1; n < iterations; n++) {
            factorial *= n;
            e += 1 / factorial;
        }

        System.out.println(e);
        System.out.println(Math.E);
    }
}
