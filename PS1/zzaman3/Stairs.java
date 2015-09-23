/**
 * Zohair Zaman - zzaman3
 * Stairs Problem Set 1
  */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Stairs {
	public static void stairs(int input) {
		int i = 1;
		int j;	
		
		for(i = 0; i <= input; i++){
			int k = i;
			while((input-k) > 0 ){
				System.out.print(" ");
				k++;
			}
			
			for(j = 1; j <= i; j++){
				System.out.print("#");
			}
			System.out.println("");
		}
	
		
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
