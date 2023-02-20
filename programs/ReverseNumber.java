package string.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		// declare a number;
		int number = 12321 ;

		// declare reminder,reverse with intial value is 0
		int reminder = 0, reverse = 0;
        //declare a temp variable and assgin the number
		int temp=number;
		// create a while loop and it checks if the number is not equal to zero
		System.out.println("The  number is :" + number);
		while (number != 0) {
			// mod the number by 10 and store in reminder-->it takes last digit
			reminder = number % 10;
			// multiply the current reverse value with 10 and add the current reminder value
			reverse = reverse * 10 + reminder;
			// divide the number by 10-->it takes omit the last digit rest of the number
			// should taken for another iteration
			number = number / 10;
		}
		System.out.println("The Reversed number is :" + reverse);
		if (reverse==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");

		}
	}

}
