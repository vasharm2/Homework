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
For example, the String â€œoatrtroâ€� will return true (rotator), while the String â€œfalseâ€� will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

public class Anagram {

	public static boolean anagram(String input) {
		
		// Displays the input.
		System.out.println("");
		System.out.println("Input: "+ input);
		
		// Checks if it is ok to have one letter that has no pair.
		double halfCount = (double)input.length()/2;
		boolean isEven = halfCount % 2 == 0;
		System.out.println("Has even number of letters: "+isEven);
		
		// Convert all letters to lowercase.
		input = input.toLowerCase();
		System.out.println("Lower case input: "+ input);
		
		// Make list that will store unique characters found in input.
		List<Character> diffLetters = new ArrayList<Character>();
		
		// Loop through the list and add unique characters to list.
		for (int i = 0; i < input.length();i++){
			char letter = input.charAt(i);
			
			boolean found = false;
			for (int c = 0; c < diffLetters.size() ;c++){
				if (diffLetters.contains(letter)){
					found = true;
					break;
				}
			}
			
			if (!found){
				diffLetters.add(letter);
			}
		}
		
		System.out.println("Number of different characters: "+diffLetters.size());
		
		
		// Loop through each letter and check how many of the same are in the input. If it is
		// odd, it has no pair. If the word has odd letters, the word can still be an anagram
		// if the number of characters with no pair is smaller than 1. If it is odd, all
		// characters must have pairs.
		int numOfCharactersWithNoPair = 0;
		
		for (int i = 0; i < diffLetters.size(); i++){
			int sameLetterCount = 0;
			for (int p = 0; p < input.length();p++){
				if (input.charAt(p) == diffLetters.get(i))
					sameLetterCount++;
			}
			
			if (sameLetterCount < 2){
				numOfCharactersWithNoPair++;
			}
		}
		
		System.out.println("Number of characters without pair: "+ numOfCharactersWithNoPair);
		
		// Check how many characters with no pair and returns the appropriate boolean.
		if (isEven && numOfCharactersWithNoPair != 0){
			System.out.println("The word cannot be an anagram of a palindrome because there is a character without a pair and the word is even.");
			return false;
		}
		if (!isEven && numOfCharactersWithNoPair <= 1){
			System.out.println("Word is anagram of palindrome!");
			return true;
		}
		
		System.out.println("This word is not a palindrome because there is more than one character without a pair.");
		return false;
		

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