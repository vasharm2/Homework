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
 For example, the String 鈥渙atrtro鈥�will return true (rotator), while the String 鈥渇alse鈥�will return false.


 PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

 ************************************************

 */

public class Anagram {

	public static boolean anagram(String input) { 
	 		int num = input.length();
				double mark = 0.0;
				String word = input.toLowerCase();
				/*for (int i = 0; i < num; i ++){
					if (word.substring(i,i+1).equals(word.substring(num-i-1,num-i))){
						mark = mark + 1;
					}
				}
				if (mark == num){
					return true;}
				else{  
	 			return false;
				} */
				int charList[] = new int[26];
				for (int i = 0; i < num; i++){
					char agent = input.charAt(i);
					charList[agent - 'a'] ++; 
				}
				if (num % 2 == 0){
					for (int i = 0; i < 26; i++){
						if (charList[i] % 2 != 0){
							return false;
						}
					}
				}
				else {
					int counterOdd = 0;
					for (int i = 0; i < 26; i++){
						if (charList[i] % 2 != 0){
							counterOdd = counterOdd + 1;
							if (counterOdd > 1)
								return false;
						}
					}
				}
				return true;
	 	}	
	
	public static void main(String[] args) {
		File file = new File("Anagram.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for (int i = 0; i < numberOfCases; i++) {
				String input = scan.next();
				System.out.println(anagram(input));
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}