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
For example, the String  will return true (rotator), while the String will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/
public class Anagram {

	public static boolean anagram(String input) {
		//YOUR CODE HERE
		// count number of each letter
		Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
		for(int i = 0; i < input.length(); i++) {
			Character c = (Character)input.charAt(i);
			if(table.containsKey(c))
			{
				Integer temp = table.get(c) + 1;
				table.put(c, temp);
			} else {
				table.put(c, 1);
			}
		}
		// if there is one or fewer characters with an odd number count, it is a palindrome
		int oddCounter = 0;
		
		for(Enumeration<Character> e = table.keys(); e.hasMoreElements();)
		{
			if(table.get(e.nextElement()) % 2 != 0) {
				oddCounter++;
			}
		}
		
		return oddCounter <= 1;
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