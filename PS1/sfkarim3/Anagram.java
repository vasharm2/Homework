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
		char[] chars = input.toCharArray();
		if( (input.length() % 2) == 0)//if there is an even number of characters
		{
			for(char c1: chars)//to check all the characters
			{
				int count = 0; //how many of each of those chars there are
				for(char c2: chars)
				{
					if(c1 == c2)
					{
						count++;
					}					
				}				
				if (count % 2 != 0)//if there is an even number of letters a palindrome must have an even number of each charachter
				{
					return false;					
				}
			}
			return true; // if it checked all characters it works
		}
		else //odd num of characters 
		{
			Character flags = null;
			for(char c1: chars)//to check all the characters
			{
				int count = 0; //how many of each of those chars there are
				for(char c2: chars)
				{
					if(c1 == c2)
					{
						count++;
					}					
				}				
				if (count % 2 != 0)//to flag the odd amounted charachters 
				{
					if(flags == null)
					{
						flags = c1;
					}
					if(c1 != flags)
					{
						return false;
					}
				}
			}
			if(flags != null)
			{
				return true;
			}
			return false;
		}		
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