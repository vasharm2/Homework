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
		//Calls the 2 diagonal functions using the input as the argument; Returns the product
		return getRightDiagonalSum(input) * getLeftDiagonalSum(input);
	}
	
	public static int getLeftDiagonalSum(int[][] input){
		//Start counting sum at 0
		int sum = 0;
		//Iterate through the rows from 0 -> length; **Assuming square matrix**
		for(int i = 0; i < input[0].length; i++){
			//
			sum += input[i][i];
		}
		return sum;
	}
	public static int getRightDiagonalSum(int[][] input){
		//Start counting sum at 0
		int sum = 0;
		
		//Iterate through the rows from 0 -> length; **Assuming square matrix**
		for(int i = 0; i < input[0].length; i++){
			//
			sum += input[input[0].length - i - 1][i];
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