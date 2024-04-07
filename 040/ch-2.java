// Task 2 from
// https://perlweeklychallenge.org/blog/perl-weekly-challenge-040/

/*
    $ java ch-2.java
    1
    4
    3
    8
    12
    10
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int[] data = {10, 4, 1, 8, 12, 3};
        final int[] indices = {0, 2, 5};

        int len = indices.length;
        int[] toSort = new int[len];
        for (int i = 0; i != len; i++) {
            toSort[i] = data[indices[i]];
        }

        Arrays.sort(toSort);

        for (int i = 0; i != len; i++) {
            data[indices[i]] = toSort[i];
        }

        for (int x : data) {
            System.out.println(x);
        }
    }
}