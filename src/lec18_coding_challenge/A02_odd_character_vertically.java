package lec18_coding_challenge;

/*
Que: Print out your name vertically [They will not mention: character by character]
Input: Tofael Kabir
Output:
T
o
f
a
e
l

K
a
b
i
r
*/
public class A02_odd_character_vertically {
	public static void NameInVerticalAndOddNum(String s) {
		s = s.replaceAll(" ", "");
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {

				System.out.println(s.charAt(i));

			}
		}

	}

	public static void main(String[] args) {
		NameInVerticalAndOddNum("Rubuait Rahman");

	}
}
