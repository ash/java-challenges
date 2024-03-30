// Solution of Task 1 of The Weekly Challenge 9
// https://theweeklychallenge.org/blog/perl-weekly-challenge-009/

// Test run:
// $ java ch-1.java
// n = 113
// n^2 = 12769

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        int n = (int) Math.floor(Math.sqrt(10000)); // To start with a number whose square has 5 digits.
        boolean isFound = false;
        while(!isFound) {
            int n2 = n * n;
            if (countDigits(n2) >= 5) {
                isFound = true;
                System.out.println("n = " + String.valueOf(n));
                System.out.println("n^2 = " + String.valueOf(n2));
            }
            else {
                n++;
            }
        }        
    }

    static int countDigits(int n) {
        String s = String.valueOf(n);
        Hashtable<Character, Integer> digits = new Hashtable<Character, Integer>();

        for (int c = 0; c != s.length(); c++) {
            digits.put(s.charAt(c), 1);
        }

        return digits.size();
    }
}
