package IO;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("F:\\SUNBEAM\\Java\\JAVA\\testout.txt");
			fout.write(65); //A
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
