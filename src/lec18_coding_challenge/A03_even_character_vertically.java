package lec18_coding_challenge;
/*
Que: Print out your name vertically but only even index
Input: Tofael Kabir
Output:
T
f
e

a
i
*/

public class A03_even_character_vertically {
	public static void NameInEvenNumberInVertically(String s) {
		s = s.replaceAll(" ", "");
		for (int i = 0; i < s.length(); i++) {

			if (i % 2 == 0) {
				System.out.println(s.charAt(i));

			}

		}
	}

	public static void main(String[] args) {
		NameInEvenNumberInVertically("Rubuait Rahman");
	}

}
