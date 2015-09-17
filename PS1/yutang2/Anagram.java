import java.util.*;
import java.io.*;

public class Anagram {
	public static boolean anagram(String input){
		List<Character> word = new ArrayList<Character>();
				for(char i:input.toCharArray()){
					word.add(i);
				}
		int a = findandremove(word);
		if(a>=2){return false;}
		else return true;
	}
	public static int findandremove(List<Character> word){
		int failchar = 0;
		loops:
		while(failchar != 2){
			Iterator<Character> it = word.iterator();
			Character begin = it.next();
			System.out.println(begin);
			while(it.hasNext()){
				Character a = it.next();
				System.out.println(a);
				if(begin.equals(a)){
					it.remove();
					word.remove(word.indexOf(a));
					break loops;
				}
			}
			failchar++;
		}
		return failchar;	
	}

	public static void main(String[] args) {
		File file = new File("Anagram.txt");
		try{
			Scanner scan = new Scanner(file);
			int numberOfCases = scan.nextInt();
			for(int i = 0;i < numberOfCases;i++){
				String input = scan.next();
				System.out.println(anagram(input));
				
			}
			scan.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
