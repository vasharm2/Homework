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
	
	
	private static boolean palindromeFound = false;
	
	public static boolean anagram(String input) {
		//Sets global palindromFound variable to false
		palindromeFound = false;
		
		//Start the recursive 
		testAnagram(input.toLowerCase(), "");
		
		//Return the state of the global variable, which will have been modified by testAnagram() if a palindrome
		//was found
		return palindromeFound;
	}
	public static void testAnagram(String input, String currentOutput){
		//If the input does not exist, the recursion has produced a full anagram
		if(input.equals("")){
			//Checks to see if the found anagram is a palindrome
			if(isPalindrome(currentOutput)) {
				//Modifies global variable to reflect the fact that a palindrome has been found
				palindromeFound = true;
			}
			
		}
		//Iterate through each character in the current input
		for(int i = 0; i < input.length(); i++){
			//Adds the current character to the output given to the next recursion
			String nextOutput = currentOutput + input.charAt(i);
			//Removes the current character from the input given to the next recursion
			String restToPermutate = input.substring(0,i) + input.substring(i+1);
			//Recursively tests the rest of the string using the input and output just found
			testAnagram(restToPermutate, nextOutput);
		}
	}
	
	public static boolean isPalindrome(String input) {
		int stringLength = input.length();
		//Initial condition is true, loop checks if input is NOT a palindrome
		boolean inputIsPalindrome = true;

		//Loops through all character pairs starting by comparing (0,n) and looping to (1,n-1), (2,n-2), etc.
		for(int i = 0; i < stringLength / 2; i ++){
			//Checks to see if the character pairs DON'T match
			if(input.charAt(i) != input.charAt(input.length() - i - 1)){
				//If any pair does not match, the string cannot be a true palindrome
				inputIsPalindrome = false;
			}
		}
		return inputIsPalindrome;
	}



	public static void main(String[] args) {
		//Tests for isPalindrom()
//		System.out.println(isPalindrome("tsdst") + ":true");
//		System.out.println(isPalindrome("tsst") + ":true");
//		System.out.println(isPalindrome("tsdrst") + ":false");
//		System.out.println(isPalindrome("tstt") + ":false");

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
