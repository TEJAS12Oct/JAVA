package keywords;

//Java Program to demonstrate the use of an instance variable  
	//which get memory each time when we create an object of the class.  
	class Counter2{ // with static variables 
	static int count=0;//will get memory each time when the instance is created  
	  
	Counter2(){  
	count++;//incrementing value  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	//Creating objects  
	Counter2 c1=new Counter2();  
	Counter2 c2=new Counter2();  
	Counter2 c3=new Counter2();  
	}  
	}
