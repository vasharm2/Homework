import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
************************************************
  ____ ____    _  ___   __   
 / ___/ ___|  / |/ _ \ / /_  
| |   \___ \  | | (_) | '_ \ 
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/ 
                             

Problem set 1

Question 1

************************************************
*/

public class Anagram
{
	public static boolean anagram(String input)
	{
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < input.length(); i++)
		{
			if (!a.remove(input.substring(i, i+1)))
			{
				a.add(input.substring(i, i+1));
			}
		}
		if (a.size() < 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		File file = new File("Anagram.txt");
		try {
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0; i < numberOfCases; i++) {
				String input = scan.next();
				System.out.println(anagram(input));
			}
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	
}
