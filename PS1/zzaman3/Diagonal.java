/**
 * Zohair Zaman - zzaman3
 * Diagonal Problem Set 1
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Diagonal {

	public static int diagonal(int[][] input) {
		int l = input.length;
		
		int total;
		int firstSum = 0;
		int secondSum = 0;
		
		for(int i = 0; i< l; i++) {
			firstSum += input[i][i];
		}

		for (int j = 0; j< l; j++) {
			secondSum += input[j][l-j-1];
		}
		total = firstSum*secondSum;
		
		return total;
	}
	
	public static void main(String[] args) {
		File file = new File("Diagonal.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0; i < numberOfCases; i++) {
				int N = scan.nextInt();
				int[][] matrix = new int[N][N];
				for(int j = 0; j < N; j++) {
					for(int k = 0; k < N; k++) {
						matrix[j][k] = scan.nextInt();
					}
				}
				System.out.println(diagonal(matrix));
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

