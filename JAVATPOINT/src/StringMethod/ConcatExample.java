package StringMethod;

public class ConcatExample {
	public static void main(String args[]) {
		String s1 = "java string";
		String s2 =   "  TEJAS";
// The string s1 does not get changed, even though it is invoking the method      
// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		//s1.concat("is immutable");
		s1.concat(s2);
//		System.out.println(s1);
//		s1 = s1.concat(" is immutable so assign it explicitly");
		System.out.println(s1.concat(s2));
		//System.out.println(s1);
	}
}