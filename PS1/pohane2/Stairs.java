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
		int counter = 0;
		while(counter <= input){
			int spaces, stars, countSpaces, countStars;
			countSpaces = 0;
			countStars = 0;
			spaces = input - counter;
			stars = input - spaces;
			while(countSpaces <= spaces){
				System.out.print(" ");
				countSpaces++;
			}
			while(countStars <= stars){
				System.out.print("*");
				countStars++;
			}
			System.out.println("");
			counter++;
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
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


}