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
		char[] letters = new char[length];
		
		//insert the String of characters into an array of lowercase characters
		for(int i=0; i<length; i++){
			letters[i] = Character.toLowerCase(input.charAt(i));
		}
		
		
		char temp;
		char currentChar;
		
		//sorts the chars numerically
		Arrays.sort(letters);
		
		int[] nums = new int[length];
		int numsIndex = 0;
		char prevChar = 0;
		
		//creates an array that contains how many times each char appears 
		for(int b=0; b<length;b++){
			if (b==0){
				nums[numsIndex]++;
			}
			else{
				if(letters[b]==prevChar && nums[numsIndex]<2){
					nums[numsIndex]++;
				}
				else if(letters[b]==prevChar && nums[numsIndex]==2){
					nums[numsIndex]++;
				}
				else{
					numsIndex++;
				}
			}
			prevChar = letters[b];
		}
		
		int numOfOdds = 0;
		
		//if there are more than one set of odd numbers of chars then the given text can't be a palindrome
		for(int c=0;c<length;c++){
			if (nums[c]%2!=0){
				numOfOdds++;
			}
			if(numOfOdds>1){
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