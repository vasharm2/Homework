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
	/*
	 * This is a simple contains class for Arrays
	 */
	public static boolean contains(char[] list,char c)
	{
		for(char ch:list)
		{
			if(ch == c)
			{
				return true;
			}
		}
		return false;
	}
	/*
	 * This is a simple index of class for an array
	 */
	public static int indexOf(char[] list,char c)
	{
		int counter = 0;
		for(char ch:list)
		{
			if(ch == c)
			{
				return counter;
			}
			counter ++;
		}
		return -1;
	}
	/*
	 * This is a method that counts the number of nonzero terms in 
	 * an array
	 */
	public static int nonZeroTerms(char[] list)
	{
		int counter = 0;
		for(char c:list)
		{
			if(c != 0)
			{
				counter ++;
			}
		}
		return counter;
	}
	
	/*
	 * This program checks to see if something is an anagram. This is
	 * done by putting the word into an array of characters and going through term 
	 * by term to see if there are duplicates. If there are then both are set to zero.
	 * For any anagram this will leave us with 1 or 0 nonzero terms which we check at the end
	 * whfdwfh -- 000d000 -- is an anagram
	 */
	public static boolean anagram(String input) {
		//takes input and makes it an array of all lowercase chars
		input.toLowerCase();
		char[] word = input.toCharArray();
		int counter = 0;
		for(char c:word)
		{
			if(c != 0)
			{
				word[counter] = 0;
				if(contains(word,c))
					word[indexOf(word,c)] = 0;
				else
				{
					word[counter] = c;
				}
				counter++;
			}
		}
		for(char c:word)
		{
			System.out.println((int)c);
		}
		if(nonZeroTerms(word) == 0 || nonZeroTerms(word) == 1)
		{
			return true;
		}
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