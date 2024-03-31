// Solution of Task 2 of The Weekly Challenge 262
// https://theweeklychallenge.org/blog/perl-weekly-challenge-262/

/*
$ java ch-2.java 3 1 2 2 2 1 3 2
4

$ java ch-2.java 1 2 3 1        
0
*/

public class Main {
    public static void main(String[] args) {
        int dataSize = args.length - 1;
        int[] data = new int[dataSize];

        for (int c = 0; c != dataSize; c++) {
            data[c] = Integer.valueOf(args[c]);
        }

        int k = Integer.valueOf(args[dataSize]);

        int count = 0;
        for (int j = 0; j < dataSize; j++) {
            for (int i = 0; i < j; i++) {
                if (data[i] == data[j] && ((i * j) % k) == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
