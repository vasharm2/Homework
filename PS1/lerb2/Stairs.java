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


	public static void stairs(int input) {
		for (int length = 1; length <= input; length++) {
			int spaces = input - length;
			int staircases = length;
			//Prints the correct number of spaces according to the input value
			while (spaces > 0) {
				System.out.print(" ");
				spaces--;
			}
			//Prints the correct number of "#" to form the staircase
			while (staircases > 0) {
				System.out.print("#");
				staircases--;
			}
			//The above while loops only print one line of the staircase,
			//	hence the use of a for loop to print multiple lines.
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