package OopsPillars;

//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicles {
//defining a method  
	void run() {
		System.out.println("Vehicle is running");
	}
}

//Creating a child class  
class MethodOverriding_Bikes extends Vehicles {
//defining the same method as in the parent class  
	void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String[] args) {
		MethodOverriding_Bikes obj = new MethodOverriding_Bikes();// creating object
		obj.run();// calling method

	}

}
