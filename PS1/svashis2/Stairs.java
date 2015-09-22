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
		//YOUR CODE HERE
		for (int i=1; i<=input; i++){
			spaces(input-i);
			pound(i);
			System.out.println();
		}
		System.out.println();
	}
		

	public static void spaces(int num){
		for (int i = 1; i<=num; i++){
			System.out.print(" ");
		}
	}
	
	public static void pound(int num){
		for (int i = 1; i<=num; i++){
			System.out.print("#");
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