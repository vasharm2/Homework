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
		
		for(int i = 1,s = input-1; i<=input; i++, s--){
			System.out.print(mprint(s, " "));
			System.out.println(mprint(i, "#"));
		}
	}
	
	//method to print multiples. cos i can.
	public static String mprint(int m, String s){
		String result = "";
		for (int i = 1; i<=m; i++){
			result += s;
		}
		return result;
	}

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		stairs(sc.nextInt());*/
		
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