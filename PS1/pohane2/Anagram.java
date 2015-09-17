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
For example,

PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

public class Anagram {
	public static boolean anagram(String input) 
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int wordLength = input.length();
		for(int i = 0; i < wordLength; i++) 
		{		
			char letter = input.charAt(i);
			if(map.containsKey(letter))
			{
				map.put(letter, map.get(letter)+1);
			}
			else map.put(letter, 1);
		}
		Collection c = map.values();
		Iterator itr = c.iterator();
		int countOdd = 0;
		int countEven = 0;
		while(itr.hasNext())
		{
			int count = (int) itr.next();
			if(count%2==1)
			{
				countOdd = countOdd+1;
			}
			if(count%2==0)
			{
				countEven = countEven+1;
			}
		}
		if(countOdd>1)
		{
			return false;
		}
		else return true;
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