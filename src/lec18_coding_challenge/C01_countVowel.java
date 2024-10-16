package lec18_coding_challenge;
//Que: Write a method to find the number of vowels from the String? Vowel: a, e, i, o, u

public class C01_countVowel {
	public static void main(String[] args) {
		findOutVowel("Pack my box with five dozen liquor jugs");
	}

	public static void findOutVowel(String s) {
		int count = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
