import java.io.*;
import java.util.*;
import java.lang.System;

public class Anagram{

//private static Scanner co;


public static boolean anagram (String bazinga) 
{
	//System.out.println("please enter something");
		//co = new Scanner(System.in);
		String dirty = "something";
		dirty = bazinga;
		//System.out.println(dirty);
		//co = null;
		int counter = 0;
		int counterTwo=0;
		int needed=0;
		
		
		String clean = "";
		

			for (int i=0; i<dirty.length(); i++)
			{

				if((dirty.charAt(i)=='a'||dirty.charAt(i)=='b'||dirty.charAt(i)=='c'||dirty.charAt(i)=='d'||dirty.charAt(i)=='e'||dirty.charAt(i)=='f'||dirty.charAt(i)=='g'
					||dirty.charAt(i)=='h'||dirty.charAt(i)=='i'||dirty.charAt(i)=='j'||dirty.charAt(i)=='k'||dirty.charAt(i)=='l'||dirty.charAt(i)=='m'||dirty.charAt(i)=='n'
					||dirty.charAt(i)=='o'||dirty.charAt(i)=='p'||dirty.charAt(i)=='q'||dirty.charAt(i)=='r'||dirty.charAt(i)=='s'||dirty.charAt(i)=='t'||dirty.charAt(i)=='u'
					||dirty.charAt(i)=='v'||dirty.charAt(i)=='w'||dirty.charAt(i)=='x'||dirty.charAt(i)=='y'||dirty.charAt(i)=='z'||dirty.charAt(i)=='A'||dirty.charAt(i)=='B'
					||dirty.charAt(i)=='C'||dirty.charAt(i)=='D'||dirty.charAt(i)=='E'||dirty.charAt(i)=='F'||dirty.charAt(i)=='G'||dirty.charAt(i)=='H'||dirty.charAt(i)=='I'
					||dirty.charAt(i)=='J'||dirty.charAt(i)=='K'||dirty.charAt(i)=='L'||dirty.charAt(i)=='M'||dirty.charAt(i)=='N'||dirty.charAt(i)=='O'||dirty.charAt(i)=='P'
					||dirty.charAt(i)=='Q'||dirty.charAt(i)=='R'||dirty.charAt(i)=='S'||dirty.charAt(i)=='T'||dirty.charAt(i)=='U'||dirty.charAt(i)=='V'||dirty.charAt(i)=='W'
					||dirty.charAt(i)=='X'||dirty.charAt(i)=='Y'||dirty.charAt(i)=='Z'))
				{clean= clean + dirty.charAt(i);}
			
				else
				{
					
					
					
				}
				
			}
			
			
			for(int i=0; i<clean.length(); i++)
			{
				counter=0;
				for(int j=0; j<clean.length(); j++)
				{
					
					if((clean.charAt(i))==(clean.charAt(j)))
					{
						counter++;
						
					}
					
				}
				if((!(0==counter%2))&&(needed==0))
				{
					needed=counter*counter;
				}
				if(!(counter%2==0))
				{
					counterTwo+=counter;
				}
			}	
			
			if (counterTwo==needed)
			{
				return true;
			}
			else
			{
				return false;
			}

	}
				
	public static void main(String[] args) {
		File file = new File("Anagram.txt");
		//File file = new File("/Users/CharlesBSwarts/Documents/workspace/JAVA/Homework Folder/src/Anagram.txt");
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

			
		