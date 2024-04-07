// Task 1 from
// https://perlweeklychallenge.org/blog/perl-weekly-challenge-040/

/*
    $ java ch-1.java
    I 2 !
    L 4 ?
    O 0 £
    V 3 $
    E 2 %
    Y 0 ^
    O 1 &
    U 9 *
*/

public class Main {
    public static void main(String[] args) {
        char[] a = {'I', 'L', 'O', 'V', 'E', 'Y', 'O', 'U'};
        int[]  b = {2, 4, 0, 3, 2, 0, 1, 9};
        char[] c = {'!', '?', '£', '$', '%', '^', '&', '*'};

        for (int i = 0; i != a.length; i++) {
            System.out.printf("%c %d %c\n", a[i], b[i], c[i]);
        }
    }
}