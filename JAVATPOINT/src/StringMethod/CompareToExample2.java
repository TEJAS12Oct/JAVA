package StringMethod;

public class CompareToExample2 {
	public static void main(String args[]) {
		String s1 = "hello";
		String s2 = "";
		String s3 = "me";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
	}
}



//If first string is an empty string, the method returns a negative
//If second string is an empty string, the method returns a positive number that is the length of the first string.