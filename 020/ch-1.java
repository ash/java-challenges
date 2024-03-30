// Solution of Task 1 of The Weekly Challenge 20
// https://theweeklychallenge.org/blog/perl-weekly-challenge-020/

// Test run:
// $ java ch-1.java ABBCDEEF
// A
// BB
// C
// D
// EE
// F

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java ch-1.java <string>");
            return;
        }

        String s = args[0];
        char prev = 0;
        String out = "";
        for (int pos = 0; pos != s.length(); pos++) {
            char curr = s.charAt(pos);
            if (curr != prev) {
                if (!out.isEmpty()) {
                    System.out.println(out);
                }
                out = "";
                prev = curr;
            }
            out += curr;
        }

        System.out.println(out);
    }
}
