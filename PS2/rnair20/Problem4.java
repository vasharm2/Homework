import java.util.*;
public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    printFirstSentence();
	        printSecondSentence();
	        printThirdSentence();
	}

	 public static void printFirstSentence() {
	        for(int i = 5; i > 0; i--) {
	            System.out.println("This sentence should print 5 times.");
	        }
	    }
	 public static void printSecondSentence() {
	        int i = 3;
	        while(i > 0) {
	            System.out.println("This sentence should print 3 times.");
	            i--;
	        }
	    }
	 public static void printThirdSentence() {
	        for(int amount = 0; amount < 4; amount++) {
	            System.out.println("This sentence should print 4 times.");
	        }
	    }
}
