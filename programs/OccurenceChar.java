package string.programs;

public class OccurenceChar {

	public static void main(String[] args) {
		//declare a string
		String str="vinovasanth";
		//declare a totalCount and get the length of the string
		int totalCount=str.length();
		//declare a afterCount and use replace method and pass the arguments as which character need to count and replace with empty
		//get the length
		int afterCount=str.replace("v", "").length();
		//decalre a count and substract the totalCount and afterCount
		int count=totalCount-afterCount;
		
		System.out.println("The number of occurences of v is :"+count);

	}

}
