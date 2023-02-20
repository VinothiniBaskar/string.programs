package string.programs;

import java.util.HashMap;

public class MatchingChar {

	public static void main(String[] args) {
		// declare a string
		String str = "vinothini";
		// convert to charArray
		char[] ch = str.toCharArray();
		// decalre a HashMap
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		// declare a for each loop
		for (char c : ch) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);

			}
		}
		System.out.println("The Matching char is :" + hmap);
	}

}
