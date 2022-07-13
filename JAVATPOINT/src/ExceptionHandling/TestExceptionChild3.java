package ExceptionHandling;

import java.io.*;

class Tejas {
	void msg() throws Exception {
		System.out.println("parent method");
	}
}

public class TestExceptionChild3 extends Tejas {
	void msg() throws Exception {
		System.out.println("child method");
	}

	public static void main(String args[]) {
		Tejas p = new TestExceptionChild3();

		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
