import java.util.*;

/*
************************************************
author: kaucic2
  ____ ____    _  ___   __
 / ___/ ___|  / |/ _ \ / /_
| |   \___ \  | | (_) | '_ \
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/

Problem Set 2
Problem 4

This program causes something called an infinite loop. This means that the
program never ends because of a logical error.

Use eclipse for this problem

Why doesn't this program stop running/print the correct number of statements?
There are three logical issues to address.

This program should print the following when done:

This sentence should print 5 times.
This sentence should print 5 times.
This sentence should print 5 times.
This sentence should print 5 times.
This sentence should print 5 times.
This sentence should print 3 times.
This sentence should print 3 times.
This sentence should print 3 times.
This sentence should print 4 times.
This sentence should print 4 times.
This sentence should print 4 times.
This sentence should print 4 times.

************************************************
*/

class Problem4 {
    public static void main(String[] args) {
        printFirstSentence();
        printSecondSentence();
        printThirdSentence();
    }

    public static void printFirstSentence() {
        for(int i = 0; i < 5; i++) {
            System.out.println("This sentence should print 5 times.");
            //i was set to 5 and the loop was conditioned to continue while i > 0
            //i kept getting incremented up one (i++) so it would never be < 0
            //fixed that by setting i to 0 and ending when i = 5 (i.e. no longer < 5)
        }
    }

    public static void printSecondSentence() {
        int i = 3;
        while(i > 0) {
            System.out.println("This sentence should print 3 times.");
            i--;
            //changed i++ to i-- so that i counted down from 3, 2, 1, and stopped at 0
            //instead of counting up infinitely
        }
    }

    public static void printThirdSentence() {
        for(int amount = 0; amount < 4; amount++) {
            System.out.println("This sentence should print 4 times.")
            //the program didn't work because of the amount-- command, 
            //which negated the for loop's amount++ condition.
            //also amount = 0 to amount < 12 would have printed 12 sentences
            //assuming amount++, so I changed that to amount = 0 to amount < 4
        }
    }
}
