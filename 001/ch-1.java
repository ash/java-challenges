// Solution of Task 1 of The Weekly Challenge 1
// https://theweeklychallenge.org/blog/perl-weekly-challenge-001/

// Test run:
// $ java ch-1.java
// ThE WEEkly ChallEngE
// 5


public class Task1 {
    public static void main(String[] args) {
        String s = "The Weekly Challenge";
        s = s.replace('e', 'E');
        System.out.println(s);

        int n = 0;
        for (int c = 0; c != s.length(); c++) {
            if (s.charAt(c) == 'E') {
                n++;
            }
        }
        System.out.println(n);
    }
}
