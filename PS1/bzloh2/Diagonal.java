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
 
 
 Question 2
 
 Given a square matrix size N x N, calculate the product of the sums across the two main diagonals.
 For example, given the input:
 
 3
 
 4	5	7
 3	1	5
 9	3	2
 
 Return: (4+1+2)*(9+1+7) = 119
 
 PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!
 
 ************************************************
 
 */
public class Diagonal {
    
    public static int diagonal(int[][] input) {
        int left = 0;
        int right=0;
        int start1 =0;
        int start2 = 0;
        int end1 = input[0].length-1;
        int end2 = 0;
        while((0<=start1 && start1<input.length) && (0<=start2 && start2<input[0].length))
        {
            left += input[start1][start2];
            start1++;
            start2++;
        }
        while((0<=end2 && end2<input.length) && (0<=end1 && end1<input[0].length))
        {
            right += input[end2][end1];
            end2++;
            end1--;
        }
        return right*left;
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