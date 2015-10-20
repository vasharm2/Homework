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
//For a string to be a palindrome, it should have an even number of letters if its length is even and only one odd number of letters if its length is odd.
	public static boolean anagram(String input) 
	{
		int keepTrack[] = new int[26]; //26 spaces for 26 letters.
		int oddNumbers=0;
		for (int i =0; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			char c = Character.toLowerCase(ch); //to make them all lower case
			int character=c; //type casting
			if (Character.isLetter(c)) //to discard punctuation
			{
				keepTrack[character-'a']++;
			}
		}
		for (int i =0; i<26; i++)
		{
			if (keepTrack[i]%2!=0)
				oddNumbers++;
		}
		if (oddNumbers<=1)
			return true;
		else
			return false;
	}



	public static void main(String[] args) {
		File file = new File("C:\\Users\\vidushi\\workspace2\\Submissions\\PS1\\vrai2\\Homework-master\\PS1\\java\\Anagram.txt");
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