// Solution of Task 2 of The Weekly Challenge 1
// https://theweeklychallenge.org/blog/perl-weekly-challenge-001/

// Test run:
// $ java ch-2.java
// fizbuzz
// 1
// 2
// fizz
// 4
// buzz
// fizz
// 7
// 8
// fizz
// buzz
// 11
// fizz
// 13
// 14
// fizbuzz
// 16
// 17
// fizz
// 19
// buzz

public class Task2 {
    public static void main(String[] args) {
        for (int n = 0; n <= 20; n++) {
            if (n % 15 == 0) {
                System.out.println("fizbuzz");
            }
            else if (n % 3 == 0) {
                System.out.println("fizz");
            }
            else if (n % 5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(n);
            }
        }
    }
}
