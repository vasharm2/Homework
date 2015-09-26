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
<<<<<<< HEAD
For example, the String "tatrtro" will return true(rotator), while the String "false" will return false.
=======
For example, the String "rtatoro" returns true(rotator), while the String "false" returns false.
>>>>>>> db62a3241a4fc943be1dbc64dcf5c00a46e5639f


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************

*/

<<<<<<< HEAD

=======
>>>>>>> db62a3241a4fc943be1dbc64dcf5c00a46e5639f
public class Anagram {

	public static boolean anagram(String input) {
		//YOUR CODE HERE
		input = input.toLowerCase();
		//delete space, punctuations
<<<<<<< HEAD
		Char[] array = new Char[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for (int i=0; i <26; i++){
		  char target = array[i];
		  String after = input.replace(target,"" )
	      int charCounter = input.length() - after.length();
	     if (charCounter%2 == 0)
	    	 return;
	     else
	       int oddCounter = oddCounter+1
		   return;
		}
		if (oddCounter>2)
		return false;
=======
	    HashMap<Integer,String> hm= new HashMap<Integer,String>();
	    hm.put(0,"a");
	    hm.put(1, "b");
	    hm.put(2,"c");
	    hm.put(3,"d");
	    hm.put(4,"e");
	    hm.put(5,"f");
	    hm.put(6,"g");
	    hm.put(7,"h");
	    hm.put(8,"i");
	    hm.put(9,"j");
	    hm.put(10,"k");
	    hm.put(11,"l");
	    hm.put(12,"m");
	    hm.put(13,"n");
	    hm.put(14,"o");
	    hm.put(15,"p");
	    hm.put(16,"q");
	    hm.put(17,"r");
	    hm.put(18,"s");
	    hm.put(19,"t");
	    hm.put(20,"u");
	    hm.put(21,"v");
	    hm.put(22,"w");
	    hm.put(23,"x");
	    hm.put(24,"y");
	    hm.put(25,"z");
	    
	    
		int oddCounter = 0;
		int i=0;
		while (i<26){
		  String target = hm.get(i);
		  String after = input.replaceAll(target,"" );
	      int charCounter = input.length() - after.length();
	     if (charCounter%2 != 0)
	       oddCounter = oddCounter+1;
	     i =i+1;
		}
		if (oddCounter>1)
		return false;
		else
	     return true;
>>>>>>> db62a3241a4fc943be1dbc64dcf5c00a46e5639f
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