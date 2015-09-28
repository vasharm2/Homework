import java.util.*;

/*
************************************************
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
<<<<<<< HEAD
        for(int i = 5; i > 0; i--) {
=======
        for(int i = 0; i < 5; i++) {
>>>>>>> a7bb04f9623d9560ffd828c9847973fbac1570ee
            System.out.println("This sentence should print 5 times.");
        }
    }

    public static void printSecondSentence() {
<<<<<<< HEAD
        int i = 3;
        while(i > 0) {
            System.out.println("This sentence should print 3 times.");
            i--;
=======
        int i = 0;
        while(i < 3) {
            System.out.println("This sentence should print 3 times.");
            i++;
>>>>>>> a7bb04f9623d9560ffd828c9847973fbac1570ee
        }
    }

    public static void printThirdSentence() {
        for(int amount = 0; amount < 4; amount++) {
            System.out.println("This sentence should print 4 times.");
        }
    }
}
<<<<<<< HEAD
=======

>>>>>>> a7bb04f9623d9560ffd828c9847973fbac1570ee
