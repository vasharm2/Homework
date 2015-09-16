import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HW3 {
	
	public static void stairs(int input) {
		
		for (int i=1;i<=input;i++){
			for(int j=1;j<=input-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				if (k==i){
					System.out.println("#");
				}else{
					System.out.print("#");
				}
			}
		}
		
		return;
	}


	public static void main(String[] args) {
		File file = new File("/users/SamYang95/desktop/Stairs.txt");
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
