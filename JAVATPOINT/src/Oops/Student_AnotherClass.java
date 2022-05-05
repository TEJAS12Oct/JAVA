package Oops;

 class TestStudent1 {
	 int id;  
	 String name;  
}
    //Java Program to demonstrate having the main method in   
	//another class  
	//Creating Student class.
	//Creating another class TestStudent1 which contains the main method  
	//When we create class in another clas then dont write public before a class
    class Student_AnotherClass{
	public static void main(String[] args) {
		TestStudent1 s1=new TestStudent1(); 
		  System.out.println(s1.id);  
		  System.out.println(s1.name);  
		  
		 }  
		  
}


