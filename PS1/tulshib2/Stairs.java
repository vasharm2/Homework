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

	//Uses nested loops to iterate over each line to print the appropriate number of spaces and #s to form a staircase.
	public static void stairs(int input) {
		for(int i = input; i >= 0; i --)		//There's some confusion between the correlation between the input and the height of the stairs.
		{										//The documents I have all specify it to be 1 higher than the number.
			int j = 0;							//The updates in the github now (9/15 20:26) are inconsistent between PS1.txt and Stairs.java.
			for(j = 0; j <= i; j++) 			//I have followed the instructions in this directory, to make it 1 higher than the input.
			{
				System.out.print(" ");
			}
			for(j = i; j <= input; j++)
				System.out.print("#");
			System.out.println();
		}
		System.out.println();
		return;
	}


	public static void main(String[] args) {
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