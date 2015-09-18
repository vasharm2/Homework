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
For example, the String true will return true (rotator), while the String false will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

public class Anagram {
	static ArrayList<Character> chars;
	public static boolean anagram(String input) {
		chars = new ArrayList<Character>();
		char[] inputChars = input.toCharArray();
		for(int i = 0; i < inputChars.length; i++) {
			chars.add(inputChars[i]);
		}
		int inputLength = chars.size();
		removeDupChars(chars);
		if(inputLength%2==0) {
			if(chars.size() == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if(chars.size() == 1) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	/*public static void printArray(ArrayList<Character> a) {
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i));
		}
		System.out.println("");
	}*/
	
	public static void removeDupChars(ArrayList<Character> chars) {
		for(int i = 0; i < chars.size() - 1; i++) {
			char first = chars.get(i);
			for(int j = chars.size() - 1; j > i; j--) {
				char second = chars.get(j);
				if(first == second) {
					chars.remove(i);
					chars.remove(j-1);
					i--;
					break;
				}
			}
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