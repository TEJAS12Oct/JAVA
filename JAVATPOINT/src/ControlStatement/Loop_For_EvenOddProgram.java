package ControlStatement;

public class Loop_For_EvenOddProgram {

	public static void main(String[] args) 
	{
		
		int num =9;
		Loop_For_EvenOddProgram loopobj = new Loop_For_EvenOddProgram();
		loopobj.divisibilityRule(num);
		
		
	}
	
	public void divisibilityRule(int num) {
		if(num%2==0) {
			
			if(num%3==0 && num%2 == 0)
			{
				System.out.println("Number divisible by 2 and 3 = " + num);
			}
			else {
				System.out.println("Number Is Divisible by 2  = " + num);
			}
			
		}
		
		
		else if(num%3 == 0)
		{
			System.out.println("Number divisible by 3 = " + num);
		}
	}
}
	
//	public void evenOddNumber() {
//		//int sum = 0;
//				for(int j = 1; j<=10;j++) 
//				{  
//				if((j==4) && (j%2==0))
//				{
//					
//					System.out.println("j = " + j);
//		  			//System.out.println("Number is even = " + j);
//				}
//				else if (j%2 !=0)
//				{
//					System.out.println("Number is odd = " + j);
//				}
//				//System.out.println("j ="+ j);
//				}
//	}
//	
//
//}


//0 + 1 = 1
//1 + 2 = 3
//3 + 3 = 6
//6 + 4 = 10
//10 + 5 = 15
//15 + 6 = 21
//21 + 7 = 28
//28 + 8 = 36
//36 + 9 = 45
//45 + 10 = 55