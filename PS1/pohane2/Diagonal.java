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
		int counter, shift, product;
		int upSum = 0;
		int downSum = 0;
		shift = input.length - 1;
		for(counter = 0; counter<input.length; counter++){
			int num1 = input[counter][counter];
			upSum = upSum + num1;
			int num2 = input[counter][shift-counter];
			downSum = downSum + num2;
		}
		product = upSum*downSum;
		System.out.println("The sum of the diagonal going from top left to bottom right is: " + upSum);
		System.out.println("The sum of the diagonal going from top right to bottom left is: " + downSum);
		System.out.println("The product of the sums of the diagonals is: ");
		return product;
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