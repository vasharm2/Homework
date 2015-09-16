/**
 * @author zchen142
 */
import java.io.*;
import java.util.Scanner;

public class Diagonal {

	public static int diagonal(int[][] input) {
	
		
		int sum=0;
		int sum1=0;
		int[] diagonal=new int[input.length];
		int[] diagonal2=new int[input.length]; 
		for (int i=0; i< input.length;i++)
			
		{	
			
					sum+=input[i][i];
					diagonal[i]=input[i][i];
			
					sum1+=input[input.length-1-i][i];
					diagonal2[i]=input[input.length-1-i][i];
					
			
		}

		System.out.print("(");	
		for (int i=0; i<=diagonal.length-2;i++)
		{
			System.out.print(diagonal[i]+"+");
		}
		System.out.print(diagonal[diagonal.length-1]+")"+" "+"*"+" "+"(");
		for (int i=0; i<=diagonal.length-2;i++)
		{
			System.out.print((diagonal2[i])+"+");
		}
		System.out.println(diagonal2[diagonal2.length-1]+")"+" ");
		return sum*sum1;
	}





	public static void main(String[] args) {
		File file = new File("/Users/DanielCzL315/Desktop/oh.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			while(scan.hasNext())
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
			System.out.print("Oops");
		}
	}

}