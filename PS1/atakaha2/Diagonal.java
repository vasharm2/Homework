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
		//YOUR CODE HERE
<<<<<<< HEAD
		i
		return 0;
=======
		int sum1 = 0;
		int sum2 = 0;
		int N = input.length;
		for(int l = 0; l < N; l++){
			sum1 = sum1 + input[l][l];
		}
		for (int m = 0; m <N; m++){
			sum2 =sum2 + input[m][N-m-1];
			
		}
		return sum1*sum2;
>>>>>>> db62a3241a4fc943be1dbc64dcf5c00a46e5639f
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
<<<<<<< HEAD
		}
=======

			}
>>>>>>> db62a3241a4fc943be1dbc64dcf5c00a46e5639f
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}