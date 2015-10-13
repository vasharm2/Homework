import java.util.*;
import java.io.*;
<<<<<<< HEAD
=======
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Scanner;
>>>>>>> db62a3241a4fc943be1dbc64dcf5c00a46e5639f

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
		char[] temp = input.toCharArray();
		Hashtable<Character, Integer> chars = new Hashtable<Character,Integer>();
		int numOfOdds = 0;
		if (input.length() < 3 )
			return true;
		//Puts the individual letters into the Hashtable 
		for (int i = 0; i < temp.length; i++) { 
			if (!chars.contains(temp[i]))
				chars.put(temp[i], 0);
		}
		//Counts the number of time each letter appears in the String. 
		for (int i = 0; i < temp.length; i++) {
			chars.put(temp[i], chars.get(temp[i]) + 1);
		}
		Collection<Integer> values = chars.values();
		for (int c : values ) {
			if (c % 2 != 0)
				numOfOdds++;
		}
		return numOfOdds <= 1 ;
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
