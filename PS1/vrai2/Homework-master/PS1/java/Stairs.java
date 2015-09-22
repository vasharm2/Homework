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
//vrai2
public class Stairs {


	public static void stairs(int input) {
		int n=input-1;
		for (int i =0; i<input; i++)
		{
			for (int j=0; j<input; j++)
			{
				if (j>=n)
					System.out.print("#");
				else
					System.out.print(" ");
				
			}
			n--;
			System.out.println();
		}
		return;
	}


	public static void main(String[] args) {
		File file = new File("C:\\Users\\vidushi\\workspace2\\Submissions\\PS1\\vrai2\\Homework-master\\PS1\\java\\Stairs.txt");
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