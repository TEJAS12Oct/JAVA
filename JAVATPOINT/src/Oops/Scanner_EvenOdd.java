//package Oops;
//import java.util.Scanner;  
//class Scanner_EvenOdd
//{
//
//	public static void main(String[] args) {
//		//creating Scanner class object     
//		Scanner scan=new Scanner(System.in);  
//		System.out.print("Enter the number: ");  
//		//reading value from the user  
//		int num=scan.nextInt();  
//		//method calling  
//		
//		find_even_odd(num);
//		
//	   }
//
//
//
//	     
//	      public static void find_even_odd(int num) {
//		      
//			//method body  
//			if(num%2==0)   
//			System.out.println(num+" is even");   
//			else   
//			System.out.println(num+" is odd");  
//			}  
//
//}


// when we write static ==> do not need to create object
// it directly call with class
	      
package Oops;
import java.util.Scanner;  


class EvenOdd
{
public void EvenOdd(int num) 
			{
 		      
 			//method body  
 			if(num%2==0)   
 			System.out.println(num+" is even");   
 			else   
 			System.out.println(num+" is odd");  
 			}  

 }


class Scanner_EvenOdd 
{

			public static void main(String[] args) {
				//creating Scanner class object     
			Scanner scan=new Scanner(System.in);  
			System.out.print("Enter the number: ");  
			//reading value from the user  
			int num=scan.nextInt();  
	      		  
			EvenOdd sc = new EvenOdd();
			sc.EvenOdd(num);
	      		
	      		
	      	}
}

