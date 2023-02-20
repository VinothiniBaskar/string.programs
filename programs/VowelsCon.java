package string.programs;

public class VowelsCon {

	public static void main(String[] args) {
		String str = "vinothini";
		int vowel = 0;
		int consonant = 0;
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				vowel++;
			} else {
				consonant++;
			}
		}
		System.out.println("vowel count is :"+vowel);
		System.out.println("consonant count is :"+consonant);

	}

}
