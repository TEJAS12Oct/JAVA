package Operators;

public class NegationTF {

	public static void main(String[] args) 
	{
		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;
		System.out.println(~a);//-11 (minus of total positive value which starts from 0) 
		
	//  0  1  2   3   4   5   6   7   8   9   10
	// -1 -2 -3  -4  -5  -6  -7  -8  -9  -10  -11
		
		
		System.out.println(~b);//9 (positive of total minus, positive starts from 0) 
		
		
	//  -10  -9  -8  -7  -6  -5  -4  -3  -2  -1
	//    0   1   2   3   4   5   6   7   8   9	
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  (opposite of boolean value)
	}

}
