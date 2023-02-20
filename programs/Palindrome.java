package string.programs;

public class Palindrome {

	public static void main(String[] args) {
		String str = "mam";
		String revStr = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			revStr = ch + revStr;
		}
		if (str.equals(revStr) ) {
			System.out.println("Palindrome");
		} else {
			System.out.println(" not Palindrome");

		}
	}

}
