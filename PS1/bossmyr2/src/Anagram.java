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
For example, the String "oatrtro" will return true (rotator), while the String "false" will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

Code by: bossmyr2

************************************************

*/

public class Anagram {

	public static boolean anagram(String input) {
		boolean odd = false;

		while (input.length() > 0) {
			int counter = 1;
			char first = input.charAt(0);

			for (int i = 1; i < input.length(); i++) {
				if (input.charAt(i) == first) {

					counter++;
				}
			}
			input = input.replaceAll(String.valueOf(first), "");//removes characters we've already dealt with
			if (counter % 2 == 1) {//checks if number of characters of a type is odd
				if (odd) {
					return false;
				} else {
					odd = true;//changes variable odd so that there are no more than one set off odd numbers in the anagram
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		File file = new File("res/Anagram.txt");
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