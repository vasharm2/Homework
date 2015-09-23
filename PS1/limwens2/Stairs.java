import java.util.Scanner;
import java.io.File;

class Stairs
{
    public static void main(String args[]) throws Throwable
    {
        File f = new File("Stairs.txt");
        Scanner sc = new Scanner(f);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int rows = sc.nextInt();
            printPyramid(rows);
        }
    }

    public static void printPyramid(int rows)
    {
        for (int i = rows - 1; i >= 0 ; i--) {
            for (int j = 0; j < rows; j++) {
                if (j < i) System.out.print(" ");
                else System.out.print("#");
            }
            System.out.println();
        }
    }
}
