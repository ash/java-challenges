// Solution of Task 1 of The Weekly Challenge 2
// https://theweeklychallenge.org/blog/perl-weekly-challenge-002/

// Test run:
// $ java ch-1.java
// 42

public class Task1 {
    public static void main(String[] args) {
        String number = "0042";

        int pos = 0;
        while (number.charAt(pos) == '0') {
            pos++;
        }

        number = number.substring(pos);
        System.out.println(number);
    }
}
