package lec18_coding_challenge;
/*
 * how can i find upperCase and lower case character from a string
 */

public class B02_countASpecificCharacter {
	public static void main(String[] args) {
		findUpperandLowelCaseChar("ZiyadZ Alz KhilanliezZZZ");
	}

	public static void findUpperandLowelCaseChar(String s) {
		//s = s.toUpperCase();
		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'z')//why it shows us tottal number of z
				count++;
		}
		System.out.println(count);
	}

}
