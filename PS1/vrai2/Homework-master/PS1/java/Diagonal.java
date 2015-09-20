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
//vrai2
public class Diagonal {

	public static void diagonal(int[][] input, int N) 
	{
		int firstDiagonal=0, secondDiagonal=0;
		for(int i=0; i<N; i++)
		{
			for (int j=0; j<N; j++)
			{
				if (i==j)
				{
					firstDiagonal=firstDiagonal+input[i][j];
					
				}
				if ((i+j)==(N-1))
				{
					secondDiagonal=secondDiagonal+input[i][j];
				}
			}
		}
		int product = firstDiagonal*secondDiagonal;
		System.out.println("The product of the the sum of the two diagonals = " +product);
	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\vidushi\\workspace2\\Submissions\\PS1\\vrai2\\Homework-master\\PS1\\java\\Diagonal.txt");
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
			diagonal(matrix, N);
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}