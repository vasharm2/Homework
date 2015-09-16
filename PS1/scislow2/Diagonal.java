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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[][] mat = new int[t][t];
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                mat[i][j] = s.nextInt();
            }
        }
        System.out.println("\n" + diagonals(mat, t));
        s.close();
    }
    
    public static int diagonals(int[][] mat, int rowcol){
        int sum1 = 0;
        int sum2 = 0;
        System.out.print("((");
        for(int i=0; i<rowcol; i++){
            sum1 += mat[i][i];
            if(i<rowcol-1){
            	System.out.print(mat[i][i] +" + ");
            } else {
            	System.out.print(mat[i][i]);
            }
        }
        System.out.print(") (");
        int index = rowcol-1;
        for(int i=0;i<rowcol;i++){
            sum2+=mat[index][i];
            if(i<rowcol-1){
            	System.out.print(mat[index][i] +" + ");
            } else {
            	System.out.print(mat[index][i]);
            }
            index--;
        }
        System.out.print("))");
        return Math.abs(sum1*sum2);
    }
}