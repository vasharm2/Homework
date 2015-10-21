import java.util.*;
import java.io.*;
public class Diagonal
{
    
    public static int diagonal(int[][] input)
    {
        int sum1=0;
        int sum2=0;
        for (int i=0;i<input.length;i++)
        {
            for (int j=0;j<input[0].length;j++)
            {
                if (i==j)
                    sum1+=input[i][j];
                if (i+j==input.length-1)
                    sum2+=input[i][j];
            }
        }
        return (sum1*sum2);
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