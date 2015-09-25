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


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/
public class Stairs {
	
	static int stairs;
	static int spacesLeft;
	static int counter;
	public static void stairs(int input) {
		counter = 1;
		stairs = 1;
		spacesLeft = input-1;
		while(counter <= input){
			while(spacesLeft > 0){
				System.out.print(" ");
				spacesLeft--;
			}
			while(stairs <= counter){
				System.out.print("#");
				stairs++;
			}
			System.out.println();
			counter++;
			spacesLeft = input-counter;
			stairs = 1;
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
				if(height > 0){
					stairs(height);
					System.out.println();
				}
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}