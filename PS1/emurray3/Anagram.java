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
For example, the String â€œoatrtroâ€ will return true (rotator), while the String â€œfalseâ€ will return false.


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

public class Anagram {

	public static boolean anagram(String input) {
		//make the input all lower case
		input = input.toLowerCase();
		//make a matrix where the first column has chars and the second column has the occurrences of that char
		int[][] matrix = new int[input.length()][2];
		int oddLetters = 0; //how many letter occur an odd number of times
		int row = 0; //which row you are checking
		boolean found = false; //is the letter found yet
		for (int i = 0; i < input.length(); i++){ 
			row = 0;
			found = false;
			while (matrix[row][0] != 0 && found == false){ //go through the first column until the first blank row
				if (input.charAt(i) == matrix[row][0]){ //add 1 if char i is in the first column in row
					matrix[row][1]++;
					found = true;
				}
				row++;
			}
			if (found == false){ //if char i is not in the first column
				matrix [row][0] = input.charAt(i); //add char i to the next row
				matrix [row][1]++;
				row++;
			}
		}
		//check how many letters occur an odd number of times
		for (int i = 0; i < input.length(); i++){
			if (matrix[i][1] % 2 == 1)
				oddLetters++;
		}
		
		if (oddLetters > 1)
			return false;
		else
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