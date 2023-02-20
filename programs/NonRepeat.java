package string.programs;

public class NonRepeat {

	public static void main(String[] args) {
		String str="vvviio";
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i),str.indexOf(str.charAt(i))+1)==-1) {
				System.out.println("non repeat char is "+str.charAt(i));
				break;
			}
		}

	}

}
