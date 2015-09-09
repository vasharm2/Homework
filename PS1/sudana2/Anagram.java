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
		
		//Gets number of odd characters in string
				int oddChars = 0;
				for(int i = 0; i < input.length(); i++) {
					char currentLetter = input.charAt(i);
					int letterCount = 0;
					
					//Get number of instances of the character
					for(int j = 0; j < input.length(); j++) {
						if(currentLetter == input.charAt(j))
						{
							if(j < i)
								break;
							else
								letterCount++;
						}
						
					}
					
					if(letterCount % 2 != 0)
						oddChars++;
				}
			
		        /*
		         * Palindromes can have, at most only one character 
		         * which appears an odd number of times in a string,
		         * or else they cannot be spelled the same backwards
		         */
				if(oddChars > 1)
					return false;
				else
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