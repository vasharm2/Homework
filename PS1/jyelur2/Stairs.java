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

    #    i = 5 input = 4
   ##    i = 5 input = 3
  ###
 ####
#####


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/
public class Stairs {


	public static void stairs(int input) {
		
		int char[][] = new char[input][input]; 
		int c = input-1;
		
	  int d = 0;
    for(int i = input-1; i < 0; i--)
	{
	
       for(int j = d; j < input; j++)
          {
			box[i][j] = '#'; 	
	          }
                d++;
	
	}
    
    for(int l = 0; l < input; l++)
    {
    
    for(int m = 0; m < input; m++)
    	
    {
    	System.out.print(box[l][m])
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