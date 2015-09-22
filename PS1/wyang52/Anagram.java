import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HW1 {
	
	public static void main(String[] args) {
		File file = new File("/users/SamYang95/Projects/Eclipse/CS196 Homework/Anagram.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0; i < numberOfCases; i++) {
				String input = scan.next();
				System.out.println(check(input));
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static boolean check(String input){
		
		boolean bo[] = new boolean[26];
		input = input.toLowerCase();
		
		for (int i = 0; i<input.length();i++){
			char character = input.charAt(i);
			bo[character-'a']=!bo[character-'a']; //record if character appears odd(true)/even(false) time(s)
		}
		
		int count = 0;
		for (boolean e:bo){
			if (e==true) //count of odds
				count++;
		}
		
		return (count<=1);
	}
	}
