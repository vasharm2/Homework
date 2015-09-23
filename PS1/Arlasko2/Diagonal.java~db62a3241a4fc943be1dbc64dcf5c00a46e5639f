import java.util.*;
import java.io.*;


public class Diagonal {

	public static int diagonal(int[][] input) {
		int diag1 = 0; int diag2 = 0;
		int size = input.length;
		for(int count1 = 0; count1 < size; count1++) {
			diag1 += input[count1][count1];
			}
			for(int count2 = 0; count2 < size; count2++) {
				diag2 += input[count2][size-count2-1];
			}
			int result = diag1*diag2;
			return result;
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