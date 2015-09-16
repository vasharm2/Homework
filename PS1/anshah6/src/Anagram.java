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
	public static boolean anagram(String input) {
		System.out.print(input+":  ");
		input = input.trim();
		input = input.toLowerCase();
		int n = input.length();
		int counter=0;
		double oddCounter=0.0;
		char[] word = new char[n];
		for (int i = 0; i < n; i++) {
			word[i] = input.charAt(i);
		}
		//This is the test for the even case
		if(n%2 == 0) {
			for (int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if (word[i] == word[j]) 
						counter++;
				}
				if (counter%2 != 0)
					return false;
				//If one letter fails then it is not an anagram
			}
			return true;
			//If it makes it here it has to be an anagram
		}
		else {
			//This is the odd case
			for (int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if (word[i] == word[j]) 
						counter++;
				}
				if (counter%2 != 0)
					oddCounter+= 1/counter;
				if(oddCounter >= 2)
					return false;
					//If two letters fail then it is not an anagram
				counter = 0;
			}
			return true;
			//If it makes it here it has to be an anagram
		}
	}
}