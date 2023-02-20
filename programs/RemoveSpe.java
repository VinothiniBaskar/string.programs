package string.programs;

public class RemoveSpe {

	public static void main(String[] args) {
		// decalre a string
		String str = "vino$#@";
		// declare a removeStr and use replaceAll method
		String removeSpe = str.replaceAll("[^a-z0-9]", " ");
		System.out.println("The string is :" + removeSpe);

		// decalre a string
		String str1 = "vino123";
		// declare a removeStr and use replaceAll method
		String removeDigit = str1.replaceAll("\\d", " ");
		System.out.println("The string is :" + removeDigit);

	}

}
