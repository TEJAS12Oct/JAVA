package ExceptionHandling;

import java.io.*;

class Parentt {
	void msg() throws Exception {
		System.out.println("parent method");
	}
}

class TestExceptionChild4 extends Parentt {
	void msg() throws ArithmeticException {
		System.out.println("child method");
	}

	public static void main(String args[]) {
		Parentt p = new TestExceptionChild4();

		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
