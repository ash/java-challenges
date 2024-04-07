// Task 1 from
// https://perlweeklychallenge.org/blog/perl-weekly-challenge-031/

/*
    $ java ch-1.java
    false
    true
    true
    false
    true
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(isDivideBy0(10, 20));
        System.out.println(isDivideBy0(10, 0));
        System.out.println(isDivideBy0(-3, 0));
        System.out.println(isDivideBy0(1, 5));
        System.out.println(isDivideBy0(0, 0));
    }

    static boolean isDivideBy0(double a, double b) {
        double c = a / b;
        if (c == Double.POSITIVE_INFINITY || c == Double.NEGATIVE_INFINITY || Double.isNaN(c)) {
            return true;
        }
        else {
            return false;
        }
    }
}