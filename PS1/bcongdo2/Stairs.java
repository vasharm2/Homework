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

   # //3
  ## //2
 ### //1
#### //0


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/
public class Stairs {


	public static void stairs(int input) {
		//System.out.println("Input: " + input);
		
		//Iterate through rows - Starting at "bottom" and going to "top" (because of printout order)
		for(int y = 0; y < input; y++){
			//Start row with empty string
			String row = "";
			
			//Calculate number of hashmarks should be in each row; correcting for 0-based iteration in the input
			int numHashsesInRow = (input - 1) - y;
			
			//Iterate through columns
			for(int x = 0; x < input; x++){
				//Print spaces until it becomes necessary to start printing hashes; append the correct character to the
				//row string
				if(x < numHashsesInRow){
					row += " ";
				}
				else{
					row += "#";
				}
			}
			//Print the completed row string
			System.out.println(row);
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