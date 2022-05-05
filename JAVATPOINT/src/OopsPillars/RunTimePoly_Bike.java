package OopsPillars;

class Splendor {
	void run() {
		System.out.println("Splendor Is Running");
	}
}

class RunTimePoly_Bike extends Splendor {
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String[] args) {
		Splendor s = new RunTimePoly_Bike();
		s.run();

	}

}
