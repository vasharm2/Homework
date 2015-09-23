import java.util.*;
import java.io.*;

public class Stairs {
	public static void stairs(int input) {
		for (int i = 1; i <= input; i++) { // controls number of '#'
			for (int j = 1; j <= input; j++) { // controls number of spaces
				if (i + j >= input + 1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		File file = new File("Stairs.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for (int i = 0; i < numberOfCases; i++) {
				int height = scan.nextInt();
				stairs(height);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}