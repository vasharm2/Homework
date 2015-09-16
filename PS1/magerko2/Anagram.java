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

	/**
	 * Helper method for generating all unique anagrams of a string without a
	 * prefix. If a constant prefix should be used to generate these anagrams,
	 * use {@link #generateAnagrams(String, String)} instead
	 *
	 * @param string
	 *            the string from which all anagrams will be generated
	 * @return a Set of all unique anagrams of the parameterized string
	 */
	protected static Set<String> generateAnagrams(String string) {
		return generateAnagrams("", string);
	}

	/**
	 * Helper method for generating all unique anagrams of a string using a
	 * given prefix. If no prefix should be used to generate these anagrams, use
	 * {@link #generateAnagrams(String)} instead <br />
	 * Inspiration: <a
	 * href="http://stackoverflow.com/a/4240323/996249">Generating all
	 * permutations of a given string</a>
	 *
	 * @param prefix
	 *            a constant prefix to add to all anagrams
	 * @param remainder
	 *            the string from which all anagrams will be generated
	 * @return a Set of all unique anagrams of the parameterized string,
	 *         prefixed with prefix
	 */
	protected static Set<String> generateAnagrams(String prefix,
			String remainder) {
		HashSet<String> anagrams = new HashSet<String>();

		int remainderLength = remainder.length();
		if (remainderLength == 0) {
			return anagrams;
		}

		for (int index = 0; index < remainderLength; index++) {
			char fixed = remainder.charAt(index);
			String updatedPrefix = prefix + fixed;
			String updatedRemainder = remainder.substring(0, index)
					+ remainder.substring(index + 1, remainderLength);

			anagrams.add(updatedPrefix + updatedRemainder);
			anagrams.addAll(generateAnagrams(updatedPrefix, updatedRemainder));
		}

		return anagrams;
	}

	/**
	 * Checks to see if a non-null String is a palindrome
	 *
	 * @param potentialPalindrome
	 *            the string to check
	 * @return true if the string is a plaindrome, otherwise false
	 */
	protected static boolean isPalindrome(String potentialPalindrome) {
		if (potentialPalindrome == null) {
			return false;
		}

		int length = potentialPalindrome.length();
		if (length <= 1) {
			return true;
		}

		String potentialPalindromeReversed = new StringBuilder(
				potentialPalindrome).reverse().toString();
		return potentialPalindrome.equals(potentialPalindromeReversed);
	}

	/**
	 * Helper method to see if a Collection of Strings contains a palindrome
	 *
	 * @param potentialPalindromes
	 *            a Collection of Strings to check
	 * @return true as soon as a single palindrome is found, and false if no
	 *         palindrome is found
	 */
	protected static boolean containsPalindrome(
			Collection<String> potentialPalindromes) {
		for (String potentialPalindrome : potentialPalindromes) {
			if (isPalindrome(potentialPalindrome)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Checks to see if a String is the case-insensitive anagram of a palindrome
	 * Note that this method will not necessarily use the most efficient method 
	 * for checking to see if a word is a palindrome, which could involve simply
	 * counting occurrences of specific characters. This way seemed like more fun.
	 *
	 * @param string
	 *            the String to check
	 * @return true if an anagrammed version of string is a palindrome,
	 *         otherwise false
	 */
	public static boolean isAnagrammedPalindrome(String string) {
		if (string == null) {
			return false;
		}

		Set<String> anagrams = generateAnagrams(string.toLowerCase());
		return containsPalindrome(anagrams);
	}

	public static void main(String[] args) {
		File file = null;
		Scanner scan = null;
		try {
			file = new File("Anagram.txt");
			scan = new Scanner(file);

			int numberOfCases = scan.nextInt();
			for (int i = 0; i < numberOfCases; i++) {
				String input = scan.next();
				System.out.println(isAnagrammedPalindrome(input));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}
}
