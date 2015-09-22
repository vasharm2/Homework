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

	public static boolean anagram(String input) 
	{
		System.out.println();
		System.out.println("You said: " + input);
		System.out.println("length of string: " + input.length());
		
		//Change the input to lower case.
		input = input.toLowerCase();
		
		//Find length of input string and see if it is even.
		int length = input.length();
		boolean isEven;
		if (length % 2 == 0) {
			isEven = true;
		}
		else {
			isEven = false;
		}
		
		
		int numOfMatches = 0;
		boolean isTrue = false;
		int lonelyNumbers = 0;
		
		//if the string has an even number of digits
		if (isEven == true) 
		{
			for (int c = 0; c < input.length(); c++) 
			{
				char focusLetter = input.charAt(c);
					for (int i = 0; i < input.length(); i++) 
					{
						if (focusLetter == input.charAt(i)) 
						{
							numOfMatches++;
						}						
					}	
						if (numOfMatches < 2) 
						{
						lonelyNumbers++;
						}			
			}
			System.out.println("Lonely numbers: " + lonelyNumbers);
			System.out.println("NumOfMatches: " + numOfMatches);
		
		if (lonelyNumbers > 0) 
		{
			isTrue = false;
		}
		else
		{
			isTrue = true;
		}
		}
		
		//If the string has an odd number of digits
		if (isEven == false) 
		{
			for (int c = 0; c < input.length(); c++) 
			{
				char focusLetter = input.charAt(c);
					for (int i = 0; i < input.length(); i++) 
					{
						if (focusLetter == input.charAt(i)) 
						{
							numOfMatches++;
						}						
					}	
				if (numOfMatches < 2) 
				{
					lonelyNumbers++;
				}			
			}
		System.out.println("Lonely numbers: " + lonelyNumbers);
		System.out.println("NumOfMatches: " + numOfMatches);
		
		if (lonelyNumbers == 1 || lonelyNumbers < 2) 
		{
			isTrue = true;
		}
		else
		{
			isTrue = false;
		}
		
		
		}
		return isTrue;
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