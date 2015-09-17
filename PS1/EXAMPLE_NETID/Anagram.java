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
		int x = 0;
		int length = input.length();
		Boolean palindrome = true;
		Boolean even = true;
		if (length % 2 == 1)
		    even = false;
		char[] str = input.toCharArray();
		char letter;
		int z = 0;
		int n = 0;
		while (n < length)
		{
			letter = str[n];
			if (letter != ' ' )
			{
			    z = n + 1;
			    while (z < length)
			    {
			         if (letter == input.charAt(z))
			         {
			              str[n] = ' ';
			              str[z] = ' ';
			              z = length;
			         }
			         z++;
			    }
			         if (z != length + 1)
			         {
			                 x++;
			                 str[n] = ' ';
			         }
			}
		n++;
		}
		if (even)
		{
		     if (x == 0)
		           palindrome = true;
		     else
		           palindrome = false;
		}
		else
		{
		     if (x == 1)
		           palindrome = true;
		     else
		           palindrome = false;
		}
		return palindrome;
	}



	public static void main(String[] args) {
		File file = new File("src/Anagram.txt");
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