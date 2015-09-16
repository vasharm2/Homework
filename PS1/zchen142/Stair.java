/**
 * @author zchen142
 */

import java.io.*;
import java.util.Scanner;


public class Stairs  {


	public static void stairs(int input) {
		
		for(int i=1;i<input+1;i++)
		{
			for(int k=input; k>i;k--)
			{	
				System.out.print(" ");
			
			}
			for(int x=0; x<i;x++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}

		System.out.println("");
	
		return;
	}


	public static void main(String[] args) {
		File file = new File("/Users/DanielCzL315/Desktop/oh.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
		
			for(int i = 0; i < numberOfCases; i++) {
				int height = scan.nextInt();
				
					stairs(height);
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.print("oh?");
		}
	}
}

