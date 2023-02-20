package string.programs;

public class Swap {

	public static void main(String[] args) {
		// decalre a strings
		String a = "vino";
		String b = "baskar";
		System.out.println("Before swap is  : " + a + " " + b + "");

		// add the strings
		a = a + b;

		// use substring method
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After swap is  : " + a + " " + b + "");

	}

}
