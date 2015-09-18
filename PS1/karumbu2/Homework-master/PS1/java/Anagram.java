import java.util.*;
import java.io.*;
import java.util.Scanner;
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
		Scanner anagram= new Scanner(System.in);
		String Input= anagram.nextLine();
		Input = Input.toLowerCase();
		/*if (correct(Input)) {
		System.out.println("yes");
		}
		else {
			System.out.println("no!");
		}*/
		return false;}
		public static boolean correct(String input){
			int [] stat = new int[26];
		for (int i=0; i< input.length();i++)
		{
			char ascii= input.charAt(i);
			stat [ascii - 'a']++;
		}
		int loop;
		loop = 0;
		for (int stable:stat){
			if (loop > 1){ 
				return false;
			}
			if (stable%2 == 1){
				loop++;
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