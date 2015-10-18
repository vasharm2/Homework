import java.io.File;
import java.io.*;
import java.util.*;

public class anagram {
    public static boolean anagram(String input) 
    {
        //user inputs letters into the system
    	input = input.toLowerCase();
    	int[] let = new int[26];
    	int oddCount = 0;
        for (int i = 0; i < input.length(); i++)
        {
        	char c = input.charAt(i);
            let[c - 'a']++;
        }
        
        for (int i = 0; i < let.length; i++)
        {
        	int x = let[i];
        	if (oddCount > 1)
        		return false;
        	else if (x%2==1)
        		oddCount++;
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