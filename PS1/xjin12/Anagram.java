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
   
    /* It pairs up characters that have same value, and counts the number of characters that are alone.
     If there are more than 1 unpaired characters, the original string is not an anagram of a palindrome.
     Otherwise, it is an ananagram of a palindrome.
	    */

	public static boolean anagram(String input) {
		 int n = 0; int pos; char ch;
		while (input.length() > 0){ 
			    ch = input.charAt(0);
			    input = input.substring(1); 			//delete 0th character.
			    pos = input.indexOf(ch); 				//get the position of the character that is same as ch.
			if(pos != -1){
				 input = input.substring(0,pos)+input.substring(pos+1);	//if there is such a character,delete it.
			} else{
				n++;	  //n is the number of unpaired characters.
			}															
		}
		if(n > 1) {
			return false;
		} else {
			return true;
		}
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