import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Diagonal {

	public static int diagonal(int[][] input) {
		int leftToRightSum = 0;
		int rightToLeftSum = 0;
		for(int i = 0; i < input.length; i++){
			
			for(int j = 0; j < input[i].length; j++){
				if(j == i){
					leftToRightSum = leftToRightSum + input[i][j];				
				}
				if(j == input[i].length - i - 1){
					rightToLeftSum = rightToLeftSum + input[i][j];
				}
			}
		}
		return rightToLeftSum * leftToRightSum;
	}
	
	public static void main(String[] args) {
		File file = new File("Diagonal.txt");
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
