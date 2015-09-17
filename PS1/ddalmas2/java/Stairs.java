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
			int pairsOfLetters = input.length() / 2; // There should be pairs of the characters in a palindrome
			// This list will contain the indexes of each character that has already been paired
		    //so that there aren't pairs being counted when there shouldn't be.
			List<Integer> list = new ArrayList<>();
			//the for loop will iterate over each character then search if there is a pair
			// in front of it 
			for(int i=0; i<input.length(); i++) {
				// This is to check if the character has already been paired and accounted for or not
				if (!list.contains(i)) { 
					char letter = input.charAt(i);
					innerLoop:
					for(int j=i+1; j<input.length(); j++) {
						if (letter == input.charAt(j)) {
							list.add(j);
							pairsOfLetters --;
							break innerLoop; // If a pair is found, the character should not keep checking for a match
						}
					}
				}
			}
			if (pairsOfLetters == 0)
				return true;
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