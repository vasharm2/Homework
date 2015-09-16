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

Question 3

************************************************
*/
public class Stairs
{
	public static void stairs(int input)
	{
		int height = input;
		for (int line = 0; line <= input; line++)
		{
			for (int spaces = height; spaces > 0; spaces--)
			{
				System.out.print(" ");
			}
			for (int pound = 0; pound <= line; pound++)
			{
				System.out.print("#");
			}
			System.out.println();
			height--;
		}
		return;
	}

	public static void main(String[] args)
	{
		File file = new File("Stairs.txt");
		try
		{
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0; i < numberOfCases; i++)
			{
				int height = scan.nextInt();
				stairs(height);
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
