package ExceptionHandling;

import java.io.*;

class J {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

class Testthrows4 {
	public static void main(String args[]) throws IOException {// declare exception
		J m = new J();
		m.method();

		System.out.println("normal flow...");
	}
}
