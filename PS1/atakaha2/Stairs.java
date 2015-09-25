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
<<<<<<< HEAD
		return;
=======
      int height=input;
      int l =0;
	  while (l<= height){
	
		for (int j=height-l; j > 0; j--){
			System.out.print(" ");
		}
		for (int k=l; k > 0; k--){
         System.out.print("#");
		}
		 System.out.println("");
		l = l+1;
	  }
>>>>>>> db62a3241a4fc943be1dbc64dcf5c00a46e5639f
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