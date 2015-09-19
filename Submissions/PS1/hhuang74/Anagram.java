import java.util.*;
import java.io.*;

public class Anagram {
	public static boolean anagram(String input) { // assume only letters and spaces in text file
		input = input.toLowerCase();
		int [] alphabet = new int[26];
		int oddCount = 0;
		for (int i = 0; i < input.length(); i++){
			char c = input.charAt(i);
			alphabet[c - 'a'] = alphabet[c - 'a'] + 1; // counts how many of each letter a-z there are
		}
		for (int k = 0; k < alphabet.length; k++){
			int a = alphabet[k];
			if (oddCount > 1){
				return false;
			} else if (a%2==1){ // if a letter occurs an odd number of times
				oddCount = oddCount + 1;
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}