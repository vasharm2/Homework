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

		//An string will be an anagram in 2 cases
		//Case 1: if there is an even number of characters, and there are multiples of 2 of each letter that appears
		//Case 2: if there is an odd number of character, then there can be one character that is appears an odd number of times.
		//Therefore we need to implment an algorithm that checks for even numbers of characters (and possible one odd if the number of chars is odd)
		
		int [] count = new int[26];
        for( int i = 0; i < input.length(); i++ )
        {
            char c = input.charAt(i);
            count[c-'a']++;
        }
        int odds = 0;
        for( int co:count )
        {
            if( odds > 1)
                return false;
            if( co%2 == 1 )
                odds++;
        }
        return true;
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