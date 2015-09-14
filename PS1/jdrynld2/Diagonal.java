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
	 * 
	 * @param input - An N x N matrix 
	 * @return - The product of the sums of the diagonals of the matrix given.
	 */
	public static int diagonal(int[][] input) {
		int topToBottomDiagonalSum = 0;
		//Sum the diagonal entries that go from the top to the bottom of the matrix
		for(int i = 0; i < input.length; i++){
			topToBottomDiagonalSum += input[i][i];
		}

		int bottomToTopDiagonalSum = 0;
		//Sum the diagonal entries that go from the bottom to the top of the matrix
		for(int i = 0; i < input.length; i++){
			bottomToTopDiagonalSum += input[i][(input.length-1)-i];
		}
		//return the product of the two diagonal sums
		return topToBottomDiagonalSum*bottomToTopDiagonalSum;
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