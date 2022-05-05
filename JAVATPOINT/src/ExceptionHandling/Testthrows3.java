package ExceptionHandling;

import java.io.*;

class T {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

class Testthrows3 {
	public static void main(String args[]) throws IOException {// declare exception
		T m = new T();
		m.method();

		System.out.println("normal flow...");
	}
}
