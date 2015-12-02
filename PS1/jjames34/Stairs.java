
import java.io.*;
import java.util.Scanner;

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
		String numberOfHashes = "";
		for (int i = 0; i < input; i++) {
			for (int j = 0; j <= i; j++) {
				numberOfHashes = numberOfHashes + "#";
			}
		System.out.println(numberOfSpaces(input,i) + numberOfHashes);
		numberOfHashes = "";
		}
	}
	
	public static String numberOfSpaces(int input,int current) {
		String result = "";
		for (int i = 0; i < input - current; i++) {
			result = result + " ";
		}
		return result;
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