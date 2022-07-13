package Operators;

public class AssignmentOperator {

	public static void main(String[] args) 
	{
		int a=10;  
		int b=20;  
		a+=4;//a=a+4 (a=10+4)  
		b-=4;//b=b-4 (b=20-4)  
		System.out.println(a);  
		System.out.println(b);  
		 
//		Output:
//      14
//		16
		  
		int c=10;  
		c+=3;//10+3  
		System.out.println(c);  
		c-=4;//13-4  
		System.out.println(c);  
		c*=2;//9*2  
		System.out.println(c);  
		c/=2;//18/2  
		System.out.println(c);  
		  
//		Output:
//		13
//		9
//		18
//		9
		
		
		
		short d=10;  
		short e=10;  
		d+=e;//d=d+e internally so fine  
		//d=d+e;//Compile time error because 10+10=20 now int  
		System.out.println(d);  
		  

		short f=20;  
		short g=10;  
		f=(short)(f+g);//30 which is int now converted to short  
		System.out.println(f); 
		

	}

}
