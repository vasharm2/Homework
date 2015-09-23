import java.util.*;
import java.io.*;

public class Anagram {

	public static boolean anagram (String input) {
		int odd=0;
		int inlength=input.length(); 
		for(int i = 0; i < inlength; i++){
			int count=0; 
			for(int r = 0; r < inlength; r++){
				if (input.charAt(i)==input.charAt(r)){ 
					if (i>r) {
						break;
					}
					else{
						count++;
					}
				}
			}
			if (count % 2 != 0)
			{ odd++;}
			
		}
		
		
		
		if (odd > 1) {
			return false;
		}
		else{
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