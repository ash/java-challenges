// Solution of Task 1 of The Weekly Challenge 26
// https://theweeklychallenge.org/blog/perl-weekly-challenge-026/

// Test run:
// $ java ch-1.java chancellor chocolate  
// 8

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        String word1 = args[0];
        String word2 = args[1];

        Hashtable<Character, Integer> letters = new Hashtable<Character, Integer>();

        for (int pos = 0; pos != word1.length(); pos++) {
            letters.put(word1.charAt(pos), 1);
        }

        int count = 0;
        for (int pos = 0; pos != word2.length(); pos++) {
            if (letters.get(word2.charAt(pos)) != null) count++;
        }

        System.out.println(count);
    }
}
