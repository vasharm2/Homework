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

	public static int diagonal(int[][] input) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number");
		// get user input for a
		int a = reader.nextInt();
		System.out.println(a);
		
		int sizeOfMatrix = input.length;
		System.out.println("Size of matrix: " + sizeOfMatrix);
		
		// Store the numbers in the diagonals in two arrays.
		int[] diagonal1 = new int[sizeOfMatrix];
		int[] diagonal2 = diagonal1;
		
		for (int i = 0; i < sizeOfMatrix; i++){
			diagonal1[i] = input[i][i];
			diagonal2[i] = input[sizeOfMatrix -i - 1][i];
		}
		
		
		// Find sum of two diagonals.
		int diag1Sum = 0;
		int diag2Sum = 0;
		
		for (int i = 0; i < diagonal1.length; i++){
			diag1Sum += diagonal1[i];
			diag2Sum += diagonal2[i];
		}

		// Return the product of the two sums.
		return diag1Sum * diag2Sum;
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