package string.programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//declare a strings
		String str1="act";
		String str2="cat";
		//convert to char array
		char[] ch=str1.toCharArray();
		char[] ch1=str2.toCharArray();
		//sort the array
		Arrays.sort(ch);
		Arrays.sort(ch1);
		//declare boolean
		boolean banagram=true;
		//for loop for ch
		for (int i=0;i<ch.length;i++) {
			//check if condition -->if the each charater is not equal to next array char set as value false and give break
			if (ch[i]!=ch1[i]) {
				System.out.println("not Anagram");
				banagram=false;
				break;
			}
		}
if (banagram) {
	System.out.println(" Anagram");

}

	}

}
