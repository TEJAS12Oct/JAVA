package OopsPillars;

class AA {

	AA() {
		System.out.println("parent class constructor invoked");
	}
}

class Instant_Intializer_block_B3 extends AA {
	Instant_Intializer_block_B3() {
		super();
		System.out.println("child class constructor invoked");
	}

	Instant_Intializer_block_B3(int a) {
		super();
		System.out.println("child class constructor invoked " + a);
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	
		public static void main(String[] args) {
			Instant_Intializer_block_B3 b1 = new Instant_Intializer_block_B3();
			Instant_Intializer_block_B3 b2 = new Instant_Intializer_block_B3(10);

		}

	
}
