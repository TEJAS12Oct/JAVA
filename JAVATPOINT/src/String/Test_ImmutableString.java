package String;

//public class Test_ImmutableString {
//public static void main(String args[]) {
//		String s = "Sachin";
//		s.concat(" Tendulkar");// concat() method appends the string at the end
//		System.out.println(s);// will print Sachin because strings are immutable objects
//	}
//
//}

// Output = Sachin

public class Test_ImmutableString {
	public static void main(String args[]) {
		String s = "Sachin";
		s = s.concat(" Tendulkar");
		System.out.println(s);
	}
}

// // Output = Sachin Tendulkar