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
		int sumRight = 0;
		int sumLeft = 0;
		int shift = input.length - 1;
<<<<<<< HEAD
		for(int i = 0; i < input.length; i++) {
			sumRight += input[i][i];
			sumLeft += input[i][shift - i];
		}
=======
		String string1 = "";
		String string2 = "";
		for(int i = 0; i < input.length; i++) {
			string1 += input[i][i] + " + ";
			string2 += input[i][shift - i] + " + ";
			sumRight += input[i][i];
			sumLeft += input[i][shift - i];
		}
		string1 = string1.substring(0, string1.length() - 3);
		string2 = string2.substring(0, string2.length() - 3);
		System.out.println("Print the product of the sums of the diagonals ((" + string1 + ") + (" + string2+ "))");
		
>>>>>>> db62a3241a4fc943be1dbc64dcf5c00a46e5639f
		return sumRight * sumLeft;
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
<<<<<<< HEAD
=======
				
>>>>>>> db62a3241a4fc943be1dbc64dcf5c00a46e5639f
				System.out.println(diagonal(matrix));
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}