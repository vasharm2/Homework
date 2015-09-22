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
*
* Author: Troy Goodin
* 
* NetID: goodin2
* 
************************************************

*/

public class Anagram {

	public static boolean anagram(String input) {
		
		//Makes an array with 26 empty slots named 'alphabet'
		int[] alphabet = new int[26];
		
		//Goes through each character of input and adds one in the matching slot of the alphabet array
		for(int i = 0; i < input.length(); i++){
			char ch = input.charAt(i);
			
			alphabet[ch - 'a']++;
			System.out.println(Arrays.toString(alphabet));
		}
		
		
		
		int oddOccur = 0;
		boolean palindrome = true;
		
		//Goes through each slot of the alphabet array and checks to see if the slot is odd
		for(int i = 0; i < 26; i++){
			
			//If the slot is odd, it adds one to the int oddOccurr
			if(alphabet[i]%2 == 1){
				oddOccur++;
			}
			
			//If oddOccurr becomes greater than 1(if there are multiple odd letters), then it is not a palindrome
			// and assigns false to the boolean palindrome
			if(oddOccur > 1){
				palindrome = false;
			}
		}
		

			return palindrome;
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