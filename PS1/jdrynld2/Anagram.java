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
For example, the String oatrtro will return true (rotator), while the String false will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

public class Anagram {

	public static boolean anagram(String input) {
		//HashMap to carry the count of each character in the input String
		HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();
		//Iterate through string; count # of occurrences of each character.
		for(int i=0; i<input.length(); i++){
			Character key = input.charAt(i);
			//if there's already a key for that character
			if(characterCount.containsKey(key)){
				//increment the value assigned to that key by 1
				Integer currentValue = characterCount.get(key);
				characterCount.put(key, currentValue + 1);
			}
			//otherwise, make a new mapping with value 1
			else {
				characterCount.put(key, 1);
			}
		}
		//Get the set of keys
		Set<Character> keys = characterCount.keySet();
		
		//if it's an even length string
		if(input.length()%2==0){
			for (Character key:keys){
				//there can be no odd count of characters
				if(characterCount.get(key)%2!=0){
					return false;
				}
			}
		}
		//it it's an odd length string
		else {
			int numOdds = 0;
			for (Character key:keys){
				if(characterCount.get(key)%2!=0){
					numOdds++;
				}
			}
			//there can only be a single odd count of a character
			if(numOdds>1){
				return false;
			}
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