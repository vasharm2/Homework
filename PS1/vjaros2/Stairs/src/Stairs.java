import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stairs {


	public static void stairs(int input) {
		String[][] matrix = new String[input][input];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < i + 1; j++){
				System.out.print("#");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
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
