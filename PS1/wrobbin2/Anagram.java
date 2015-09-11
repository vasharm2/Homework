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
		// add up the count of each character occurence
		int[] chars = new int[Character.MAX_VALUE];
		for(char c : input.toCharArray()) {
			chars[c]++;
		}
		// tally up the counts (there can only be one odd count)
		boolean alreadyFoundOdd = false;
		for(int i : chars)  {
			if(i % 2 != 0)
				if(alreadyFoundOdd)
					return false;
				else
					alreadyFoundOdd = true;
		}
		return true;
	}

	/*  Unnessecary.  F
	public static boolean isPalindrome(String input)  {
		for(int i = 0; i < input.length() / 2; i++)
			if(input.charAt(i) != input.charAt(input.length()-1-i))
				return false;
		return true;
	}
	*/



	public static void main(String[] args) {
		File file = new File("Anagram.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0; i < numberOfCases; i++) {
				String input = scan.next();
				System.out.println(anagram(input));
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}