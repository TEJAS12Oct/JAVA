package OopsPillars;

interface Bankk {
	float rateOfInterest();
}

class SBIi implements Bankk {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bankk {
	public float rateOfInterest() {
		return 9.7f;
	}
}

class InterfaceTest {
	public static void main(String[] args) {
		Bankk b = new SBIi();
		System.out.println("ROI: " + b.rateOfInterest());
	}

}
