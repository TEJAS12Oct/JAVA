package Code;

class CallByValue_Operation {

	int data = 50;

	void change(CallByValue_Operation op) {
		op.data = op.data + 100;// changes will be in the instance variable
	}

	public static void main(String[] args) {

		CallByValue_Operation op = new CallByValue_Operation();

		System.out.println("before change " + op.data);
		op.change(op);// passing object
		System.out.println("after change " + op.data);

	}

}
