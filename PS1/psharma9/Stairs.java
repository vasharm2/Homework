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
		
		for(int i = 1; i <= input; i++)
		{
		    for(int j = input; j > 0; j--)
		    {
		        if(i < j) //prints the required number of blank spaces before the # starting with input to 0
		            System.out.print(" ");
		        else  //prints the required number of #s starting with 1 to input
		            System.out.print("#");
		    }
		    System.out.println(); //creates the series of #s in a new line
		}
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