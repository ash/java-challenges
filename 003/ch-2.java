// Solution of Task 2 of The Weekly Challenge 3
// https://theweeklychallenge.org/blog/perl-weekly-challenge-003/

// Test runs:
// $ java ch-2.java   
// 1 
// 1 1 
// 1 2 1 
// 1 3 3 1 
// 1 4 6 4 1 

// $ java ch-2.java 6
// 1 
// 1 1 
// 1 2 1 
// 1 3 3 1 
// 1 4 6 4 1 
// 1 5 10 10 5 1 

public class Main {
    public static void main(String[] args) {
        final int maxRows;       
        if (args.length == 0) {
            maxRows = 5;
        }
        else {
            maxRows = Integer.valueOf(args[0]);
        }
        int[][] data = new int[maxRows][];

        for (int row = 0; row < maxRows; row++) {
            data[row] = new int[row + 1];
            data[row][0] = 1;
            data[row][row] = 1;

            for (int col = 1; col < row; col++) {
                data[row][col] = data[row-1][col-1] + data[row-1][col];
            }
        }

        dump(data);
    }

    static void dump(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            dumpRow(data, row);
        }
    }

    static void dumpRow(int[][] data, int printRow) {
        for (int col = 0; col <= printRow; col++) {
            System.out.print(data[printRow][col]);
            System.out.print(' ');
        }
        System.out.println("");
    }
}
