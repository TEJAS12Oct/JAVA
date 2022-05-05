package Multithreading;

//example of java synchronized method  
class Table {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread11 extends Thread {
	Table t;

	MyThread11(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread22 extends Thread {
	Table t;

	MyThread22(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronization2 {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread11 t1 = new MyThread11(obj);
		MyThread22 t2 = new MyThread22(obj);
		t1.start();
		t2.start();
	}
}
