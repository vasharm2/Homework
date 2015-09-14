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

	/**
	 * Creates a text-based staircase of N stair-levels
	 * @param input The number of stair levels desired.
	 */
	public static void stairs(int input) {
		//The number of blocks on the current stair level
		int x = 1;
		//The current stair level
		int y = 1;
		//Increment the y to create each level of stairs
		while(y <= input){
			String output = "";
			//Create the spaces
			for(int i = 0; i < input-x; i++){
				output+= " ";
			}
			//Create the blocks
			for(int i = 0; i < x; i++){
				output+= "#";
			}
			//Print the resultant stair level
			System.out.println(output);
			x++;
			y++;
		}
		System.out.println();
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