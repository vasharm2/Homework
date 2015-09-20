import java.util.*;
import java.io.*;
import java.util.Arrays;

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

/*	TRY 1
 * 
 * 	static int stringLength = 0, fails, eachCharCount;
	static char[] keys;
	static boolean hasNoMatch;
	public static boolean anagram(String input) {
		keys = null;
		fails = 0;
		hasNoMatch = true;
		System.out.print(stringLength);
		for(int i = 0; i < stringLength; i++) {
			keys[i] = input.charAt(i);
		}
		for(int i = 0; i < stringLength; i++) {
			while(keys[i] == 'j'){
				
			}
			if(hasNoMatch){
				fails++;
			}
			hasNoMatch = false;
		}
		if(fails <= 1) {
			return true;
		} else {
			return false;
		}
	}

*/
/*  TRY 2
 * 
 * 	public static boolean anagram(String input) {
		String string = input.toLowerCase();
		StringBuilder sb = new StringBuilder(string);
		int stringLength = string.length();
		int stringLengthUnchanged = string.length();
		
		int count = 0;
		while(count <= stringLengthUnchanged){
			stringLength = string.length();
			for(int i = 1; i < stringLength; i++){
				if(string.charAt(0) == string.charAt(i)){
					sb.deleteCharAt(i);
					sb.deleteCharAt(0);
					string = sb.toString();
					stringLength = string.length();
					i=stringLength;
				}else{
					sb.append(string.charAt(0));
					sb.deleteCharAt(0);
					string = sb.toString();
				}
			}
			count++;
		}
		stringLength = string.length();
		if(stringLength == 1 || stringLength == 0){
			return true;
		}else{
			return false;
		}
	}
*/
	static String sortedWord;
	static char[] chars;
	static int i, oddCount;
	public static boolean anagram(String input){
		if(input.length() != 0){
			i = 0;
			chars = input.toLowerCase().toCharArray();
			Arrays.sort(chars);
			sortedWord = new String(chars);
			if(input.length()%2 == 0){
				while(i < input.length()){
					if(sortedWord.charAt(i) != sortedWord.charAt(i+1)){
						return false;
					}
					i+=2;
				}
				return true;
			} else {
				oddCount = 0;
				while(i < input.length()-1){
						if(sortedWord.charAt(i) != sortedWord.charAt(i+1)){
							oddCount++;
							i--;
							if(oddCount > 1){
								return false;
							}
						}
						i+=2;
				}
				return true;
			}
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		File file = new File("Anagram.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			scan.nextLine();
			for(int i = 1; i <= numberOfCases; i++) {
				String input = scan.nextLine();
				System.out.println(anagram(input));
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}