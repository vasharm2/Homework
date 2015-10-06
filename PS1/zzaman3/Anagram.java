/*  Anagram Problem Set 1
 * zzaman 3 - Zohair Zaman
 */
import java.util.*;
import java.io.*;

public class Anagram {
	public static boolean anagram(String input) {
		 int [] name;
		 name = new int[52];
		 int j = input.length();
		 for( int i = 0; i < j; i++ ) { 
	            char pn = input.charAt(i);
	            name[pn-'a'] = name[pn-'a'] + 1;
	     
	        }
	        int frequencyOdd;
	        frequencyOdd = 0;
	        
	      for (int i = 0; i < 52; i++) {
	    	  if(name[i] % 2 == 1) 
	   
	    		frequencyOdd = frequencyOdd + 1;
	      
	    	  if(frequencyOdd > 1) 
	    		  return false;
	    	  }
	    			
	        return true;
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
