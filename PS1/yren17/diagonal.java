
public class diagonal {
	public static void main(String[] args){
		System.out.println("Please enter the size of your matrix:");
		int size=TextIO.getlnInt();
		int[][] matrix;
		matrix=new int[size][size];
		for (int i=0;i<size; i++){
			for(int j=0;j<size;j++){
				System.out.println("What do you want for the number?");
				matrix [i] [j]=TextIO.getlnInt();
			}
		}
		int value=1;
		for (int k=0;k<size;k++){
			value=value+matrix[k][k];
		}
		int value2=1;
		for (int m=0;m<size;m++){
			value2=value2+matrix[size-1-m][m];
		}
		int result=value*value2;
		System.out.println(result);
		
	}
}



