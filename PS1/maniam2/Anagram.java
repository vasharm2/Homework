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
For example, the String â€œoatrtroâ€� will return true (rotator), while the String â€œfalseâ€� will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

public class Anagram {

	String[] chars;
	boolean isEven = false;
	String word;
	boolean[] evens = new boolean[26];
	
	public Anagram(String input){
		word = input.toLowerCase();
		isEven = (input.length() % 2 == 0);
		for (int i = 0; i < evens.length; i++){
			evens[i] = true;
		}
	}

	
	public boolean isAnagram(){
		for (int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			evens[c-'a'] = !evens[c-'a'];
		}
		/*if (isEven){
			for (boolean b : evens){
				if(!b)
					return false;
			}
			return true;
		}
		else{*/
			int count = 0;
			for (boolean b : evens){
				if(!b)
					count++;
			}
			if(count > 1)
				return false;
			else
				return true;
		//}
	}
	
	

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String yes;
		do{
			System.out.println("Enter words:");
			String input = sc.next();
			Anagram test = new Anagram(input);
			System.out.println(test.isAnagram());
			System.out.println("Cont");
			yes = sc.next();


			
		}while(yes.equals("yes"));*/
		
		
		File file = new File("Anagram.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0; i < numberOfCases; i++) {
				String input = scan.next();
				Anagram a = new Anagram(input);
				System.out.println(a.isAnagram());
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	
}