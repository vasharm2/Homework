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

	public static int diagonal(int[][] input, int dimension) {
		int diagonalOne = 0, diagonalTwo = 0, d = 0, u = dimension-1;
		//System.out.print("(");
		while(d < dimension){
			//System.out.print(input[d][d]);
			diagonalOne += input[d][d];
			//if(d != dimension-1){
			//	System.out.print("+");
			//}
			d++;
		}
		//System.out.print(")*(");
		d = 0;
		while(u >= 0){
			//System.out.print(input[u][d]);
			diagonalTwo += input[u][d];
			//if(u != 0){
			//	System.out.print("+");
			//}
			u--;
			d++;
		}
		//System.out.print(") = " + diagonalOne*diagonalTwo);
		return diagonalOne*diagonalTwo;
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
				if(N > 0){
					System.out.println(diagonal(matrix, N));
				}
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}