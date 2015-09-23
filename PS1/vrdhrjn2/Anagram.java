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
		boolean isAnagram = true;
		int single = 0;
		input = input.toLowerCase();
		int[] A = new int[26];
		for(int j =0;j<26;++j)
			A[j]=0;
		
		for(int i=0;i<input.length();++i)
		{  int counter =1;
		   char a = input.charAt(i);
		   int place = -97+(int)a;
		   
		   if(A[place]==0){
			 
				for(int j = i+1;j<input.length();++j){
				if(input.charAt(j)==a)
					counter++;
				}
				if(counter%2==1) single++;
		   }
			A[place]=1;
						
		}
		
		if(single>1) isAnagram = false;
		
	    return isAnagram;
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