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
		int sum1 = 0;
		int sum2 = 0;
		if (input.length > 0){
			int x = 0;
			int i = 0;
			for (int j = 0; j < input[x].length; j ++){
				sum1 = sum1 + input[i][j];
				i++;
			}
			int k = input[x].length-1;
			for (int n = 0; n < input.length; n++){
				sum2 = sum2 + input[n][k];
				k--;
			}
			return sum1 + sum2;
		}else{
		return 0;
		}
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