import java.util.*;
import java.io.*;
// syoon46
public class Stairs {

	public static void stairs(int input) {
		for (int i = 0; i < input; i++){
			for (int j = i; j < input-1 ; j++){
				System.out.print(" "); 	// print space input-1 times
			}
			for (int j = 0; j < i+ 1; j++){
				System.out.print("#"); // print space i+1 times
			}
			System.out.println(""); //must make new line after one set of stairs
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
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}