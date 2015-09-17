import java.util.*;
import java.io.*;

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

        input = input.toLowerCase();

        // ARRAYLIST IMPLEMENTATION - OLD

		/* Loops through each character of input string.
         * For each character:
		 *     If character does not exist in ArrayList: character is added
		 *     If character exists in ArrayList: character is removed
		 * Resulting ArrayList contains characters with no twin.
		 * If there is at most 1 character with no twin, input is anagram of palindrome
		 */

        /*ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (characters.contains(Character.valueOf(input.charAt(i)))) {
                characters.remove(Character.valueOf(input.charAt(i)));
            } else {
                characters.add(Character.valueOf(input.charAt(i)));
            }
        }

        return characters.size() == 0 || characters.size() == 1;*/

        /* Loops through each character of input string, counting how many times that character appears.
         *
         * When a character appearing an odd number of times is found:
         *     If the input string length is even: returns false (an anagram of an even-length palindrome
         *     cannot have any characters appearing an odd number of times.
         *     If the input string length is odd: the character is stored in oddChar. If another character
         *     is found to appear an odd number of times, false is returned.
         *
         * If the loop completes iterating without returning false, input is an anagram of a string
         *     true is returned
         */

        boolean isInputLengthOdd = input.length() % 2 != 0;

        char oddChar = '\u0000';

        for (int i = 0; i < input.length(); i++) {
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == input.charAt(i)) count++;
            }
            if (count % 2 != 0) {
                if (!isInputLengthOdd) return false;
                else if (oddChar == '\u0000') {
                    oddChar = input.charAt(i);
                } else if (oddChar != input.charAt(i)) return false;
            }
        }

        return true;

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
