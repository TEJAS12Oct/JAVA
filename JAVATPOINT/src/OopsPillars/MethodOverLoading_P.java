package OopsPillars;

//Method Overloading: changing no. of arguments
public class MethodOverLoading_P {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

class TestOverloading1 {
	public static void main(String[] args) {
		System.out.println(MethodOverLoading_P.add(11, 11));
		System.out.println(MethodOverLoading_P.add(11, 11, 11));
	}
}

//Method Overloading: changing data type of arguments
//public class MethodOverLoading_P {
//	static int add(int a, int b) {
//		return a + b;
//	}
//
//	static double add(double a, double b) {
//		return a + b;
//	}
//}
//
//class TestOverloading2 {
//	public static void main(String[] args) {
//		System.out.println(MethodOverLoading_P.add(11, 11));
//		System.out.println(MethodOverLoading_P.add(12.3, 12.6));
//
//	}
//}
