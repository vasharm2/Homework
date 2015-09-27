
public class Problem4 {
	 public static void main(String[] args) {
	        printFirstSentence();
	        printSecondSentence();
	        printThirdSentence();
	    }

	    public static void printFirstSentence() {
	        for(int i = 0; i <= 5; i++) {
	            System.out.println("This sentence should print 5 times.");
	        }
	    }

	    public static void printSecondSentence() {
	        int j = 0;
	        while (j <= 3) {
	            System.out.println("This sentence should print 3 times.");
	            j++;
	        }
	    }

	    public static void printThirdSentence() {
	        for(int amount = 4; amount > 0; amount--) {
	            System.out.println("This sentence should print 4 times.");
	        }
	    }

}
