import java.util.*;
import java.io.*;

public class Stairs {


	public static void stairs(int input) {
		for (int x = 0; x < input; x++)
		{
			for (int y = 0; y < x+1; y++)
			{
				System.out.print("X"); 
			}
			System.out.println("");
		}
		System.out.println("");
		
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