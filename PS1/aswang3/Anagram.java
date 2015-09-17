<<<<<<< HEAD
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
		String a = input.toLowerCase();
		int count = 1, size = a.length(), cnt = 0; 
		boolean z, y;
		int[]num = new int[size];
		ArrayList<Character> repeat = new ArrayList<Character>(); //contains repeated letters
		ArrayList<Boolean> value = new ArrayList<Boolean>(); //contains whether or not even
		
		for(int i = 0; i < size; i++){
			for(int j = 1; j < size; j++){
				if (repeat.contains(a.charAt(i)))
					count = 0;
				else{
					if(a.charAt(i) == a.charAt(j)){
						count++;
					}
				}
				num[i] = count;
			}
			repeat.add(a.charAt(i));
		}
		for(int j = 0; j < size; j++){
			if(num[j]%2 == 0)
				y = true;
			else
				y = false;
			value.add(y);
		}
		
		for(int k = 0; k < value.size(); k++){
			if(value.get(k) == false)
				cnt++;
		}
		
		if(cnt > 1)
			z = false;
		else
			z = true;
		return z;
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
=======

>>>>>>> 7a3a176157cfc91e9d2402bdbf5f7a7ea594755b
