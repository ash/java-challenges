// Solution of Task 1 of The Weekly Challenge 262
// https://theweeklychallenge.org/blog/perl-weekly-challenge-262/

/*
$ java ch-1.java -3 1 2 -1 3 -2 4
4

$ java ch-1.java -1 -2 -3 1      
3

$ java ch-1.java 1 2       
2
*/

public class Main {
    public static void main(String[] args) {
        int countNegative = 0;
        int countPositive = 0;

        for (int c = 0; c != args.length; c++) {
            int data = Integer.valueOf(args[c]);
            if (data < 0) countNegative++;
            else if (data > 0) countPositive++;
        }

        int result = countNegative > countPositive ? countNegative : countPositive;
        System.out.println(result);
    }
}
