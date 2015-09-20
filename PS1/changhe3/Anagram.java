import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
************************************************
  ____ ____    _  ___   __   
 / ___/ ___|  / |/ _ \ / /_  
| |   \___ \  | | (_) | '_ \ 
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/ 
                             

Problem set 1


Question 1

A common problem in computer science is finding patterns within data. 
This problem will simulate that in a way that is easy to see what is happening.

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Allowances may be made for adjustments to capital letters, punctuation, and word dividers.

an anagram is a word, phrase, or name formed by rearranging the letters of another.


Given a String S, determine if it is an anagram of a palindrome. 
Return true if the String is an anagram of a palindrome, and false otherwise. 
For example, the String “oatrtro” will return true (rotator), while the String “false” will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

public class Anagram {

    public static boolean anagram(String input) {
        char[] chars = input.toCharArray();
        //Convert the input into the char array and sort it, so that the same characters will come together.
        Arrays.sort(chars);
        //Note that this is just an integer value wrapped as an int array. This is done because only through this way
        //could the value be modified in a method, the code more organized.
        int[] occurrenceOfOddChar = new int[]{0};
        //This loop keeps track of the current character traversed throught, the numver of the current number,
        // and number of characters that have an odd number of occurence. Return false if that number is greater
        // than one.
        char currentChar = chars[0];
        int length = 0;
        for (char c : chars) {
            if (c == currentChar) {
                length++;
            } else {
                checkLength(length, occurrenceOfOddChar);
                if (occurrenceOfOddChar[0] > 1) return false;
                currentChar = c;
                length = 1;
            }
        }
        //Call method checklength(int, int[]) again for the last few characters in the char array.
        checkLength(length, occurrenceOfOddChar);
        //Check if the last call of checklength(int, int[]) has incremented the occurrenceOfOddChar[0]
        return occurrenceOfOddChar[0] < 2;
    }

    private static void checkLength(int length, int[] occurrenceOfOddChar) {
        if (length % 2 == 1) {
            occurrenceOfOddChar[0]++;
        } else if (length < 1) {
            throw new IllegalStateException();
        }
    }

    public static void main(String[] args) {
        File file = new File("Anagram.txt");
        try {
            Scanner scan = new Scanner(file);
            int numberOfCases = scan.nextInt();
            for (int i = 0; i < numberOfCases; i++) {
                String input = scan.next();
                System.out.println(anagram(input));
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}