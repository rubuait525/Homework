package lec18_coding_challenge;

public class B03_countASpecificCharacter {
	public static void main(String[] args) {
		findUpperandLower("ZiyadZ Alz KhilanliezZZZ");
	}

	public static void findUpperandLower(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.toUpperCase().charAt(i) == 'Z')
				
				count++;
		}
			
		System.out.println(count);

	}
	
}
