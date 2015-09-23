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
			int x= input.length;
			int y = input[0].length;
			int sumOne = 0;
			int sumTwo = 0;
			int ans = 0;
			if(x!=y)
			{
				System.out.println("wrong input");
			}
			else
			{
				System.out.print("(");
				for(int i=0; i<x;i++)
				{
					System.out.print(input[i][i]);
					sumOne+=input[i][i];
					if(i<x-1)
					{
						System.out.print("+");
					}
				}
				
				System.out.print(")*(");
				
				for(int j=0; j<x;j++)
				{
					System.out.print(input[j][input[0].length-1-j]);
					sumTwo+=input[j][input[0].length-1-j];
					
					if(j<x-1)
					{
						System.out.print("+");
					}
				}
				
				System.out.print(") = ");
				
				ans = sumOne *sumTwo;
				
				System.out.println(ans);
				
				
			}
			System.out.println();
			return 0;
		}





		public static void main(String[] args) {
			File file = new File("Diagonal.txt");
			//File file = new File("/Users/CharlesBSwarts/Documents/workspace/JAVA/Homework 2 Folder/bin/Diagonal.txt");
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
					diagonal(matrix);
				}
				scan.close();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

	
}