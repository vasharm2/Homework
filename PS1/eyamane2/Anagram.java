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
  int noDuplicateCount = 0, length = input.length();
  boolean duplicateFound = false;
  ArrayList<String> duplicateLetters = new ArrayList<String>();
  for (int i=0;i<length;i++) {
   for (int a=i+1;a<length;a++) {
    if ( (input.substring(i,i+1).equals( input.substring(a,a+1) )) || duplicateLetter(input.substring(i,i+1),duplicateLetters) ) {
      duplicateFound = true;
      duplicateLetters.add(input.substring(i,i+1));
    }
   }
   if ( !duplicateFound ) {
     noDuplicateCount++;
   }
   duplicateFound = false;
  }
  if ( duplicateLetter(input.substring(length-1),duplicateLetters) ) {
    noDuplicateCount--;
  }
  if ( noDuplicateCount <= 1 ) {
   return true;
  }
  return false;
 }
 
 public static boolean duplicateLetter(String input, ArrayList<String> list) {
   for (String letter : list) {
     if ( input.equals(letter) ) {
       return true;
     }
   }
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