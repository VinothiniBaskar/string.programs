package string.programs;

public class TotalCharCount {

	public static void main(String[] args) {
		// declare a string
		String str = "vino";
		// declare a count value as 0
		int count = 0;

		// iterate the for loop
		for (int i = 0; i < str.length(); i++) {
			// check if condition -->if the each character is not equal to empty count the
			// value
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("The count is :" + count);
	}

}
