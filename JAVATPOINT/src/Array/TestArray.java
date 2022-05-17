package Array;

//Java Program to illustrate how to declare, instantiate, initialize  
//and traverse the Java array.  
class TestArray {
	public static void main(String args[]) {
		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
//traversing array  
		for (int i = 0; i < a.length; i++)// length is the property of array
			System.out.println(a[i]);
	

		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int j = 0; j < b.length; j++)// length is the property of array
			System.out.println(b[j]);
	}

}
