package lec18_coding_challenge;

public class C02_consonant {
	public static void main(String[] args) {
		findConsonant("Pack my box with five dozen liquor jugs");
	}
	public static void findConsonant(String s) {
		int count = 0;
		s = s.replaceAll(" ", "");
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)!= 'a' && s.charAt(i)!= 'e'&& s.charAt(i)!= 'o'&& s.charAt(i)!= 'u');
			count++;
			
			
		}
		System.out.println("only consonent: " + count);
	}

}
