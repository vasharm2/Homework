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
For example, the String "oatrtro" will return true (rotator), while the String â€œfalseâ€� will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

public class Anagram 
{
	static Map<String, List<String>> Map = new HashMap<String, List<String>>();
	
	public static boolean anagram(String input) 
	{
		// If its already a palindrome, return (VERY USEFUL for eg if a 20 character thing was passed in that is already a palindrome)
		if(palindrome(input))
			return true;
		
		List<String> anagrams = permute(input);
		
		for(int i = 0; i < anagrams.size(); i++)
		{
			//System.out.println(anagrams.get(i));
			
			if (palindrome(anagrams.get(i)))
				return true;
		}
		
		return false;
	}

	// Credit to my summer self for this function (also Splash for making me write it and the idea of using a Map to save time)
	// Originally written in C#
	public static List<String> permute(String input)
	{
		List<String> permutations = new ArrayList<String>();
		
		if(Map.containsKey(input))
			return Map.get(input);
		
		// Only two letters, add both combos
		if(input.length() == 2)
		{
			permutations.add(Character.toString(input.charAt(0)) + Character.toString(input.charAt(1)));
			permutations.add(Character.toString(input.charAt(1)) + Character.toString(input.charAt(0)));
		}
		else if(input.length() == 1)
		{
			// This only happens if they gave us 1 character
			permutations.add(input);
		}
		else
		{
			for (int i = 0; i < input.length(); i++)
			{
				// permute our letters with the one letter missing
				List<String> p = permute(input.substring(0, i) + input.substring(i + 1, input.length()));
				
				for (int j = 0; j < p.size(); j++)
				{
					permutations.add(input.charAt(i) + p.get(j));
				}
			}
		}
		
		Map.put(input, permutations);
		
		return permutations;
	}
	
	public static boolean palindrome(String input)
	{
		input = input.replace(" ", "");	// Remove any spaces (just in case they put words in the test case, as they mentioned ignoring space, punctuation, etc. Assuming single phrase without punctuation)
		input = input.toLowerCase();	// Capitals don't matter
		// Hopefully no test cases with punctuation
		
		String revInput = "";
		
		//Reverse input
		for (int i = input.length() - 1; i >= 0; i--)
		{
			revInput += input.charAt(i);
		}
		
		//System.out.println(input + " | " + revInput);
		
		if (revInput.equals(input))
			return true;
		else 
			return false;
	}

	public static void main(String[] args) 
	{
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