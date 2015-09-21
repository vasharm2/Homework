import java.util.*;
import java.io.*;


public class Diagonal {

	public static int diagonal(int[][] input) {
		int s1 =  0;
		for (int i = 0; i < input.length; i++){
			s1 += input[i][i];
		}
		int s2 = 0;
		for (int i = 0; i < input.length; i++){
			s2 += input[i][input.length-1-i];
		}
		return s1 * s2;
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
