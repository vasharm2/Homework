import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
        for (int[] ints : input) {
            if (ints.length != input.length) throw new IllegalArgumentException("Not a square matrix!");
        }
        return diagonal(input, Direction.Main) * diagonal(input, Direction.Other);
    }

    public static int diagonal(int[][] input, Direction direction) {
        int size = input.length;
        int r_init, r_offset, c_init, c_offset;
        switch (direction) {
            case Main:
                r_init = 0;
                c_init = 0;
                r_offset = 1;
                c_offset = 1;
                break;
            case Other:
                r_init = 0;
                c_init = size - 1;
                r_offset = 1;
                c_offset = -1;
                break;
            default:
                throw new IllegalStateException();
        }
        int r = r_init, c = c_init, sum = 0;
        while ((0 <= r && r < size) && (0 <= c && c < size)) {
            sum += input[r][c];
            r += r_offset;
            c += c_offset;
        }
        return sum;
    }

    public static void main(String[] args) {
        File file = new File("Diagonal.txt");
        try {
            Scanner scan = new Scanner(file);
            int numberOfCases = scan.nextInt();
            for (int i = 0; i < numberOfCases; i++) {
                int N = scan.nextInt();
                int[][] matrix = new int[N][N];
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        matrix[j][k] = scan.nextInt();
                    }
                }
                System.out.println(diagonal(matrix));
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public enum Direction {Main, Other}

}