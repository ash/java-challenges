// Solution of Task 1 of The Weekly Challenge 28
// https://theweeklychallenge.org/blog/perl-weekly-challenge-028/

// $ java ch-1.java
// 19:07:16

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(now.format(fmt));
    }
}
