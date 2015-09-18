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
		
		System.out.println(input) ;
		   char[] arr = input.toCharArray(); //a string class to put all characters of string into arr
		    int count = 0;
		    for(int i = 0; i < input.length(); i++)
		    {
		    	int j = i + 1; //j is the index of the letter that need to be compared to the letter at index i
		    	while(j < input.length()) 
		    	{
		    		if(arr[i]  != '\b' && arr[i] == arr[j]) // if the element is not already marked earlier.
		    		{
		    			count = count + 1;
		    			arr[j] = '\b'; // mark this position of the array as already used with a backspace
		    			break; //breaks out of the loop if a pair is found
		    		}
		         j++; //increment j to avoid checking same letter twice
		    	}
		    }
		    int doubleCount = count * 2;
		    int length = arr.length;
		    if(doubleCount == length || doubleCount == length - 1)
		    {
		      return true;
		    }
		    else
		    {
		      return false;
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