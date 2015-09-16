import java.util.*;

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
For example, the String  will return true (rotator), while the String  will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		ArrayList<String> s = new ArrayList<String>();
		for(int i=0;i<=t;i++){
			s.add(scan.nextLine());
		}
		for(int i=1;i<=t;i++){
			System.out.println(anagram(s.get(i)));
		}
		scan.close();
	}
	
	public static boolean anagram(String input) {
		int numOdd = 0;
		int count = 0;
		char[] chars = input.toLowerCase().toCharArray();
		ArrayList<Character> letters = new ArrayList<Character>();
		for(int i=0; i<chars.length; i++){
			for(int j=0; j<chars.length;j++){
				if(chars[i] == chars[j] && !letters.contains(chars[i])){
					count++;
				}
			}
			if(!letters.contains(chars[i])){
				letters.add(chars[i]);
			}
			if(count%2==1){
				numOdd++;
			}
			count=0;
		}
		
		if(input.length()%2==0 && numOdd > 0){
			return false;
		} else if (numOdd>1){
			return false;
		} else {
			return true;
		}
	}


}
