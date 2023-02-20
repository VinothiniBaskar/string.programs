package string.programs;

public class ReverseString {

	public static void main(String[] args) {
		// decalre a string with data
		String str = "vino";
		// declare a string with empty value
		String revStr = "";
		// decalre a variable of type char
		char ch;
		// print the revString
		System.out.println("The  String is :" + str);
		// iterate the for loop
		for (int i = 0; i < str.length(); i++) {
			// store the each character in ch variable
			ch = str.charAt(i);
			// add the each character with current revStr value
			revStr = ch + revStr;
		}
		// print the revString
		System.out.println("The reversed String is :" + revStr);
	}

}
