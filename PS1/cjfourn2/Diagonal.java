import java.util.*;
import java.io.*;

public class Diagonal {
	public static int diagonal(int[][] input) {
		int d1 = 0, d2 = 0;
		for (int i = 0, j = i; i < input.length; i++, j++){
			d1 = d1 + input[i][j];
		}
		for (int i = 0, j = input[i].length - 1; j >= 0; i++, j--) {
			d2 = d2 + input[i][j];
		}
		return d1*d2;
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}