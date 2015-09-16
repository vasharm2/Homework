/**
 * @author zchen142
 */

import java.util.Scanner;
import java.io.*;
import java.lang.String;

public class Anagram
{
		public static boolean anagram(String input) 
		{
			int[] count= new int[26];
			input=input.toLowerCase();
			for (int i=0;i<input.length();i++)
			{
				char a=input.charAt(i);
				count[a-'a']++;
				
			}
			int odd=0;
			for (int j=0;j<count.length;j++)
			{
				if (count[j]%2==1)
				{
					odd++;
				}			
			}
			if (odd>1)
			{
				return false;
			}
			return true;
		
		}
		public static void main(String[] args)
		{
			File file = new File("/Users/DanielCzL315/Desktop/oh.txt");
			try 
			{
				Scanner scan = new Scanner(file);
				int numberOfCases = scan.nextInt();
				for(int i = 0; i < numberOfCases; i++) 
				{
					String input = scan.next();
					System.out.println(anagram(input));
				}
				scan.close();
			}
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
		}
}