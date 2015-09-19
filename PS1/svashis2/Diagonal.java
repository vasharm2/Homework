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

	public static int diagonal(int[][] input, int matrixdimention) {

		// YOUR CODE HERE

		int diagonal1total = 0;
		for (int rowCtr = 0; rowCtr < matrixdimention; rowCtr++) {
			for (int colCtr = 0; colCtr < matrixdimention; colCtr++) {
				if (rowCtr == colCtr) {

					diagonal1total = diagonal1total + input[rowCtr][colCtr];
				}

			}
		}

		int diagonal2total = 0;
		for (int rowCtr = 0; rowCtr < matrixdimention; rowCtr++) {
			for (int colCtr = 0; colCtr < matrixdimention; colCtr++) {
				if (rowCtr + colCtr == (matrixdimention - 1)) {

					diagonal2total = diagonal2total + input[rowCtr][colCtr];
				}
			}
		}

		int diagonalProduct = 0;
		diagonalProduct = (diagonal1total * diagonal2total);

		return diagonalProduct;

		// diagonal code above//

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
				int diagprod = diagonal(matrix, N);
				System.out.println(diagprod);
						
				//System.out.println(diagonal(matrix));
//for the diagonal from the top left down to the bottom right, make an if statement with the condition rowCtr=colCtr.
//Add the values of the input elements together as diagonal1
//For the diagonal from the top right to the bottom left set variable x that is the square root of the the number of elements
//write and if statement with the condition that the rowCtr and colCtr both have to add up to = x
//Add the values of the input elements together as diagonal2
//Add the values of diagonal1 and diagonal2
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}