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


/*there must be an even number of a specific char, if length of string 
 *is even. 
 * if length is odd, only one specific char can have a odd number occurrence,
 * and all other chars must have an even number of occurrences
 */


public class Anagram {

	public static int letterExists(char c, String input){
		for (int x = 0; x < input.length(); x++){
			if (input.charAt(x) == c){
				return x;
			}
		}
		return -1;
	}

	public static boolean anagram(String input) {

		int length = input.length();
		int oddCount = 0;
		String str = input;
		//System.out.println(input);
		
		if(input == "" || length==1){
			return true;
		}

		if(length%2 == 0){
			int mark = -1;
			while (str.length() > 0){
				if (letterExists(str.charAt(0), str) != -1){
					//System.out.println("og str: " + str);
					mark = letterExists(str.charAt(0), str);
					//System.out.println("mark: " + mark);
					str = str.substring(0,mark) + str.substring(mark+1, str.length() -1);
					//System.out.println("new str: " + str);
				}
			}

			if ( (input.length()%2 == 0) && (str.length() == 0)){ //if original word length even
				return true;
			}
			if ( (input.length() %2 == 1) && (str.length() <= 1)){ //if original word length odd
				return true;
			}

			return false;
		}
		return false;
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