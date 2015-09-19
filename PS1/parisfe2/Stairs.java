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


Question 3

Given an integer input N, print a staircase out of height N. For example, given the input 4, print out the following staircase:

    #
   ##
  ###
 ####
#####


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/
public class Stairs {


	public static void stairs(int input) 
	{
		// A pyramid of height 4 has a base of 5 across (it's also actually 5 high)
		int dim = input + 1;
		
		// For each lin
		for (int i = 0; i < dim; i++)
		{
			// Print blanks, starting at one less than the dimension and going to 0
			for (int blank = 0; blank < dim - (i + 1); blank++)
				System.out.print(" ");
				
			// Print the #'s, starting at 1 and going to dimension
			for (int hash = 0; hash < i + 1; hash++)
				System.out.print("#");
				
			System.out.print("\n");
		}
		
		return;
	}


	public static void main(String[] args) 
	{
		File file = new File("Stairs.txt");
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
		}
	}

}