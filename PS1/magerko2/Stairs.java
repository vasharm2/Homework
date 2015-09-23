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

	/**
	 * Generates stairs of specified height using # characters
	 * @param height	the height of the stairs
	 * @return a String representation of the stairs
	 */
	public static String generateStairs(int height) {
		StringBuilder builder = new StringBuilder();
		for (int currentHeight = 0; currentHeight < height; currentHeight++) {
			for (int spaces = 0; spaces < height - currentHeight; spaces++) {
				builder.append(' ');
			}
			for (int stairs = 0; stairs <= currentHeight; stairs++) {
				builder.append('#');
			}

			if (currentHeight < height - 1) {
				builder.append('\n');
			}
		}

		return builder.toString();
	}


	public static void main(String[] args) {
		File file = null;
		Scanner scan = null;
		try {
			file = new File("Stairs.txt");
			scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0; i < numberOfCases; i++) {
				int height = scan.nextInt();
				System.out.println(generateStairs(height));;
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}

}
