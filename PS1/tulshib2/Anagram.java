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

	//Checks if every letter in the input string has a pair, and if there is just a single unpaired letter.
	public static boolean anagram(String input) 
	{
		input = input.toLowerCase();
		String str = new String(input);
		if(str.length() == 1)
			return true;
		if(str.length() == 2)
			return str.charAt(0) == str.charAt(1);
		int letterIndex = 0, index = -1;
		for(;index < 0 && letterIndex < str.length() - 1; letterIndex++) {
			index = str.indexOf(str.charAt(letterIndex), letterIndex+1);
			if(index >= 1)
				return anagram(removePair(str, 0, index));
		}
		return false;
	}
	
	
	///@Param:  str - String to be modified. 
	///			a - int representing index of first letter to be removed.
	///			b - int representing index of second letter to be removed.
	///NOTE: 	Needs a < b to work as intended.
	///@Return: 
	private static String removePair (String str, int a, int b)
	{
		String out = new String("");
		out += str.substring(a+1, b);
		out += str.substring(b+1);
		///DEBUG
		
		/*
		 * DEBUG PAUSE
		try{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		return out;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println();
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