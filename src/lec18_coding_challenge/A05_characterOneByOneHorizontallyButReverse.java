package lec18_coding_challenge;
/*
Que: Print your name Horizontally but in reverse
Input: Tofael Kabir

Output:
ribaK leafoT

*/


public class A05_characterOneByOneHorizontallyButReverse {
	public static void main(String[] args) {
		NameInHorizontallyButReverse("Rubuait Rahman");

	}

	public static void NameInHorizontallyButReverse(String s) {
		s = s.replaceAll(" ", "");

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
