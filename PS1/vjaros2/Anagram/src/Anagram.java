import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Anagram {

	public static boolean anagram(String input) {
		boolean isPalindrome = true;
		boolean unique = true;
		int uniqueCharacterCount = 0;
		char charArray[] = input.toLowerCase().toCharArray();
		
		for(int i = 0; i<(charArray.length); i++){
			if(uniqueCharacterCount > 1) return false;
			for(int j = i + 1; j<(charArray.length) - i; j++){
				unique = true;
				if (charArray[i] - charArray[j] == 0){
					char temp = charArray[charArray.length-1-i];
					charArray[charArray.length-1-i] = charArray[j];
					charArray[j] = temp;
					unique = false;
				}
				
			}
			if (unique){
				char temp = charArray[charArray.length/2];
				charArray[charArray.length/2] = charArray[i];
				charArray[i] = temp;
				uniqueCharacterCount++;
				i--;
			}
		}
		for(int i = 0; i<(charArray.length)/2; i++){
			if(!(charArray[i] == charArray[charArray.length - 1 - i])){
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
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
