import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HW2 {

	public static int diagonal(int[][] input) {
		
		int first=0;
		int second=0;
		
		for (int row=0; row<input.length; row++){
			first +=input[row][row];
			second +=input[row][input.length-1-row];
		}
		return first*second;
	}




	public static void main(String[] args) {
		File file = new File("/users/SamYang95/Projects/Eclipse/CS196 Homework/Diagonal.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0; i < numberOfCases; i++) {
				int N = scan.nextInt();
				int[][] matrix = new int[N][N];
				for(int j = 0; j < N; j++) {
					for(int k = 0; k < N; k++) {
						matrix[j][k] = scan.nextInt();
					}
				}
				System.out.println(diagonal(matrix));
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
