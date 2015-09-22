import java.util.*;
import java.io.*;

/*
************************************************
  ____ ____    _  ___   __
 / ___/ ___|  / |/ _ \ / /_
| |   \___ \  | | (_) | '_ \
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/


Problem set 1


Question 2

Given a square matrix size N x N, calculate the product of the sums across the two main diagonals.
For example, given the input:

3

4	5	7
3	1	5
9	3	2

Return: (4+1+2)*(9+1+7) = 119

PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/
public class Diagonal {

	/**
	 * Sums the diagonals of an N-by-N-sized matrix. Note that a 1-by-1-sized
	 * matrix will return the value 2*x (where x is the sole element in the matrix)
	 * since this is the only element in both diagonals
	 * @param input	the number of elements in the row or column of the matrix
	 * @return	the sum of the diagonals of input
	 */
	private static int diagonal(int[][] input) {
		int sum = 0;

		if (input.length == 0) {
			return 0;
		}

		for (int index = 0; index < input.length; index++) {
			sum += input[index][index];
		}

		for (int rowIndex = input.length - 1; rowIndex >= 0; rowIndex--) {
			int columnIndex = Math.abs(rowIndex + 1 - input.length);
			sum += input[rowIndex][columnIndex];
		}

		return sum;
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
