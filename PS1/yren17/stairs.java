
public class stairs {
	public static void main(String[]args){
		int floor;
		floor=TextIO.getlnInt();
		for (int i=1; i<=floor; i++){
			for(int k=1; k<=floor-i; k++){
				
			System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				
			System.out.print("#");
			
			}
		System.out.println();
		}
		
	}

}
