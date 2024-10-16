package lec18_coding_challenge;

import java.util.Arrays;

public class A06_reverseTheWordsFromParagraph {
	public static void main(String[] args) {
		reverseTheStringInWord("Hi my name is Rubuait");
	}

	public static void reverseTheStringInWord(String s) {
		String[] word = s.split(" ");// in this line we are doing string to array string
		char[] characterByCharacter = s.toCharArray();
		System.out.println(Arrays.toString(word));
		for (int i = 0; i < word.length; i++)
			System.out.println(i);
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print((word[i] + " "));
			//System.out.println("/n......................................................................");
			//System.out.println (Arrays.toString(characterByCharacter));

		}

	}
}
