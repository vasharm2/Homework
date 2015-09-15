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
		if (input >= 0) {
			for (int spaces = input; spaces >= 0; spaces--) {
				for (int i = 0; i < spaces; i++) {
					System.out.print(" ");
				}
				
				int stairs = input - spaces + 1;
				
				for (int i = 0; i < stairs; i++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
		
		else {
			for (int stairs = 1; stairs <= -input + 1; stairs++) {
				for (int i = 0; i < stairs; i++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
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
