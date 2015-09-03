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


Question 3

Given an integer input N, print a staircase out of height N. For example, given the input 5, print out the following staircase:

    #
   ##
  ###
 ####
#####


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/
public class Stairs {


    public static void stairs(int input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= input; i++) {
            appendChar(builder, ' ', input - i);
            appendChar(builder, '#', i);
            builder.append("\n");
        }
        System.out.println(builder);
        return;
    }

    private static void appendChar(StringBuilder builder, char c, int times) {
        if (times < 0) throw new IllegalArgumentException();
        for (int i = 0; i < times; i++) {
            builder.append(c);
        }
    }

    public static void main(String[] args) {
        File file = new File("src/Stairs.txt");
        try {
            Scanner scan = new Scanner(file);
            int numberOfCases = scan.nextInt();
            for (int i = 0; i < numberOfCases; i++) {
                int height = scan.nextInt();
                stairs(height);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}