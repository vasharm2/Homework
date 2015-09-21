package PS1;
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
		//a word is an anagram of a palindrome if it has and even number of each letter (and one odd, if the length is odd)
		int odd = 0;
		String uniqueLetters = ""; // a string with all the unique letters in the input
		for (int i = 0; i < input.length(); i++)
		{
			String character = input.substring(i, i+1);
			boolean alreadyFound = false;
			for (int j = 0; j < uniqueLetters.length(); j++) // find if we have already added this character to the string
			{
				if (character.equals(uniqueLetters.substring(j,j+1)))
					alreadyFound = true;
			}
			if (!alreadyFound) // if we haven't found it, add it.
				uniqueLetters += character;
		}
		for (int c = 0; c < uniqueLetters.length(); c++)
		{
			int num = 0;
			String temp = uniqueLetters.substring(c, c+1);
			for (int d = 0; d < input.length(); d++) // find how many times that character appears in the string
			{
				if (input.subSequence(d,d+1).equals(temp))
					num ++;
			}
			if (num % 2 == 1)
				odd++;
		}
		if (input.length()%2 == 0 && odd == 0) // if the word has an even number of total letters, it is an palindrome if all letters appear an even
			return true;                        // number of times
		else if (odd == 1) // if it is an odd-length string, then it is a palindrome if there is exactly one letter that appears an odd number of times
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