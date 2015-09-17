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
		int pound = 1;
		
		for(int counter = 0; counter <= input; counter++)	{	//number of rows for pyramids
			int space = 0;
			while(space + pound <= input + 1)	{	//spaces before hashtags
				System.out.print(" ");
				space ++;
			}
		
			int i = 0;
			while(i < pound)	{	//pound signs
				System.out.print("#");
				i ++;
			}
		
			pound ++;
			System.out.println("");
		}
		return;
	}


	public static void main(String[] args) {
		File file = new File("src/Stairs.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();	//numberOfCases = number of stairs
			for(int i = 0; i < numberOfCases; i++) {
				int height = scan.nextInt();	//height = next number = number of rows + 1
				stairs(height);	//calling above code
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}