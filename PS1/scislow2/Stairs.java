import java.util.*;

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
	
	//MY code for testing and running Stairs because text file wasn't working
	/*public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		ArrayList<Integer> h = new ArrayList<Integer>();
		for(int i=0;i<t;i++){
			h.add(scan.nextInt());
		}
		for(int i=0; i<t; i++){
			stairs(h.get(i));
		}
		scan.close();
	}*/
	
	public static void stairs(int input) {
		int row = 1;
		int length = input;
		while(input>0) {
			for(int j = length-row; j>0; j--) {
				System.out.print(" ");
			}
			for(int i = row; i > 0; i--) {
				System.out.print("#");
			}
			row++;
			input--;
			System.out.println();
		}
	}
	
	

}