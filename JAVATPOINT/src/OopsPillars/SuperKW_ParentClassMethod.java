package OopsPillars;

class Animals {
	void eat() {
		System.out.println("eating...");
	}
}

class Dogs extends Animals {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}

public class SuperKW_ParentClassMethod {

	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.work();
		;
	}

}
