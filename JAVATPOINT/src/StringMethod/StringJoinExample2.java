package StringMethod;

public class StringJoinExample2 {
	public static void main(String[] args) {
		String date = String.join("/", "12", "10", "1999");
		System.out.print(date);
		String time = String.join(":", "12", "12", "12");
		System.out.println(" " + time);
	}
}
