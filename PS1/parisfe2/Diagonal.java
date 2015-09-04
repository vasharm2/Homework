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

	public static int diagonal(int[][] input, int N) 
	{
		int result = sumDiagonal(input, N, true) * sumDiagonal(input, N, false);

		
		
		return result;
	}

	public static int sumDiagonal(int[][] input, int N, boolean down)
	{
		int result = 0;
		
		// Starting upper left
		if(down)
		{
			for (int y = 0; y < N; y++)
			{
				for (int x = 0; x < N; x++)
				{
					if(x == y)
					{
						//System.out.println(input[y][x]);
						result += input[y][x];
					}
				}
			}
		}
		// Starting bottom left
		else
		{
			for (int y = N-1; y >= 0; y--)
			{
				for (int x = 0; x < N; x++)
				{
					if (x == (N-1) - y)
					{
						//System.out.println(input[y][x]);
						result += input[y][x];
					}
					
				}
			}
		}
		
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
				System.out.println(diagonal(matrix, N));
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}