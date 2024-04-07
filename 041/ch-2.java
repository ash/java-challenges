// Task 2 from
// https://perlweeklychallenge.org/blog/perl-weekly-challenge-041/

/*
    $ java ch-1.java
    1
    1
    3
    5
    9
    15
    25
    41
    67
    109
    177
    287
    465
    753
    1219
    1973
    3193
    5167
    8361
    13529
*/

public class Main {
    public static void main(String[] args) {
        for (int n = 0; n != 20; n++) {
            System.out.println(L(n));
        }
    }

    static int L(int n) {
        switch (n) {
            case 0: return 1;
            case 1: return 1;
            default: return L(n - 1) + L(n - 2) + 1;
        }
    }
}
