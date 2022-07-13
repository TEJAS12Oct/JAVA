package OopsPillars;

class Animaly {
	String color = "white";
}

class Doggy extends Animaly {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}

public class SuperKW_Variable {

	public static void main(String[] args) {
		Doggy d = new Doggy();
		d.printColor();

	}

}
