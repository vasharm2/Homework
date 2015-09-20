import java.util.*;
import java.io.*;



public class Anagram {
	
	public static boolean anagram(String input) {
		//YOUR CODE HERE
		int numOdds = 0;
		boolean isInList;
		char[] chosenOnes = new char[input.length()];
		
		for (int x = 0; x < input.length(); x++)
		{
			isInList= false;
			int sumNum= 1;
			for (char current: chosenOnes)
			{
				if (current== input.charAt(x) )
				{
					isInList = true;
					sumNum = 0;
					break;
				}
			}
			for (int i = x + 1; i<input.length(); i++)
			{	
				if (input.charAt(x) == input.charAt(i)  && !isInList)
					sumNum ++;
			}
			for (char current: chosenOnes)
			{
				if (current== input.charAt(x))	
					break;
			}
			if (sumNum >=1 && !isInList)
				chosenOnes[x] = input.charAt(x);
			
			if (sumNum % 2 == 1)		//if sumNum is odd increase numOdds
				numOdds++;
		}	
		if ((input.length() % 2==0  && numOdds ==0)   ||  (input.length() % 2 == 1 && numOdds==1 ) )
			return true;
			else return false;
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