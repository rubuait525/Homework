package lec18_coding_challenge;

public class B01_countASpecificCharacter {
	public static void main(String[] args) {
		findOutZorz("ZiyadZ Alz KhilanliezZZZ");
	}

	public static void findOutZorz(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
//			// if ((i==s.charAt('Z'))||(i==s.charAt('z'))) {//miktake i did
//			if (s.charAt(i) == 'z' || s.charAt(i) == 'Z')
//				count++;
			if((s.charAt(i)== 'A'|| s.charAt(i)== 'a'));// if i put ; after line 14 why it count a 24 instade od 3?
				count++;

		}
		System.out.println(count);
		//System.out.println();
	}

}
