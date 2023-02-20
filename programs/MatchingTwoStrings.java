package string.programs;

import java.util.HashMap;

public class MatchingTwoStrings {

	public static void main(String[] args) {
		// declare a strings
		String str1 = "vino";
		String str2 = "vasanth";
		// convert to toCharArray
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		// create two HashMap for stores the char and integer value
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();

		// for each loop for ch1
		for (char c : ch1) {
			// check if hmap conatins char and add the char and value by 1
			if (!hmap.containsKey(c)) {
				hmap.put(c, 1);
			}
		}
		System.out.println(hmap);
		//for each loop for ch2
		for (char c1 : ch2) {
			//check if condition -->hamp-->contains char and add the char and value by 1 stores in hmap1
			if (hmap.containsKey(c1)) {
				hmap1.put(c1, 1);
			}
		}
		System.out.println(hmap1);

	}
	

}
