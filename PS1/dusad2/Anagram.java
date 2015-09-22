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

		int length = input.length();
		int oddOccurences = 0;
		int count;
		char ch;
		String str = " ";
		for(int i = 0; i < length; i++)
		{
			ch = input.charAt(i);
			if(existsIn(ch, str))
				count = 0;
			else
				count = getCount(ch, input);

			str += ch;

			if(count % 2 == 1)
				oddOccurences++;

				
		}

		if(length % 2 == 0 && oddOccurences > 0)
			return false;
		else if(length % 2 == 1 && oddOccurences > 1)
			return false;
		else
			return true;
	}

	public static int getCount(char c, String s)
	{
		int result = 0;
		for(int i = 0; i < s.length(); i++)
			if(c == s.charAt(i))
				result++;

		return result;
	}

	public static boolean existsIn(char c, String s)
	{
		boolean result = false;
		for(int i = 0; i < s.length(); i++)
		{
			if(c == s.charAt(i))
				result = true;
		}
		return result;
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
