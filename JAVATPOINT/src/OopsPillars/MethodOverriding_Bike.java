package OopsPillars;

 class Vehicle {
	//Java Program to demonstrate why we need method overriding  
	//Here, we are calling the method of parent class with child  
	//class object.  
	//Creating a parent class  
	 
	  void run(){System.out.println("Vehicle is running");}  
	}  
	//Creating a child class  
	class MethodOverriding_Bike extends Vehicle{
	public static void main(String[] args) {
		//creating an instance of child class  
		MethodOverriding_Bike obj = new MethodOverriding_Bike();  
		  //calling the method with child class instance  
		  obj.run();  
		  }  
	

}
