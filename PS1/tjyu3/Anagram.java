import java.util.*;
import java.io.*;
import java.util.ArrayList;

/*
 ************************************************
 ____ ____    _  ___   __
 / ___/ ___|  / |/ _ \ / /_
 | |   \___ \  | | (_) | '_ \
 | |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/
 
 
 Problem set 1
 
 
 Question 1
 
 A common problem in computer science is finding patterns within data.
 This problem will simulate that in a way that is easy to see what is happening.
 
 A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
 Allowances may be made for adjustments to capital letters, punctuation, and word dividers.
 
 an anagram is a word, phrase, or name formed by rearranging the letters of another.
 
 
 Given a String S, determine if it is an anagram of a palindrome.
 Return true if the String is an anagram of a palindrome, and false otherwise.
 For example, the String “oatrtro” will return true (rotator), while the String “false” will return false.
 
 
 PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!
 
 ************************************************
 
 */

public class Anagram {
    
    public static boolean anagram(String input) {
        //YOUR CODE HERE
        int inputLength = input.length();
        char[] letters = new char[inputLength];
        
        if(inputLength==1){
            return true;
        }
        
        for(int i = 0; i<inputLength; i++){
            char upperChar = Character.toUpperCase(input.charAt(i));
            letters[i] = upperChar;
        }
        
        //sort the array into alphabetical order
        char tempChar;
        for(int j = 1; j<inputLength; j++){
            for(int k = j; k>0; k--){
                if(letters[k] < letters[k-1]){
                    tempChar = letters[k-1];
                    letters[k-1] = letters[k];
                    letters[k] = tempChar;
                }
            }
        }
        
        int counter = 0; //Number of "extra" letters in the word
        int i;
        for(i = 0; i<inputLength-1; i+=2){
            if(letters[i] != letters[i+1] && counter==0){
                counter++;
                i--;
            }
            else if(letters[i] != letters[i+1] && counter!=0){
                return false;
            }
        }
        if(counter == 0 || counter == 1)
            return true;
        
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