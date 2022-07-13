package String;

class toStringMethod_Students {

	int rollno;
	String name;
	String city;

	toStringMethod_Students(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public String toString() {// overriding the toString() method
		return rollno + " " + name + " " + city;
	}

	public static void main(String args[]) {
		toStringMethod_Students s1 = new toStringMethod_Students(101, "Raj", "lucknow");
		toStringMethod_Students s2 = new toStringMethod_Students(102, "Vijay", "ghaziabad");

		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
	}
}