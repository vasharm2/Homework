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

************************************************

*/

public class Anagram {

	public static boolean anagram(String input) {
		input = input.toLowerCase();
		//Creates an array of each character from the input
		char[] inputChar = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			inputChar[i] = input.charAt(i);
		}
		
		//Sorts the array alphabetically
		for (int i = 0; i < input.length() - 1; i++) {
			if (inputChar[i] < inputChar[i+1]) {
				char swap = inputChar[i];
				inputChar[i] = inputChar[i+1];
				inputChar[i+1] = swap;
				i = -1;
			}
		}
		
		//Checks for doubles of characters
		//Allows for one unique character, determined by middleChar
		boolean middleChar = false;
		for (int i = 0; i <= input.length() - 1; i++) {
			if (i != input.length() - 1 && inputChar[i] == inputChar[i+1])
				i++;
			else if (middleChar == false)
				middleChar = true;
			else
				return false;
		}
		return true;
	}



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