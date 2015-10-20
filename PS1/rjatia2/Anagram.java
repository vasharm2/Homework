import java.util.*;

import java.io.*;

public class Anagram {
    
    
    
    public static boolean anagram(String input) {
        
        int tolerance=0;
        
        if (input.length()%2==1)
            
            tolerance=1;
        
        for (int i=0;i<input.length();i++)
            
        {
            int count=-1;
            if (input.length()!=0)
            count=search(input,input.charAt(i));
            
            if (count%2!=0)
                
                tolerance--;
            input=input.replace((input.charAt(i)+""),"");
            
            
        }
        
        if (tolerance!=0)
            
            return false;
        
        return true;
        
    }
    
    
    
    public static int search(String str, char ch)
    
    {
        
        int count=0;
        
        for (int i=0;i<str.length();i++)
            
        {
            
            if (str.charAt(i)==ch)
                
                count++;
            
        }
        
        return count;
        
    }
    
    
    
    public static void main(String[] args)
    
    {
        
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