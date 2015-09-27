import java.util.*;
import java.io.*;

public class Stairs {
	public static void stairs(int input) {
		for(int i = 1; i <= input; i++){
			for(int j = 0; j < input - i; j++){
				System.out.print(" ");
			}
			for(int k = input- i; k < input; k++){
				System.out.print("#");
			}
			System.out.println();
		}
		return;
	}
	public static void main(String[] args) {
		File file = new File("Stairs.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0; i < numberOfCases; i++) {
				int height = scan.nextInt();
				stairs(height);
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
