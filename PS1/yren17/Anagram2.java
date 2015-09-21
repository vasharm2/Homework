public class Anagram2 {
	public static void main(String[]args){
		String word;
		word=TextIO.getlnString();
		int length=word.length();
		char [] alphabet;
		alphabet=new char[26];
		String alp="abcdefghijklmnopqrstuvwxyz";
		
		int counter=0;
		int num=0;
		for(int m=0;m<26;m++){
			counter=0;
			for(int j=0;j<length;j++){
				if (word.charAt(j)==alp.charAt(m)){
					counter++;	
				}
				
			}
			num=num+counter%2;
		}
			if (num>1){
			System.out.println("That is not an anagram.");
					
		}
		else 
			System.out.println("That's good!");
			
			
		}
		
	}



