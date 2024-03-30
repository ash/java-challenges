// Solution of Task 2 of The Weekly Challenge 10
// https://theweeklychallenge.org/blog/perl-weekly-challenge-010/

// Test run:
// $ java ch-2.java 5
// 1 0 0 0 0
// 0 1 0 0 0
// 0 0 1 0 0
// 0 0 0 1 0
// 0 0 0 0 1

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java ch-2.java <N>");
            return;
        }

        int n = Integer.valueOf(args[0]);

        int matrix[][] = new int[n][n];
        for (int c = 0; c != n; c++) {
            matrix[c][c] = 1;
        }

        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        for (int row = 0; row != height; row++) {
            for (int col = 0; col != width; col++) {
                System.out.print(matrix[row][col]);
                if (col != width - 1) {
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }
        
    }
}
