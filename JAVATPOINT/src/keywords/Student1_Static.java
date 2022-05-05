package keywords;

class  Student22 {
	static int rollno = 10;
	static String name = "tejas";
	static String college = "ITS";

	// method to display values
	static void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

class Student1_Static {
	public static void main(String[] args) {

		// calling display method

		Student22.display();
		Student22.display();
		Student22.display();
	}

}
