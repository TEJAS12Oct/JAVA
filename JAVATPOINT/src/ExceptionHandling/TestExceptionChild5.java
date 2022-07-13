package ExceptionHandling;

import java.io.*;

class Parents {
	void msg() throws Exception {
		System.out.println("parent method");
	}
}

class TestExceptionChild5 extends Parents {
	void msg() {
		System.out.println("child method");
	}

	public static void main(String args[]) {
		Parents p = new TestExceptionChild5();

		try {
			p.msg();
		} catch (Exception e) {
		}

	}
}
