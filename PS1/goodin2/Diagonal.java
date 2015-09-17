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
*
*Author: Troy Goodin
*
*NetID: goodin2
*
************************************************

*/
public class Diagonal {

	public static int diagonal(int[][] input) {
		
		//Declaring Variables
		int heightOfArray = input.length;
		int leftSum = 0;
		int rightSum = 0;
		int j = 0;
		int finalValue = 0;
		
		
		//Takes the values of the left diagonal and adds them together into int leftSum
		for(int i = 0; i < heightOfArray; i++){
			leftSum += input[i][i];
		}
		
		//Takes the values of the right diagonal and adds them together into int rightSum
		for(int i = heightOfArray - 1; i >= 0; i--){
			j = (heightOfArray - 1) - i;
			rightSum += input[i][j];
		}
		
		//Puts the product of the left diagonal sum and right diagonal into int finalValue
		finalValue = leftSum * rightSum;
		
		return finalValue;
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