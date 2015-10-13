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

author: dbansal4
************************************************


*/

public class Anagram {

	//Takes each letter from input and compares it with all other letters in input. There is a variable to keep track of the odd letters. 
	//If the occurrence of odd letters is more than one(e.g. axsx has two odd letter occurrences) then it returns false, else it returns true.
	public static boolean anagram(String input) 
	{
		String wordOnly = removeUnWantedCharacters(input);			//This method clears the punctuation, Upper Case, etc...
		if(wordOnly.equals(""))										//This makes sure the word is not empty.
			return false;
		char letter;
		int count;
		int total = 2;
		int odd = 0;
		for(int i = 0; i < wordOnly.length(); i++)		//This loop is to go through the String wordOnly. wordOnly has the word in the text file.
		{
			count = 1;									//Count keeps track of the letter in wordOnly
			letter = wordOnly.charAt(i);
			for(int j = 0; j < wordOnly.length(); j++)				//This loop goes through wordOnly and compares it with other letters to see the total occurrence of letter
			{
				if((j != i) && (letter == (wordOnly.charAt(j))))		//This if-statement is where letter is compared with each character in wordOnly. 
				{
					count++;										//If letter is equal to another character in WordOnly count increments by one
					if(total < wordOnly.length())					//Total is used to make sure we do not count a odd variable more than once. For example if you take yxyxy, 
						total++;									//to make sure y causes odd to increase by 1, there has to be a variable to make sure it is not counted twice and 
																	//odd does not became 2 and the program returns false for yxyxy.

				}
			}
			if(total == wordOnly.length() && odd == 1)				//This checks to see if there is only one letter that has odd occurrences 
				return true;
			else if(odd > 1)
				return false;
			if((count == 1 || count%2 != 0))		//This if-statement increments the variable odd if count is 1 or count%2 != 0. That means the occurrence of the letter is odd
				odd++;

		}
		return true;
	}

	//Removes all unnecessary things such as spaces and punctuation. Returns the word without anything but the characters.
	public static String removeUnWantedCharacters(String temp)
	{
		String word = "";
		char first;
		temp = temp.toLowerCase();
		for(int k = 0; k < temp.length(); k++)
		{
			first = temp.charAt(k);
			if(first >= 97 && first <= 122)
			{
				word += first;
			}
		}
		return word;
	}



	public static void main(String[] args) {
		File file = new File("Anagram.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			//System.out.println(numberOfCases);
			scan.nextLine();
			for(int i = 0; i < numberOfCases; i++) {
				String input = scan.nextLine();
				//System.out.println("input: " + input);
				System.out.println(anagram(input));
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}